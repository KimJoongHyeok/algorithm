package com.CosPro;

public class Solution5_7 {
    public static void main(String[] args) {
        int[][] connections = {{1, 2}, {1, 3}, {2, 3}};
        int answer = 0;

        int[]parents = new int [connections.length+1];
        //parent 배열 초기화
        for(int i = 1;i< parents.length;i++){
            parents[i] = i;
        }

        for (int i = 0; i < connections.length; i++){
            if(union(parents,connections[i][0],connections[i][1])){
                answer = i + 1;
                break;
            }
        }
        System.out.println(answer);
    }

    public static boolean union(int []parents,int a,int b){
        a = find(parents,a);
        b = find(parents,b);

        if(a == b) return true;

        int small = Math.min(a,b);
        int big = Math.max(a,b);
        parents[big] = small;
        return false;
    }

    public static int find(int []parents,int num){
        if(num == parents[num]) return num;
        return find(parents,parents[num]);
    }
}
