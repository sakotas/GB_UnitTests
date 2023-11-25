import unittest.mock


class Person:
    def __init__(self, balance):
        self.balance = balance

    def transfer_money(self, bank: object, amount: object) -> object:
        if amount <= 0 or amount > self.balance:
            raise ValueError("Некорректная сумма для перевода")
        self.balance -= amount
        bank.recieve_money(amount)


class Bank:
    def __init__(self):
        self.balance = 0

    def recieve_money(self, amount):
        self.balance += amount


def test_person_bank_interaction():
    person = Person(1000)
    bank = Bank()

    person.transfer_money(bank, 500)
    assert person.balance == 500
    assert bank.balance == 500


# Задание №4
# В предыдущем задании используйте unittest.mock для создания мок-объекта Bank.
# Напишите тест, в котором вы проверите, вызывается ли метод receive_money с правильным
# аргументом.

def test_transfer_with_mock():
    person = Person(1000)
    mock_bank = unittest.mock.Mock()

    person.transfer_money(mock_bank, 500)
    mock_bank.recieve_money.assert_called_with(500)
