public class BonusService {

    public long calculate (long amount, boolean registered) {
        int Persent = registered ? 3 : 1;
        long bonus = amount * Persent / 100;
        long limit = 500;
        if (bonus > limit) { // ограничение по бонусам
            bonus = limit;
        }
        return bonus;
    }
}
