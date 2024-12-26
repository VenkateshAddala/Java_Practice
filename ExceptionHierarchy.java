class A{
    void show() throws ArithmeticException{ //Ducking Exception and handling it in the main class 
        int j=2/0;
        System.out.println(j);
    }
}
class B{
    void showB() throws ArrayIndexOutOfBoundsException{  //Ducking Exception and handling it in the main class 
        int ar[]=new int[5];
        System.out.println(ar[5]);
    }
}
public class ExceptionHierarchy {
    public static void main(String[] args) {
        A obj=new A();
        B obj1=new B();
        try{
            obj.show();
            obj1.showB();
        }
        catch(ArrayIndexOutOfBoundsException e){//handling the exception
            System.out.println(e);
        }
        catch(Exception e){ //handling the exception
            System.out.println(e);
        }
        finally{
            System.out.println("Inside Finally block");
        }
        
    }
}
