package br.com.Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the file path !");
        String path =sc.next();
        System.out.println("Enter the salary filter");
        Double salFilter = sc.nextDouble();
        List<Personas> people = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while (line != null){
                String[] dataPeople = line.split(",");
                people.add(new Personas(dataPeople[1],dataPeople[0],Double.valueOf(dataPeople[2])));
                line = br.readLine();
            }
        List<String> upperSalaryname = people.stream().filter(p -> p.getSalary()>salFilter).map(p -> p.getEmail()).toList();
        double totalSalaryChar = people.stream().filter(p -> p.getEmail().charAt(0) == 'm').map(p -> p.getSalary()).reduce(0.0,(x,y) -> x+y);
           upperSalaryname.forEach(System.out::println);
            System.out.println(totalSalaryChar);

        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    sc.close();
    }
}
