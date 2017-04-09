/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author djodyfaza
 */
public class Lowongan {
    
    private long idLowongan;
    private ArrayList<BerkasLamaran> berkasMasuk;
    private ArrayList<BerkasLamaran> berkasDiterima;
    private Date deadline;
    private String namaLowongan;
    
    public Lowongan(long idLowongan, String namaLowongan, Date deadline){
        berkasMasuk = new ArrayList();
        berkasDiterima = new ArrayList();
        this.idLowongan = idLowongan;
        this.namaLowongan = namaLowongan;
        this.deadline = deadline;
    }

    //SETTER GETTER//
    public long getIdLowongan() {
        return idLowongan;
    }

    public void setIdLowongan(long idLowongan) {
        this.idLowongan = idLowongan;
    }

    public ArrayList<BerkasLamaran> getBerkasMasuk() {
        return berkasMasuk;
    }

    public void setBerkasMasuk(ArrayList<BerkasLamaran> berkasMasuk) {
        this.berkasMasuk = berkasMasuk;
    }

    public ArrayList<BerkasLamaran> getBerkasDiterima() {
        return berkasDiterima;
    }

    public void setBerkasDiterima(ArrayList<BerkasLamaran> berkasDiterima) {
        this.berkasDiterima = berkasDiterima;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getNamaLowongan() {
        return namaLowongan;
    }

    public void setNamaLowongan(String namaLowongan) {
        this.namaLowongan = namaLowongan;
    }
    //SETTER GETTER//
    
    //VOID//
    public BerkasLamaran getBerkasMasukById(long id){
        BerkasLamaran b = null;
        for(int i = 0; i<berkasMasuk.size(); i++){
            if (berkasMasuk.get(i).getIdBerkas() != id){
                b = berkasMasuk.get(i);
            } else {
                System.out.println("Maaf, id yang anda cari tidak ditemukan");
            }
        }
        return b;
    }
    
    public void RemoveBerkasMasuk(){
        berkasMasuk.clear();
    }
    
    public void pindahBerkas(int i){
        //terimaBerkas(berkasMasuk.get(i));
        berkasMasuk.remove(i);
    }
    
    public BerkasLamaran getBerkasDiterima(int i){
        return berkasDiterima.get(i);
    }
    
    public int getJumlahBerkasMasuk(){
        return berkasMasuk.size();
    }
    
    public int getJumlahBerkasDiterima(){
        return berkasDiterima.size();
    }

    @Override
    public String toString() {
        return "Lowongan{" + "idLowongan=" + idLowongan + ", berkasMasuk=" + berkasMasuk + ", berkasDiterima=" + berkasDiterima + ", deadline=" + deadline + ", namaLowongan=" + namaLowongan + '}';
    }
    
}
