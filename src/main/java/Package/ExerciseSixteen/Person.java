package Package.ExerciseSixteen;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Person {

    private String name;
    private Integer age;
    private Character sex;
    private Double height;
    private Double weight;
    private Integer DNI;

    public Person() {
    }

    public Person(String name, Integer age, Character sex) {
        this.name = Objects.requireNonNull(name);
        this.age = Objects.requireNonNull(age);
        this.sex = Objects.requireNonNull(sex);
        this.height = height;
        this.weight = weight;
        this.DNI = DNI;
    }

    public Person(
            String name,
            Integer age,
            Character sex,
            Double height,
            Double weight,
            Integer DNI)
    {
        this.name = Objects.requireNonNull(name);
        this.age = Objects.requireNonNull(age);
        this.sex = Objects.requireNonNull(sex);
        this.height = Objects.requireNonNull(height);
        this.weight = Objects.requireNonNull(weight);
        this.DNI = generateDNI();
    }

    public Integer calculateIMC(Double weight, Double height) {
        Double idealWeight = Math.pow(height, 2);
        try {
            if (idealWeight > 20) {
                return -1;
            }if (idealWeight >= 20 && idealWeight <= 25) {
                return 0;
            }
        }catch (Exception e){
            System.out.println("¡ERROR!");
        }
        return 1;
    }

    public Boolean isLegalAge() {
        if(age <= 18){
            return true;
        }
        return false;
    }

    public void checkSex(Character sex) {
        if (sex != 'H') {
            sex = 'H';
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", height=" + height +
                ", weight=" + weight +
                ", DNI=" + DNI +
                '}';
    }

    public Integer generateDNI() {

        Random random = new Random();

        Integer numberDNI = random.nextInt(100000000, 999999999);
        System.out.println(numberDNI);

        return numberDNI;
    }

    public void requestData() {

        try {
            Scanner read = new Scanner(System.in);

            System.out.println("Ingrese su nombre: ");
            String name = read.nextLine();
            setName(name);

            System.out.println("Ingrese su edad: ");
            Integer age = read.nextInt();
            setAge(age);

            System.out.println("Ingrese su genero: masculino 'H' femenino 'F' ");
            Character sex = read.nextLine().charAt(0);
            sex = sex.toUpperCase(sex);
            setSex(sex);

            System.out.println("Ingrese su peso: ");
            Double weight = read.nextDouble();
            setWeight(weight);

            System.out.println("Ingrese su altura: ");
            Double height = read.nextDouble();
            setHeight(height);

        }catch (Exception e) {
            System.out.println("¡ERROR!");
        }

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
