package deque;
import java.util.NoSuchElementException;

/**
 * A linear collection that supports element insertion and removal at
 * both ends. This interface defines methods to access the elements at both
 * ends of the deque (short for double ended queue). Methods are provided
 * to insert, remove, and examine the element. the methods throw an exception
 * if the operation fails.
 *
 * @author Doug Lea
 * @author Josh Bloch
 * @param <E> the type of elements held in this double ended queue
 */
public interface DoubleEndedQueue<E> {
  /**
   * Inserts the specified element at the front of this deque if it is
   * possible to do so immediately without violating capacity restrictions,
   * throwing an {@code IllegalStateException} if no space is currently
   * available.
   *
   * @param e the element to add
   * @throws IllegalStateException if the element cannot be added at this
   *         time due to capacity restrictions
   */
  void addFirst(E e);

  /**
   * Inserts the specified element at the end of this deque if it is
   * possible to do so immediately without violating capacity restrictions,
   * throwing an {@code IllegalStateException} if no space is currently
   * available.
   *
   * @param e the element to add
   * @throws IllegalStateException if the element cannot be added at this
   *         time due to capacity restrictions
   */
  void addLast(E e);

  /**
   * Retrieves and removes the first element of this deque. This method
   * throws an exception if this deque is empty.
   *
   * @return the head of this deque
   * @throws NoSuchElementException if this deque is empty
   */
  E removeFirst();

  /**
   * Retrieves and removes the last element of this deque. This method
   * throws an exception if this deque is empty.
   *
   * @return the tail of this deque
   * @throws NoSuchElementException if this deque is empty
   */
  E removeLast();

  /**
   * Retrieves, but does not remove, the first element of this deque.
   * This method throws an exception if this deque is empty.
   *
   * @return the head of this deque
   * @throws NoSuchElementException if this deque is empty
   */
  E getFirst();

  /**
   * Retrieves, but does not remove, the last element of this deque.
   * This method throws an exception if this deque is empty.
   *
   * @return the tail of this deque
   * @throws NoSuchElementException if this deque is empty
   */
  E getLast();

  /**
   * Returns the number of elements in this deque.
   *
   * @return the number of elements in this deque
   */
  int size();

  /**
   * Returns {@code true} if this deque contains the specified element.
   * More formally, returns {@code true} if and only if this deque contains
   * at least one element {@code e} such that {@code Objects.equals(o, e)}.
   *
   * @param o element whose presence in this deque is to be tested
   * @return {@code true} if this deque contains the specified element
   * @throws NullPointerException if the specified element is null
   */
  boolean contains(Object o);

}

