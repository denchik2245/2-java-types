package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

        if (c >= 'a' && c <= 'z') {

            c = (char)(c - ('a' - 'A'));
        }
        return c;
    }


    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        char result = solution('x');
        System.out.println(result);
         */
    }

}
