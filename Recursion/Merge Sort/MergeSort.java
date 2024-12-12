public class MergeSort {

    public static void main(String[] args) {
        int[] myArray = {5, 3, 4, 1, 6, 9, 2,7};
        
        // Print out the unsorted list
        System.out.print("Unsorted: ");
        for (int num : myArray){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
        
        // Sort the list
        mergeSort(myArray, myArray.length);

        // Print out the sorted list
        System.out.print("Sorted: ");
        for (int num : myArray){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] current, int length) {
        
        // Base case - an array of length 1
        if (length < 2) {
            return;
        }
        // Otherwise, we are going to split the array in half
        
        int mid = length / 2; // Find middle
        
        // Create two new arrays
        int[] left = new int[mid]; 
        int[] right = new int[length - mid];

        // Populate the first half into left
        for (int i = 0; i < mid; i++) {
            left[i] = current[i];
        }
        
        // Populate the second half into right
        for (int i = mid; i < length; i++) {
            right[i - mid] = current[i];
        }
        
        // Recursive calls
        mergeSort(left, mid);
        mergeSort(right, length - mid);

        // Once the recursive call returns combine the two halfs
        // back to the original
        merge(current, left, right);
    }

    public static void merge(
        int[] current, int[] left, int[] right) {

        int leftSize = left.length;
        int rightSize = right.length;
        
        /* 
         * This loop will loop through both arrays and look
         * at the lowest index value in the array, which will
         * be the lowest value. It copares the left value and
         * the right value and takes the lowest one and adds
         * it to current. Then it incriments up the index for
         * the array where it just took the value.
         *
        */
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                current[k] = left[i];
                k++;
                i++;
            }
            else {
                current[k] = right[j];
                k++;
                j++;
            }
        }
        
        /*
        * Since we didn't take the values out evenly, one of the
        * arrays may still have values remaining. These calls 
        * will place the remaining values in the current array.
        */
        while (i < leftSize) {
            current[k] = left[i];
            k++;
            i++;
        }
        while (j < rightSize) {
            current[k] = right[j];
            k++;
            j++;
        }        
        /* 
        * Notice that we do not have a return value anywhere. This is
        * because we are using the pointer values to the arrays. As a
        * result, updates in the method update the original arrays as well.
        */
    }
}