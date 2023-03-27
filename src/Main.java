public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
                 }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = -1;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int age = 33;
        if (age >= 2 && age <= 6); {
            System.out.println("Если возраст человек равен " + age + ", то ему нужно ходить в садик.");
        } else if (age >= 7 && age <18) {
            System.out.println("Если возраст человек равен " + age + ", то ему нужно ходить в школу.");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человек равен " + age + ", то ему нужно ходить в университет.");
        } else (age >= 24) {
            System.out.println("Если возраст человек равен " + age + ", то ему нужно ходить на работу.");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int age = 2;
        boolean canNotRide = age < 5;
        boolean rideWithAdults = age > 5 && age < 14;
        boolean rideAlone = age > 14;
        if (canNotRide) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        if (rideWithAdults) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься в сопровождении взрослого.");
        }
        if (rideAlone) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься одному без взрослого.");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
    }

    public static void task7 () {
        System.out.println("Задача 7");
    }
}

