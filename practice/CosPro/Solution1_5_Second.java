package com.CosPro;

public class Solution1_5_Second {

    static boolean inRange(int x, int y, int N) {
        if (0 <= x && x < N && 0 <= y && y < N) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int N = 7;
        int x = 0;
        int y = 0;
        int num = 1;
        int[][] arr = new int[N][N];

        while (inRange(x, y, N) && arr[x][y] == 0) {
            for (int dir = 0; dir < 4; dir++) {
                if (!inRange(x, y, N) || arr[x][y] != 0) break;
                while (true) {
                    arr[x][y] = num++;
                    int check_x = x + dx[dir];
                    int check_y = y + dy[dir];
                    if (inRange(check_x, check_y, N) == false || arr[check_x][check_y] != 0) { //끝이거나 방향전환을 해야한다면
                        x += dx[(dir + 1) % 4]; // x 배열 인덱스를 방향전환
                        y += dy[(dir + 1) % 4];
                        break;
                    }
                    x = check_x;
                    y = check_y;
                }
            }
        }

        int answer = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i == j) answer+= arr[i][j];
                System.out.printf(" %2d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("answer = " + answer);
        
        
    }
}
