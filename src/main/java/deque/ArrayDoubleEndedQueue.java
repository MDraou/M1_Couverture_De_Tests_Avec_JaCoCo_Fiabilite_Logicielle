package deque;

import java.util.Objects;

public class ArrayDoubleEndedQueue<E> implements DoubleEndedQueue<E> {

    private Object[] queue;

    private int indexFirst = 0;

    private int capacity;

    private int size = 0;

    public ArrayDoubleEndedQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new Object[capacity];
    }

    @Override
    public void addFirst(E e) {
        if (size != capacity) {
            queue[indexFirst] = e;
            indexFirst = (indexFirst + capacity - 1) % capacity;
            size++;
        }
    }

    @Override
    public void addLast(E e) {
        if (size != capacity) {
            queue[(indexFirst + size) % capacity] = e;
            size++;
        }
    }

    @Override
    public E removeFirst() {
        if (size > 0) {
            E element = (E) queue[indexFirst];
            indexFirst = (indexFirst + 1) % capacity;
            size--;
            return element;
        }
        return null;
    }

    @Override
    public E removeLast() {
        if (size > 0) {
            E element = (E) queue[(indexFirst + size-1) % capacity];
            size--;
            return element;
        }
        return null;
    }

    @Override
    public E getFirst() {
        return (E) queue[indexFirst];
    }

    @Override
    public E getLast() {
        return (E) queue[(indexFirst + size - 1) % capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0 ; i < capacity ; i++) {
            if (Objects.equals(queue[i],o)) return true;
        }
        return false;
    }

}
