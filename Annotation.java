class A{
    public void shows(){
        System.out.println("In A show");
    }
}
class B extends A{
    @Override
    public void shows(){
        System.out.println("In B show");
    }
}

public class Annotation {
    public static void main(String[] args) {
        B obj=new B();
        obj.shows();
    }
}
