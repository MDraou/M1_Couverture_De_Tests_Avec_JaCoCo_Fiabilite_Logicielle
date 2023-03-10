package deque;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Objects;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Test class for the ArrayDoubleQueue class.
 */

class TestArrayDoubleEndedQueue {

    private ArrayDoubleEndedQueue<Integer> queue;
    private Integer[] list = {0, 1, 2, 3, 4, 5};


    @BeforeEach
    void init() {
        queue = new ArrayDoubleEndedQueue<>(6);
        queue.addFirst(list[0]);
        queue.addLast(list[1]);
        queue.addLast(list[2]);
        queue.addLast(list[3]);
        queue.addLast(list[4]);
        queue.addLast(list[5]);
    }

    @Test
    void removeFirst() {
        assertThat(Objects.equals(queue.removeFirst(), 0));
    }

    @Test
    void removeLast() {
        assertThat(Objects.equals(queue.removeLast(), 5));
    }

    @Test
    void getFirst() {
        assertThat(Objects.equals(queue.getFirst(), 0));
    }

    @Test
    void getLast() {
        assertThat(Objects.equals(queue.getLast(), 5));
    }

    @Test
    void size() {
        assertThat(queue.size()).isEqualTo(6);
    }

    @Test
    void contains() {
        assertThat(Objects.equals(queue.contains(3), true));
    }

    @Test
    void notContains() {
        assertThat(Objects.equals(queue.contains(24), false));
    }

    @Test
    void notAddFirst() {
        queue.addFirst(9);
        assertThat(!Objects.equals(queue.getFirst(), 9));
    }

    @Test
    void notAddLast() {
        queue.addLast(7);
        assertThat(!Objects.equals(queue.getLast(), 7));
    }

    @Test
    void removeFirstEmpty() {
        queue = new ArrayDoubleEndedQueue<>(3);
        assertThat(Objects.equals(queue.removeFirst(), null));
    }

    @Test
    void removeLastEmpty() {
        queue = new ArrayDoubleEndedQueue<>(3);
        assertThat(Objects.equals(queue.removeLast(), null));
    }

}
