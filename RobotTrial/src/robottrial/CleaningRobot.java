/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robottrial;


public class CleaningRobot extends Robot {

    public String typeOfCleaningFluid;
    public CleaningRobot(String IdIn, int levelIn, String fluidIn)
    {
    super(IdIn, levelIn);
    typeOfCleaningFluid = fluidIn;
    }
    public String getTypeOfCleaningFluid()
    {
    return typeOfCleaningFluid;
    }
    
}
