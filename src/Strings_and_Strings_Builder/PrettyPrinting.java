package Strings_and_Strings_Builder;
import java.util.ArrayList;
public class PrettyPrinting{
  public static void main(String[] args){
    float a = 453.1634f;
    System.out.printf("Formatted number is %.2f%n", a);
    System.out.printf("Pie: %.3f%n", Math.PI); // print 3.142
    System.out.printf("Hello my name is %s and I am %s%n","Dev", "a student");
    System.out.println('c' + 'b');
    // 'c' = character c (dec ascii value of c = 99
    // 'd' = dec ascii value is 98
    System.out.println("a" + "b"); // "a" = String a (double quotes)
    System.out.println('a' + 3); // dec ascii value of character a = 97
    System.out.println((char)('a' + 3)); // (char) converts ascii to character
    System.out.println("a" + 1);
    // when an integer is concatenated to a string,
    // then it's converted to its wrapper class integer
    // i.e. integer will be converted to Integer that will call toString()
    // i.e. after a few steps it becomes "a" + "1"
    System.out.println("Shubham" + new ArrayList<>());
    System.out.println("Kunal" + new Integer (56));
    // toString() method is called from println class and the Object ArrayList is converted String
    String ans = new Integer(56) +""+ new ArrayList<>();
    // String ans = new Integer(56) + new ArrayList<>(); is wrong

    System.out.println(ans);

  }
}