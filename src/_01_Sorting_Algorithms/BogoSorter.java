package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] arr, SortingVisualizer display) {
    	for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length - 1; k++) {
            	if( arr[k] > arr[ k+1 ] ) {
            		Random random = new Random();
            		int rand = random.nextInt(arr.length-2);
            		int temp = arr[rand];
                    arr[rand] = arr[rand+1];
                    arr[rand+1] = temp;
                    display.updateDisplay();
                    i = 0;
                }
            	
            }
        }
    	
    }
}
