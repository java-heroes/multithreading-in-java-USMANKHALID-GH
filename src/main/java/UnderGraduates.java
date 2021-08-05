package main.java;

public class UnderGraduates implements Runnable {
    private String name;
    private  static int StudentId=100;
    private int time=100;

    static {
        System.out.println("----------UNDERGRADUATE CLASS IS EXECUTED------------");
    }
    UnderGraduates(String name){
        this.name=name;
        StudentId++;
    }

    public UnderGraduates(){

    }

   public   int getTime(){
        return time;
    }
    public  void setTime(int time){
        this.time=time;
    }
    public  void run(){
        for(int i=1; i<=time; i++){
            try{
                System.out.println(i+" UNDERGRADUATE : "+getStudentInfor());
               Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }


    private String getStudentInfor(){
        return "UnderGraduates :" +
                "name= " + name + '\t' +
                " StudentId= " + "UG"+StudentId ;
    }

}
