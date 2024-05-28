package inheritance;

public class I {
    public void m1(){
        I i1 = new I();
        i1.m1();

    }
}
class J{
    public void m1(){
        J j1 = new J();
        j1.m1();

    }
}
class K extends I,J{

}