public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int savings = 0;
        int month = 0;
        while (savings < 2_490_000) {
            savings = savings + 15_000;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " равна");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number = number + 1;
        }
        System.out.println(" ");
        for (int numbeR = 10; numbeR >= 1; numbeR--) {
            System.out.print(numbeR + " ");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        double birthRate = 17.0 / 1000;
        double mortalityRate = 8.0 / 1000;
        for (int year = 1; year <= 10; year++) {
            double births = population * birthRate;
            double deaths = population * mortalityRate;
            population = (int) (population + (births - deaths));
            System.out.println("Год " + year + ", численность населения " + Math.round(population));
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        double money = 15000;
        int month = 0;
        double bankPercent = 0.07;
        int all = 12_000_000;
        while (money < all) {
            month++;
            money = money + money * bankPercent;
            System.out.println("Месяц " + month + ", сумма накоплений " + Math.round(money));
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int money = 15000;
        int month = 0;
        double bankPercent = 0.07;
        int all = 12_000_000;
        while (money < all) {
            month = month + 1;
            money = (int) (money + money * bankPercent);
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений " + Math.round(money));
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int money = 15000;
        int years = 9;
        double bankPercent = 0.07;
        for (int a = 1; a <= years * 12; a++) {
            money = (int) (money + money * bankPercent);
            if (a % 6 == 0)
                System.out.println("Месяц " + a + ", сумма накоплений " + Math.round(money));
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        for (int day = 1; day < 31; day = day + 7) {
            System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет");
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int currentYear = 2023;
        for (int i = 0; i < currentYear + 100; i += 79) {
            if (i > currentYear - 200)
                System.out.println(i);

        }
    }
}