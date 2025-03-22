public class classObjectMethods{

    int age;
    String color;

    classObjectMethods(int age1,String color1){
        age=age1;
        color=color1;
    }
    public static void main(String args []){

        classObjectMethods obj1 = new classObjectMethods(12,"red" );
        System.out.println(obj1.age+ " "+ obj1.color);
    }
}