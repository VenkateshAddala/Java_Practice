class A{
    public void show(){
System.out.println("In A show");
    }
}

class B extends A{

    public void showB(){
        System.out.println("In B show");
    }
    public void show(){
        System.out.println("In B show A");
    }  
}

class SampleClass{
    public static void main(String[] args) {
        A obj=new B();
        ((B) obj).showB();
    }
}