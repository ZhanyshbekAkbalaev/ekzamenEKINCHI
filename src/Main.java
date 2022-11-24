import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] student = {
                new Student("Akbalaev Zhanyshbek",18,"janysh@gamil.com",Gender.MALE),
                new Student("Kelsinbekov Kuban",20,"kuban@gmail.com",Gender.MALE),
                new Student("Nabitova Nazira",16,"nazira@gmail.com",Gender.FAMELI),
                new Student("Kurbanova Aiperi",21,"aiperi@gmail.com",Gender.FAMELI),
        };
        for (Student student1 : student) {
            student1.studentS(student);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            student1.studentMale(student);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            student1.studentFameli(student);

            break;
        }
        Scanner scanner = new Scanner(System.in);
        for (Student student1 : student) {
            student1.studentNames(scanner.nextLine(), student);
            break;

        }
        for (Student student1 : student) {
            student1.studentAge();
            break;
        }

        for (Student student1 : student) {
            student1.studentSurName(scanner.nextLine(),student);
            break;
        }
    }
}