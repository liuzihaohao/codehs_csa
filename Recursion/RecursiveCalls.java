import java.util.ArrayList;

public class MergeSortCounter {

    private static int numCalls;

    public static void main(String[] args) {
        
       int[] abc=makeRandomArray(100);
       numCalls=0;
       mergeSort(abc,100);
       System.out.println("Number of recursive calls with 100 elements: "+numCalls);
        
       abc=makeRandomArray(1000);
       numCalls=0;
       mergeSort(abc,1000);
       System.out.println("Number of recursive calls with 1000 elements: "+numCalls);
        
       abc=makeRandomArray(10000);
       numCalls=0;
       mergeSort(abc,10000);
       System.out.println("Number of recursive calls with 10000 elements: "+numCalls);
        
       abc=makeRandomArray(100000);
       numCalls=0;
       mergeSort(abc,100000);
       System.out.println("Number of recursive calls with 100000 elements: "+numCalls);
        
    }

    public static void mergeSort(int[] current, int length) {
        numCalls++;
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] left = new int[mid];

        int[] right = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = current[i];
        }

        for (int i = mid; i < length; i++) {
            right[i - mid] = current[i];
        }

        mergeSort(left, mid);
        mergeSort(right, length - mid);

        merge(current, left, right);

    }

    public static void merge(int[] current, int[] left, int[] right)
    {
        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                current[k++] = left[i++];
            }
            else {
                current[k++] = right[j++];
            }
        }
        while (i < leftSize) {
            current[k++] = left[i++];
        }
        while (j < rightSize) {
            current[k++] = right[j++];
        }
    }

    public static int[] makeRandomArray(int number){
        int[] array = new int[number];
        ArrayList<Integer> sorted = new ArrayList<Integer>(number);
        // Create the sorted list
        for (int i = 0; i < number; i++){
            sorted.add(i);
        }

        // Now shuffle it.
        int index = 0;
        while (sorted.size() > 0){
            int randomIndex = (int)(Math.random()*sorted.size());
            array[index] = sorted.remove(randomIndex);
            index ++;
        }

        return array;
    }
}