package deque;

import org.junit.jupiter.api.Test;
import stringarray.StringArray;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TestArrayDoubleEndedQueue {

    private ArrayDoubleEndedQueue<Integer> queue1;

    private Integer[] list1 = {0, 1, 2, 3, 4, 5};

    @Test
    void addFirst() {
    }

    @Test
    void addLast() {
    }

    @Test
    void removeFirst() {
    }

    @Test
    void removeLast() {
    }

    @Test
    void getFirst() {
        queue1 = new ArrayDoubleEndedQueue<Integer>();
        assertThat(queue1.getFirst().equals(0));
    }

    @Test
    void getLast() {
        queue1 = new ArrayDoubleEndedQueue<Integer>();
        assertThat(queue1.getLast().equals(4));
    }

    @Test
    void size() {
        queue1 = new ArrayDoubleEndedQueue<Integer>();
        assertThat(queue1.size()).isEqualTo(6);
    }

    @Test
    void containsFirst() {
        queue1 = new ArrayDoubleEndedQueue<Integer>();
        assertThat(queue1.getFirst().equals(list1[0]));
    }

    @Test
    void containsLast() {
        queue1 = new ArrayDoubleEndedQueue<Integer>();
        assertThat(queue1.getLast().equals(list1[5]));
    }

}
