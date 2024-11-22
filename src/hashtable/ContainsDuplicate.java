package hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    // LC217 easy
    static boolean duplicate(Integer nums[]){
        HashSet set = new HashSet();

       /* List<Integer> list = Arrays.asList(nums);

        List<Integer> duplicates = list.stream()
                .filter(i -> list.indexOf(i) != list.lastIndexOf(i))
                .distinct()
                .collect(Collectors.toList()); */

        for(int n : nums){
            if(set.contains(n))
                return true;
            set.add(n);
        }
        return false;
    }

    public static void main(String args[]){
        Integer nums[] ={1,2,3,1};
        System.out.println(duplicate(nums));
    }
}
