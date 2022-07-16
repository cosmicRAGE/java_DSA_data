// import java.util.Arrays;
public class Binary_search_interview_question {
    public static void main(String[] args) {
        /*int[] searchElement={1,2,3,4,5,6,7};
        System.out.println(searchElement(searchElement, 5));*/

        /*int[] arr={2,3,5,9,14,16,18};
        System.out.println(floar_Number(arr, 1));*/

        /*char[] arr={'c','f','g'};
        System.out.println(Smallest_Letter_Greater_Than_Target(arr, 'c'));*/

        // search_element_infinite_sorted_array();

        // int[] nums={1};
        // int lastindex=searchElement(nums, 1);
        // int firstOccurance=firstOccurance(nums, lastindex, 1);
        // int lastOccurance=lastOccurance(nums, lastindex, 1);
        // System.out.println(firstOccurance+" "+lastOccurance);

        int[] arr={1,2,4,5,3,1};
        int target=3;
        int peak=bitonicArray(arr);
        int first=firstsearch(arr, target, 0, peak);
        int last=lastSearch(arr, target, peak, arr.length-1);
        if(first!=-1){
            System.out.println(first);
        }
        if(last!=0){
            System.out.println(last);
        }
    



            
    }
    static int searchElementasscending(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    static int searchElementdsscending(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int ceiling_Number(int[] arr,int target){
        //ceiling = smallest number grater or equal to target.
        int start=0;
        int end=arr.length-1;
        while(arr[start]<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
    static int floar_Number(int[] arr,int target){
        //floar=gratest number smaller or equal to target.
        int start=0;
        int end=arr.length-1;
        if(start>target){
            return -1;
        }
        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
    static char Smallest_Letter_Greater_Than_Target(char[] arr,char target){
        int start=0;
        int end=arr.length-1;
        if(target>arr[end]){
            return arr[start];
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[end+1];
    }
    static int firstOccurance(int[] arr,int lastindex,int target){
        int start=0;
        int ans=0;
        int end=lastindex;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(ans!=-1){
            return ans;
        }
        return -1;
    }
    static int lastOccurance(int[] arr,int lastindex,int target){
        int start=lastindex;
        int ans=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(ans!=-1){
            return ans;
        }
        return -1;
    }
    static void search_element_infinite_sorted_array(){
        int[] arr={1,2,3,4,5,6,7,8,9,10,12,13,14,15,};
        int target=15;
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

    }
    static int bitonicArray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }
    static int firstsearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    static int lastSearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    
    
        
}
