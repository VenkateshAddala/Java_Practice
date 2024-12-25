class A{
    public void show(){
        System.out.println("Inside A show");
    }
    public void sho1(){
        System.out.println("Inside sho1 A show");
    }
    
}

public class Anonymous {
    public static void main(String[] args) {
        A obj=new A(){
            public void sho1(){
                System.out.println("Inside new A show");
            } 
        };
        obj.show();
        obj.sho1();
    }
}
