public class search_in_Rotated_array {
    public static void main(String[] args) {
        int[] arr={1};
        int target=1;
        int peak=pivot(arr);
        int findtargetfirst=first(arr, target, 0, peak);
        int findtargetlast=last(arr, target, peak+1, arr.length-1);
        System.out.println(findtargetfirst);
        System.out.println(findtargetlast);
    }
    static int pivot(int[] arr){
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
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            if(arr[start]<arr[mid]){
                start=mid+1;
            }
        }
        return -1;
    }
    static int first(int arr[],int target,int start,int end){
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
    static int last(int arr[],int target,int start,int end){
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
}

