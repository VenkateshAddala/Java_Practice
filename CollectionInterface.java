import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionInterface {
    public static void main(String[] args) {
        List<Integer> col=new ArrayList<Integer>();

        col.add(1);
        col.add(2);
        col.add(3);
        col.add(5);
        col.add(4);

        Iterator<Integer> it=col.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // for(int i:col){
        //     System.out.println( col.indexOf(i)+":"+i);
        // }
    }
}
