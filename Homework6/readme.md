# Домашнее задание 6

Создайте программу на Python, которая принимает два списка чисел и выполняет следующие действия:

a. Рассчитывает среднее значение каждого списка.

b. Сравнивает эти средние значения и выводит соответствующее сообщение:

- “Первый список имеет большее среднее значение”, если среднее значение первого списка больше.
- “Второй список имеет большее среднее значение”, если среднее значение второго списка больше.
- “Средние значения равны”, если средние значения списков равны.

**Условия:**

- Приложение должно быть написано в соответствии с принципами объектно-ориентированного программирования.
- Используйте Pytest для написания тестов, которые проверяют правильность работы программы. Тесты должны учитывать различные сценарии использования вашего приложения.
- Используйте pylint для проверки качества кода.
- Сгенерируйте отчет с помощью ультилиты coverage о покрытии кода тестами. Ваша цель - достичь минимум 90% покрытия.

**Формат и требования к сдаче:**

Отчет о выполнении этого задания должен включать в себя следующие элементы:

- Код программы

```python
class ListComparator:
    """Класс для сравнения двух списков чисел."""

    @staticmethod
    def calculate_average(numbers):
        """
        Вычисляет среднее значение элементов списка.
        Возвращает 0 для пустого списка.

        :param numbers: Список чисел для вычисления среднего.
        :return: Среднее значение элементов списка.
        """
        if not numbers:
            return 0
        return sum(numbers) / len(numbers)

    @staticmethod
    def compare_lists(list1, list2):
        """
        Сравнивает средние значения двух списков и возвращает соответствующее сообщение.

        :param list1: Первый список чисел.
        :param list2: Второй список чисел.
        :return: Сообщение о сравнении средних значений списков.
        """
        avg_list1 = ListComparator.calculate_average(list1)
        avg_list2 = ListComparator.calculate_average(list2)

        if avg_list1 > avg_list2:
            return "Первый список имеет большее среднее значение"
        elif avg_list1 < avg_list2:
            return "Второй список имеет большее среднее значение"
        else:
            return "Средние значения равны"
```

- Код тестов

```python
"""
Модуль для тестирования функциональности класса ListComparator, 
включающего сравнение списков чисел.
"""

import pytest
from ListComparator import ListComparator

@pytest.mark.parametrize("numbers, expected", [
    ([1, 2, 3, 4], 2.5),
    ([], 0),
    ([10, 20, 30], 20),
    ([-1, -2, -3], -2)
])
def test_average(numbers, expected):
    """Тестирование функции вычисления среднего значения списка."""
    assert ListComparator.calculate_average(numbers) == expected

@pytest.mark.parametrize("list1, list2, expected", [
    ([1, 2, 3], [1, 2, 3], "Средние значения равны"),
    ([1, 2, 3, 4], [1], "Первый список имеет большее среднее значение"),
    ([1], [1, 2, 3, 4], "Второй список имеет большее среднее значение"),
    ([10, 20, 30], [5, 15, 25], "Первый список имеет большее среднее значение"),
    ([100, 200], [300, 400], "Второй список имеет большее среднее значение")
])
def test_compare_lists(list1, list2, expected):
    """
    Тестирование функции сравнения списков на основе их средних значений.
    """
    assert ListComparator.compare_lists(list1, list2) == expected
```

- Отчет pylint/Checkstyle

https://github.com/sakotas/GB_UnitTests/blob/main/Homework6/contents/Untitled.png
    
- Отчет о покрытии тестами

https://github.com/sakotas/GB_UnitTests/blob/main/Homework6/contents/Untitled1.png
    
- Объяснение того, какие сценарии покрыты тестами и почему вы выбрали именно эти сценарии
1. **Тестирование среднего значения**: Проверяет корректность расчета среднего значения, включая ситуацию с пустым списком.
2. **Сравнение списков**: Покрывает три основных сценария - равные средние значения, первый список с большим средним значением и второй список с большим средним значением.

Эти сценарии выбраны, чтобы охватить основные возможности функций, учитывая граничные случаи и обеспечивая полное покрытие логических ветвей кода.