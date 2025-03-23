// import java.math.*;
// class Circle {
//     public double  radius;  //one property
//     public double area(){
//         return Math.PI * radius * radius;
//     }
//     public double perimeter(){
//         return 2 * Math.PI * radius;
//     }

// }

// class Cylinder extends Circle {
//     public double height;
//     public double volume(){
//         return area() * height; 
//     }
// }

// public class Inheritance {
//     public static void main (String argsg[]){
//         Cylinder c=new Cylinder();
//         c.radius = 7;
//         c.height=10;
//         System.out.println("Voulume :"+c.volume());
//         System.out.println("Area :"+c.area());
      

//     }
// }

//  Everthing from the circle class will be available int the cylinder class
//  It is available but not excessable


//====================================================================================================================================================================================================================================================================================================================================================================================================================================== 

//Constructors in inheritance

// class Parent {
//     public Parent(){
//         System.out.println("Parent Constructor");
//     }
// }
// class Child extends Parent{
//     public Child(){
//         System.out.println("Child Constructor");
//     }
// }
// class GrandChild extends Child{
//     public GrandChild(){
//         System.out.println("GrandChild Constructor");
//     }
// }
// public class Inheritance{
//     public static void main (String args []){


//         System.out.println("====================================");
//          //Calling parent constructor calls only parent constructor not child and GrandChild constructor.
//         Parent p = new Parent();


//         System.out.println("====================================");
//         //Calling the child constructor first calls parent constructor then child constructor.
//         Child c  =new Child();


//         System.out.println("====================================");  
//         //Calling the Grandchild constructor first calls parent constructor then child constructor and atlast grandchild constructor.
//         GrandChild gc =new GrandChild();


//         System.out.println("====================================");
//     }
// }

// Why ??
//This happens because a child cannot exist without its parent — just like in real life:

// A child is born from a parent.

// A grandchild cannot exist without both parent and grandparent.


// It’s like a family tree — you start from the oldest ancestor and work your way down!

//======================================================================================================================================================================================================================================================================================================================================================================================================================================

//  Parametrised Constructor.


// class Parent {
//     Parent(){
//         System.out.println("Non-Param Of Parent");
//     }
//     Parent(int x){
//         System.out.println("Param Of Parent "+x);
//     }
// }
// class Child extends Parent{
//     Child(){
//         System.out.println("Non-Param Of Child");
//     }
//     Child(int y){
//         System.out.println("Param Of Child");
//     }
//     Child(int x,int y){
//         // method of calling Parametrised  construction of super class
//         // It must be called from constructor  of child class by using a keyword super and that line be a first line
//         super(x);  
//         System.out.println("2-Param Of Child "+y);
//     }
// }
// public class Inheritance{
//     public static void main (String args []){
//         Child c =new Child(10,20);

//  }
// }

//======================================================================================================================================================================================================================================================================================================================================================================================================================================

// this keyword

// class Car {
//     String model;
//     int year;
//     Car (){
//         this("Unknown",2000);
//     }
//     Car (String model,int year){
//         this.model=model;
//         this.year=year;
//     }

// }
// public class TestCar {
//     public static void main(String[] args) {
//         Car car1 = new Car();  // Uses default values
//         Car car2 = new Car("Honda", 2022);  // Custom values

//         System.out.println("Car 1: " + car1.model + ", " + car1.year);
//         System.out.println("Car 2: " + car2.model + ", " + car2.year);
//     }
// }


// class Car {


// }
// public class TestCar {
//     String name;
//     int age;
//     TestCar(){
//         this("Oscar",19);
//     }
//     TestCar (String name,int age){
//        this.name=name;
//        this.age=age;
//     }
//     public static void main(String[] args) {
//        TestCar obj1 = new TestCar();
//        TestCar obj2 = new TestCar("Kaushal",50);

//        System.out.println("Name is :"+ obj1.name +" and age is : "+obj1.age);
//        System.out.println("Name is :"+obj2.name+" and age is : "+obj2.age);
//     }
// }

//======================================================================================================================================================================================================================================================================================================================================================================================================================================

//                             this and super 

//                                   this 

// class Rectangle {
//     int length;
//     int breadth;
//     int x = 10;

//     Rectangle(int length, int breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }
// }

// public class TestCar {
//     public static void main(String args[]) {
//         Rectangle obj1 = new Rectangle(10, 12);
//         System.out.println("length :" + obj1.length + " Breadth :" + obj1.breadth);
//     }
// }


//                                   Super

class Rectangle {
    int length;
    int breadth;
    int x = 10;  // Instance variable

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth; // Constructor
    }
}

class Cuboid extends Rectangle {
    int height;
    int x = 20;  // Shadowing the 'x' variable from Rectangle

    Cuboid(int l, int b, int h) {
        super(l, b);  // Calls Rectangle's constructor
        height = h;
    }

    void display() {
        System.out.println(super.x);  // Accesses 'x' from Rectangle (10)
        System.out.println(x);         // Accesses 'x' from Cuboid (20)
    }
}



