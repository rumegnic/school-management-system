package school.management.system;

import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teacher, List<Student> students) {
        this.teachers = teacher;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeacher() {
        return teachers;
    }

    /**
     * Adds a teacher to the school.
     * @param teacher the teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school.
     */

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent (Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param moneyEarned money that is supposed to be added.
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * udpating the money that is spent by the school which
     * is the salary given by the school to its teachers
     * @param moneySpent the money spent by the school.
     */
    public static void updateTotalMoneySpent(double moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
