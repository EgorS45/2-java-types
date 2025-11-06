package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        long value = Long.parseLong(input);

        if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
            return "byte";
        }
        if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
            return "short";
        }
        if (value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) {
            return "int";
        }
        return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
