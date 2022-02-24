package com.CosPro;

public class Solution1_5 {
    static boolean inRange(int x, int y, int N) {
        return 0 <= x && x < N && 0 <= y && y < N;
    }

    public static void main(String[] args) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int N = 5;
        int x = 0;
        int y = 0;
        int arr[][] = new int[N][N];

        int num = 1;
        while (inRange(x, y, N) && arr[x][y] == 0) {
            for (int dir = 0; dir < 4; dir++) {
                if (!inRange(x, y, N) || arr[x][y] != 0) break; //범위벗어낫거나 값이 채워져있으면
                while (true) {
                    arr[x][y] = num++;
                    int check_x = x + dx[dir];
                    int check_y = y + dy[dir];
                    if (!inRange(check_x, check_y, N) || arr[check_x][check_y] != 0) {
                        x += dx[(dir + 1) % 4]; //방향전환용
                        y += dy[(dir + 1) % 4];
                        break;
                    }
                    x = check_x;
                    y = check_y;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf(" %2d",arr[i][j]);
                if(i == j){
                    sum += arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
