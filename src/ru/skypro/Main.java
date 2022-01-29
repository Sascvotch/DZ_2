package ru.skypro;

public class Main {

    public static void main(String[] args) {
task6();
task7();
task8();
    }
        public static void task1_5() {
        //ЗАДАЧА 1

// целочисленный тип
        byte b1 = 1;
        short s = 2;
        int i = 3;
        long l = 4L;

//С плавающей точкой
        float f = 1.1f;
        double d1 = 2.1;
        //Символы
        char c1 = 64555;

//Логические
        boolean bo = true;
//ЗАДАЧА 2
        double weight1 = 78.2;
        double weight2 = 82.7;
        double weightTotal = weight1 + weight2;
        double weightDifference = weight1 - weight2;
        System.out.println("Общий вес боксеров " + weightTotal + " кг");
        System.out.println("Разница в весе боксеров " + weightDifference + " кг");
//ЗАДАЧА 3

        int banans = 5;
        double banansWeight = 80;
        int milk = 200 / 100;
        double milkWeight = 105;
        int ice = 2;
        double iceWeight = 100;
        int eggs = 4;
        double eggsWeight = 70;
        double breakfastWeight = banans * banansWeight + milk * milkWeight + ice * iceWeight + eggs * eggsWeight;
        double breakfastWeightKg = breakfastWeight / 1000;
        System.out.println("вес коктейля " + breakfastWeightKg + " кг");

        //ЗАДАЧА 4
        double sbros = 7 * 1000;
        double delta1 = 250;
        double delta2 = 500;
        double countDays1 = sbros / delta1;
        double countDays2 = sbros / delta2;
        double countDays12 = (countDays1 + countDays2) / 2;
        System.out.println("среднее количество дней " + countDays12);

        //ЗАДАЧА 5
        double salMasha = 67760;
        double salDen = 83690;
        double salKri = 76230;
        double salMashaPov = salMasha + salMasha * 10 / 100;
        double salDenPov = salDen + salDen * 10 / 100;
        double salKriPov = salKri + salKri * 10 / 100;
        System.out.println("Маша теперь получает " + salMashaPov + " рублей в месяц. Годовой доход вырос на " + (salMasha * 10 / 100) * 12 + " рублей");
        System.out.println("Денис теперь получает " + salDenPov + " рублей в месяц. Годовой доход вырос на " + (salDen * 10 / 100) * 12 + " рублей");
        System.out.println("Кристина теперь получает " + salKriPov + " рублей в месяц. Годовой доход вырос на " + (salKri * 10 / 100) * 12 + " рублей");
    }
       public static void task6() {
            //ЗАДАЧА 6
            int a = 12;
            int b = 27;
            int c = 44;
            int d = 15;
            int e = 9;
            int result = a * (b + (c - d * e));
            result=-result;
        System.out.println("Результат "+result);
        }
    public static void task7() {

        int a = 5;
        int b = 14;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
     //   a=b%a;
     //   b=b-a;
     //   a=a+b;
     //   System.out.println(a);
      //  System.out.println(b);
    }
    public static void task8() {

        int a = 456;
        int b;
        b=a%100/10;
        //b=(a%100-(a%100)%10)/10;
        System.out.println(b);
    }
}






