class A{
    int count;
    public synchronized void increment(){
         count++;
    }
}

public class ThreadsMutation {
    public static void main(String[] args) {
        A a=new A();
        Runnable obj1=()->{
            for(int i=1;i<=1000;i++){
                a.increment();
            }
        };
        Runnable obj2=()->{
            for(int i=1;i<=1000;i++){
                a.increment();
            }
        };
        
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(a.count);
    }
}
