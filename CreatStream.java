package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatStream 
{
    public static void main(String[] args) 
    {
       Stream<Integer> str= Stream.of(1,2,3,4,5);
        Stream<String> str1= Stream.of("app","mango","grapes","lemon");
        
        List<Integer> list1=new ArrayList<>();
        list1.add(15);
        list1.add(50);
        list1.add(10);
        list1.add(40);
        list1.add(20);
        list1.add(15);

        
        Stream<Integer> stream1=list1.stream();
        
        
        
        
        //1.intermediate methods-==filter(),map(),sorted()
        
        //2.terminal methods=collect(),forEach(),reduce()
        
        //-----filter()------takes predicate==========-
        //predicate a functional interface takes a object as parameter nd return boolean

//        Predicate<Integer>pre=(x)->
//        {
//            if(x%2==0)
//                return true;
//            else return false;
//           // return ((x >30) )? true : false;
//
//        };

//       Stream<Integer>filterData= stream1.filter(pre);
//      List<Integer> newlist= filterData.collect(Collectors.toList());
//        System.out.println("even filtered list"+newlist);


//     List<Integer> data = list1.stream().filter((x)->
//     {
////         if(x%2==0)
////             return true;
////         else return false;
//          return ((x >30) )? true : false;
//
//     }).collect(Collectors.toList());
//        System.out.println(data);



        List<Integer> data = list1.stream().filter((x)->(x >30)
        ).collect(Collectors.toList());
        System.out.println(data);

        // ----------when u want to apply rule or logic apply map========map  function a interfacw  has apply method takes object and return object

        Function<Integer,Integer> function=(y)->y*y;
        List<Integer> mapata = list1.stream().filter((x)->x >30
        ).map(function).collect(Collectors.toList());
        System.out.println(mapata);


        List<Integer> mapata1 = list1.stream().filter((x)->x <30
        ).map((y)->y*y*y).collect(Collectors.toList());
        System.out.println("cube "+mapata1);

        //==============      sort  ======================

List<Integer> li1=list1.stream().sorted().collect(Collectors.toList());

        System.out.println(li1);




        //=================forEach  tales consumer functional interface==takes parameter doesnt return======================

        Consumer<Integer> cons=(x)-> System.out.println(x);
        list1.stream().sorted().forEach(cons);

      //  Consumer<Integer> cons=(x)-> System.out.println(x);
        list1.stream().sorted().forEach((x)-> System.out.println(" for each "+x));

        //------------------reduce-----------reduce variable to single unit --------------

       Integer res=  list1.stream().filter((x)->(x >30)
        ).sorted().reduce(0,(n1,n2)->n1+n2);
        System.out.println(res);



    }





}
