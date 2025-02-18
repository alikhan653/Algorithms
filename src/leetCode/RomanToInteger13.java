package leetCode;

public class RomanToInteger13 {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
        s = "LVIII";
        System.out.println(romanToInt(s));
        s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int res = 0;
        char[] symbols = s.toCharArray();
        for(int i = 0; i < symbols.length; i++){
            if(i==0) {
                res += resultOfSymbol(symbols[i]);
            } else {
                res += resultOfSymbol(symbols[i], symbols[i-1]);
            }
        }
        return res;
    }
    public static int resultOfSymbol(char s1) {
        if(s1 == 'I')
            return 1;
        else if(s1 == 'V')
            return 5;
        else if(s1 == 'X')
            return 10;
        else if(s1 == 'L')
            return 50;
        else if(s1 == 'C')
            return 100;
        else if(s1 == 'D')
            return 500;
        else if(s1 == 'M')
            return 1000;
        return 0;
    }
    public static int resultOfSymbol(char s1, char s2) {
        if(s1 == 'I')
            return 1;
        else if(s1 == 'V') {
            if(s2 == 'I')
                return 3;
            return 5;
        }
        else if(s1 == 'X') {
            if(s2 == 'I')
                return 8;
            return 10;
        }
        else if(s1 == 'L') {
            if(s2 == 'X')
                return 30;
            return 50;
        }
        else if(s1 == 'C'){
            if(s2 == 'X')
                return 80;
            return 100;
        }
        else if(s1 == 'D'){
            if(s2 == 'C')
                return 300;
            return 500;
        }
        else if(s1 == 'M'){
            if(s2 == 'C')
                return 800;
            return 1000;
        }
        return 0;
    }
}