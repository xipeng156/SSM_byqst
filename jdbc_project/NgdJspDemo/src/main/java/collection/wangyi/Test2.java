package collection.wangyi;

import org.junit.Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(count(s)-s.length());
    }
    public static int count(String s){
        int num=0;
        for (int i=0;i<s.length();i++){
            num+=number(s,i,i);
            num+=number(s,i,i+1);
        }
        return num;
    }

    private static int number(String s, int i, int i1) {
        int count = 0;
        while (i>=0&&i1<s.length()&&s.charAt(i)==s.charAt(i1)){
        i--;
        i1++;
        count++;

        }
        return count;
    }

}