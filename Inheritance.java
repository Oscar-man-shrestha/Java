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


//Constructors in inheritance

class Parent {
    public Parent(){
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
}
class GrandChild extends Child{
    public GrandChild(){
        System.out.println("GrandChild Constructor");
    }
}
public class Inheritance{
    public static void main (String args []){


        System.out.println("====================================");
         //Calling parent constructor calls only parent constructor not child and GrandChild constructor.
        Parent p = new Parent();


        System.out.println("====================================");
        //Calling the child constructor first calls parent constructor then child constructor.
        Child c  =new Child();


        System.out.println("====================================");  
        //Calling the Grandchild constructor first calls parent constructor then child constructor and atlast grandchild constructor.
        GrandChild gc =new GrandChild();


        System.out.println("====================================");
    }
}

// Why ??
//This happens because a child cannot exist without its parent — just like in real life:

// A child is born from a parent.

// A grandchild cannot exist without both parent and grandparent.


// It’s like a family tree — you start from the oldest ancestor and work your way down!