package COLLECTION;

public class Lambda {
    public static void main(String[] args) {
        AreaCalcilator area=(length,breadth)->{
            System.out.println(length*breadth);//35
        };
        area.calculateArea(5,7);
    }
}
