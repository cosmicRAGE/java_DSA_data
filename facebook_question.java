import java.util.Arrays;
public class facebook_question {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int[] ans ={-1,-1};
        int target=7;
        int a=search(nums, target, true);
        int b= search(nums, target, false);
        if(a>-1){
            ans[0]=a;
        }
        if(b>-1){
            ans[1]=b;
        }
        System.out.println(Arrays.toString(ans));
    }
    static int search(int[] nums,int target,boolean findstartindex){
        int start=0;
        int end=nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                ans=mid;
                if(findstartindex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    
}
