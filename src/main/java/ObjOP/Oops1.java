package ObjOP;

//Polymorphism
//class Student{
//    int age;
//    String name;
//    void printinfo(String name){
//        this.name=name;
//        System.out.println(name);
//    }
//    void printinfo(int age){
//        this.age=age;
//        System.out.println(age);
//    }
//    void printinfo(String name,int age){
//        this.age=age;
//        this.name=name;
//        System.out.println(name+" "+age);
//    }
//}

//Inheritance
//class shape{
//    int a;
//    int b;
//    void area(){
//        System.out.println("Displaying the area");
//    }
//    void ar(int a, int b){
//        this.a =a;
//        this.b=b;
//        System.out.println(a+b);
//    }
//}
//class triangle extends shape{
//    void area(int l, int b){
//        System.out.println(1/2*l*b);
//    }
//}
//class eqtriangle extends triangle{
//    void area(int l, int b){
//        System.out.println(1/2*l*b);
//    }
//}
//class circle extends shape{
//    int r;
//    void area(int r){
//        System.out.println(3.14*r*r);
//    }
//
//}
public class Oops1 {
    public static void main(String[] args){
        //Polymorphism
//        Student s1 =new Student();
//        s1.name="Seshadri";
//        s1.age=23;
//        s1.printinfo(s1.name, s1.age);
//        s1.printinfo(s1.age);

        //Inheritance
//        circle c1 = new circle();
//        c1.r=7;
//        c1.area(c1.r);
                //casting
//        shape ball = new circle();
//        ((circle) ball).r=3;
//        ((circle) ball).area(((circle) ball).r);

    }
}

