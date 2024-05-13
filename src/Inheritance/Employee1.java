package Inheritance;

public class Employee1 extends Address{
    public void display()
    {
        System.out.println("Hii");
    }

    @Override
    public void showAddress() {
        System.out.println("Bhind");
    }
}
