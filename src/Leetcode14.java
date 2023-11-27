class Leetcode14 {
    public String longestCommonPrefix(String[] strs) {
        String input = strs[0];
        String output = "";
        for(int i = 1; i < strs.length; i++) {
            int length = 0;
            if(input.length() < strs[i].length()) {
                length = input.length();
            }
            else {
                length = strs[i].length();
            }
            for(int j = 0; j < length; j++) {
                if(input.charAt(j) == strs[i].charAt(j)) {
                    output = output + input.charAt(j);
                }
                else
                    break;
            }
            input = output;
            output = "";
        }
        return input;
    }
}