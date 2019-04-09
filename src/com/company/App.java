package com.company;

public class Task {
    void main() {
        System.out.println(numberFounder("авыпавыпавыпавыпавыпвыпвыпвпавпва123"));
    }

    String numberFounder(String s) {
        int pos = 0;
        while (s.charAt(pos) < 48 || s.charAt(pos) > 57) {
            pos++;
        }
        int posOne = pos;
        int b = 0;
        while (pos < s.length() && s.charAt(pos) >= 48 && s.charAt(pos) <= 57) {
            b = b * 10 + (s.charAt(pos) - 48);
            pos++;
        }
        return s.substring(0,posOne) + (b + 1) + s.substring(pos);
    }
}

//  for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
//                System.out.print(s.charAt(i));
//            }
//        }