package InterfaceTask;

public class Main {
    public static void main(String[] args) {
        StudentReport s1=new StudentReport("Rajesh",99);
        StudentReport s2=new StudentReport("Manish",89);
        if(s1.compareTo(s2)==0){
            System.out.println("Student 1 and Student 2 have equal marks");
        } else if (s1.compareTo(s2)>0) {
            System.out.println("Student 2 have less marks than Student 1");
        }else {
            System.out.println("Student 1 have less marks than Student 2");
        }
    }
}
