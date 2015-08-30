package de.timmch.zanata;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        boolean lang_de = true;
        Locale locale;
        if ( lang_de ) {
            locale = new Locale("de", "DE");
        } else {
            locale = new Locale("en", "US");
        }
        ResourceBundle labels = ResourceBundle.getBundle("messages", locale);

        System.out.println(labels.getString("hello.world"));
        System.out.println(labels.getString("good.bye.world"));
    }
}
