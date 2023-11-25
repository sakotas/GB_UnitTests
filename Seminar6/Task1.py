# Напишите функцию для поиска среднего значения в списке чисел и соответствующие
# юниттесты с использованием фреймворка pytest.
import pytest
def find_average(numbers: list) -> float:
    if not isinstance(numbers, list):
        raise TypeError("Не тот тип использований ни лист")
    if not numbers:
        return 0
    return sum(numbers) / len(numbers)


def test_find_average():
    assert find_average([1, 2, 3]) == 2
    assert find_average([]) == 0
    assert find_average([2]) == 2

# Модифицируйте функцию find_average так, чтобы она вызывала исключение TypeError,
# если ей передается не список.
# Напишите тест, который проверяет вызов этого исключения

def test_find_average_type_error():
    with pytest.raises(TypeError):
        find_average(1)

if __name__ == '__main__':
    test_find_average_type_error()
    test_find_average()
