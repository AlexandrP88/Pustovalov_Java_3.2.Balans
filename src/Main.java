public class Main {
    public static void main ( String [] args ) {
        int currentBalance = 100;
        int sumRefill = 1100;

        if (sumRefill <= 1000) {
            int finalBalance = currentBalance + sumRefill;
            System.out.println("Баланс");
            System.out.println(finalBalance);
        } else {
            int bonus = sumRefill / 100;
            int finalBalance = currentBalance + sumRefill + bonus;
            System.out.println("Баланс");
            System.out.println(finalBalance);
            System.out.println("Бонус");
            System.out.println(bonus);
        }

            }
}
