package Interface;

import java.util.Scanner;

public class Driver{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student student=new Student(sc.nextInt(),sc.nextLine());//10 Hii
        Student student1=new Student(12,"hiii");
        //System.out.print(student.showRollNo()+"");
        //student.display();//10 Hii
        System.out.println(student.compareTo(student1));
    }


}
