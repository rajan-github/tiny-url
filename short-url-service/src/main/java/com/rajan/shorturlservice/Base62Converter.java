package com.rajan.shorturlservice;

public class Base62Converter {
    public static String convertToBase62(long number) {
        char[] base62Chars = new char[62];
        int index = 0;
        for (int i = 0; i < 10; i++)
            base62Chars[index++] = (""+i).charAt(0);
        for (int i = 'a'; i < 'a' + 26; i++)
            base62Chars[index++] = Character.toString('a' + i).charAt(0);
        for (int i = 'A'; i < 'A' + 26; i++)
            base62Chars[index++] = Character.toString('A' + i).charAt(0);

        StringBuilder base62 = new StringBuilder();
        index=61;
        while(number>=62){
            base62.append(base62Chars[(int)(number%62)]);
            number=number/62;
        }
        if(number>0)
            base62.append(base62Chars[(int)number]);
        return base62.reverse().toString();
    }
}

