public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService(); // Создаем объект класса BonusMilesService

        int price = 10_000; // Пример цены билета, которую будем использовать для расчета миль
        int miles = service.calculate(price); // Вызываем метод calculate и передаем цену билета

        System.out.println("Количество бонусных миль: " + miles); // Выводим результат на экран
    }
}