package com.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ10828 {

    private static ArrayList<String> stack = new ArrayList<>();
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String s = br.readLine();
            if (s.contains("push")) {
                String pushNum = s.substring(5, s.length());
                push(pushNum);
            } else if (s.equals("top")) {
                top();
            } else if (s.equals("size")) {
                size();
            } else if (s.equals("pop")) {
                pop();
            } else if (s.equals("empty")) {
                empty();
            }
        }
        System.out.println(sb);

    }

    private static void push(String num) {
        stack.add(num);
    }

    private static void pop() {
        int size = stack.size();
        if (size == 0) {
            sb.append(-1).append("\n");
        } else {
            sb.append(stack.get(size - 1)).append("\n");
            stack.remove(size - 1);
        }
    }

    private static void top() {
        int size = stack.size();
        if (size == 0) {
            sb.append(-1).append("\n");
        } else {
            sb.append(stack.get(size - 1)).append("\n");
        }
    }

    private static void size() {
        sb.append(stack.size()).append("\n");
    }

    private static void empty() {
        if (stack.size() == 0) {
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");
        }
    }
}
