/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author djodyfaza
 */
public class Pelamar extends Orang{
    private ArrayList<BerkasLamaran> arrBerkas;
    private BerkasLamaran berkas;

    public Pelamar(String id, String name, String email, long noTlp) {
        super(id, name, email, noTlp);
    }
    
    public void createBerkas (long idBerkas){
        //APA NIH??//
    }
    
    public BerkasLamaran getBerkas(){
        return berkas;
    }
}
