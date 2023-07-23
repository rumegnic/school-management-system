package school.management.system;

public class Teacher {

    private int id;
    private String name;
    private double salary;

    private int salaryEarned;

    public Teacher(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        salaryEarned = 0;
     }

     public String getName(){
        return name;
     }

     public int getId(){
        return id;
     }

     public double getSalary(){
        return salary;
     }

     public void setSalary(int salary){
        this.salary = salary;
     }

    /**
     * Adds to salaryEarned.
     * Removes from the total money earned by the school.
     * @param salary
     */
     public void receiveSalary(double salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
     }

     public String toString(){
         return "Teacher's name: " + name + ". Monthly salary:$" + salary;
     }
}
