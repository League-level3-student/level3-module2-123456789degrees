package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] arr1 = {"Joshua", "Sally", "Paul", "Joleen", "Jonathan"};
    	String[] arr2 = {"dog", "cat", "giraffe", "cow", "lion"};
    	String[] arr3 = {"one", "two", "three"};
        assertEquals(0, _01_LinearSearch.linearSearch(arr1, "Joshua"));
        assertEquals(1, _01_LinearSearch.linearSearch(arr2, "cat"));
        assertEquals(-1, _01_LinearSearch.linearSearch(arr3, "four"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    	int[] arr2 = {1, 5, 12, 45, 75, 634};
    	int[] arr3 = {4, 5, 6, 11, 34, 654, 896};
        assertEquals(6, _02_BinarySearch.binarySearch(arr1, 0, 9, 7));
        assertEquals(2, _02_BinarySearch.binarySearch(arr2, 0, 5, 12));
        assertEquals(-1, _02_BinarySearch.binarySearch(arr3, 0, 6, 10));
    }
}
