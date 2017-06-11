/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.language;

/**
 *
 * @author Chee Keat
 */
public class LanguagesStartup {
    public static void main(String args[]){
        LanguagesController langController_nl = new LanguagesController("Malay");
        System.out.println(langController_nl.getWord("Username"));
        LanguagesController langController_en = new LanguagesController("Chinese");
        System.out.println(langController_en.getWord("Username"));
    }
}
