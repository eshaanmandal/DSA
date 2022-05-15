import java.util.*;

public class QuickSort {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int lw = low;

        for(int i=low; i<high; i++){
            if(arr[i]<=pivot){
                int temp = arr[i];
                arr[i] = arr[lw];
                arr[lw] = temp;
                lw++;
            }
        }
        int temp = arr[lw];
        arr[lw] = arr[high];
        arr[high] = temp;

        return lw;


    }
    public static int[] qsort(int[] arr, int low, int high){
        if(low < high){
            int pivot_location = partition(arr, low, high);
            qsort(arr, low, pivot_location-1);
            qsort(arr, pivot_location+1, high);
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {2, 68, 5, 3, 8, 7, 1, 0};
        int[] sorted = qsort(arr, 0, arr.length-1);

        for(int a:sorted){
            System.out.println(a);
        }
    }
}
