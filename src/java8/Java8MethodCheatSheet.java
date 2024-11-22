package java8;

import java.util.*;
import java.util.stream.Collectors;

public class Java8MethodCheatSheet {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeDataBase.getAllEmployees();

        List<Employee> ascSortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());

//        ascSortedEmployees.get(0);

        ascSortedEmployees.forEach(System.out::println);

        System.out.println("===========================================================");

        //desc
        List<Employee> descSortedEmployees = employees.stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)))
                .collect(Collectors.toList());

        descSortedEmployees.forEach(System.out::println);

        System.out.println("===========================================================");

        Optional<Employee> highestPaidEmployees = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

         System.out.println("Highest paid employee : "+highestPaidEmployees);

        System.out.println("===========================================================");

        Optional<Employee> lowestPaidEmployees = employees.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));

        System.out.println("Lowest paid employee : "+lowestPaidEmployees);

        System.out.println("===========================================================");
        //groupingBy
        Map<String, List<Employee>> employeeGroup = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender));

        System.out.println(employeeGroup);
        System.out.println("===========================================================");
        Map<String, Long> employeeGroupCountMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(employeeGroupCountMap);
        System.out.println("===========================================================");
        //findFirst

        Employee findFirstElement = employees.stream()
                .filter(e -> e.getDept().equals("Development"))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("Employee not found "));

        System.out.println(findFirstElement);//NPE
        System.out.println("===========================================================");
        boolean developmentEmpAnyMatch = employees.stream()
                .anyMatch(e -> e.getDept().equals("Development"));
        System.out.println("is there any employee match from development dept "+developmentEmpAnyMatch);
        System.out.println("===========================================================");
        boolean developmentEmpAllMatch = employees.stream()
                .allMatch(e -> e.getSalary()>50000);//55000
        System.out.println(developmentEmpAllMatch); //false

        System.out.println("===========================================================");

        boolean isNoneMatch = employees.stream()
                .noneMatch(e -> e.getDept().equals("abc"));
        System.out.println(isNoneMatch);
        System.out.println("===========================================================");

    }
}
