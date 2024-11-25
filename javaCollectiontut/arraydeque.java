import java.util.Comparator;
import java.util.ArrayDeque;
import java.util.Queue;
public class arraydeque{
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offer(45);
        adq.offer(443);
        adq.offerFirst(34);
        adq.offerLast(78);
        adq.offer(56);
        System.out.println(adq);

        // .peek()
        // .peekFirst();
        // .peekLast();
        // .pollLast();
        // .pollFirst();
    }
}