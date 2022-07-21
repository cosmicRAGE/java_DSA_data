import java.util.Arrays;

public class bubble_sort_algo{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int count=0;
        int cou=0;
        for(int i=0;i<arr.length;i++){
            cou++;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    count++;
                    
                }
            }
            if(count==0){
                break;
            }
        }
        System.out.println(cou);
        System.out.println(Arrays.toString(arr));
    }
}