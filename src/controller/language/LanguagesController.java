/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.language;

//import java.util.HashMap;
import java.util.Locale;
//import java.util.Map;
import java.util.ResourceBundle;
/**
 *
 * @author Chee Keat
 */
public class LanguagesController {
    
//    private Map supportedLanguages;
    private ResourceBundle translation;

    public LanguagesController(String language){
        Locale Malay = new Locale("ms" , "MY");
//        supportedLanguages = new HashMap();
//        supportedLanguages.put("Chinese",Locale.CHINESE);
//        supportedLanguages.put("Dutch", Malay);
//        supportedLanguages.put("English",Locale.ENGLISH); 
        
        if ("Chinese".equals(language)){
            translation = ResourceBundle.getBundle("languages",Locale.CHINESE );
        }
        else if ("Malay".equals(language)){
            translation = ResourceBundle.getBundle("languages", Malay );
        }
        else{
            translation = ResourceBundle.getBundle("languages", Locale.ENGLISH);
        }
    }

    public String getWord(String keyword)
    {
        return translation.getString(keyword);
    }
}
