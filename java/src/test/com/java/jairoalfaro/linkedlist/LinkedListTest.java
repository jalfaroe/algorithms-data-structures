package test.com.java.jairoalfaro.linkedlist;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.com.java.jairoalfaro.linkedlist.LinkedList;

public class LinkedListTest {

	private LinkedList<Integer> sut;
	
	
	@Before
	public void setUp() throws Exception {
		this.sut = new LinkedList<Integer>();
	}

	@After
	public void tearDown() throws Exception {
		this.sut = null;
	}
	
	@Test
	public void add() {
		
		this.sut.add(1);
		this.sut.add(2);
		this.sut.add(3);
		
		assertEquals(3, this.sut.getCount());
	}
	
	@Test
	public void contains_returnsTrue(){
		this.sut.add(1);
		this.sut.add(2);
		this.sut.add(3);
		
		assertTrue(this.sut.contains(3));
		assertTrue(this.sut.contains(2));
		assertTrue(this.sut.contains(1));
	}
	
	@Test
	public void contains_returnsFalse(){
		this.sut.add(1);
		this.sut.add(2);
		this.sut.add(3);
		
		assertFalse(this.sut.contains(4));
	}
	
	@Test
	public void remove(){
		this.sut.add(4);
		this.sut.add(3);
		this.sut.add(2);
		this.sut.add(1);
		this.sut.remove(4);
		
		assertEquals(3, this.sut.getCount());
	}
	
	@Test
	public void removeFirst(){
		this.sut.add(1);
		this.sut.add(2);
		this.sut.add(3);
		this.sut.add(4);
		this.sut.removeFirst();
		
		assertEquals(3, this.sut.getCount());
		assertFalse(this.sut.contains(4));
	}
	
	@Test
	public void removeLast(){
		this.sut.add(1);
		this.sut.add(2);
		this.sut.add(3);
		this.sut.add(4);
		this.sut.removeLast();
		
		assertEquals(3, this.sut.getCount());
		assertFalse(this.sut.contains(1));
	}
	
	@Test
	public void clear() {
		
		this.sut.add(1);
		this.sut.add(2);
		this.sut.add(3);
		this.sut.clear();
		
		assertEquals(0, this.sut.getCount());
	}

	@Test
	public void addFirst() {
		
		this.sut.addFirst(1);
		this.sut.addFirst(2);
		this.sut.addFirst(3);
		
		assertEquals(3, this.sut.getCount());
	}
	
	@Test
	public void addLast() {
		
		this.sut.addLast(1);
		this.sut.addLast(2);
		this.sut.addLast(3);
		this.sut.addLast(4);
		
		assertEquals(4, this.sut.getCount());
	}	
}
