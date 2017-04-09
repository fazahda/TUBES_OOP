/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author djodyfaza
 */
public class BerkasLamaran {
    private long idBerkas;
    private Pelamar profilPelamar;

    public BerkasLamaran(long idBerkas, Pelamar profilPelamar) {
        this.idBerkas = idBerkas;
        this.profilPelamar = profilPelamar;
    }

    public long getIdBerkas() {
        return idBerkas;
    }

    public void setIdBerkas(long idBerkas) {
        this.idBerkas = idBerkas;
    }

    public Pelamar getProfilPelamar() {
        return profilPelamar;
    }

    public void setProfilPelamar(Pelamar profilPelamar) {
        this.profilPelamar = profilPelamar;
    }
    
    
    
    
}
