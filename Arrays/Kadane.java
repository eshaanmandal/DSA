public class Kadane {
    public static void max_subarray_sum(int[] arr){
        int local_max = 0;
        int global_max = Integer.MIN_VALUE;

        for(int i: arr){
            local_max += i;
            if(local_max > global_max){
                global_max = local_max;
            }
            if(local_max < 0){
                local_max=0;
            }
        }
        System.out.println(global_max);
    }
    public static void main(String[] args){
        int[] arr = {-2, 1, 3, 4};
        max_subarray_sum(arr);
    }
}
