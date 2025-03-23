//widening Casting.....

// Widening cassting (Automatic Type Conversion) --> byte,short,char,int,long,float,double.


// public class typeCasting{
//     public static void main(String args[]){
//         int myInt=30;
//         double myDouble=myInt;

//         System.out.println(myInt);
//         System.out.println(myDouble);

//     }
// }

 // Narrowing Casting (Manually Type Conversion)-->double,float,long,int,char,short,byte

//  public class typeCasting{
//     public static void main(String args[]){
// double myDouble = 9.87d;
// int myInt=(int) myDouble;
// System.out.println(myDouble);
// System.out.println(myInt);


//     }
// }


// Overflow and underflow..

// public class typeCasting{
//     public static void main(String args[]){

//         System.out.println("Smallest int value ="+Integer.MIN_VALUE);
//         int int_var=Integer.MIN_VALUE-1; //underflow
//         System.out.println(int_var);

//         System.out.println("Largest int value ="+Integer.MAX_VALUE);
//         int_var=Integer.MAX_VALUE+1; //overflow
//         System.out.println(int_var);


//     }
// }



// Widening cassting (Automatic Type Conversion) --> byte,short,char,int,long,float,double.

// Narrowing Casting (Manually Type Conversion)-->double,float,long,int,char,short,byte

// by the short char i love for double.








// public class typeCasting {
//     public static void main(String args[]) {
//         int[] arr={1,2,3,4,5,6,7};
//         for (int num : arr) {
//             if (num % 2 == 0) {
//                 System.out.println("even");// Even number
//             } else {
//                 System.out.println("odd"); // Odd number
//             }
//         }
//     }
// }

//odd or even 


// public class typeCasting {


//     public static void main(String args[]) {

        
//        int arr []={1,2,3,4};
//        int c=0;
//        for(int num:arr){
//        while(num!=0){
//         int digit=num%10;
//         c=c*10+digit;
//         num=num/10;

//         System.out.println(num);
//        }
//     }
// }}





// import java.util.Arrays; // ✅ Import Arrays class

// public class ReverseArray {
//     public static void main(String args[]) {
        
//         int arr[] = {1, 2, 3, 4}; // Original array
//         int n = arr.length;

//         // Reverse the array using two-pointer method
//         for (int i = 0, j = n - 1; i < j; i++, j--) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//         }

//         // Print the reversed array
//         System.out.println("Reversed Array: " + Arrays.toString(arr)); // ✅ Uses Arrays.toString()
//     }
// }





