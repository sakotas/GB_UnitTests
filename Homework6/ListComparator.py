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
