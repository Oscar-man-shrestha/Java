//Local Varibles::

//Variables defined inside constructor,method body or block ..
//These variables are created when methods is called and destroyed when it is executed and retured to caller.

// public class typesOfVariables{

//     public  void add(){
//         int a=10;
//         int b=11;
//         int c=a+b;
//         System.out.println(c);
//     }
//     public static void main (String args[]){
//         typesOfVariables obj=new typesOfVariables();
//         obj.add();

//     }
// }


//===================================================================================================================================================================================================================================================

//Instance Varibles::

//  A variables that is declared inside the class but outside the  method body,constructor,or block is known as instance variables.
//  It is non-static variable.
//  These variables are created when an instance (object) of the class is created and are destroyed when the object is destroyed.

// class Parent{
//     String name;
//     int age;
// }
// public class typesOfVariables{
//     public static void main(String args[]){
//         Parent obj=new Parent ();
//         obj.name="Kaushal Man shrestha";
//         obj.age=54;
//         System.out.println(obj.name);
//         System.out.println(obj.age);
//     }
// }


//===================================================================================================================================================================================================================================================


//Static Variables::

//  A variable that is declared as static is known as static variable.Also known as class variable.
//  These variables are created in the begining of the program execution and destroyed autoamtically when the program execution end.

// class Parent {
//     public static String name="Kaushal Man Shrestha";
//     public static int age;

// }
// public static void main(String args[]){
//     System.out.println(Parent.name);
//     Parent.age=54;
//     System.out.println(Parent.age);
// }

//calculate the bmi..


public class typesOfVariables{
    public String myName;
    public double height;
    public int weight;


    public void printPersonName(){
        System.out.println("The name of the Person is: "+myName);
        System.out.println("The weight of the Person is: "+weight);
        System.out.println("The height of the Person is: "+height);
    }
    public  double calculateBMI(){
        double BMI=0;
        BMI=(weight)/((height)*(height));
        return BMI;
    }
    public static void main(String args[]){

        typesOfVariables obj=new typesOfVariables();

        obj.myName="Oscar Man Shrestha";
        obj.height=5.5;
        obj.weight=55;

        obj.printPersonName();
        

        typesOfVariables obj2=new typesOfVariables();

        obj.myName="Kaushal Man Shrestha";
        obj.height=5.8;
        obj.weight=65;

        obj.printPersonName();

        typesOfVariables BMI=new typesOfVariables();

       double personBMI= obj.calculateBMI();
       double personBMI2= obj2.calculateBMI();
       System.out.println("BMI of person1 is:"+personBMI);
       System.out.println("BMI of person2 is:"+personBMI2);



    }

}







