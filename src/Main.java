import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

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

    public static void task1() {
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        int weather = 3;
        if (weather <= 5) {
            System.out.println("На улице " + weather + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + weather + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        int speed = 75;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
    }

    public static void task4() {
        int age = 19;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + " ,то ему пора спать");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        } else if (age > 60) {
            System.out.println("Если возраст человека равен " + age + " , то ему можно отдохнуть");
        }
    }

    public static void task5() {
        int age = 7;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " , то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " , то он может кататься на аттракционе только в сопровождении взрослого");
        } else if (age > 14) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        {
            System.out.println("Задача 6");
        }
        int train = 102;
        System.out.println("Общее количество мест в вагоне " + train);
        int passanger = 113;
        System.out.println("Пассажир " + passanger);
        if (passanger >= 1 && passanger <= 60) {
            System.out.println("Сидячее место есть " + passanger);
        } else if (passanger >= 61 && passanger <= 102) {
            System.out.println("Сидячих мест нет, но есть стоячее место");
        } else{
            System.out.println("Вагон полностью забит");
        }
    }
    public static void task7(){
        System.out.println("Задача 7");
        int one = 5;
        int two = 7;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        }
        else if (two > one && two > three) {
            System.out.println("Самое большое число " + two);
        }
        else if (three > one && three > two) {
            System.out.println("Самое большое число " + three);
        }
    }
}

