import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lgoychev on 6/3/16.
 */

// How to replace numbers with * using regex and Matcher

public class TempReplaceNumberWithAsterix {
    public static void main(String[] args) {
        String text = "Pesho - 2434563 Stefan - 234234 Toshko - 345345 345 Gosho";
        String regex = "\\d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        StringBuffer buffer = new StringBuffer();

        String match = "";
        while   (matcher.find()){
            match = matcher.group(0);
            String replacementString = makeReplacementString(match);
            //System.out.println(match);
            matcher.appendReplacement(buffer,replacementString);
        }

        matcher.appendTail(buffer);
        System.out.println(buffer);




    }

    private static String makeReplacementString(String match) {
        String result = "";
        for (int i = 0; i < match.length(); i++) {
             result = result + "*";
            
        }
        return result;
    }
}

