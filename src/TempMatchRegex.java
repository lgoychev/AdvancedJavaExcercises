import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lgoychev on 6/3/16.
 */

// Show how to match something into text using regex expression

public class TempMatchRegex {
    public static void main(String[] args) {
        String text = "Today is 0982015-06-02";
        String regex = "\\d{4}-\\d{2}-\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean isMatch = matcher.find();

        System.out.println(isMatch);
    }
}
