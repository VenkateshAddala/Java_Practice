import java.lang.reflect.Array;

class VenkyException extends Exception{
    public VenkyException(String s){
        super(s);
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int ar[]=new int[5];
        try{
            
            // System.out.println(ar[5]);
            j=6%i;
            System.out.println(j);
            if(j==0)
                throw new VenkyException("Divide by zero exception");
            
        }
        catch(ArithmeticException e){
            System.out.println("inside ArithmeticException " +e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Inside ArrayOutofbounds exception "+e);
        }
        catch(Exception e){
            System.out.println("Inside Exception"+e);
        }
        finally{
            System.out.println("Inside Finally block");
        }
    }
}
