/**
 * Created by lgoychev on 6/3/16.
 */

// Show how to replace some symbols in text with another symbol using regex
public class TempReplaceRegex_02 {
            public static void main(String[] args) {

            String text = "Pesho, Stefan, Toshko, Gosho";
            String regex = ",";

            String newText = text.replaceAll(regex, ";");

            System.out.println(newText);

        }
    }


