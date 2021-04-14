/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removelastcharacterusingstring.substring;

/**
 *
 * @author KELVO FRAYAY
 */
public class RemoveLastCharacterUsingStringSubString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String string= "Welcome to Java";
        
        //printd the string
        System.out.println(removeLastchar(string));
    }
    //method to remove last character
    private static String removeLastchar(String s){
        return s.substring(0, s.length()-1)+ s.substring(s.length());
    }
}
