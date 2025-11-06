package com.example.task14;

public class Task14 {

    public static int reverse(int value) {

        int result = 0;
        int remaining = value;

        while (remaining > 0) {
            result = result * 10 + remaining % 10;
            remaining /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
         */
    }


}
