package ru.mirea.lab3;
import java.text.NumberFormat;  // значки валюты
import java.util.Locale;  // для определения локации
import java.util.Formatter;

public class converter {
    private double rubToUsd;
    private double rubToEur;

    // курс валют по умолчанию
    public converter() {
        this.rubToEur = 0.0102;
        this.rubToUsd = 0.012;
    }

    public converter(double rubToEur, double rubToUsd) {
        this.rubToEur = rubToEur;
        this.rubToUsd = rubToUsd;
    }

    public double rubToEur(double rub) {
        return rub * rubToEur;
    }

    public double rubToUsd(double rub) {
        return rub * rubToUsd;
    }

    public double eurToRub(double eur) {
        return eur / rubToEur;
    }

    public double usdToRub(double usd) {
        return usd / rubToUsd;
    }

    public double usdToEur(double usd) {
        return usdToRub(usd) * rubToEur;
    }

    public double eurToUsd(double eur) {
        return eurToRub(eur) * rubToUsd;
    }

    public double convert(double summ, String from, String to) {
        if (from.equals("RUB") && to.equals("USD")) {
            return rubToUsd(summ);
        } else if (from.equals("RUB") && to.equals("EUR")) {
            return rubToEur(summ);
        } else if (from.equals("USD") && to.equals("RUB")) {
            return usdToRub(summ);
        } else if (from.equals("EUR") && to.equals("RUB")) {
            return eurToRub(summ);
        } else if (from.equals("USD") && to.equals("EUR")) {
            return usdToEur(summ);
        } else if (from.equals("EUR") && to.equals("USD")) {
            return eurToUsd(summ);
        } else {
            return summ;
        }
    }

    public void printConvert(double summ, String from, String to) {
        double res = convert(summ, from, to);
        System.out.println(summ + " " + from + " = " + res + " " + to);
    }

    public double getRubToUsd() {
        return rubToUsd;
    }

    public double getRubToEur() {
        return rubToEur;
    }

    public void setRubToUsd(double rubToUsd) {
        this.rubToUsd = rubToUsd;
    }

    public void setRubToEur(double rubToEur) {
        this.rubToEur = rubToEur;
    }
}





