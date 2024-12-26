class A implements Runnable{ //creating a thread by implementing runnable interface
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(10); //setting thread to sleep for 10 milli seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{//creating a thread extending Thread class
    public void run(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(10);//setting thread to sleep for 10 milli seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hi yo!!!");
        }
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        Runnable a=new A(); // creating runnable object for class A thread
        Thread t1=new Thread(a);
        
        B b=new B();
        b.setPriority(Thread.MAX_PRIORITY); //setting max thread priority
        t1.start();
        try {
            Thread.sleep(5);//setting thread to sleep for 5 milli seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.start();

        Runnable obj=()->{
                for(int i=0;i<5;i++){
                    System.out.println(i+":"+"hello");
                    try {
                        Thread.sleep(10); //setting thread to sleep for 10 milli seconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };

        obj.run();
    }
    
}
