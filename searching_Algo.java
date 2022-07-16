public class searching_Algo {
    public static void main(String[] args) {
        // int[] arr={18,12,9,14,77,50,-7};
        // int [][] arr2={{1,2,3},
        //                {4,5,6}};
        /*
        if(elementleanersearch(arr)){
            System.out.println("yes "+14+" is present in array");
        }
        else{
            System.out.println(14+" is not present");
        }
        */
        // String[] str={"aman","avinash","gaurav","saurav"};
        // System.out.println(stringelementsearch(str));
        // System.out.println(check_element_in_range(arr));
        // System.out.println(gives_minimum_integer(arr));
        // System.out.println(array2d(arr2));
        // int[]ar={12,345,2,6,7896};
        // int count=0;
        // for(int i=0;i<ar.length;i++){
        //     if(even(ar[i])){
        //         count++;
        //     }
        // }
        // System.out.println(count);
        // maximumwealth();
        int[] sortedarray={1,2,3,4,5,6,7};
        System.out.println(binarySearch(sortedarray, 10));
    }

    // Linear Search
    static boolean elementleanersearch(int[]arr){
        if(arr.length==0){
            return false;
        }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==14){
        //         return true;
        //     }
        // }
        for (int i : arr) {
            if(i==14){
                return true;
            }
        }
        return false;
    }
    static boolean stringelementsearch(String[] str){
        for(int i=0;i<str.length;i++){
            if(str[i].equals("avinash")){
                return true;
            }
        }
        return false;
    }
    static boolean check_element_in_range(int[]arr){
        for(int i=1;i<=4;i++){
            if(arr[i]==50){
                return true;
            }
        }
        return false;
    }
    static int gives_minimum_integer(int[]arr){
        int minimum=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=minimum){
                minimum=arr[i];
            }
        }
        return minimum;
    }
    static boolean array2d(int[][]arr){
        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
                if(arr[row][column]==4){
                    return true;
                }
            }
        }
        return false;
    }
    static void findnumbers(){
        int[]arr={12,345,2,6,7896};
        for(int i=0;i<arr.length;i++){

           
        }
    }
    static boolean even(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }
    static void maximumwealth(){
        int[][] arr={{1,2,3},{3,2,1}};
        // int count=0;
        int max=0;
        for(int row=0;row<arr.length;row++){
            int count=0;
            for(int col=0;col<arr[row].length;col++){
                count=count+arr[row][col];
            }
            if(count>max){
                max=count;
            }
        }
        System.out.println(max);
    }

    // Binary Search

    // binary search works on sorted array its either asscending or decending order.

    static int binarySearch(int[] arr,int target){
        int  start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;  
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                //ans found
                return mid;
            }
        }
        return -1;
    }

}
 
