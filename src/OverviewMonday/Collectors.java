package OverviewMonday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collectors {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        System.out.println(list);//[10, 20, 30, 10]
        list.remove(1);
        System.out.println(list);//[10, 20, 10]
        list= Arrays.asList(40,50,60);
        System.out.println(list);//[40,50,60]

        System.out.println();

        list= Arrays.asList(40,50,60);
        //here list.add(10); not possible error Exception
        System.out.println(list);//[40,50,60]

        List<Person> list1=Arrays.asList(
                new Person("Shree1",28),
                new Person("Shree2",32),
                new Person("Shree3",22),
                new Person("Shree4",12)
        );
        Collections.sort(list1,new PersonAgeComparator());
        System.out.println(list1);//[Person{name='Shree4', age=12}, Person{name='Shree3', age=22}, Person{name='Shree1', age=28}, Person{name='Shree2', age=32}]
    }
}
