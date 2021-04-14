/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raggedarrays;

/**
 *
 * @author KELVO FRAYAY
 */
public class RaggedArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initialize ragged array
        char [][]animals= {
                             {'M','O','N','K','E','Y'},
                             {'C','A','T'},
                             {'B','I','R','D'}
                          };
        for(int row=0;row<animals.length;row++){//row numbers is fixed
            for(int col=0;col<animals[row].length;col++){//column number is variable
                System.out.print(animals[row][col]);//display one character
            }
            System.out.println();//new line after one row displayed
        }
        
    }
    
}
