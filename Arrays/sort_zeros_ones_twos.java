public class sort_zeros_ones_twos {
    public static void sort(int[] arr){
        int zeros = 0, ones = 0, twos = 0;

        for(int i:arr){
            if(i == 0){
                zeros++;
            }
            else if(i == 1){
                ones++;
            }
            else{
                twos++;
            }
        }
        for(int i=0; i<zeros; i++)
            arr[i] = 0;

        for(int i=zeros; i<zeros+ones; i++)
            arr[i] = 1;

        for(int i=zeros+ones; i<zeros+ones+twos; i++)
            arr[i] = 2;

        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        int[] arr = {2,0,1,0,0,1,1,1,0,2,2,2};
        sort(arr);

    }
}
