import java.util.*;

public class BinarySearchTest {


    public static void main(String[] args) {
        
        // Use the helper code to generate arrays, calculate the max
        // iterations, and then find the actual iterations for a randomly
        // selected value.
        int[] abc=generateArrayOfLength(100);
        System.out.println("Array Size: 100\nMax iterations: "+binaryMax(100)+"\nActual iterations: "+binaryRec(abc,abc[(int)(Math.random() * 100)],0,99,0));
        System.out.println();
        abc=generateArrayOfLength(1000);
        System.out.println("Array Size: 1000\nMax iterations: "+binaryMax(1000)+"\nActual iterations: "+binaryRec(abc,abc[(int)(Math.random() * 1000)],0,999,0));
        System.out.println();
        abc=generateArrayOfLength(10000);
        System.out.println("Array Size: 10000\nMax iterations: "+binaryMax(10000)+"\nActual iterations: "+binaryRec(abc,abc[(int)(Math.random() * 10000)],0,9999,0));
        System.out.println();
        abc=generateArrayOfLength(100000);
        System.out.println("Array Size: 100000\nMax iterations: "+binaryMax(100000)+"\nActual iterations: "+binaryRec(abc,abc[(int)(Math.random() * 100000)],0,99999,0));
    }

    public static int binaryRec(int[] array, int target, int begin, int end,int count) {
        if (begin <= end)
        {
        	int mid = (begin + end) / 2;
            count ++;
        	// Base Case
        	if (target == array[mid]) {
        			return count;
        	}
    
            if (target < array[mid]) {
                return binaryRec(array, target, begin, mid - 1,count );
            }
    
            if (target > array[mid]) {
                return binaryRec(array, target, mid + 1, end,count );
            }
        }
		return -1; //Alternate Base Case - not found
    }

    public static int[] generateArrayOfLength(int length)
    {
        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
        }

        Arrays.sort(arr);

        return arr;
    }

    private static int binaryMax(int length) {
        return (int) (Math.log(length) / Math.log(2)) + 1;
    }
}