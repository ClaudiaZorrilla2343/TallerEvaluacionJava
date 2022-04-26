package Package.ExerciseSixteen;

import java.util.Scanner;

import static java.lang.System.in;

public class Runner {
    final static Scanner read = new Scanner(in);

    public static void main(String[] args) {
        Person data = new Person();
        Person personOne = new Person();

        System.out.println("Ingrese nombre: ");
        String name = read.nextLine();
        data.setName(name);

        System.out.println("Ingrese edad: ");
        Integer age = read.nextInt();
        data.setAge(age);

        System.out.println("Ingrese sexo: ");
        Character sex = read.nextLine().charAt(0);
        data.setSex(sex);

        System.out.println("Ingrese peso: ");
        Double weight = read.nextDouble();
        data.setWeight(weight);

        System.out.println("Ingrese altura: ");
        Double height = read.nextDouble();
        data.setHeight(height);

        data.toString();
    }
}
