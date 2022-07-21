public class Majority_element_1 {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        int count=0;
        int maxcount=0;
        if(arr.length==1){
            System.out.println(arr[0]);
        }
        for(int i=0;i<arr.length;i++){
            maxcount=count;
            
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(maxcount>arr.length/2){
                // System.out.println(arr[i]);
                System.out.println(arr[i-1]);
            }
            
        }
       
    }
}
