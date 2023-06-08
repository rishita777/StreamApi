package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCustom
{
    public static void main(String[] args) {
        Employee e1=new Employee(3,"varun",45000);
        Employee e2=new Employee(1,"nisha",75000);
        Employee e3=new Employee(2,"ajay",25000);
        List<Employee> li1=new ArrayList<>();
        li1.add(e1);
        li1.add(e2);
        li1.add(e3);
        System.out.println(li1);

        System.out.println("===================FILTER=============================");
        li1.stream().filter(x->x.getSalary()>25000).collect(Collectors.toList()).forEach((x)-> System.out.println(x));

        System.out.println();
        System.out.println("===================MAP============================");

        li1.stream().filter((x)->x.getSalary()<=25000).map((x)->new Employee(x.getEmpId(),x.getEmpName().toUpperCase(),x.getSalary()))
                .collect(Collectors.toList()).forEach((x)-> System.out.println(x));
        System.out.println();

        System.out.println("===================SORT============================");

        li1.stream().sorted(new ComparatorBySalary()).collect(Collectors.toList()).forEach((x)-> System.out.println("sorted by salary "+x));

        //==========================================output   =================================
//        Stream<Integer> nums=Stream.of(1,2,3,4,5);
//        nums.filter(x->x%2==1);
//        nums.forEach((p-> System.out.println(p)));

    }
}
