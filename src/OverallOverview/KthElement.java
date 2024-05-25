package OverallOverview;

import java.util.Scanner;

public class KthElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Input array size
        System.out.println("Enter the size of array");
        int size=scanner.nextInt();

        //Input array elements
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<size;i++){
            arr[i]=scanner.nextInt();
        }

        //Input k
        System.out.println("Enter value of k: ");
        int k=scanner.nextInt();

        if(k>0 && k<=size){
            System.out.println("Kth smallest: "+findKthSmallest(arr,k));
            System.out.println("Kth largest: "+findKthLargest(arr,k));

        }else {
            System.out.println("Invalid value of k");
        }

    }
    public static int findKthSmallest(int[] arr,int k){
        for(int i=0;i<k;i++){
            int minIndex=i;
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }

            }
            //swap the found minimum element with the element at index i
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        return arr[k-1];
    }

    public static int findKthLargest(int[] arr,int k) {
        for (int i = 0; i < k; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }

            }
            //swap the found minimum element with the element at index i
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        return arr[k - 1];
    }
}
