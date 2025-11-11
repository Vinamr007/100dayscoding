package practicecode;


import java.util.*;
import java.util.Scanner;

public class additionmatrix {
    public static void main(String[] args) {
        
int[][] arr=new int[2][2];
int [][] arr1=new int[2][2];
int [][] addrr=new int[2][2];

Scanner sc=new Scanner(System.in);
System.out.println("enter your first marrix");

for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
        arr [i][j]=sc.nextInt();
    }
}

System.out.println("enter your second matrix");

for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr1.length;j++){
        arr1[i][j]=sc.nextInt();
    }
}

System.out.println("addition of 2 matrix");

(int i=0;i<addrr.length;i++)
{
    for(int j=0;j<addrr.length;j++){
        addrr[i][j]=arr[i][j]+arr1[i][j];
        System.out.println(addrr[i][j]+" ");
    }



    }
    
}
}
