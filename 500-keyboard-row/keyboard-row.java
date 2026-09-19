import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for (String word : words) {
            String w = word.toLowerCase();

            String row;

            if (row1.indexOf(w.charAt(0)) != -1)
                row = row1;
            else if (row2.indexOf(w.charAt(0)) != -1)
                row = row2;
            else
                row = row3;

            boolean valid = true;

            for (char c : w.toCharArray()) {
                if (row.indexOf(c) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid)
                list.add(word);
        }

        return list.toArray(new String[0]);
    }
}