public class Main {
    public static void main(String[] args) {
        // Начальные данные
        int initialBalance = 100; // Начальная сумма на счету клиента
        int depositAmount = 1100; // Сумма пополнения

        // Переменные для бонусных рублей и итогового баланса
        int bonusRubles = 0;
        int finalBalance;

        // Условие 1: Если пополнение больше 1000 рублей
        if (depositAmount > 1000) {
            // Бонус начисляется за всю сумму пополнения, а не только за сумму свыше 1000
            bonusRubles = depositAmount / 100;
        }

        // Итоговая сумма на счету клиента (учитывая бонусы)
        finalBalance = initialBalance + depositAmount + bonusRubles;

        // Вывод результатов
        System.out.println("Сумма пополнения: " + depositAmount + " рублей");
        System.out.println("Количество бонусных рублей: " + bonusRubles);
        System.out.println("Итоговая сумма на счету клиента: " + finalBalance + " рублей");
    }
}