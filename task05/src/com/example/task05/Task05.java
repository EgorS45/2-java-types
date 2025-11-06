package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        if (x == 0) {
            return "TRUE";
        }

        int value = x;
        while (value > 0) {
            int digit = value % 10;
            if ((digit % 2) != 0) {
                return "FALSE";
            }
            value /= 10;
        }

        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
