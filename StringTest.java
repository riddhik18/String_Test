package Java;
import java.util.Scanner;
public class StringTest {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a  String: ");
        String input = scanner.nextLine();
        String shiftedString = shiftCharacters(input);
        System.out.println("Shifted string: " + shiftedString);
    }

    public static String shiftCharacters(String input) {
        StringBuilder shiftedString = new StringBuilder();
        for (char c : input.toCharArray()) 
        {
            if (Character.isUpperCase(c)) 
            {
                char shiftedChar = (char) (((c - 'A' - 2)%26)+ 'A');
                shiftedString.append(shiftedChar);
            }
            else if (Character.isLowerCase(c)) 
            {
                char shiftedChar = (char) (((c - 'a' - 3)%26)+ 'a');
                shiftedString.append(shiftedChar);
            } 
            else 
            {
                shiftedString.append(c);
            }
        }
        return shiftedString.toString();
    }
}

