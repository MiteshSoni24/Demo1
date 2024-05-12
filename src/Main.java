import Model.Employee;
import Model.Shapes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //static
        // Employee.display("Kavish","sr sd");

        //nonstatic
       // Employee employee=new Employee();
       // employee.display("Kavita","Sr. rec");


       // Employee employee=new Employee("neha","marketing head");
        // employee.display("Kavita","Sr. rec");
        // employee.display("hello");

        Shapes shapes=new Shapes();
        shapes.area(10,12);
        shapes.area(10);
        shapes.area(4.5);
        shapes.area(100);
         }
    }
