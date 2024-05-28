package inheritance;

public class F {// heirarchy inheritance
    public void m1(){
        System.out.println("F for Fisherman");

    }
}
class G extends F{
    public void m2(){
        System.out.println("G for gandhi ji");

    }
}
class H extends F {
    public void m3(){
        System.out.println("H for height");

    }

    public static void main(String[] args) {
        H h1 = new H();
        G g1 = new G();
        h1.m3();h1.m1();
        g1.m2();g1.m1();
    }
}