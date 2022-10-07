package com.neoflex.calculate.calculation;

import org.apache.commons.lang3.math.NumberUtils;
import static com.neoflex.calculate.notification.Notification.ERROR;
import static com.neoflex.calculate.notification.Notification.NOT_NUMBER;

public class CalculateProcess {
    public static String getCalculations(String numberAsString1)
    {
        if (!NumberUtils.isDigits(numberAsString1)) return ERROR + numberAsString1 + NOT_NUMBER;

        double avgDaysOfMonth = 29.3; //среднее количество дней в месяце
        int vacationDays = 28; // количество отпускных дней

        float averageSalary = Float.parseFloat(numberAsString1);
        return String.valueOf((averageSalary/avgDaysOfMonth) * vacationDays);
    }
}