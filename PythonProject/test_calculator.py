"""
Модуль для тестирования функциональности калькулятора, включающего сложение, 
вычитание, умножение и деление.
"""

import pytest
from calculator import add, subtract, multiply, divide

def test_add():
    """Тест функции сложения."""
    assert add(1, 2) == 3
    assert add(5.2, 3.3) == 8.5

def test_subtract():
    """Тест функции вычитания."""
    assert subtract(10, 5) == 5
    assert subtract(2.3, 1.1) == 1.2

def test_multiply():
    """Тест функции умножения."""
    assert multiply(3, 3) == 9
    assert multiply(7, -1) == -7
    assert multiply(0, 3) == 0

def test_divide():
    """Тест функции деления."""
    assert divide(10, 2) == 5
    assert divide(5, 2) == 2.5
    # Проверка исключения при делении на ноль
    with pytest.raises(ValueError):
        divide(5, 0)

if __name__ == '__main__':
    test_subtract()
    test_divide()
    test_add()
    test_multiply()
