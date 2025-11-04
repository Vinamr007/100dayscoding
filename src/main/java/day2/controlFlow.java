import java.util.Scanner;

public class controlFlow {
    public static void main(String[] args){

        // if-else statement
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();

        if(age>18){
            System.out.println("you are eligable for opening bank acccount ");
        }else{
            System.out.println("you are not eligeble");
        }

        //else if ladder

        System.out.println("enter your marks");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("grade A");
        }else if(marks>=80){
            System.out.println("grade B");
        }else if(marks>=70){
            System.out.println("grade C");
        }else if(marks>=60){
            System.out.println("grade D");
        }else{
            System.out.println("fail");
        }

        //switch case
        System.out.println("enter your day number");
        int day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid day number");
      //  }
      
      // loops
      // for loop
for(int i=1;i<=5;i++){
          System.out.println("hello world " + i);
      }

      // while loop
      int j=1;
      while(j<=5){
          System.out.println("hello java " + j);
          j++;
      }

      // do while loop
      int k=1;
      do{
          System.out.println("hello do while " + k);
          k++;
      }while(k<=5);
    }
    
}
