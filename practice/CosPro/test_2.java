package com.CosPro;

public class test_2 {
    public static void main(String[] args) {
        String a = "10001";
        String b = "1101";

        int num1 = convert_to_decimal(a);
        int num2 = convert_to_decimal(b);

        String answer = convert_to_binary(num1 + num2);
        System.out.println("answer = " + answer);

    }
    
    public static int convert_to_decimal(String s){
        int mul = 1;
        int answer = 0;
        for(int i = s.length()-1;i >= 0;i--){
            answer += (s.charAt(i)-'0') * mul;
            mul *= 2;
        }
        return answer;
    }
    
    public static String convert_to_binary(int i){
        if(i == 0 ) return"";
        return convert_to_binary(i / 10)+ (char)(i%10 + '0');
    }
}
