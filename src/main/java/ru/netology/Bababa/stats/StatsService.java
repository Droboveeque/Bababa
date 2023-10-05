package ru.netology.Bababa.stats;

public class StatsService {
    // сумма всех продаж
    public int salesAmount(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            amount += sale;
        }
        return amount;
    }

    // средняя сумма продаж в месяц
    public int averageSalesPerMonth(int[] sales) {
        int averageSales = salesAmount(sales) / sales.length;
        return averageSales;
    }

    // номер последнего месяца, в котором был пик продаж
    public int luckyMonth(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // номер последнего месяца, в котором был минимум продаж
    public int unluckyMonth(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // количество месяцев, в которых продажи были ниже среднего
    public int monthsUnderAverageSalesPerMonth(int[] sales) {
        int months = 0;
        for (int amountPerMonth : sales) {
            if (amountPerMonth < averageSalesPerMonth(sales)) {
                months++;
            }
        }
        return months;
    }

    // количество месяцев, в которых продажи были выше среднего
    public int monthsOverAverageSalesPerMonth(int[] sales) {
        int months = 0;
        for (int amountPerMonth : sales) {
            if (amountPerMonth > averageSalesPerMonth(sales)) {
                months++;
            }
        }
        return months;
    }

}
