import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public int solution(String str) {
        String[] split = str.split("-");
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            
            String[] plusArr = s.split("\\+");
            int sum = 0;
            for (String plus : plusArr) {
                sum += Integer.parseInt(plus);
            }
            list.add(sum);
        }

        int answer = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            answer -= list.get(i);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(T.solution(input));
    }
}
