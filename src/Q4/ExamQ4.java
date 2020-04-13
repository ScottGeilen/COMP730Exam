package Q4;
import java.util.*;

public class ExamQ4 {
    public static void main(String[] args) {
        StringReverse reversedObject = new StringReverse();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputObject = input.nextLine();
        System.out.println(reversedObject.reverseString(inputObject));
    }
}