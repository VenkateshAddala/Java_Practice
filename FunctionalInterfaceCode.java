@FunctionalInterface 
interface A {
void show();
    
} 
public class FunctionalInterfaceCode {
    public static void main(String[] args) {
        A obj=new A(){  //using Anonymous Inner class
            public void show(){
                System.out.println("Inside A show");
            }
        };
        obj.show();
    }
}
