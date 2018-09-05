/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

/**
 *
 * @author WINDOWS 10
 */
public class user1 extends Manusia{
    @Override
    void settinggi()
    {
        double user1 = 160.0;
        System.out.println("Tinggi Badan      : "+user1+"cm");
    }
    
    @Override
    void setjenis()
    {
        String jenis = "L";
        System.out.println("Jenis Kelamin     : "+jenis);
        
    }
    
    @Override
    void setberat()
    {
        double berat = 50;
        System.out.println("Berat badan ideal : "+berat+"kg");
    }
}
