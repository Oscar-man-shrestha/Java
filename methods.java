// // public class methods {

// //   int logic (int x,int y){ //if static hunxa vane matra teslai main method mah call garna milxa otherwise we need object creation
// //         int z  ;
// //         if(x>y){
// //             z=x+y;
// //         }
// //         else{
// //             z=(x+y)*5;
// //         }
// //         return z;
// //         }


// //     public static void main(String args[]){
// // int a=5;
// // int b=7;
// // int c;


// // //with static
// // methods obj=new methods();
// // c=obj.logic(a,b);


// // // without static
// // // c=logic(a,b);


// // System.out.print(c);
// //     }
    
// // }




// //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// // public class methods {

// //     static void change(int a){
// //         a=98;
// //     }
// //      static void change2(int [] arr){
// //         arr[0]=98;
// //      }
  
// //       public static void main(String args[]){

// //         //Case 1:Changing the Integer
// //         int x=45;
// //         change(x);
// //         System.out.println(x);
  
// //          //Case 2:Changing the array
// //         int [] marks={52,73,77,89,98,94};
// //         change2(marks);
// //         System.out.println("The value of x after running change is:"+marks[0]);
// //       }
      
// //   }
  

// //====================================================Method overloading===================================================================



// // public class methods {

// //   static void foo(){

// //     System.out.println("Good Morning bro!");
// //   }
// //   static void foo(String a){ //a is parameter
// //     System.out.println("Good Morning"+a+"bro!");
// //   }

// //     public static void main(String args[]){

// //       foo();
// //       foo(" "+"Oscar"+" ");   //oscar is argument  [  arguments are actual! ]
// //     }
    
// // }


// // public class methods {

// //   static int max(int x,int y){
// //     return x>y?x:y;
// //   }
// //   static float max(float x,float y){

// //     if(x>y)
// //     return x;
// //     else
// //     return y;
// //   }
// //     public static void main(String args[]){
// //       System.out.println(max(10f,5f));

// //     }
    
// // }

// //behaviour change -polymorphism. parameter depends

// //====================================================Method overloading===================================================================

// // public class methods {

// //   void show(double a){
// //     System.out.println("int method");
// //   }

// //   void show(String a){
// //     System.out.println("String method");
// //   }

// //       public static void main(String args[]){
// //      methods obj=new methods();
// //      obj.show(2.20f);

// //     }
    
// // }


// // public class methods {

// //   void show(StringBuffer a){
// //     System.out.println("int method");
// //   }

// //   void show(String a){
// //     System.out.println("String method");
// //   }

// //       public static void main(String args[]){
// //      methods obj=new methods();
// //      obj.show("haha");

// //     }
    
// // }

// // public class methods {

// //   void show(int a,float b){
// //     System.out.println("int method");
// //   }

// //   void show(float a ,int b){
// //     System.out.println("String method");
// //   }

// //       public static void main(String args[]){
// //      methods obj=new methods();
// //      obj.show(20,3);

// //     }
    
// // }

// // output:The method show(int, float) is ambiguous for the type methods

// // public class methods {

// //   void show(int... a){
// //     System.out.println("int method");
// //   }

// //   void show(float a ,int b){
// //     System.out.println("String method");
// //   }

// //       public static void main(String args[]){
// //      methods obj=new methods();
// //      obj.show(20,20,21);

// //     }
    
// // }

// //====================================================Method overriding===================================================================




// // class A{
  
// // }
// // class B extends A{

// // }
// // class test{
// //   public static void main (String []args ){
// //     A obj =new B();  //Implicit Upcasting


// //   }
// // }


// class A{
  
// }
// class B extends A{

// }
// class test{
//   public static void main (String []args ){
//     B obj =new A();  //Implicit downcasting


//   }
// }


class A{
  
}
class B extends A{

}
class test{
  public static void main (String []args ){
    A obj =new B();  //Implicit downcasting
    B obj1=(B)obj;


  }
}
