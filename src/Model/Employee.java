package Model;

public class Employee {
    private String ename;
    private String position;

    public Employee(String ename, String position) {
        this.ename = ename;
        this.position = position;
    }
    public Employee(){

    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    //static
   // public static void display(String ename, String position)
   // {
    //    System.out.println(ename+" "+position);
   // }

    //nonstatic
    public void display(String ename, String position)
    {
        System.out.println(ename+" "+position);
    }
    public boolean display(String ename){
        System.out.println(ename+" "+position);
        return true;
    }
}
