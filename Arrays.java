import java.util.Scanner;
import java.util.ArrayList;
public class Arrays{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int[] roll_no=new int[10];
        String[]arr=new String[5];
        System.out.println(arr[1]);
        */

        //input array using for loop;
        /*
        int arr[]=new int[5];
        System.out.println("Enter the 5 elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            System.out.print(i);
        }
        */

        //array of objects
        /*
        String[]str=new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=sc.next();
        }
        for (String string : str) {
            System.out.print(string+" ");
        }
        */

        //mutuable (change ) value in array by function
        /*
        int[]arr={1,2,3,4,5};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        change(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        */

        //multiDimensionarrays
        /*
        int[][] arr=new int[3][3];
        arr[0][0]=1;
        arr[0][1]=3;
        arr[0][2]=4;
        arr[1][0]=5;
        arr[1][1]=5;
        arr[1][2]=8;
        arr[2][0]=6;
        arr[2][1]=4;
        arr[2][2]=6;
       System.out.println(arr[0][0]);
        */

        //input of 2D array:
        /*
        int[][]arr2=new int[3][2];
        System.out.println(" enter the integer: ");
        for(int row=0;row<arr2.length;row++){
            for(int col=0;col<arr2[row].length;col++){
                arr2[row][col]=sc.nextInt();
            }
            
        }
        for(int row=0;row<arr2.length;row++){
            for(int col=0;col<arr2[row].length;col++){
                System.out.print(arr2[row][col]+" ");
            }
            System.out.println();
        }
        */


        //Arraylist in java(Dynamic Array)

        ArrayList<Integer> list =new ArrayList<Integer>(10);
        list.add(67);
        list.add(34);
        list.add(34);
        list.add(34);
        list.add(34);
        list.add(34);
        list.add(64);
        list.add(64);
        list.add(64);
        list.add(64);
        System.out.println(list.contains(34));
        list.set(0, 99);
        list.remove(2);
        System.out.println(list);

    } 
    static void change(int[]trr){
        trr[0]=22;
    }  
}