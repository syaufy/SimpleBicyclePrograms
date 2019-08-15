/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RPL
 */
class Bicycle {
    
    private String ownerName;
    
    public Bicycle ()  {
        ownerName = "Unknown";
    }
        
    public String getOwnerName(){
        return ownerName;
    }
    
    public void setOwnerName(String name)   {
        ownerName = name;
    }
}
