/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penitipan;

/**
 *
 * @author Ilham DM
 */
public class Hewan {
    String id,pemilik;
    boolean statusPenitipan;
    
    void info(String id, String pemilik){
        this.id = id;
        this.pemilik = pemilik;
        System.out.println("Info Hewan : \n"+"ID : "+id+"\n"+"Pemilik : "+pemilik);
    }
    
    boolean status(boolean statusPenitipan){
        this.statusPenitipan = statusPenitipan;
        System.out.println("Status Hewan : ");
        return true;       
    }
    
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        Anjing anjing = new Anjing(true);
        Ikan ikan = new Ikan(false);
        
        hewan.info("1", "Dimas");
        hewan.status(true);
        System.out.println("Status Suntik Rabies : "+anjing.statusSuntikRabies);
        System.out.println("Status Ganti Air : "+ikan.statusGantiAir);
    }
    
}
