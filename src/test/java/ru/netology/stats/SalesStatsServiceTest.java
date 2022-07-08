package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SalesStatsServiceTest {
    @Test
    public void shouldFindAmontOfSales() {
        StatsSServices services = new StatsSServices();

        int[] sales = {
                10, 15, 6, 13, 11, 20, 19, 21, 7, 14, 4, 8
        };

        int expectedAmount = 148;
        int actualAmount = services.getAmountSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindAmontOfSalesNegative() {
        StatsSServices services = new StatsSServices();

        int[] sales = {
                10, 15, 6, 13, 11, 20, 19, 21, 7, 14, 4, 8
        };

        int expectedAmount = 500;
        int actualAmount = services.getAmountSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindMediumAmountOfMonths() {
        StatsSServices services = new StatsSServices();

        int[] sales = {
                18, 5, 23, 15, 7, 20, 9, 13, 17, 6, 19, 8
        };

        int expectedMediumAmount = 13;
        int actualMediumAmount = services.getMediumAmountSalesOfMonth(sales);

        Assertions.assertEquals(expectedMediumAmount, actualMediumAmount);
    }

    @Test
    public void shouldFindMediumAmountOfMonthsNegative() {
        StatsSServices services = new StatsSServices();

        int[] sales = {
                18, 5, 23, 15, 7, 20, 9, 13, 17, 6, 19, 8
        };

        int expectedMediumAmount = 11;
        int actualMediumAmount = services.getMediumAmountSalesOfMonth(sales);

        Assertions.assertEquals(expectedMediumAmount, actualMediumAmount);
    }

    @Test
    public void shouldFindHighSalesOfMonth() {
        StatsSServices services = new StatsSServices();

        int[] sales = {
                281, 115, 113, 125, 111, 440, 109, 230, 117, 114, 104, 118
        };

        int expectedMonth = 5;
        int actualMonth = services.getHighSalesMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);


    }

    @Test
    public void shouldFindHighSalesOfMonthNegative() {
        StatsSServices services = new StatsSServices();

        int[] sales = {
                281, 115, 113, 125, 111, 440, 109, 230, 117, 114, 104, 118
        };

        int expectedMonth = 1;
        int actualMonth = services.getHighSalesMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);


    }

    @Test
    public void shouldFindBetweenEnds() {
        StatsSServices service = new StatsSServices();

        int[] sales = {
                81, 115, 134, 415, 717, 120, 129, 240, 57, 114, 144, 118
        };

        int expectedMonth = 8;
        int actualMonth = service.getMinSalesMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindBetweenEndsNegative() {
        StatsSServices service = new StatsSServices();

        int[] sales = {
                81, 115, 134, 415, 717, 120, 129, 240, 57, 114, 144, 118
        };

        int expectedMonth = 4;
        int actualMonth = service.getMinSalesMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMonthBelowAverage() {
        StatsSServices service = new StatsSServices();

        int[] sales = {
                142, 152, 133, 145, 171, 320, 194, 210, 73, 144, 114, 128
        };

        int expectedMonth = 8;
        int actualMonth = service.getMonthSalesBelowAverage(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMonthBelowAverageNegative() {
        StatsSServices service = new StatsSServices();

        int[] sales = {
                142, 152, 133, 145, 171, 320, 194, 210, 73, 144, 114, 128
        };

        int expectedMonth = 11;
        int actualMonth = service.getMonthSalesBelowAverage(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void shouldFindMonthAboveAverage() {
        StatsSServices service = new StatsSServices();

        int[] sales = {
                142, 152, 133, 145, 171, 320, 194, 210, 73, 144, 114, 128
        };

        int expectedMonth = 4;
        int actualMonth = service.getMonthSalesAboveAverage(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);


    }

    @Test
    public void shouldFindMonthAboveAverageNegative() {
        StatsSServices service = new StatsSServices();

        int[] sales = {
                142, 152, 133, 145, 171, 320, 194, 210, 73, 144, 114, 128
        };

        int expectedMonth = 6;
        int actualMonth = service.getMonthSalesAboveAverage(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

}
