package ru.netology.stats;

public class StatsSServices {

    public int getAmountSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;

    }

    public int getMediumAmountSalesOfMonth(int[] sales) {
        int sum = getAmountSales(sales);
        return sum/ sales.length;

    }

    public int getHighSalesMonth(int[] sales) {
        int highSaleMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[highSaleMonth]) {
                highSaleMonth = i;
            }
        }
        return highSaleMonth;


    }

    public int getMinSalesMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;


    }

    public int getMonthSalesBelowAverage(int[] sales) {
        int sum = getAmountSales(sales);
        int average = sum / sales.length;
        int monthBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthBelowAverage++;
            }
        }

        return monthBelowAverage;
    }

    public int getMonthSalesAboveAverage(int[] sales) {
        int sum = getAmountSales(sales);
        int average = sum / sales.length;
        int monthAboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthAboveAverage++;
            }
        }

        return monthAboveAverage;
    }


}
