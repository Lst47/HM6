package ru.netology.stats.org.example.HMmassiv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestStatsService {
    int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    public void minSalesTest (){
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.minSales(sale);

        Assertions.assertArrayEquals(new int[]{expected}, new int[]{actual});


    };

    @Test
    public void sumSalesTest (){
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.sumSales(sale);

        Assertions.assertArrayEquals(new int[]{expected}, new int[]{actual});


    };

    @Test
    public void mediumSumTest (){
        StatsService service = new StatsService();

        int expected = 15;
        int actual = service.mediumSum(sale);

        Assertions.assertArrayEquals(new int[]{expected}, new int[]{actual});


    };

    @Test
    public void maxSaleMonthTest (){
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.maxSaleMonth(sale);

        Assertions.assertArrayEquals(new int[]{expected}, new int[]{actual});


    };

    @Test
    public void belowAverage (){
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.belowAverage(sale);

        Assertions.assertArrayEquals(new int[]{expected}, new int[]{actual});


    };

    @Test
    public void aboveAverage (){
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.aboveAverage(sale);

        Assertions.assertArrayEquals(new int[]{expected}, new int[]{actual});


    };
}
