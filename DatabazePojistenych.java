/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojistenych;
import java.util.ArrayList;
/**
 *
 * @author Cid Corso
 */
public class DatabazePojistenych {
    
    
    // použít collekci ArrayList
    
    // svůj arraylist s metodama na přidání, vyhledávání a mazání
    /**
     * založení ArrayListu s údaji ze třídy Pojistenec
     */
    private ArrayList<Pojistenec> pojistenci = new ArrayList<>();
    
    // metoda na přidání pojištěnce do ArrayListu
    /**
     * 
     * @param pojisteneci metoda na přidání údajů ze třídy Pojištěnec do ArrayListu
     */
    public void pridej(Pojistenec pojisteneci) {
        
        
        pojistenci.add(pojisteneci);
    }
    
    
    // metoda na vypsání pojištěnců z ArrayListu
    /**
     * metoda na vypsání pojištěnců z ArrayListu
     * pomocí for cyklu
     * @return vrací údaje pojištěnců ( jméno, přijmení, telefon, věk )
     */
    public String vypis() {
        String vypis = "";
        
        for (Pojistenec zaznam : pojistenci) {
            vypis += zaznam + " \n";
        }
        return vypis;
    }

    // metoda na najití pojištěnce v ArrayListu
    /**
     * metoda na najití pojištěnce v ArrayListu
     * s použitím for cyklu a podmínky if
     * @param jmeno parametr pro jméno pojištěnce
     * @param prijmeni parametr pro přijmení pojištěnce
     * @return vrátí parametry pojištěnce ( jméno, přijmení, telefon, věk )
     */
    public Pojistenec hledej(String jmeno, String prijmeni) {
        for (Pojistenec pojistenec : pojistenci) {
            if (pojistenec.getJmeno().equals(jmeno) && pojistenec.getPrijmeni().equals(prijmeni)) {
                return pojistenec;
            }
        }
    return null;
    }
    
    
}
