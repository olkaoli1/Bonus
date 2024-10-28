public class BonusMilesService {
    public int calculate(int price) {
        int milesPerRub = 20; // Количество рублей для одной бонусной мили
        return price / milesPerRub; // Рассчитываем количество миль и возвращаем результат
    }
}
