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
        }
        if (age < 18){
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
        int age = 1;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в садик.");
        }
        else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходитьв  школу.");
        }
        else if (age >= 18 && age <= 24) {
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в универ.");
        }
        else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно работать!!!");
        }
        else {
            System.out.println("Это младенец.");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int age = 30;
        if (age < 5) {
            System.out.println("Если возраст ребнка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        else if (age < 14) {
            System.out.println("Если возраст ребнка равен " + age + ", то ему можно кататься на аттракционе только в сопровождении взрослого.");
        }
        else {
            System.out.println("Если возраст ребнка равен " + age + ", то ему можно кататься на аттракционе без сопровождения возрослого.");
        }

    }

    public static void task6 () {
        System.out.println("Задача 6");
        int trainCapacity = 102;
        int numberOfSeats = 60; // количество сидячих мест

        int seatsPeople = 20; // количество людей на сидячих местах
        int standingPeople = 42; // количество стоящих людей

        if (seatsPeople < 60) {
            System.out.println("В вагоне еще осталось " + (numberOfSeats - seatsPeople) + " сидячих мест.");
        } else {
            System.out.println("Сидячих мест нет.");
        }
        if (standingPeople < (trainCapacity - numberOfSeats)) {
            System.out.println("В вагоне еще осталось " + (trainCapacity - numberOfSeats - standingPeople) + " стоячих мест.");
        } else {
            System.out.println("Стоячих мест нет.");
        }

    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 10;
        int two = 2;
        int three = 10;

        if (one>two && one>=three) {
            System.out.println("Наибольшее число " + one);
        }
        else if (two>one && two>=three) {
            System.out.println("Наибольшее число " + two);
        }
        else if (three>one && three>=two) {
            System.out.println("Наибольшее число " + three);
        } else {
            System.out.println("Все числа равны.");
        }
    }
}

