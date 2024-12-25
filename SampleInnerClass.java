class A{

    public void show(){
        System.out.println("In A show");
    }


     static class B 
     {
        public void con(){
            System.out.println("In B config");
        }
    }
}
public class SampleInnerClass {
    public static void main(String[] args) {
        // A obj=new A();
        // obj.show();
        A.B obje= new A.B();
        // A.B obje=new A.B();
        obje.con();
    }
}
