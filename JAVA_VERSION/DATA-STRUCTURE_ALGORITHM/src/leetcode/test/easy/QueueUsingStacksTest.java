package leetcode.test.easy;

import leetcode.easy.QueueUsingStacks;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueUsingStacksTest {
    private final QueueUsingStacks myQueue;
    QueueUsingStacksTest() {
        myQueue = new QueueUsingStacks();
    }

    @Test
    void testQueueUsingTwoStacks() {
        Queue<Integer> actualQueue = new LinkedList<>();

        myQueue.enqueue(4);
        myQueue.enqueue(8);
        myQueue.enqueue(15);

        actualQueue.add(4);
        actualQueue.add(8);
        actualQueue.add(15);

        int expected = actualQueue.poll();
        assertEquals(expected, myQueue.dequeue());

        myQueue.dequeue();
        myQueue.enqueue(16);

        actualQueue.poll();
        actualQueue.add(16);

        expected = actualQueue.peek();
        assertEquals(expected, myQueue.peek());
        assertEquals(myQueue.isEmpty(), actualQueue.isEmpty());
    }
}
