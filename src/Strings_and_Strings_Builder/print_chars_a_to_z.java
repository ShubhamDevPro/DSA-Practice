package Strings_and_Strings_Builder;
public class print_chars_a_to_z {
    public static void main(String[] args) {
        StringBuilder series = new StringBuilder();
        char ch;
        for (int i = 0; i < 26; i++) {
            ch = (char) ('a' + i);
            series.append(ch);
        }System.out.print(series);
        // This is not the optimal way to print alphabets
        //a,ab,abc,abcd,abcde,abcdef,abcdefg.........
        //New String Object is created in every iteration
        //Bcz Strings are immutable
        //This will waste a lot of memory.
/*
        String series = "";
        char ch;
        for (int i = 0; i < 26; i++) {
            ch = (char) ('a' + i);
            series = series +ch;
        }System.out.print(series);
        */

    }
}


