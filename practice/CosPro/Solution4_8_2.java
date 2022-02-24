package com.CosPro;

import java.util.ArrayList;

public class Solution4_8_2 {

    static ArrayList<Integer> num_list = new ArrayList<Integer>();

    static public int[] func_a(int[] card) {
        int card_count[] = new int[10];
        for (int i = 0; i < card.length; i++) {
            card_count[card[i]]++;
        }
        return card_count;
    }

    static public void func_b(int level, int max_level, int num, int[] current_count, int[] max_count) {
        if (level == max_level) {
            System.out.println(num);
            num_list.add(num);
            return;
        }
        for (int i = 1; i <= 9; i++) {
            if (current_count[i] < max_count[i]) {
                current_count[i] += 1;
                func_b(level + 1, max_level, num * 10 + i, current_count, max_count);
                current_count[i] -= 1;
            }
        }
    }

    static public int func_c(ArrayList<Integer> list, int n) {
        for (int i = 0; i < list.size(); i++) {
            if (n == list.get(i))
                return i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] card = {1, 2, 1, 3};
        int n = 1312;

        int[] card_count = func_a(card);
        func_b(0, card.length, 0, new int[10], card_count);
        int answer = func_c(num_list, n);

        System.out.println(answer);
    }
}
