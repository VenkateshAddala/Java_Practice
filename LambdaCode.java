interface A{
    public int show(int i, int j);
}
public class LambdaCode {
    public static void main(String[] args) {
        // A obj=(i,j)->System.out.println(i+j);
        // obj.show(2,3);

        A obj = (i,j)-> i+j;

        int res=obj.show(2,5);
        System.out.println(res);
    }
}
