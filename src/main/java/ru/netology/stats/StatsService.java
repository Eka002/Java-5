package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;
    }

    public int maximum(long[] sales) {
        int MaximumMonth = 0;
        long maximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (maximum <= sales[i]) {
                maximum = sales[i];
                MaximumMonth = i;
            }
        }

        return MaximumMonth;
    }

    public int minimum(long[] sales) {
        int MinimumMonth = 0;
        long minimum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (minimum >= sales[i]) {
                minimum = sales[i];
                MinimumMonth = i;
            }
        }
        return MinimumMonth;
    }

    public int mouthLowerAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;

            }

        }
        return counter;
    }

    public int mouthAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;

            }

        }
        return counter;
    }
}
