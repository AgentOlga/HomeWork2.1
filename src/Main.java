import java.awt.geom.Arc2D;

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

    public static void task1() {
        int dogGrey = 8;
        byte catBlack = 120;
        short appleRed = 12442;
        long snakeBlack = 200000L;
        float percentageWorkHours = 12.23f;
        double rentMoney = 123.123;

        System.out.println("Собаки " + dogGrey);
        System.out.println("Кошки " + catBlack);
        System.out.println("Яблоки " + appleRed);
        System.out.println("Змеи " + snakeBlack);
        System.out.println("Часы работы " + percentageWorkHours);
        System.out.println("Арендная плата " + rentMoney);
    }


    public static void task2() {
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        int d = 569;
        int e = -159;
        short f = 27897;
        byte g = 67;
    }

    public static void task3() {
        int classLudPavl = 23;
        int classAnnSerg = 27;
        int classEkatAndr = 30;
        int paper = 480;
        int totalClass = classLudPavl + classAnnSerg + classEkatAndr;
        int listPaper = paper / totalClass;

        System.out.println("На каждого ученика рассчитано " + listPaper + " листов бумаги.");
    }

    public static void task4() {
        int minutes = 2;
        int machineOutputInTwoMinutes = 16;
        int time1 = 20;
        int machineOutputInTwentyMinutes = (time1 * machineOutputInTwoMinutes) / minutes;
        int time2 = 1440;
        int machineOutputPerDay = (time2 * machineOutputInTwoMinutes) / minutes;
        int time3 = 3 * time2;
        int machineOutputPerThreeDays = (time3 * machineOutputInTwoMinutes) / minutes;
        int time4 = 30 * time2;
        int machineOutputPerMonth = (time4 * machineOutputInTwoMinutes) / minutes;

        System.out.println("За 20 минут машина произвела " + machineOutputInTwentyMinutes  +  " штук бутылок.");
        System.out.println("За сутки машина произвела " + machineOutputPerDay  +  " штук бутылок.");
        System.out.println("За 3 суток машина произвела " + machineOutputPerThreeDays  +  " штук бутылок.");
        System.out.println("Зa месяц машина произвела " + machineOutputPerMonth  +  " штук бутылок.");

    }
    public static void task5() {
        int amountCansOfPaint = 120;
        int oneClassAmountWhitePaint = 2;
        int oneClassAmountBrownPaint = 4;
        int amountOfClassesInSchool = amountCansOfPaint / (oneClassAmountBrownPaint + oneClassAmountWhitePaint);
        int totalAmountWhitePaint = amountOfClassesInSchool * oneClassAmountWhitePaint;
        int totalAmountBrownPaint = amountOfClassesInSchool * oneClassAmountBrownPaint;

        System.out.println("В школе, где есть " + amountOfClassesInSchool + " классов, нужно " +  totalAmountWhitePaint + " банок белой краски и " + totalAmountBrownPaint + " банок коричневой краски.");
    }
    public static void task6() {
        int amountBananas = 5;
        float weightOneBanana = 80f;
        float weightBananas = amountBananas * weightOneBanana;
        int totalWeightMilk = 2;
        float weightOneMilk = 105f;
        float  weightMilk = totalWeightMilk * weightOneMilk;
        int amountIceCream = 2;
        float weightOneIceCream = 100f;
        float  weightIceCream = amountIceCream * weightOneIceCream;
        int amountEggs = 4;
        float  weightOneEgg = 70f;
        float  weightEggs = amountEggs * weightOneEgg;
        float  weightSportBreakfastGrams = weightBananas + weightMilk + weightIceCream + weightEggs;
        float wightSportBreakfastKg = weightSportBreakfastGrams / 1000;


        System.out.println("Bес спортзавтрака равен " + weightSportBreakfastGrams + " граммов.");
        System.out.println("Bес спортзавтрака равен " + wightSportBreakfastKg + " кг.");
    }


    public static void task7() {
        int amountOfLostKilo = 7000;
        int amountOfLostKgOneDay1 = 250;
        int amountOfLostKgOneDay2 = 500;
        int amountDietDays1 = amountOfLostKilo / amountOfLostKgOneDay1;
        int amountDietDays2 = amountOfLostKilo / amountOfLostKgOneDay2;

        System.out.println("Если терять в день 250 граммов, то потребуется " + amountDietDays1 + " дней," + " чтобы потерять 7 кг.");
        System.out.println("Если терять в день 500 граммов, то потребуется " + amountDietDays2 + " дней," + " чтобы потерять 7 кг.");

    }

    public static void task8() {

        int increaseFromCurrentSalary = 10;
        int salaryOneMonthMasha = 67760;
        int salaryOneMonthDenis = 83690;
        int salaryOneMonthKristina = 76230;
        int increaseOneMonthMasha = (salaryOneMonthMasha * increaseFromCurrentSalary) / 100;
        int increaseOneMonthDenis = (salaryOneMonthDenis * increaseFromCurrentSalary) / 100;
        int increaseOneMonthKristina = (salaryOneMonthKristina * increaseFromCurrentSalary) / 100;
        int newSalaryOneMonthMasha = salaryOneMonthMasha + increaseOneMonthMasha;
        int newSalaryOfYearMasha = (increaseOneMonthMasha + salaryOneMonthMasha) * 12;
        int newSalaryOneMonthDenis = salaryOneMonthDenis + increaseOneMonthDenis;
        int newSalaryOfYearDenis = (increaseOneMonthDenis + salaryOneMonthDenis) * 12;
        int newSalaryOneMonthKristina = salaryOneMonthKristina + increaseOneMonthKristina;
        int newSalaryOfYearKristina = (increaseOneMonthKristina + salaryOneMonthKristina) * 12;
        int differenceBeforeAndAfterIncreaseMasha = newSalaryOfYearMasha - (salaryOneMonthMasha * 12);
        int differenceBeforeAndAfterIncreaseDenis = newSalaryOfYearDenis - (salaryOneMonthDenis * 12);
        int differenceBeforeAndAfterIncreaseKristina = newSalaryOfYearKristina - (salaryOneMonthKristina * 12);

        System.out.println("Маша теперь получает " + newSalaryOneMonthMasha + " рублей в месяц. Годовой доход вырос на " + differenceBeforeAndAfterIncreaseMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryOneMonthDenis + " рублей в месяц.  Годовой доход вырос " + differenceBeforeAndAfterIncreaseDenis + " на рублей.");
        System.out.println("Кристина теперь получает " + newSalaryOneMonthKristina + " рублей в месяц. Годовой доход вырос " + differenceBeforeAndAfterIncreaseKristina + " на рублей.");

    }

}
