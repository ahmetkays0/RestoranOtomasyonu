/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoransistemi;

/**
 *
 * @author ewnS
 */
class Masa {
    
    private String masaadi;
    private int hesap;
   
    public Masa(String masaadi,int hesap){
     
        this.hesap=hesap;
        this.masaadi=masaadi;
    }
    public String getname(){
        return masaadi;
    }
    public int gethesap(){
        return hesap;
    }
    
  
}
