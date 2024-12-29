import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Student{
    int age;
    String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student(String name) {
        this.name = name;
    }
    
    public Student(){

    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }


}

public class MethodReference {
    public static void main(String[] args) {
        List<String> ls=Arrays.asList("venky","hemanth","nithish","vinay");
        List<String> res=ls.stream().map(String::toLowerCase).toList();
        res.forEach(System.out ::println);


        List<Student> stu = new ArrayList<>();
        // for(String name:ls){
        //     stu.add(new Student(name));
        // }

        // stu=ls.stream()
        //     .map(n->new Student(n))
        //     .toList();

        stu=ls.stream()
            .map(Student::new)
            .toList();


        System.out.println(stu);
    }
}
