package com.example.task12;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task12 {

    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {

        // TODO раскомментируйте и исправьте код

        BigDecimal result = sum.setScale(9, RoundingMode.HALF_UP);
        BigDecimal base = BigDecimal.ONE.add(percent).setScale(9, RoundingMode.HALF_UP);

        for (int i = 0; i < 12; i++) {
            result = result.multiply(base).setScale(9, RoundingMode.HALF_UP);
        }

        return result.setScale(9, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {

        BigDecimal sum = new BigDecimal(500).setScale(9, BigDecimal.ROUND_HALF_UP); // 500 руб. на счете
        BigDecimal percent = new BigDecimal(0.00000001f).setScale(9, BigDecimal.ROUND_HALF_UP); // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
