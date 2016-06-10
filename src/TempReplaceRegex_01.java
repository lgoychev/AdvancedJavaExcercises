import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lgoychev on 6/3/16.
 */

// Show how to replace some symbols in text with another symbol using regex and and Matcher
public class TempReplaceRegex_01 {
    public static void main(String[] args) {

        String text = "Pesho, Stefan, Toshko, Gosho";
        String regex = ",";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String newText = matcher.replaceAll(";");

        System.out.println(newText);

        }
    }
