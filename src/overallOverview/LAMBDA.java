package overallOverview;

import java.util.*;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;

public class LAMBDA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();//10
        int w = scanner.nextInt();//5
        LambdaInterface lambdainterface = ((length, width) -> {
            System.out.println(length * width);//output 50.0
        });

        lambdainterface.calculate(l, w);

        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

        people.forEach(System.out::println);//Person{name='Alice', age=30} Person{name='Bob', age=25} Person{name='Charlie', age=35}


        List<Integer> list= people.stream()
                .map(person ->  person.getAge()+2)
                .collect(Collectors.toList());
        list.forEach(System.out::println);// 32 27 37


        List<Person> list1=people.stream()
                .filter(person -> person.getAge()>25)
                .collect(Collectors.toList());
        list1.forEach(System.out::println);//Person{name='Alice', age=30} Person{name='Charlie', age=35}

        int a=people.stream()
                .map(person -> person.getAge())
                .reduce(0,(age1, age2) -> age1 + age2);
        System.out.println(a);//90(sum of all persons age)


    }
}