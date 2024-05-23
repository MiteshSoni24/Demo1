package OverviewMonday;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(31);
        arrayList.forEach(
                n -> {
                    if (n % 10 == 0) {
                        System.out.println(n);//10 20
                    }
                });
        arrayList.forEach(n -> System.out.println(n));//10 20 31

        System.out.println();

        List<Person> people= Arrays.asList(new Person("shri",20),new Person("shri2",15),new Person("shri3",23));

        List<Person> filteredList = people.stream()
                .filter(person -> person.getAge() > 18)
                .collect(Collectors.toList());

        filteredList.forEach(System.out::println); //Person{name='shri', age=20}  Person{name='shri3', age=23}


        System.out.println();

        int totalAge = people.stream()
                .map(person -> person.getAge())
                .reduce(0, (age1, age2) -> age1 + age2);

        System.out.println("Total age: " + totalAge);//Total age: 58

        System.out.println();
    }
}


