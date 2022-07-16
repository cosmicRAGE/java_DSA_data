import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // System.out.println(isprime(n));
        // System.out.println(isArmstrong(153));
        // int i=2;
        // while(i<1000){
        // if(isArmstrong(i)){
        // System.out.println(i);
        // }
        // i++;
        // }
        System.out.println(Palindrome("abamavba"));
        
        

    }
    static void greet(){
        System.out.println("hello");
    }

    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;

    }

    static boolean isArmstrong(int a) {
        int original = a;
        int rem = 0;
        int sum = 0;
        while (a > 0) {
            rem = a % 10;
            sum = sum + rem * rem * rem;
            a = a / 10;
        }
        if (sum == original) {
            return true;
        }
        return false;
        // return sum==original;

    }

    static int getmax(int a, int b, int c) {
        if (a > b && b > c) {
            return a;
        } else if (b > a && a > c) {
            return b;
        } else if (c > a && a > b) {
            return c;
        } else if (a == b && a > c) {
            return a;
        } else if (a == b && a < c) {
            return c;
        } else if (a == c && a > b) {
            return a;
        } else if (a == c && b > a) {
            return b;
        } else if (b == c && c > a) {
            return c;
        } else if (b == c && a > c) {
            return a;
        } else {
            return a;
        }

    }

    static int getmin(int a, int b, int c) {
        if (a < b && b < c) {
            return a;
        } else if (b < a && a < c) {
            return b;
        } else if (c < a && a < b) {
            return c;
        } else if (a == b && a > c) {
            return c;
        } else if (a == b && a < c) {
            return a;
        } else if (a == c && a > b) {
            return b;
        } else if (a == c && b > a) {
            return a;
        } else if (b == c && c > a) {
            return a;
        } else if (b == c && a > c) {
            return c;
        } else {
            return a;
        }
    }

    static String evenorodd(int n) {
        if (n % 2 == 0) {
            return "even";
        }
        return "odd";
    }

    static String vote(int age) {
        if (age >= 18) {
            return "you can vote";
        }
        return " you can't vote";
    }

    static int sum(int n1, int n2) {
        return n1 + n2;
    }

    static boolean isprimeno(int n) {
        int n2 = 2;
        if (n <= 1) {
            return false;
        }
        while (n2 * n2 <= n) {
            if (n % n2 == 0) {
                return false;
            }
            n2++;
        }
        return true;
    }

    static String grade(int marks) {
        if (marks >= 91) {
            return "AA";
        } else if (81 <= marks && marks <= 90) {
            return "AB";
        } else if (71 <= marks && marks <= 80) {
            return "AB";
        } else if (61 <= marks && marks <= 70) {
            return "AB";
        } else if (51 <= marks && marks <= 60) {
            return "cd";
        } else if (41 <= marks && marks <= 50) {
            return "DD";
        } else {
            return "fail";
        }
    }

    static int factorial(int num){
        int fact=1;
        if (num<=0){
            return 1;
        }
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }

    static boolean isPalindrome(int n){
        String s=Integer.toString(n);
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static void primenummbers(int num1,int num2){
        for(int i=num1;i<num2;i++){
            if(isprime(i)){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
    }

    // 0+1+1+2+3+5+8+13+21...
    // To calculate Fibonacci Series up to n numbers.

    static void Fibonacci(){
        int a=0;
        int b=1;
        int i=0;
        int c=0;
        while(i<3){
            c=a+b;
            a=b;
            b=c;
            i++;
        }
        System.out.print(c);
    }

    // To find out whether the given String is Palindrome or not.
    //ex : abba is Palindrome .
    static boolean Palindrome(String str){
        int j=str.length()-1;
        for(int i=0;i<j;i++){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }

    
    

}
