package com.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Word implements Comparable<Word>{
    String s;
    int length;

    public Word(String s,int length){
        this.s = s;
        this.length = length;
    }

    @Override
    public int compareTo(Word w){
        if(this.length == w.length){
            return this.s.compareTo(w.s);
        }else{
            return this.length - w.length;
        }
    }
}
public class BOJ1181 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Word[] arr = new Word[n];
        for (int i = 0; i < n; i++) {
           String word = sc.next();
           arr[i] = new Word(word,word.length());
        }

        Arrays.sort(arr);

        for(Word w : arr){
            System.out.println(w.s);
        }

    }
}
