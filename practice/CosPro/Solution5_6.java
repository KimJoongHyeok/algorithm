package com.CosPro;

public class Solution5_6 {
    public static void main(String[] args) {
        String s1 = "112001";
        String s2 = "12010";
        int p = 3;
        int q = 8;

        int num1 = convert_to_decimal(s1, p);
        int num2 = convert_to_decimal(s2, p);
        String answer = convert_to_q(num1 + num2, q);
        System.out.println("answer = " + answer);

    }

    public static int convert_to_decimal(String num, int p) {
        int len = num.length();
        int mul = 1;
        int answer = 0;
        for (int i = len - 1; i >= 0; i--) {
            answer += (num.charAt(i) - '0') * mul;
            mul *= p;
        }
        return answer;
    }

    public static String convert_to_q(int num, int q) {
        if (num == 0) return "";
        return (convert_to_q(num / q, q) + (char) (num % q + '0'));
    }

}
