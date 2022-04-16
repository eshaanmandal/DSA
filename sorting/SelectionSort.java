package sorting;
import java.util.Arrays;
public class SelectionSort {
    public static int[] s_sort(int[] a){
        for(int i=0; i<a.length; i++){
            int min_idx = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j] < a[i]){
                    min_idx = j;
                }
            }
            int temp = a[i];
            a[i] = a[min_idx];
            a[min_idx] = temp;
        }
        return a;
    }
    public static void main(String[] args){
        int[] a = {-2, -8, -65, 3, 8, 7, 1, 90};
        int[] sorted_a = s_sort(a);
        for(int x: sorted_a){
            System.out.print(x + " ");
        }
    }
}
