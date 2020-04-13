package Q4;

public class StringReverse {
    public String reverseString(String str) {
        if (str.isEmpty()) {
            return "";
        } else {
            StringBuilder reverseCall = new StringBuilder();
            reverseCall.append(str);
            reverseCall = reverseCall.reverse();
            String reverse = reverseCall.toString();
            return reverse;
        }
    }
}