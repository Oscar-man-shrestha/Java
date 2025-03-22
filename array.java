// public class array {
//     public static void main(String args[]){
//         int A[]=new int[5];
//         int B[]={1,2,3,4,5};
//         System.out.println(B.length);
//         A[0]=90;
//         A[1]=100;
//         System.out.println(A[1]);
//         System.out.println(A[0]);


//         for (int i=0;i<A.length;i++){
//             System.out.println(B[i]);
//         }

//         for (int i=B.length-1;i>=0;i--){
//             System.out.println(B[i]);
//         }

//         // for(int x:B){
//         //     System.out.println(x);
//         // }//for each

//     }
// }


//Questions..

// public class array {
//     public static void main(String args[]){
//         int sum=0;
//        int A[]={3,9,7,8,12,6,15,5,4,10};
//        for(int i=0;i<A.length;i++){
//         sum=sum+A[i];
       


//        }
//        System.out.print(sum);
//     }
// }

//Linear Search..

// import java.util.*;
// public class array {
//     public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// System.out.print("Enter the Key:");
// int key=sc.nextInt();
//         int A[]={3,9,7,8,12,6,15,5,4,10};

// for(int i=0;i<A.length;i++){
//     if(key==A[0]){
//         System.out.print("Found");
//         System.exit(0);
//     }
//     else{
//         System.out.print("Not Found");
//         break;
//     }
// }
//     }
// }



// import java.util.*;
// public class array {
//     public static void main(String args[]){
//         int A[]={3,9,7,8,12,6,15,5,4,10};
//        int maximum=Integer.MIN_VALUE;
//        for(int i=0;i<A.length;i++){
//         if(A[i]>maximum){
//             maximum=A[i];
//         }
//        }
//        System.out.print("Maximum :"+maximum);
           
//         }




//        }



//rotate

// import java.util.*;
// public class array {
//     public static void main(String args[]){
        
//         int A[]={3,9,7,8,12,6,15,5,4,10};

//         for (int x:A)
//         System.out.print(x+",");
//         System.out.println("");

//        int temp = A[0];

//         for(int i=1;i<A.length;i++){
//             A[i-1]=A[i];
//         }
//         A[A.length-1]=temp;

//         for (int x:A)
//         System.out.print(x+",");
//         System.out.println("");
//     }
// }

//Rotating 

// import java.util.*;
// public class array {
//     public static void main(String args[]){
        
//         int A[]={3,9,7,8,12,6,15,5,4,10};
      

        // for (int x:A)
        //     System.out.print(x+",");
        //     System.out.println("");
        //     int temp=A[0];

        //     for(int i=1;i<A.length;i++){
        //         A[i-1]=A[i];
        //     }
        //     A[A.length-1]=temp;

        //     for (int x:A)
        //     System.out.print(x+",");
        //     System.out.println("");


        


//     }
// }

//inserting.....


// import java.util.*;
// public class array {
//     public static void main(String args[]){
        
//         int A[]=new int [10];
//         A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
//         int n=6;

//         for(int i=0;i<n;i++)
//             System.out.print(A[i]+",");
//         System.out.println("");

//             int x=20;
//             int index=2;

//             for(int i=n;i>index;i--)
//                 A[i]=A[i-1];
//                 A[index]=x;

//                 for(int i=0;i<n;i++)
//             System.out.print(A[i]+",");
//         System.out.println("");
            
//     }
// }



// public class array {
//     public static void main(String args[]) {
//         int A[] = new int[11]; // Extra space to allow insertion
//         int originalArray[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
//         int n = 6;  // Number of elements in use

//         // Copy initial elements into A[]
//         for (int i = 0; i < n; i++) {
//             A[i] = originalArray[i];
//         }

//         // Print original array
//         System.out.println("Original Array:");
//         for (int i = 0; i < n; i++)
//             System.out.print(A[i] + ",");
//         System.out.println("");

//         // Element to insert and index position
//         int x = 20;
//         int index = 2;

//         // Shift elements to the right to make space
//         for (int i = n; i > index; i--) {
//             A[i] = A[i - 1];
//         }

//         // Insert x at the desired index
//         A[index] = x;
//         n++; // Increase count of elements

//         // Print modified array
//         System.out.println("Array after insertion:");
//         for (int i = 0; i < n; i++)
//             System.out.print(A[i] + ",");
//         System.out.println("");
//     }
// }

// public class array {
//     public static void main(String args[]) {
      
//         int A[]=new int[11];
//         int originalArray[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
//         int n=6;

//         for(int i=0;i<n;i++){
//             A[i]=originalArray[i];
//         }

//         System.out.print("Original Array :");

//         for(int i=0;i<n;i++)
//             System.out.print(originalArray[i]+",");
//             System.out.println("");
        
// //--------------------------------------------------------------------------------------------------------------------------------------------------
//             int x=20;
//             int index=2;

//             for(int i=n;i>index;i--){
//                 A[i]=A[i-1];
//             }
            
           
//             A[index]=x;
//             n++;
//             System.out.print("Array after insertion:");

//             for(int i=0;i<n;i++)
//             System.out.print(A[i]+",");
//             System.out.println("");


//     }
// }
//=============================================================================================================================================================================================================================================================

// import java.util.*;

// class arrayEx {
//     String name;
//     int rollNo;

//     arrayEx (String name,int rollNo){
//         this.name=name;
//         this.rollNo=rollNo;
//     }
// }
// public class array{

