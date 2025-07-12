/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author wilso
 */
// FinancialForecast.java
public class FinancialForecast {

    // Recursive method to calculate future value after 'years'
    public static double futureValue(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        return futureValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialAmount = 1000;
        double growthRate = 0.05; // 5% growth per year
        int years = 5;

        double fv = futureValue(initialAmount, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f\n", years, fv);
    }
}

