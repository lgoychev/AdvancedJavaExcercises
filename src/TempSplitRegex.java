/**
 * Created by lgoychev on 6/3/16.
 */

//Show how to split some names delete  selected symbols as ("," "." "tab" or "spaces")

public class TempSplitRegex {
    public static void main(String[] args) {

        String text = "Pesho,Stefan |   Toshko    .      Gosho";
        String regex = "[, \\|\\.]+";

        String[] names = text.split(regex);

        for (String name : names){
            System.out.println(name);
        }
    }
}
