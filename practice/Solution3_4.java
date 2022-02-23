package com.CosPro;

import java.util.ArrayList;

public class Solution3_4 {
    public static void main(String[] args) {
        String s1 = new String("abcdab");
        String s2 = new String("ababc");

        int len = Math.min(s1.length(), s2.length());

        int len_max = 0;
        for (int i = 0; i < len; i++) {
            String check_s1 = s1.substring(0, i + 1);
            System.out.println("check_s1 = " + check_s1);
            String check_s2 = s2.substring(s2.length() - i - 1, s2.length());
            System.out.println("check_s2 = " + check_s2);
            if (check_s1.equals(check_s2)) {
                len_max = Math.max(len_max, check_s1.length());
            }

            String reverse_s1 = s1.substring(s1.length() - i - 1, s1.length());
            String reverse_s2 = s2.substring(0, i + 1);
            if(reverse_s1.equals(reverse_s2)){
                len_max = Math.max(len_max,reverse_s1.length());
            }
        }
        int answer = s1.length() + s2.length() - len_max;
        System.out.println(answer);

//        for (int i = len - 1; i >= 0; i--) {
//            String sub_s1 = s1.substring(i, s1.length());
//            for (int j = 1; j <= len; j++) {
//                String sub_s2 = s2.substring(0, j);
//                if (sub_s1.equals(sub_s2)) {
//                    System.out.println(sub_s1 + " " + sub_s2);
//                    len_max = Math.max(len_max, sub_s1.length());
//                }
//            }
//        }
//
//        for (int i = 1; i <= len; i++) {
//            String sub_s1 = s1.substring(0, i);
//            for (int j = len - 1; j >= 0; j--) {
//                String sub_s2 = s2.substring(i, s1.length());
//                if (sub_s1.equals(sub_s2)) {
//                    System.out.println(sub_s1 + " " + sub_s2);
//                    len_max = Math.max(len_max, sub_s1.length());
//                }
//            }
//        }
//        System.out.println(len_max);
//        int answer = 0;
//        int len = Math.min(s1.length(), s2.length());
//        int idx = 0;
//
//        for (int i = 0; i < len; i++) {
//            String sub1 = s1.substring(s1.length() - i -1, s1.length() - 1);
//            String sub2 = s2.substring(0, i);
//            if(sub1.equals(sub2)) idx = i;
//        }
//
//        answer = s1.concat(s2.substring(idx, s2.length()-1)).length();
//        System.out.println(answer);
    }
}
