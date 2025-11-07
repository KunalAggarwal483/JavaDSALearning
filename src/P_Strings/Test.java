package P_Strings;

import readwrite.FastReader;

public class Test {

    public static void main(String[] args) {

        FastReader fr = new FastReader();
        //1
        String s1 = "java";
        String s2 = "java";
        System.out.println(s1 == s2); // true
        //2
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s3 == s4); // false
        //3
        String s5 = "java";
        String s6 = "ja" + "va";
        System.out.println(s5 == s6); // true
        //4
        String s7 = "Ja";
        String s8 = s7 + "va";
        System.out.println("Java" == s8); // false
        //5
        String s9 = "abc";
        s9.concat("xyz");
        System.out.println(s9); // abc
        //6
        String s10 = "abc";
        s10 = s10.concat("xyz");
        System.out.println(s10); // abcxyz
        //7
        String s11 = "HELLO";
        String s12 = s11.toLowerCase();
        System.out.println(s11 == s12); // false
        //8
        String s13 = new String ("Java");
        String s14 = s13.intern();
        System.out.println(s13 == s14); // false
    }
    
}
