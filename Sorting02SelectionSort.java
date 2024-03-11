public class Sorting02SelectionSort{
    // Function to swap elements
    public static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    // Selection Sort function
    public static void selectionSort(int a[], int n){
        // Iterate from 0 to n - 1
        for( int i = 0; i < n - 1; i++ ){

            int minIndex = i;
            // Iterating from i + 1 to n
            for( int j = i + 1; j < n; j++){

                // If a[j] is smaller than a[minIndex]
                // then updating the minIndex.
                if ( a[j] < a[minIndex] )
                    minIndex = j;
            }

            // Swapping a[i] with a[minIndex].
            swap(a, i, minIndex);
        }
    }
    public static void main(String args[]){
        // Defining the array 'a'.
        int a[]={3,54,2,6,4,23,43};

        // Printing the initial array.
        System.out.print("Array before Sorting - ");
        for( int i = 0; i < a.length; i++ )
            System.out.print(a[i] + " ");
        System.out.println();

        // Calling the Selection Sort function
        selectionSort(a, a.length);

        // Printing the sorted Array
        System.out.print("Array after Sorting - ");
        for( int i = 0; i < a.length; i++ )
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
