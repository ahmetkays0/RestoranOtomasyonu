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
class urunler {
      
    private String urunbilgisi;
    private int hesap;
   
    public urunler(String urunbilgisi,int hesap){
     
        this.hesap=hesap;
        this.urunbilgisi=urunbilgisi;
    }
    public String geturun(){
        return urunbilgisi;
    }
    public int gethesap(){
        return hesap;
    }
}
