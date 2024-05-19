package Collection;

import java.util.*;

public class ArrList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
       // arrayList.add("hhh");
        for(Integer i:arrayList){
            System.out.println(i);//0 1 2
        }

        arrayList.remove(1);
        for(Integer i:arrayList){
            System.out.println(i);//0 2
        }


        System.out.println();

        ArrayList<Employee> arrayList1=new ArrayList<>();
        //Employee employee = null;
        Employee employee1=new Employee(2,"gfhgf","fghfhg");
        Employee employee2=new Employee(1,"gfhgf","fghfhg");
        arrayList1.add(employee1 );
        arrayList1.add(employee2);
        System.out.println(arrayList1);
        //output: [Employee{eId=2, eName='gfhgf', position='fghfhg'}, Employee{eId=1, eName='gfhgf', position='fghfhg'}]
        arrayList1.remove(employee1);
        System.out.println(arrayList1);
        //output: [Employee{eId=2, eName='gfhgf', position='fghfhg'}, Employee{eId=1, eName='gfhgf', position='fghfhg'}]


        Set<Employee> set = new HashSet<>();
        set.add(employee1);
        set.add(employee2);
        System.out.println("set "+ set);
       //output:  set [Employee{eId=1, eName='gfhgf', position='fghfhg'}, Employee{eId=2, eName='gfhgf', position='fghfhg'}]

        System.out.println();
        Collections.sort(arrayList1,new EmployeeIdComparator());
        for(Employee employee:arrayList1){
            System.out.println(employee);
        }
        //Set<Integer>set1 =new HashSet<>();
        Scanner sc=new Scanner(System.in);
        Employee employee=new Employee(sc.nextInt(),sc.nextLine(),sc.next());
        System.out.println(employee.toString());
    }
}

