package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
    public BubbleSorter() {
        type = "Bubble";
    }

    /* 
     * Use the bubble sorting algorithm to sort the array.
     * You can use display.updateDisplay() to show the current
     * progress on the graph.
     */
    @Override
    void sort(int[] arr, SortingVisualizer display) {
    	for (int i = 0; i < arr.length; i++) {
            
            // This for loop puts one value in the correct position
            for (int k = 0; k < arr.length - 1; k++) {
                
                // If the current element is bigger than the next...
                if( arr[k] > arr[ k+1 ] ) {
                    
                    // Swap elements at k and k+1
                    int temp = arr[k];
                    arr[k] = arr[ k+1 ];
                    arr[ k+1 ] = temp;
                }
                display.updateDisplay();
            }
        }
        
    }
}
