import java.util.Scanner;

public class QuestionService {
    
    Questions q[]= new Questions[5];
    String[] ans=new String[5];
    
    

    public QuestionService() {
        q[0]=new Questions(1,"what is the capital of AP?","Tirupati","Vijayawada","Amaravathi","Visakhapatnam","Amaravathi");

        q[1]=new Questions(2,"who is the Chief Minister of AP?","KCR","Jagan Mowayya","CBN","PK","CBN");

        q[2]=new Questions(3,"what is the capital of India?","Chennai","Mumbai","Delhi","Hyderabad","Delhi");

        q[3]=new Questions(4,"who is the PM of India?","PVN","NAMO","MMS","VP","NAMO");

        q[4]=new Questions(5,"what is the capital of Karnataka?","Mangalore","Bangalore","Belgaum","Mysore","Bangalore");

    }



    public void display(){
        int i=0;
        for(Questions que:q){
            System.out.println(que.getId()+"."+que.getQuestion());
            System.out.println("a."+que.getOp1());
            System.out.println("b."+que.getOp2());
            System.out.println("c."+que.getOp3());
            System.out.println("d."+que.getOp4());
            System.out.println();
            Scanner sc=new Scanner(System.in);
            ans[i]=sc.nextLine();
            i++;
            
        }
        System.out.println();
        for(String s:ans)System.out.println(s);
    }

    public void displayScore(){
        int score=0;

        for(int i=0;i<5;i++){
            if(q[i].getAns().equalsIgnoreCase(ans[i])){
                
                score++;
            }
        }

        System.out.println("your score is: "+score);
    }
    
}
