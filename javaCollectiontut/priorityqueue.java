import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class priorityqueue {
    public static void main(String[] args) {
    Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    pq.offer(34);
    pq.offer(56);
    pq.offer(50);
    System.out.println(pq);
    
    System.out.println(pq.peek());
    pq.poll();
    pq.poll();
    System.out.println(pq.peek());

    }
}