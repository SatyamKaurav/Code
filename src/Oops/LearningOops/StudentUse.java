package LearningOops;

public class StudentUse {


    public static void main(String[] args) {

//        this thing is creating a logical break
//        any one out the class can change the static value variable value
        //Student.studentcount=100;

      Student s1 = new Student("Satyam");
        Student s2 = new Student("Shubham");
        Student s3 = new Student("Keerat");
        s1.print();
        s2.print();
        s3.print();
        System.out.println(Student.getStudentcount());

//.........................
        //question1
/*
        Student t=new Student();
        t.set_marks(78);                //Line 2
        System.out.print(Student.marks);   //Line 3

//        There is no error in this code.
//        In this class, there is just a single variable,
//        which is, static variable. Static variables are property of the class,
//        but you can access it through objects.
//        Hence, line 1 and 2 did not generate any error.
         */

    }
}
