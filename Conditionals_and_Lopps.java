import java.util.Scanner;

public class Conditionals_and_Lopps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*

        System.out.println("Enter three integer : ");
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);

        */

        /*

        System.out.println("Enter the charcter : ");
        char c=sc.next().trim().charAt(0);
        if(c>='a' && c<='z'){
            System.out.println(c+" is lower case");
        }
        if(c>='A' && c<='Z'){
            System.out.println(c+" is upper case");
        }

        */

        /*
        int n=sc.nextInt();
        int a =0;
        int b= 1;
        int count=2;
        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
        */

        /*
        int n=255567778;
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==7){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
        */
        // int a=0;int b=1;int c;
        // System.out.print(a+" "+b+" " );
        // for(int i=0;i<8;i++){
        //     c=a+b;
        //     System.out.print(c+" ");
        //     a=b;
        //     b=c;
        // }

        String S="abba";
        int j=S.length()-1;
        String b=" yes it is ";
        for(int i=0;i<j;i++){
            if(S.charAt(i)!=S.charAt(j)){
                b="no it is not";
                
                break;
            }
            i++;
            j--;
        }
        System.out.println(b);


    }

}
