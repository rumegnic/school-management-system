package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 650);
        Teacher alex = new Teacher(2, "Alex", 500);
        Teacher bianca = new Teacher(3, "Bianca", 550);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(lizzy);
        teachers.add(alex);
        teachers.add(bianca);

        Student patrick = new Student(1, "Patrick", 4);
        Student lisbon = new Student(2, "Lisbon", 10);
        Student alexandra = new Student(3, "Alexandra", 7);

        List<Student> students = new ArrayList<>();
        students.add(patrick);
        students.add(lisbon);
        students.add(alexandra);

        School ravenwoodHigh = new School(teachers, students);

        patrick.payFees(1000);
        lisbon.payFees(6000);
        System.out.println("Ravenwood High has earned:$" + ravenwoodHigh.getTotalMoneyEarned());

        System.out.println("-----MAKING SCHOOL PAY THE SALARY-----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("RWH has payed " +lizzy.getName() + "'s salary" + " and now has:$" + ravenwoodHigh.getTotalMoneyEarned());

        alex.receiveSalary(alex.getSalary());
        System.out.println("RWH has payed " +alex.getName() + "'s salary" + " and now has:$" + ravenwoodHigh.getTotalMoneyEarned());

        System.out.println(patrick);
        System.out.println(lizzy);
    }
}
