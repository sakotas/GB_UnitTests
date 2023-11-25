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