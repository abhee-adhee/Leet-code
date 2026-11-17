class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length() <8) return false;
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;
        String symbol = "!@#$%^&*()-+";
        for(int i=0 ; i<password.length() ; i++){
            char c = password.charAt(i);
            if(Character.isLowerCase(c)) lower = true;
            if(Character.isUpperCase(c)) upper = true;
            if(Character.isDigit(c)) digit = true;
            if(symbol.indexOf(c)!=-1) special = true;
            if(i>0 && password.charAt(i) == password.charAt(i-1)) return false;

        }
        return lower && upper && digit && special;

    }
}