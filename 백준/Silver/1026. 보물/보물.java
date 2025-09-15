import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(Integer[] arr1, Integer[] arr2) {
        int answer = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2, (a, b) -> b - a);

        for (int i = 0; i < arr1.length; i++) {
            answer += arr1[i] * arr2[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] arr1 = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        Integer[] arr2 = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(T.solution(arr1, arr2));
    }
}
