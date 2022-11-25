package com.que;

public class LC1678 {
    public static void main(String[] args) {
        String command = "GG()";
        System.out.println(interpret(command));
    }

    static public String interpret(String command) {
        String ans = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                ans += 'G';
                continue;
            }
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    ans += 'o';
                    i+=1;
                    continue;
                }
                if (command.charAt(i + 1) == 'a') {
                    ans += "al";
                    i+=3;
                }

            }
        }
        return ans;
    }
}
