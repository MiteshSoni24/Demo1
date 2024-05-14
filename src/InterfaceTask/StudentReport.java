package InterfaceTask;

public class StudentReport implements Comparable<StudentReport> {
    private String Name;
    private int Marks;

    public StudentReport(String name, int marks) {
        this.Name = name;
        this.Marks = marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        this.Marks = marks;
    }

    @Override
    public int compareTo(StudentReport studentReport) {
        if(this.Marks == studentReport.Marks)
            return 0;
        else if (this.Marks > studentReport.Marks) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
