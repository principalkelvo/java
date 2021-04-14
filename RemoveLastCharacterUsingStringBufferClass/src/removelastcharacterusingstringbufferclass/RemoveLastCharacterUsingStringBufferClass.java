/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removelastcharacterusingstringbufferclass;

/**
 *
 * @author KELVO FRAYAY
 */
public class RemoveLastCharacterUsingStringBufferClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String string="Java is the best language";
        
        //creating a constructor of StringBuffer class
        StringBuffer sb= new StringBuffer(string);
        
        //invocking the method
        sb.deleteCharAt(sb.length()-1);
        
        //prints the string after deleting the character
        System.out.println(sb);
    }
    
}
