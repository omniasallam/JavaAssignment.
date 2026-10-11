package day8;

import java.util.HashMap;
import java.util.Map;

public class TestResult {
   public static Map getOriginalGrades(){
       Map grades= new HashMap();
       grades.put("islam", 90);
       grades.put("Omnia", 90);
       grades.put("Ahmed",80);
       grades.put("Mohamed",60);
       return grades;
   }
   public static Map getMakupGrades(){
       Map grades= new HashMap();
       grades.put("islam", 90);
       grades.put("Omnia", 95);
       grades.put("Ahmed",80);
       grades.put("Mohamed",50);
       return grades;
   }
}
