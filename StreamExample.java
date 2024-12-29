import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
   public static void main(String[] args) {
    List<Integer> ls=Arrays.asList(4,3,5,2,6,1,7,8);

    Stream<Integer> s=ls.stream();
    Stream<Integer> s1=s.filter(n->n%2==0);
    Stream<Integer> s2=s1.map(n->n*2);
    int res=s2.reduce(0,(c,e)->c+e);


    int result=ls.stream().filter(n->n%2==0)
    .map(n->n*3)
    .reduce(0,(c,e)->c+e);

    System.out.println(res);
    System.out.println(result);



    
   } 
}
