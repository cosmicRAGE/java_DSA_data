public class arranging_coins {
    public static void main(String[] args) {
        int n=1000;
        int start=1;
        int end=n;
        int count=0;
        while(start<=end){
            count++;
            int mid=start+(end-start)/2;
            if((long)mid*((long)mid+1)/2==n){
                System.out.println(mid);
                break;
            }
            else if((long)mid*((long)mid+1)/2<n){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(end);
        System.out.println(count);
    }

}
