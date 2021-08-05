 package main.java;

public class PostGraduates  implements  Runnable{
    private String name;
    private  static int StudentId=100;
    private int time=100;

    static {
        System.out.println("----------POSTGRADUATE CLASS IS EXECUTED------------");
    }

    PostGraduates(String name){
        this.name=name;
        StudentId++;
    }

    public PostGraduates(){

    }

    public  void run(){
        for(int i=1; i<=time; i++){
            try{
                System.out.println(i+" POSTGRADUATE : "+getStudentInfor());
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }


    private String getStudentInfor(){
        return "UnderGraduates :" +
                "name= " + name + '\t' +
                "StudentId= " + "PG"+StudentId ;
    }
}
