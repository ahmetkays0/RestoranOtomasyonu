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
class Hesap {
    
     private String kadi;
    private String sifre;
   
    public Hesap(String kadi,String sifre){
     
        this.kadi=kadi;
        this.sifre=sifre;
    }
    public String getkadi(){
        return kadi;
    }
    
    public String getsifre(){
        return sifre;
    }
}
