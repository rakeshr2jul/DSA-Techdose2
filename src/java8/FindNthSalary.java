package java8;

import java.util.*;
import java.util.stream.Collectors;

public class FindNthSalary {

 /*   public static void main(String[] args) {

        // Test Case 1 : Unique Employee List


        Map.Entry<Integer, List<String>> nthHighestSalary2 = getNthHighestSalary(empList, 3);
        System.out.println("Test Case 2: " + nthHighestSalary2);
        //System.out.println(getHighestSal(empList));
    }


    private static Map.Entry<Integer, List<String>> getNthHighestSalary(List<Employee> empList, int nth) {

        if (empList.isEmpty() || nth <= 0 || empList.size() < nth)
            throw new IllegalArgumentException("Please validate your inputs.");

        //empList.stream().collect(Collectors.groupingBy(Employee::getDept , Collectors.mapping(Employee)))
        return empList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())
                ))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(nth );
    }

   /* private static Employee getHighestSal(List<Employee> empList){

        return empList.stream().sorted().skip(1)
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
    }*/
}
