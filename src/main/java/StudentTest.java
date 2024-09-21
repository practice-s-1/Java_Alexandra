package main.java;

public class StudentTest {
    public static void main(String[] args) {

       Student student1 = new Student("Maria", "AB123");

        System.out.println("The details related to student1 are: " + student1);

        student1.setName("Nicoleta");

        System.out.println("The new details are: " + student1.getName());

    }
}
