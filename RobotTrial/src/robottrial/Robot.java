/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robottrial;

/**
 *
 * @author KELVO FRAYAY
 */
public class Robot {
    private String id;
    private int securityLevel;
    private int warningLevel = 0;
    public Robot(String IdIn, int levelIn)
    {
    id = IdIn;
    securityLevel = levelIn;
    }
    public String getId()
    {
    return id;
    }
    public int getSecurityLevel()
    {
    return securityLevel;
    }
    public void calculateWarningLevel(){
        
    };
}
