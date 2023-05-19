package Oops.LearningOops;

public class Student {

    String name;
    private int ron;
   private static int studentcount;
  static int a=10;
  int b=20;

    public Student(String name) {
        this.name = name;
        studentcount++;
        this.ron = studentcount;
    }



//    static funtion
    public  static int getStudentcount(){
        return studentcount;
    }

//    Student() {
//        name = "Enter your name";
//        ron = 00;
//    }

    public void print() {
        System.out.println(name + " " + ron);
    }

//..................................
    //Question1
//static int marks;
//    void set_marks(int marks)
//    {
//        this.marks=marks;               //Line 1
//    }
    //..................................
}
