package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Example {

    public static void main(String args[]){
        String input ="java";
      //  Given String Count the each character
      Map<String, Long> map= Arrays.stream(input.split(""))
              .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

      System.out.println(map);

      // java program to find all duplicate from a given String
      List<String> duplicateStr=      Arrays.stream(input.split(""))
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                    .entrySet().stream().filter(s-> s.getValue() >1)
                    .map(Map.Entry::getKey).collect(Collectors.toList());
      System.out.println(duplicateStr);
        int nums[] = {1,1,2,2,4,5,3,3};

        List<Integer> duplicateN=      Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(s->s.getValue()>1)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(duplicateN);

        // java program to find all unique from a given String
        List<String> unique = Arrays.stream(input.split("")).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(s->s.getValue()==1)
                .map(Map.Entry ::getKey).collect(Collectors.toList());

        System.out.println(unique);

        // Java Program to find first non repeating element
        String nonRepeating = Arrays.stream(input.split("")).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(s->s.getValue()==1)
                .findFirst().get().getKey();
        System.out.println(nonRepeating);

        // Find the longest string from a given array
        String str[] = {"java","web","springboot","microservices"};

       String longest= Arrays.stream(str)
               .reduce((word1,word2)-> word1.length() > word2.length() ? word1 :word2)
               .get();
        System.out.println(longest);

        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        int secondLargestNumber = Arrays
                .stream(numbers)
                .boxed()
                .sorted(  )
                .skip(1)
                .findFirst()
                .get();


        System.out.println(secondLargestNumber);


    }
}