//     public static void main(String args[]){
//         arrayEx []array=new arrayEx[3];  //Array of objects
//         array[0] = new arrayEx("Oscar", 67);
//         array[1] = new arrayEx("Alice", 42);
//         array[2] = new arrayEx("Bob", 89);
        
//         for(arrayEx s:array){
//             System.out.println(s);
//         }


            
//     }
// }


//=============================================================================================================================================================================================================================================================

// class Rectangle{
//     private int length;
//     private int breadth;

//     public Rectangle(int length,int breadth){
//         this.length=length;
//         this.breadth=breadth;
//     }
//     public int getArea(){
//         return length*breadth;

//     }
// }

//     public class array {
    
//         public static void main(String args[]){
//             Rectangle obj=new Rectangle(2,4);
//             Rectangle obj2=new Rectangle(4,5 );
//             System.out.println(obj.getArea());
//             System.out.println(obj2.getArea());
//         }
//     }




//=============================================================================================================================================================================================================================================================

// class Rectangle{
//     int length;
//     int breadth;

//     Rectangle(int l,int b){
//         length=l;
//         breadth=b;
//     }
//         public int getArea(){
//             return length*breadth;
//         }

    
// }

// public class array {
//     public static void main(String args[]){
//         Rectangle[] rect=new Rectangle[2];
//         rect[0]=new Rectangle(2,4);
//         rect[1]=new Rectangle(4, 5);

//         for(int i=0;i<2;i++){
//             System.out.println(rect[i].getArea());
//         }
//     }
// }









//=============================================================================================================================================================================================
//Finding maxinmum element.........

// import java.util.*;
// public class array {
//     public static void main(String args[]){



//         int A[]={3,9,7,8,12,6,15,5,4,10};
//         int maxinmum=A[0];

//         for (int i=0;i<A.length;i++){
//             if(A[i]>maxinmum){
//                 maxinmum=A[i];
//             }
//         }
//         System.out.println(maxinmum);
//     }
// }

//=============================================================================================================================================================================================================================================================

//Previous maximum::


// import java.util.*;
// public class array {
//     public static void main(String args[]){
//         int A[]={3,9,7,8,12,6,15,5,4,10};

//         int maxinmum=A[0];
        
//         int prevMaximum=Integer.MIN_VALUE;

//         for (int i=0;i<A.length;i++){
//             if(A[i]>maxinmum){
//                 prevMaximum=maxinmum;
//                 maxinmum=A[i];
//             }
//             else if(A[i]>prevMaximum && A[i]!=maxinmum){
//                  prevMaximum=A[i];
//             }
//         }
//         System.out.println(prevMaximum);
//     }
// }











//   Example 7: Employee Management System

// import java.util.*;

// class Employee{

//Instance variable..



//     int empID;
//     String  name;
//     String designation;
//     int salary;





//   Cosntructor...

//     Employee(int empID,String name,String deString,int salary){
//         this.empID=empID;
//         this.name=name;
//         this.designation=designation;
//         this.salary=salary;
//     }





//methods for printing

//     void display(){
//         System.out.println("ID :"+empID);
//         System.out.println("Name :"+name);
//         System.out.println("Designation :"+designation);
//         System.out.println("Salary :"+salary);
        

//     }
// }




// public class array {

//     public static void main(String args[]){
//         Employee[] employee={
//             new Employee( 101,"Oscar","Manager",50000),
//             new Employee(102, "Saimon", "Developer", 45000),
//             new Employee(103, "Charlie", "Designer", 55000),
//             new Employee(104, "David", "Analyst", 75000),
//             new Employee(105, "Eve", "HR", 48000)
//         };

//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the employee ID :");
//         int employeeID=sc.nextInt();
//         System.out.println("1.Display details of "+employeeID+":");
//         System.out.println("2.check Employee has salary>50000  or not:");

//         int choice=sc.nextInt();

//         switch (choice){
//             case 1: 
//             for(Employee e:employee)
//             if (e.empID==employeeID)
//             e.display();
//             break;

//             case 2:
//             for(Employee e:employee)
//             if(e.salary>50000)
//             e.display();
//             break;
//             default:
//             System.out.println("Invalid choice!");

//         }
//         sc.close();

//     }
// }





// public class array {

//     static void inc(int x){
//         x++;
//         System.out.println(x);
//     }
//     public static void main(String args[]){
//         int a=10,b=15;
//         inc(a);
//         System.out.println(a);
       
//     }
// }

//Prime Number

// public class array {

//     static boolean primeNum(int n){
        
//         for(int i=2;i<n/2;i++){
//             if(n%2==0)
//             return false;
            
            
//         }
//         return true;
//     }
//         public static void main(String args[]){
//         System.out.print(primeNum(98));
//         }
    // }

    //GCD 

// public class array {

//            static int gcd(int m,int n){
//                 while(m!=n){
//                     if(m>n)m=m-n;
//                     else n=n-m;
//                 }
//                 return m;
//             }
//     public static void main(String args[]){
   
//         System.out.print(gcd(35,56));
//             }
//         }

      

import java.util.*;
public class array {

        
    public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
  
System.out.print("Enter the size of array:");
int n=sc.nextInt();
   int arr[]=new int [n];
   System.out.print("Enter the number for "+n+" elements");
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }


        //bubble sort

       for (int i=0;i<n-1;i++){
        for (int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
       }
    }
       
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
     
            }
        }