class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";

        List<String> list = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();
            String row;

            if (first.contains("" + lower.charAt(0))) {
                row = first;
            } else if (second.contains("" + lower.charAt(0))) {
                row = second;
            } else {
                row = third;
            }

            boolean valid = true;

            for (int j = 1; j < lower.length(); j++) {
                if (!row.contains("" + lower.charAt(j))) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
    }
}