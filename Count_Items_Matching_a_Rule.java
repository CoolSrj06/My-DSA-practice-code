import java.util.ArrayList;
import java.util.List;

public class Count_Items_Matching_a_Rule {
    public static void main(String[] args) {
        List<List<String>> arr= new ArrayList<>();
        arr.add(List.of("phone","blue","pixel"));
        arr.add(List.of("computer","silver","lenovo"));
        arr.add(List.of("phone","gold","iphone"));
        System.out.println(countMatches(arr,"color","silver"));
//        System.out.println(arr.get(0).get(1));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        String[] type={"phone","color","name"};
        int index=0,count=0;
        for (int i = 0; i < type.length; i++) {
            if (type[i].equals(ruleKey))
                index=i;
        }
        for (int i=0;i<items.size();i++) {
            if (items.get(i).get(index).equals(ruleValue))
                count += 1;
        }
        return count;
    }
}
