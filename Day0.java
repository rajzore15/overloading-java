 class Student{
     public Student(int roll_no, int phn_no, char gender, String name, String mail_id) {
         this.roll_no = roll_no;
         this.phn_no = phn_no;
         this.gender = gender;
         this.name = name;
         this.mail_id = mail_id;
     }

     int roll_no;
   int phn_no;
   char gender;
   String name ,mail_id;

     public Student() {

     }
 }
public class Day0 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Student student= new Student();
        student.roll_no = 31;
        System.out.println(student.roll_no);
        student.gender ='M';
        System.out.println(student.gender);
        student.mail_id = "zoreraj099@mail.com";
        System.out.println(student.mail_id);
        student.name = "raj";




    }

}
