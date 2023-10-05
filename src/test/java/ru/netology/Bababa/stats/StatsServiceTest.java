package ru.netology.Bababa.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSalesAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.salesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSalesPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSalesPerMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLuckyMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.luckyMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnluckyMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.unluckyMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsUnderAverageSalesPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsUnderAverageSalesPerMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsOverAverageSalesPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsOverAverageSalesPerMonth(sales);

        Assertions.assertEquals(expected, actual);
    }
}
