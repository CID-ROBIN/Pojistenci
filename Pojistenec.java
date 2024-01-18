/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojistenych;

/**
 *
 * @author Cid Corso
 */
public class Pojistenec {
    
    // založení parametrů pojistence
    
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefon;
    
    public Pojistenec(String jmeno, String prijmeni, int vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }
    
    // metoda na výpis pojištěnce do konzole
    @Override
    public String toString() {
        return String.format("%s %s   věk: %s   telefon: %s", jmeno, prijmeni, vek, telefon);
    }
    
    // metoda na získání jména pojištěnce
    public String getJmeno() {
        return jmeno;
    }
    
    // metoda na získání příjmení pojištěnce
    public String getPrijmeni() {
        return prijmeni;
    }
}
