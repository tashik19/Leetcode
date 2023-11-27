public class Leetcode13 {
    public int romanToInt(String s) {
        int number = 0;
        boolean flag = true;
        for(int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == 'I' && s.charAt(i+1) == 'V') {
                number = number + 4;
                i = i + 1;
                if(i == s.length() -1) flag = false;
                continue;
            }
            if(s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
                number = number + 9;
                i = i + 1;
                if(i == s.length() -1) flag = false;
                continue;
            }
            if(s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
                number = number + 40;
                i = i + 1;
                if(i == s.length() -1) flag = false;
                continue;
            }
            if(s.charAt(i) == 'X' && s.charAt(i+1) == 'C'){
                number = number + 90;
                i = i + 1;
                if(i == s.length() -1) flag = false;
                continue;
            }
            if(s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
                number = number + 400;
                i = i + 1;
                if(i == s.length() -1) flag = false;
                continue;
            }
            if(s.charAt(i) == 'C' && s.charAt(i+1) == 'M'){
                number = number + 900;
                i = i + 1;
                if(i == s.length() -1) flag = false;
                continue;
            }
            if(s.charAt(i) == 'I') number = number + 1;
            if(s.charAt(i) == 'V') number = number + 5;
            if(s.charAt(i) == 'X') number = number + 10;
            if(s.charAt(i) == 'L') number = number + 50;
            if(s.charAt(i) == 'C') number = number + 100;
            if(s.charAt(i) == 'D') number = number + 500;
            if(s.charAt(i) == 'M') number = number + 1000;
        }
        if(flag) {
            if(s.charAt(s.length()-1) == 'I') number = number + 1;
            if(s.charAt(s.length()-1) == 'V') number = number + 5;
            if(s.charAt(s.length()-1) == 'X') number = number + 10;
            if(s.charAt(s.length()-1) == 'L') number = number + 50;
            if(s.charAt(s.length()-1) == 'C') number = number + 100;
            if(s.charAt(s.length()-1) == 'D') number = number + 500;
            if(s.charAt(s.length()-1) == 'M') number = number + 1000;
        }
        return number;
    }
}
