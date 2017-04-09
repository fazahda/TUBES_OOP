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
public abstract class Orang {
    String id;
    String name;
    private String email;
    private long noTlp;
    
    public Orang(String id, String name, String email, long noTlp){
        this.id = id;
        this.name = name;
        this.email = email;
        this.noTlp = noTlp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNoTlp() {
        return noTlp;
    }

    public void setNoTlp(long noTlp) {
        this.noTlp = noTlp;
    }
    
    
}
