import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lgoychev on 6/3/16.
 */
public class Excercise03062016 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder text = new StringBuilder();
        while (true){
            String line = reader.readLine();
            if (line.equals("END")) {
                break;
            }
        text.append(line);
        }

        List<String> aTags = new ArrayList<>();
        while (true) {
            int openingTag = text.indexOf("<a");
            int closingTag = text.indexOf(">", openingTag);
            if (openingTag == -1){
                break;
            }

            String tag = text.substring(openingTag, closingTag);
            text = new StringBuilder(text.substring(closingTag));

        }
            for (String aTag : aTags) {
                System.out.println(aTag);
            }
    }
}
