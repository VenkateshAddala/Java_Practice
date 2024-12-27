import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
    public int compareTo(Student that) {
      
         if(this.age>that.age)
            return 1;
         else
            return -1;
    }
    
    
}

public class ComparatorAndComparableExample {
    public static void main(String[] args) {
        List<Student> ls=new ArrayList<Student>();
        ls.add(new Student(21, "venky"));
        ls.add(new Student(23, "hemanth"));
        ls.add(new Student(18, "nithish"));
        ls.add(new Student(26, "vinay"));
        ls.add(new Student(27, "jyo"));

        Comparator<Student> com=(i,j)->i.age%10>j.age%10?1:-1;

        Collections.sort(ls,com); //sorting based on the last digit in age
        for(Student s:ls)System.out.println(s);
        Collections.sort(ls);//sorting based on the age
        for(Student s:ls)System.out.println(s);

    }
}
