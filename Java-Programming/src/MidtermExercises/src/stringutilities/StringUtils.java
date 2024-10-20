package stringutilities;
import java.lang.StringBuilder;

public class StringUtils
{

    public static void isPalindrome(String s)
    {
        StringBuilder builder = new StringBuilder(s);
        String reversered = builder.reverse().toString();
        if (s.equals(reversered))
        {
            System.out.println("String is a palindrome");
        }
    }

    public static void Reverse(String s)
    {
        StringBuilder builder = new StringBuilder(s);
        System.out.println(builder.reverse().toString());

    }
}
