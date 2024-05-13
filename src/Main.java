import Inheritance.Employee1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Employee1{
    public static void main(String[] args) {

        //Employee1 employee1=new Main();
        //employee1.display();//bye

        //Main main=new Main();
        //main.display();//bye
        //main.showAddress();//bye/Bhind

        Main main=new Main();
        Employee1 employee1=(Employee1)main;
        employee1.display();//bye
        }

    public void display(){
        System.out.println("bye");
    }
}
