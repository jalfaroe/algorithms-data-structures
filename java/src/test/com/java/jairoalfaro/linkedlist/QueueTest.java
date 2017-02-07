package test.com.java.jairoalfaro.linkedlist;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.com.java.jairoalfaro.queue.Queue;

public class QueueTest {
	private Queue<Integer> sut;

	@Before
	public void setUp() throws Exception {
		sut = new Queue<Integer>();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void enqueue_Updates_Count() {
		assertEquals("The count should start at 0", 0, sut.getCount());

		for (int i = 0; i < 10; i++) {
			assertEquals("The count was off before calling Enqueue...", i, sut.getCount());
			sut.enqueue(i);
			assertEquals("The count was off after calling Enqueue...", i + 1, sut.getCount());
		}
	}

	@Test
	public void Dequeue_Peek_Correct_Order() {
		for (int i = 0; i < 10; i++) {
			sut.enqueue(i);
		}

		int expectedCount = sut.getCount();

		for (int expected = 0; expected < 10; expected++) {
			assertEquals("The count was off before Peek", expectedCount, sut.getCount());

			assertEquals("Peek returned an unexpected result", expected, (int) sut.peek());

			assertEquals("The count was off after Peek", expectedCount, sut.getCount());

			assertEquals("Dequeue returned an unexpected result", expected, (int) sut.dequeue());

			assertEquals("The count was off after Dequeue", expectedCount - 1, sut.getCount());

			expectedCount--;
		}
	}
}
