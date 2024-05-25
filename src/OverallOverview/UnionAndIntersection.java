package OverallOverview;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection{

    public static Set<Integer> findUnion(int[] arr1, int[] arr2) {
        Set<Integer> union = new HashSet<>();
        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            union.add(num);
        }
        return union;
    }

    public static Set<Integer> findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        return intersection;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};

        Set<Integer> union = findUnion(arr1, arr2);
        Set<Integer> intersection = findIntersection(arr1, arr2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);

        int[] arr3 = {2, 5, 6};
        int[] arr4 = {4, 6, 8, 10};

        union = findUnion(arr3, arr4);
        intersection = findIntersection(arr3, arr4);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}

