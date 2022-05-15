import java.util.Arrays;
public class InsertionSort {
    public static int[] insertion_sort(int[] a){
        for(int i=1; i<a.length; i++){
            int key = a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        return a;
    }
    public static void main(String[] args){
        int[] a = {2, 68, 5, 3, 8, 7, 1, 90};
        int[] sorted_a = insertion_sort(a);
        for(int x: sorted_a){
            System.out.print(x + " ");
        }
    }
}
