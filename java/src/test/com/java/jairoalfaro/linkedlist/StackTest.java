package test.com.java.jairoalfaro.linkedlist;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.com.java.jairoalfaro.stack.Stack;

public class StackTest {
	private Stack<Integer> sut;

	@Before
	public void setUp() throws Exception {
		sut = new Stack<Integer>();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void stack_Success_Cases() {

		for (int i = 0; i < 6; i++) {
			assertEquals("The stack count is off", i, sut.getCount());
			sut.push(i);
			assertEquals("The stack count is off", i + 1, sut.getCount());
			assertEquals("The recently pushed value is not peeking", i, (int) sut.peek());
		}

		for (int i = 6 - 1; i >= 0; i--) {
			assertEquals("The peeked value was not expected", i, (int) sut.peek());
			assertEquals("The popped value was not expected", i, (int) sut.pop());
			assertEquals("The popped value was not expected", i, sut.getCount());
		}
	}
}
