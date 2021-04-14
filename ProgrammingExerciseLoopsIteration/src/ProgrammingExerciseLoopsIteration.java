import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KELVO FRAYAY
 */
public class ProgrammingExerciseLoopsIteration {
    public static void main(String[] args) {
        int gum = 0,popcorn = 0,chocolate = 0,juice = 0,total;
        char response;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("***VENDING MACHINE***");
        do{
            //offer menu options
            System.out.println();//blank line
            System.out.println("[1] Get gum");
            System.out.println("[2] Get chocolate");
            System.out.println("[3] Get popcorn");
            System.out.println("[4] get juice");
            System.out.println("[5] Display total sold so far");
            System.out.println("[6] quit");
            System.out.print("enter choice [1,2,3,4,5]: ");
            response=keyboard.next().charAt(0);
            System.out.println();
            switch(response){
                case '1':System.out.print("how many gums: ");
                gum=keyboard.nextInt();
                System.out.println("Here is your gum.Enjoy");
                break;
                case '2':System.out.print("how many pieces of chocolates: ");
                chocolate=keyboard.nextInt();
                System.out.println("Here is your chocolate.Enjoy");
                break;
                case '3':System.out.print("how many packets of popcorn: ");
                popcorn=keyboard.nextInt();
                System.out.println("Here is your popcorn.Enjoy");
                break;
                case '4':System.out.print("how many cups of juice: ");
                juice=keyboard.nextInt();
                System.out.println("Here is your juice. Enjoy");
                break;
                case '5':System.out.println("total items sold so far");
                System.out.println(gum+" items of gums sold");
                System.out.println(chocolate+" items of chocolate sold");
                System.out.println(popcorn+" items of popcorn sold");
                System.out.println(juice+" items of juice sold");
                break;
                case '6':System.out.println("GOODBYE");
                default:System.out.println("OPTION 1-6 ONLY!!!");
            }
        }while(response!='6');
    }
    
}
