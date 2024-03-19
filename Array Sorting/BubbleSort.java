//bubble sort java

//package java;
public class BubbleSort {
    
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array before sorting:");
        printArray(array);

        bubbleSort(array);

        System.out.println("\nArray after sorting:");
        printArray(array);
    }

    // Function to perform bubble sort
    static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    // Function to print an array
    static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}