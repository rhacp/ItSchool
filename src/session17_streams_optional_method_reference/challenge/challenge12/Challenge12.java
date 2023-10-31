package session17_streams_optional_method_reference.challenge.challenge12;

import session17_streams_optional_method_reference.challenge.challenge12.models.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Challenge12 {

    public static void main(String[] args) {
        List<Employee> inputList = Arrays.asList(new Employee("Andrei", "IT", 2000),new Employee("Octavian", "Marketing", 1000),new Employee("Costin", "Sales", 1300),new Employee("Mihai", "IT", 2500));
        printHighestSalaryDepartment(inputList);
    }

    public static void printHighestSalaryDepartment(List<Employee> inputList) {
        Optional<Map.Entry<String, Integer>> result = inputList.stream()
                .collect(Collectors.toMap(
                        element -> element.getDepartment(),
                        element -> (int)element.getSalary(),
                        (r1, r2) -> r1 + r2
                ))
                        .entrySet().stream()
                        .max(Comparator.comparing(Map.Entry::getValue));

        System.out.println(result.get());
    }
}
