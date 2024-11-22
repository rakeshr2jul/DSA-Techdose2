package dsa.strings;

import java.util.HashMap;
import java.util.Map;

public class ShortestUniqueSubstring {

    public static Map<String, String> shortestUniqueSubstr(String[] strArr) {
        Map<String, String> result = new HashMap<>();
        for(String str : strArr) {
            result.put(str, str);
            for(int i = 0; i < str.length(); i++) {
                for(int j = i + 1; j <= str.length(); j++) {
                    String subStr = str.substring(i, j);
                    boolean addSub = true;
                    for(String str2 : strArr) {
                        if(str2.equals(str)) continue;
                        if(str2.contains(subStr)) {
                            addSub = false;
                            break;
                        }
                    }
                    if(addSub && subStr.length() < result.get(str).length()) {
                        result.put(str, subStr);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String args[]){

        String[] str = {"cheapair", "cheapoair", "peloton", "pelican"};
        Map<String,String> hm = shortestUniqueSubstr(str);

       for(Map.Entry<String, String > entry : hm.entrySet()){
            System.out.println(entry.getKey() +" "+entry.getValue());
        }

    }
}
