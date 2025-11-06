package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        long sum = (long) x + y;

        if (sum == 0) {
            return 1;
        }

        long value = Math.abs(sum);
        int count = 0;
        while (value > 0) {
            value /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
