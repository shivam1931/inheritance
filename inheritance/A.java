package inheritance;

public class A {// parents single levelm
    public void m1(){
        int roll;
        int marks;
        String name;
        System.out.println("enter roll name and marks :");
    }
}
class B extends A{//child
    void m2(){
        B b = new B();
        int roll = 1; String name = "shivam"; int marks = 75;
        System.out.println(roll+ " " +name+" " + marks);

    }

    public static void main(String[] args) {
        B b = new B();
        b.m1(); b.m2();
    }
}