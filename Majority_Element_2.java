import java.util.*;

public class Majority_Element_2 {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        // int count=0;
        // for(int i=0;i<arr.length;i++){
            
        //     for(int j=1;j<arr.length-i;j++){
        //         if(arr[j]<arr[j-1]){
        //             int temp=arr[j];                  // this bublle sort method i written
        //             arr[j]=arr[j-1];
        //             arr[j-1]=temp;
        //             count++;
                    
        //         }
        //     }
        //     if(count==0){
        //         break;
        //     }
        // }

        Arrays.sort(arr);                  //function for sorting. inbuilt in java.
        System.out.println(Arrays.toString(arr));

        

        int cou=1;
        for(int i=0;i<arr.length;i++){
            if(cou>arr.length/2){
                System.out.println(arr[i]);
                break;
            }
            if(i<arr.length && arr[i]==arr[i+1] ){
                    cou++;
            }
            else  {
                cou=1;
            }
            
        }
        


    }
}
