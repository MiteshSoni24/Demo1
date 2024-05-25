package OverallOverview;

public class intToBinary {
    public static void main(String[] args) {
        int num=67;
        //convert integer to binary
        String binaryString= Integer.toBinaryString(num);
        System.out.println("Original value: "+num);
        System.out.println("Binary Representation: "+binaryString);

    }
}
