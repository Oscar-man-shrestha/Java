// import java.math.*;
// import java.util.*;
// public class Practise{
//     public static void main(String args[]){
    
//         int a,b,c;
//         float s;
//         double area;

//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter value for a: ");
//         a=sc.nextInt();
//         System.out.print("Enter value for b: ");
//         b=sc.nextInt();
//         System.out.print("Enter value for c: ");
//         c=sc.nextInt();

//         s=(a+b+c)/2;
//         area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

//         System.out.println(area);


    
      
//     }
// }


// import java.math.*;
// import java.util.*;
// public class Practise{
//     public static void main(String args[]){
    
//         int a,b,c;
        
//         double r1,r2;

//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter value for a: ");
//         a=sc.nextInt();
//         System.out.print("Enter value for b: ");
//         b=sc.nextInt();
//         System.out.print("Enter value for c: ");
//         c=sc.nextInt();

      

    
      
//     }
// }

public class Practise{

    String name;

   public Practise (String name){
       this.name=name;
   }

   static{
       System.out.println("You are currently checking the grade...");
   }

   //Using percentage

   public void checkGrade(double marks){
       if(marks>=90){
           System.out.println(name+" Is graded with A and eligible for full Scholarship !!");
       }
       else if (marks>=80){
           System.out.println(name+" Is graded with B and eligible for Half Scholarship !!");
       }
       else{
           System.out.println(name+" Is graded with C and not eligible for Scholarship !!");
       }
   }
       //Using marks out of 100

   public void checkGrade(int marks){
           checkGrade(marks/1.0);
       }
   
       //using grade
       public void checkGrade(char marks){
           if(marks=='A'){
               System.out.println(name+"Is graded with A and eligible for full Scholarship !!");
           }
           else if(marks =='B'){
               System.out.println(name+"Is graded with B and eligible for Half Scholarship !!");
           }
           else{
               System.out.println(name+"Is graded with C and not eligible for Scholarship !!");
           }
           
       }
       public static void main(String args[]){

           Practise obj=new Practise("Oscar Man Shrestha");
           obj.checkGrade(90);
           obj.checkGrade('A');
           obj.checkGrade(100.00);



       }
   }
   
   

