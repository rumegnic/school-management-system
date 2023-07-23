package school.management.system;

/*
 * This class is responsible for keeping
 * track of students fees, name, grade & fees paid.
*/

public class Student {

   private int id;
   private String name;
   private int grade;
   private int feesPaid;
   private int feesTotal;


   public Student(int id, String name, int grade){
       feesPaid = 0;
       feesTotal = 30000;
       this.id = id;
       this.name = name;
       this.grade = grade;
   }

   public void setGrade(int grade){
       this.grade = grade;
   }



    public void payFees (int fees){
      feesPaid += fees;
      School.updateTotalMoneyEarned(feesPaid);

   }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
       return feesTotal-feesPaid;
    }


    @Override
    public String toString() {
        return "Student's name: " + name + ". Total fees paid so far:$" + feesPaid;
    }

}
