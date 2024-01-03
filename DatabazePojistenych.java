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
    
    private ArrayList<Pojistenec> pojistenci = new ArrayList<>();
    
    /*
    public class pojistenec {
        public ArrayList<String> pojistenci;
        
    }
    */
    public void pridej(Pojistenec pojisteneci) {
        
        
        pojistenci.add(pojisteneci);
    }
    
    
    
    public String vypis() {
        String vypis = "";
        
        for (Pojistenec zaznam : pojistenci) {
            vypis += zaznam + " \n";
        }
        return vypis;
    }

    
    public Pojistenec hledej(String jmeno, String prijmeni) {
        for (Pojistenec pojistenec : pojistenci) {
            if (pojistenec.getJmeno().equals(jmeno) && pojistenec.getPrijmeni().equals(prijmeni)) {
                return pojistenec;
            }
        }
    return null;
    }
    
    /*
/ na databázi použít kolekci ArrayList nebo něco hodně podobnýho 
co bude podporovat vkládání a mazání záznamů u kolekce + vyhledávání a vypisování z kolekce

    mohl by to být ten ArrayList nebo možná spojový seznam LinkedList ale ten možná ani ne
    
    
*/
    
}
