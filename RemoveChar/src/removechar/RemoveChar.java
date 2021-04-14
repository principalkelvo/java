/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removechar;

/**
 *
 * @author KELVO FRAYAY
 */
public class RemoveChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str= "India is my country";
        System.out.println(charRemoveAt(str,(str.length()-1)));
    }
 
    public static String charRemoveAt(String strIn,int noIn){
        return strIn.substring(0,noIn)+ strIn.substring(noIn+1);
    }
}
