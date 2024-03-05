import java.util.*;

public class Maps {
    public static void main(String[] args){
        HashMap  <String, Integer> empId = new HashMap<>();

        empId.put("John",12345);
        empId.put("Jerry",551);
        empId.put("Carl",288);

        System.out.println(empId);
        System.out.println(empId.get("Carl"));


    }

    private static Map<String,Integer> sortByValue(Map<String,Integer> empId){
        Map<String,Integer> sorted = new LinkedHashMap<>();

        return sorted;
    }

}
