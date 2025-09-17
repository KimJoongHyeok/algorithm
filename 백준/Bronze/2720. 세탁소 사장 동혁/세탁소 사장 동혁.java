import java.util.Scanner;

public class Main {
    public String solution(int[] arr) {

        int[] money = {25, 10, 5, 1};
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            int total = arr[i];

            for (int j = 0; j < money.length; j++) {
                answer.append(total / money[j]).append(" ");
                total %= money[j];
            }

            answer.append("\n");
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(m.solution(arr));
    }
}
