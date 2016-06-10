import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lgoychev on 6/3/16.
 */
public class RegularExpressions {
    public static void readData(String fileName) throws IOException {
        String regex = "([A-Z][a-zA-Z#+]*_[A-Z][a-z]{2}_\\d{4})\\s+([A-Z][a-z]{0,3}\\d{2}_\\d{2,4})\\s+(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        //String path = SessionData.currentPath + "\\" + fileName;

    }
}
