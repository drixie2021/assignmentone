package comp271.sorting;

import org.junit.jupiter.api.Test;

import java.nio.channels.ScatteringByteChannel;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortPriorityQueueTest {

    @Test
    public void getsMinimum() {

        PriorityQueue priorityQueue = new MergeSortPriorityQueue(34, 5, 12, 8, 35, 99, 1, 28);

        assertEquals(1, priorityQueue.removeMin());
        assertEquals(5, priorityQueue.removeMin());
        assertEquals(8, priorityQueue.removeMin());
        assertEquals(12, priorityQueue.removeMin());
        assertEquals(28, priorityQueue.removeMin());
        assertEquals(34, priorityQueue.removeMin());
        assertEquals(35, priorityQueue.removeMin());
        assertEquals(99, priorityQueue.removeMin());


   }
}
