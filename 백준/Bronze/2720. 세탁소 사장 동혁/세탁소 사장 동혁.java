import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int[] arr) {

        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int total = arr[i];

            answer.add(total / quarter);
            total %= quarter;
            answer.add(total / dime);
            total %= dime;
            answer.add(total / nickel);
            total %= nickel;
            answer.add(total / penny);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> solution = m.solution(arr);
        for (int i = 0; i < solution.size(); i++) {
            if (i != 0 && i % 4 == 0) {
                System.out.println();
                System.out.print(solution.get(i) + " ");
            } else {
                System.out.print(solution.get(i) + " ");
            }
        }
    }
}
