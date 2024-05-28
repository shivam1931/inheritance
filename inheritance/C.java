package inheritance;

public class C {// multilevel
    int a,b;
    int c;
    public void m3(){
        int a = 20; int b= 10;
        int c =a+b;
        System.out.println("sum of digit " + c);
    }
}
class D extends C{
    public void m4(){
        int a = 12;
        int b = 6;
        int d =a/b;
        System.out.println(" answer "+ d);

    }
}
class E extends D {
    public void m5() {
        int a = 12;
        int b = 6;
        int m = a*b;
        System.out.println("answer is " + m);
    }

    public static void main(String[] args) {
        E e1 = new E();
        e1.m3();
        e1.m4();
        e1.m5();


    }
}