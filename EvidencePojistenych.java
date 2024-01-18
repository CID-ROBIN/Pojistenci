/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.evidencepojistenych;

import java.util.Scanner;

/**
 *
 * @author Cid Corso
 */
public class EvidencePojistenych {

    public static void main(String[] args) {
        DatabazePojistenych datoska = new DatabazePojistenych();
        UpravaSlova korekce = new UpravaSlova();
        
        
        System.out.println("-----------------------------\nEvidence pojistenych\n-----------------------------");
        
        // uživatelské rozhraní zabalené ve while a switch
        
        
        
        while (true) {
            
            // výběrový blok s menu    
            
                
            System.out.println("\nVyberte si akci:");
    
    
    
            int volba = 0;
            Scanner scanner = new Scanner(System.in, "Windows-1250");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
        
            volba = Integer.parseInt(scanner.nextLine().trim());
        
        
            switch (volba) {
                case 1:
                    // blok na zadávání údajů pojištěnce
                    System.out.println("Zadejte jméno pojištěného: ");
                    String jmeno = korekce.uprav();
                    
                    System.out.println("Zadejte příjmení: ");
                    String prijmeni = korekce.uprav();
                    
                    System.out.println("Zadejte telefonní číslo: ");
                    String telefon = scanner.nextLine().trim();
                    
                    System.out.println("Zadejte věk: ");
                    int vek = Integer.parseInt(scanner.nextLine().trim());
                    
                    // zde bude kód na zabalení a odeslání do ArrayList datošky
                    Pojistenec pojistenec = new Pojistenec(jmeno, prijmeni, vek, telefon);
                    datoska.pridej(pojistenec);
                            
                    System.out.println("\nData byla uložena. Pokračujte libovolnou klávesou ...");
                    
                    
                    break;
                case 2:
                    // tady bude volání metody z databáze na výpis všech pojištěných do konzole
                    System.out.println("\nSeznam všech pojištěných:");
                    String vypis = datoska.vypis();
                    System.out.println(vypis);
                    System.out.println("Pokračujte libovolnou klávesou...");
                    break;
                case 3:
                    // tady bude volání metody z databáze na to aby v ní našel pojisteneho a vypsal ho do konzole
                    System.out.println("\nZadej přesné jméno hledané osoby.");
                    jmeno = korekce.uprav();
                    
                    System.out.println("Zadej přesné příjmení hledané osoby.");
                    prijmeni = korekce.uprav();
                    
                    pojistenec = datoska.hledej(jmeno, prijmeni);
                    if (pojistenec != null) {
                        System.out.println("\nNalezl jsem záznam:\n" + pojistenec + "\n\nPokracujte libovolnou klávesou...");
                    } else {
                        System.out.println("Hledaný záznam nebyl nalezen.\n Skontrolujte správnost zadaného jména a přijmení.");
                    }
                    
                    
                    
                    break;
                case 4:
                    
                    // tady musí být kód na zastavení celý aplikace
                    
                    return;
                default:
                    System.out.println("neplatná volba, zadej znovu");
            }
            scanner.nextLine();
        } 
    }
}
