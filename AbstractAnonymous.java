abstract class A{
    abstract public void sho1();
    abstract public void show();
}

enum Status{
    SUCCESS,
    FAILED,
    RUNNING
}

public class AbstractAnonymous{
    public static void main(String[] args) {
        A obj=new A(){
            public void sho1(){
                System.out.println("Inside Abstract Anonymous Inner show");
            } 
            public void show(){
                System.out.println("Inside Config");
             }
        };
        obj.sho1();
        obj.show();

        Status[] s=Status.values();
        System.out.println(s[0]);
    }
}
