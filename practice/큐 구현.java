import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(5);
        q.offer(4);
        q.offer(3);
        q.offer(2);
        q.poll(); //삭제
        q.poll();
        q.offer(1);
        q.offer(9);
        q.poll();

        while (!q.isEmpty()) {
            System.out.println(q.poll() + " ");
        }
    }
}
