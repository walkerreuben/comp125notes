package comp125;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class TestMergeSort {
	
	@Test
	public void testMergeSort() {
		
		LinkedList<Integer> one = new LinkedList<Integer>();
		
		one.add(29); one.add(15); one.add(23); one.add(9); one.add(10);
		one.add(17); one.add(27); one.add(36); one.add(33);
		
		Week10LectureTwo.mergeSort(one);
		
		assertEquals(9, (int)one.getFirst());
		assertEquals(36, (int)one.getLast());
	}

}
