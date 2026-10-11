package day8;

import java.util.Map;
public class FinalResult {
    public static void main(String[] args) {
       Map <String, Integer> originalGrades= TestResult.getOriginalGrades();
       Map <String, Integer> makeupGrades= TestResult.getMakupGrades();
       for (var student:makeupGrades.entrySet()){
         //  System.out.println(student + " key + value in method upgrades");
           Integer firstGrades= originalGrades.get(student.getKey());
           // getOriginalGrades() عاوزين نشوف درجات الطلاب اللي في ميثود
           Integer secondGrades=makeupGrades.get(student.getKey());
         //  System.out.println(firstGrades + " originalgrades");
         //  System.out.println(secondGrades);
           if (secondGrades> firstGrades){
               originalGrades.put(student.getKey(), secondGrades);
           }
           System.out.println("Student " + student.getKey() + " has new grades "
           + originalGrades.get(student.getKey()));
       }



    }
}
