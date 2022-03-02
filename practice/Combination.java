package com.Permutation;

public class Combination {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        boolean[] visited = new boolean[arr.length];
        int r = 2;
        comb(arr, visited, 0, r);
        System.out.println(sb);
    }

    public static void comb(int[] arr, boolean[] visited, int index, int r) {
        if (r == 0) {
            for (int i = 0; i < visited.length; i++) {
                if(visited[i]){
                    sb.append(arr[i]).append(" ");
                }
            }
            sb.append("\n");
            return;
        }
        if (index == arr.length) return;
        else {
            visited[index] = true;
            comb(arr, visited, index, r - 1);

            visited[index] = false;
            comb(arr, visited, index + 1, r);
        }
    }
}
