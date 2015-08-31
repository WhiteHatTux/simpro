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
        String[] languages = new String[3];// = ;//, "de_DE", "en_US"];
        languages[0] = "en_US";
        languages[1] = "de_DE";
        languages[2] = "es_ES";
        Locale locale;
        if ( lang_de ) {
            locale = new Locale("es", "ES");
        } else {
            locale = new Locale("en", "US");
        }
        for (int i = 0; i < languages.length; i++) {
            String shortLang = languages[i].split("_")[0];
            String shortCountry = languages[i].split("_")[1];
            locale = new Locale(shortLang, shortCountry);
            ResourceBundle labels = ResourceBundle.getBundle("messages", locale);

            System.out.println("This is the language with the abbreviation: " + shortLang);
            System.out.println(labels.getString("hello.world"));
            System.out.println(labels.getString("good.bye.world"));
        }

    }
}
