package Reccursion.Easy;

public class atoi {
    public int convert_int(String s) {
        long oldNo = 0;
        int i = 0;
        boolean pos = false;
        boolean neg = false;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i < s.length() && s.charAt(i) == '+') {
            pos = true;
            i++;
        } else if (i < s.length() && s.charAt(i) == '-') {
            neg = true;
            i++;
        }
        for (int j = i; j < s.length(); j++) {
            if (!Character.isDigit(s.charAt(j)))
                break;
            int current = s.charAt(j) - '0';
            oldNo = oldNo * 10 + current;
            if (!neg && oldNo > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (neg && oldNo > (long) Integer.MAX_VALUE + 1) {
                return Integer.MIN_VALUE;
            }
        }

        if (pos || (pos == false && neg == false)) {
            oldNo = oldNo * 1;
        } else if (neg) {
            oldNo = oldNo * -1;
        }

        return (int) oldNo;
    }

    public static void main(String[] args) {
        
    }
}
