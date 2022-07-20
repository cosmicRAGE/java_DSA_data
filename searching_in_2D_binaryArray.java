import java.util.Arrays;

public class searching_in_2D_binaryArray {
    public static void main(String[] args) {
        int[][]arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                count++;
            }
        }
        System.out.println(count);
        int arr2[]=new int[count];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr2[k]=arr[i][j];
                k++;
                
            }
        }
        System.out.println(binary_search(arr2, 3));

        
    }
    public static boolean binary_search(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
        }
        return false;
    }
}
