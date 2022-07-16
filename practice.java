import java.util.ArrayList;
import java.util.Arrays;
public class practice {
    public static void main(String[] args) {
        int[]nums={0,2,1,5,3,4};
        // int[]ans=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     ans[i]=nums[nums[i]];
        // }
        // for (int element : ans) {
        //     System.out.println(element);
        // }
        // System.out.println(Arrays.toString(ans));
        // sum();
        // maximumwealth();
        // System.out.println(maximumvalue(nums));
        // swap(nums, 0, 1);
        // System.out.println(Arrays.toString(nums));
        // reversearray(nums);
        a();
    }
    static void sum(){
        int[]num={1,2,3,4};
        for(int i=1;i<num.length;i++){
            num[i]=num[i]+num[i-1];
        }
        System.out.println(Arrays.toString(num));
    }
    static void maximumwealth(){
        int[][]accounts={{1,2,3},
                         {3,2,1}};
        int sum=0;
        int max =0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            if(sum>max){
                max=sum;
                sum=0;
            }
            
        }
        System.out.println(max);
    }
    static int maximumvalue(int[]arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    static void reversearray(int[]arr){
        int i=0;
        int k=arr.length-1;
        
        while(i<k){
            swap(arr, i,k );
            i++;
            k--;
        }
        System.out.println(Arrays.toString(arr));

    }
   static void findnumbersisgreatest(){
        int num=44;
        int[]arr={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>num){
                
            }
        }
   }
   // Input: candies = [2,3,5,1,3], extraCandies = 3
    //  Output: [true,true,true,false,true] 
    static void a(){
        int[]arr={2,3,5,1,3};
        int num=3;
        boolean b=true;
        ArrayList<Boolean>bool=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            b=true;
            int value=arr[i]+num;
            for(int j=0;j<arr.length;j++){
                if(value<arr[j]){
                    b=false;
                }
                
            }
            bool.add(b);
        }
        System.out.println(bool);
    }
    
}
