import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2447 {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        star(0, 0, n, false);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void star(int x, int y, int n, boolean blank) {
        if (blank) {
            for (int i = x; i < x + n; x++) {
                for (int j = y; j < y + n; y++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }
        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        int size = n / 3;
        int count = 0;
        for (int i = x; i < x + n; i += size) {
            for (int j = y; j < y + n; j += size) {
                count++;
                if (count == 5) {
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                }
            }
        }
    }
}
