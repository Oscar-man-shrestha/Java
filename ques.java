// import java.math.*;
// public class ques {
//     public static void main(String args[]){

//         double area,circumference;
//         int radius=5;
//         double myDouble=2.4/3.0;

//         area=Math.PI*Math.pow(radius,2);
//         circumference=2*Math.PI;
//         int myInt=(int)Math.round(myDouble);

//         // Math.sqrt(radius)
//         //Math.cos()
//         //math.sin()


//         System.out.println(area);
//         System.out.println(circumference);
//         System.out.println(myInt);
//     }
// }

import java.math.*;
import java.util.*;
public class ques {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Name of the Student:");
        String Name=sc.nextLine();
        System.out.print("Enter His/Her age:");
        int age=sc.nextInt();
        System.out.print("Enter His/Her Grade of 12th grade :");
        double precentage=sc.nextDouble();

        System.out.println("\n=================Students Details==========");
        System.out.printf("Name     :%s%n",Name);
        System.out.printf("age     :%d years%n",age);
        System.out.printf("Percentage     :%.2f%%%n",precentage);

    }
}
