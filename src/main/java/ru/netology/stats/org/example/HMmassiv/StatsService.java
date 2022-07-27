package ru.netology.stats.org.example.HMmassiv;
public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
    public int sumSales (int[] sales) {
        int allSum = 0;
        for (int x : sales) {
            allSum += x;

        }

        return allSum;
    }


    public int mediumSum(int[] sales){
        int allSumm = sumSales(sales);
        int midSum =allSumm / sales.length;
        return midSum;
    }

    public int maxSaleMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public int belowAverage(int[] sales){
        int midSum = mediumSum(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < midSum){
                month ++;
            }
        }
        return month;
    }
    public int aboveAverage(int[] sales) {
        int midSum = mediumSum(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > midSum) {
                month++;
            }
        }
        return month;


    }

}
