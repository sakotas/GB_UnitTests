# Напишите функцию для поиска среднего значения в списке чисел и соответствующие
# юниттесты с использованием фреймворка pytest.

def find_average(numbers: list) -> float:
    if not numbers:
        return 0
    return sum(numbers) / len(numbers)


def test_find_average():
    assert find_average([1, 2, 3]) == 2
    assert find_average([]) == 0

