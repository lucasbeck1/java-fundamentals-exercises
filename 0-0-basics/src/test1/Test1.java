/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lbeck
 */
public class Test1 {

    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeClassTest();
    }

    /**
     * @param args the command line arguments
     */
    public static void byteExperiment() {
        byte x = 127;
        x++;
        x++;
        x++;
        x++;
        System.out.print(x);
    }

    public static void switchTest() {
        char vocal = 'U';
        String nombre_mes = "";
        int mes = 1;

        switch (vocal) {
            case 'A':
                mes = 2;
                System.out.println("vocal A");
                break;
            case 'U':
                mes = 3;
                System.out.println("vocal U");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        switch (mes) {
            case 1 -> nombre_mes = "Enero";
            case 2 -> nombre_mes = "Febrero";
            default -> {
                nombre_mes = "k";

                System.out.println("Not found");
            }
        }
        System.out.println(nombre_mes);
    }

    public static void forTest() {
        int i = 0;

        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int e = 0; e < 10; e++) {
            System.out.println(e);
        }
    }

    public static void doWhileTest() {
        int x1 = 0;
        int x2 = 2;

        do {
            System.out.println("El numero es " + x1);
            x1++;
        } while (x1 <= x2);
    }

    public static void arrayTest() {
        int[] notas = { 1, 2, 3, 4, 5 };
        int notas2[] = { 1, 2, 3, 4, 5 };

        int[][] matriz = { { 1, 2 }, { 3, 4, 5 }, { 6, 7 }, { 8, 9, 10, 11 } };
        int[][] numeros = new int[4][4];
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[1][0] = 3;
        numeros[1][1] = 4;

        // 1) Traditional for loop
        for (int rw = 0; rw < numeros.length; rw++) {
            System.out.println();
            for (int cl = 0; cl < numeros[rw].length; cl++) {
                System.out.print(numeros[rw][cl]);
            }
        }

        // 2) Enhanced for loop
        for (int[] numero : numeros) {
            System.out.println();
            for (int cl = 0; cl < numero.length; cl++) {
                System.out.print(numero[cl]);
            }
        }
        // 1) & 2) produce the same results
    }

    public static void listTest() {
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        animals.add(2, "Elephant");
        animals.add("Doguis");
        animals.remove(5);
        System.out.println(animals);
    }

    public static void personClassTest() {
        Person person1 = new Person(10, 30, "Done");
        Person person2 = new Person(20, 40, "Jony");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }

    public static void dogClassTest() {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.setName("Jeff");
        dog1.setAge(22);
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
    }

    public static void exceptionTest() {
        try {
            int n = Integer.parseInt("u");
        } catch (Exception e) {
            System.out.println("Error on execution: " + e);
        } finally {
            System.out.println("Finally: This code is always executed");
        }
    }

    public static void EmployeeClassTest() {
        Employee employee = new Employee();

        employee.setName("Bob");
        employee.setAge(22);
        employee.setSex('M');
        employee.setEmployee_id(1);
        employee.setDepartment("Code");

        String name = employee.getName();
        int age = employee.getAge();
        char sex = employee.getSex();

        System.out.println("Name: " + name + " Age: " + age + " Sex: " + sex);
        System.out.println(employee.toString());
        employee.printMessage();

    }

}
