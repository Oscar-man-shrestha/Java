import java.util.*;
public class switchcase {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
    System.out.println("Menu: ");
    System.out.println( "1.Addition ");
    System.out.println( "2.Subtract ");
    System.out.println( "3.Division ");
    System.out.println( "4.Multiplication ");
    System.out.print("Enter Your Choice From Above Menu :");
    String option=sc.nextLine().toString().toLowerCase();

    System.out.print(" Value Of a :");
    int a=sc.nextInt();
    System.out.print("Value Of b :");
    int b=sc.nextInt();

    switch(option){
        case "addition":
        System.out.print("Addition of two number:"+(a+b));
        break;
        case "subtract":
        System.out.print("Substract of two number:"+(a-b));
        break;
        case "division":
        System.out.print("Division of two number:"+(a/b));
        break;
        case "multiplication":
        System.out.print("Multiplication of two number:"+(a*b));
        break;
        default:
        System.out.print("INVALID CHOICE");
    }

    



        

        
        
    }
}
