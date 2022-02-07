package com.company;

import java.util.Arrays;
import java.util.Scanner;

class Member implements Comparable<Member>{
    int age;
    String name;
    int number;

    public Member(int age,String name,int number){
        this.age = age;
        this.name = name;
        this.number = number;
    }

    @Override
    public int compareTo(Member m){
        //나이가 같지 않으면 나이 오름차순
        if(this.age != m.age){
            return this.age - m.age;
        }//나이가 같으면 먼저 가입한 순서로,i
        else{
            return this.number - m.number;
        }
    }
}

public class BOJ10814 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Member []m = new Member[n];
        sc.nextLine();
        for(int i = 0;i<n;i++){
            int age = sc.nextInt();
            String name = sc.next();
            m[i] = new Member(age,name,i);
        }

        Arrays.sort(m);

        for(Member member : m){
            System.out.println(member.age + " " + member.name);
        }
    }
}
