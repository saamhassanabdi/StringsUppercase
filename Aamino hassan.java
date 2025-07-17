import java.util.Scanner;

public class assemt2{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Enter 5 strings");
String[] strings = new String[5];
for (int i = 0; i < strings.length; i++) {
strings[i] = input.nextLine();
}
System.out.println("Strings  uppercase");
for (String  string: strings) {
System.out.println(string.toUpperCase());
}

}  
} codka inaa dhigo aan rabo waa kan

