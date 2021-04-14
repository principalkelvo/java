/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raggedarraytriangle;

import java.util.Scanner;

/**
 *
 * @author KELVO FRAYAY
 */
public class RaggedArrayTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [][] triangle = new int[4][];
    triangle[0] = new int[1]; // number of columns in first row
    triangle[1] = new int[2]; // number of columns in second row
    triangle[2] = new int[3]; // number of columns in third row
    triangle[3] = new int[4]; // number of columns in forth row
        enterValue(triangle);
        displayValue(triangle);
        displayMaxValue(triangle);
    }
    
    //method to enter integer values in a ragged array
    static void enterValue(int[][]triangleIn){
        Scanner keyboard = new Scanner (System.in);
        //the outer loop controls the row
        for(int i=0;i<triangleIn.length;i++){
            //the inner loop controls the column
            for(int j=0;j<triangleIn[i].length;j++){
                System.out.println("enter values to fill in the triangle: ");
                triangleIn[i][j]=keyboard.nextInt();
            }
        }
    }
    //method to display integers in a ragged array
    static void displayValue(int[][]triangleIn){
        //the outer loop controls the row
        for(int i=0;i<triangleIn.length;i++){
            //the inner loop controls the column
            for(int j=0;j<triangleIn[i].length;j++){
                System.out.print(triangleIn[i][j]+" ");
            }
            System.out.println();
        }
    }
    //method to display largest value entered
    static void displayMaxValue(int[][]triangleIn){
        double result= triangleIn[0][0];//set result to the first value in the array
        //this loops run from the first item to the last item in the array
        for(int i=0;i<triangleIn.length;i++){
            for(int j=0;j<triangleIn[i].length;j++){
             if(triangleIn[i][j]>result){
                result= triangleIn[i][j];
                System.out.println();
                //System.out.println("max= "+ result +" index ["+i+"] ["+j+"]");
                } 
             
            }
            
        }
        System.out.println("max= "+ result);//result showing max in ragged array
    }
}
