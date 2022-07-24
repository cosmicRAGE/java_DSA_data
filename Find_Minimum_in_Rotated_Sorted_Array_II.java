public class Find_Minimum_in_Rotated_Sorted_Array_II {
    public  int main(String[] args) {
        // int[] arr={1,3};
        int[] arr={10,1,10,10,10};
        int pivot=Search_pivot_with_Duplicates(arr);
        int n1=first_half(arr, 0, pivot);
        if(pivot==arr.length-1){
            return n1;
        }
        int n2=second_half(arr, pivot+1, arr.length-1);
        if(n1<n2){
            return n1;
        }
        else{
            return n2;
        }
        
        
        

    }  
    int Search_pivot_with_Duplicates(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // if elements at middle,start,end are equal then just skip the duplicates.
            if(arr[mid]==arr[start]&&arr[mid]==arr[end]){
                // skip the duplicates.
                //Note : what if these elements at start end were the pivot??
                // check if start is the pivot.
                if(start<end && arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //check if end is the pivot.
                if(end>start && arr[end]<arr[end-1]){
                  return end-1;  
                }
                end--;

            }
            // left side is sorted , so pivot should be in right.
            else if(arr[start]<arr[mid]||(arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else{
               end=mid-1; 
            }


        }
        return -1;
    
    }
    int first_half(int arr[],int start,int end){
        
        return arr[start];
    }
    int second_half(int[]arr,int start,int end){
        return arr[start];
    }
}
