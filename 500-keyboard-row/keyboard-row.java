import java.util.*;
class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";

        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String[] a = words[i].toLowerCase().split("");
            boolean flag = true;
            String temp = "";

            if (first.contains(a[0])) {
                temp = first;
            }
            else if (second.contains(a[0])) {
                temp = second;
            }
            else {
                temp = third;
            }

            for (int j = 1; j < a.length; j++)
                if (!temp.contains(a[j])) {
                    flag = false;
                    break;
                }
            if (flag)
                list.add(words[i]);
        }
        return list.toArray(new String[list.size()]);
    }
}