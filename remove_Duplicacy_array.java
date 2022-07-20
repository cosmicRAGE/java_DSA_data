import java.util.Arrays;

public class remove_Duplicacy_array{
    // If array elements are positive integers;
    public static void main(String[] args) {
        int[] nums1={1,1,0,2,0,3,0}; int[]nums2={2,2,1,2,3};
        int count=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=i+1;j<nums1.length;j++){
                if(j<nums1.length && nums1[i]==nums1[j]){
                    nums1[j]=-1;
                }
            }
        }
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==-1){
                count++;
            }
        }
        int n=nums1.length-count;
        int next=0;
        int[] arr2=new int[n];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=-1){
                arr2[next]=nums1[i];
                next++;
            }
        }
        // System.out.println(Arrays.toString(arr2));

        int cou=0;
        for(int i=0;i<nums2.length;i++){
            for(int j=i+1;j<nums2.length;j++){
                if(j<nums2.length && nums2[i]==nums2[j]){
                    nums2[j]=-1;
                }
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==-1){
                cou++;
            }
        }
        int n2=nums2.length-cou;
        int next2=0;
        int[] arr3=new int[n2];
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]!=-1){
                arr3[next2]=nums2[i];
                next2++;
            }
        }
        // System.out.println(Arrays.toString(arr3));

        //--> here the intersection.

        int newcount=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr3.length;j++){
                if(arr2[i]==arr3[j]){
                    newcount++;
                }
            }
        }
        // System.out.println(newcount);

        int[] arr4=new int[newcount];
        int x=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr3.length;j++){
                if(arr2[i]==arr3[j]){
                    arr4[x]=arr2[i];
                    x++;
                }
            }
        }
        // System.out.println(Arrays.toString(arr4));
    }
}