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
        
        System.out.println("-----------------------------\nEvidence pojistenych\n-----------------------------");
        
        // uživatelské rozhraní zabalené ve while a switch
        
        // netuším jak dosáhnout opakovací funkčnosti kterou chci (která by měla být v tomhle projektu)
        // jeden radí něco druhý radí tohle ve while cyklu :(
        
        while (true) {
            
            // výběrový blok s menu    
            
                
            System.out.println("\nVyberte si akci:");
    
    
    
            int volba = 0;
            Scanner scanner = new Scanner(System.in, "Windows-1250");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
        
            volba = Integer.parseInt(scanner.nextLine());
        
        
            switch (volba) {
                case 1:
                    /*
                    Když mě zbyde čas tak tam přibude ještě trimování, 
                    část kódu kdy nebude uživatel moct zadat zápornou hodnotu do věku,
                    část kódu aby se do jména, přijmení, telefoního čísla a věku zapsaly pouze správné hodnoty
                    nejspíš to hodit do catch kódu aby to při žadání špatné hodnoty nespadlo
                    
                    prostě ten kód pro zadávání napsat tak aby to bylo "blbuvzdorný" proti zadávání špatných hodnot
                    
                    Jenže pro nedostatek času (velké spoždění ve e-lerning studiu) je to prozatím takhle :(
                    aby to vůbec aspoň nějak fungovalo.
                    */
                    System.out.println("Zadejte jméno pojištěného: ");
                    String jmeno = scanner.nextLine();
                    System.out.println("Zadejte příjmení: ");
                    String prijmeni = scanner.nextLine();
                    System.out.println("Zadejte telefonní číslo: ");
                    String telefon = scanner.nextLine();
                    System.out.println("Zadejte věk: ");
                    int vek = Integer.parseInt(scanner.nextLine());
                    
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
                    jmeno = scanner.nextLine();
                    System.out.println("Zadej přesné příjmení hledané osoby.");
                    prijmeni = scanner.nextLine();
                    pojistenec = datoska.hledej(jmeno, prijmeni);
                    if (pojistenec != null) {
                        System.out.println("\nNalezl jsem záznam:\n" + pojistenec + "\n\nPokracujte libovolnou klávesou...");
                    } else {
                        System.out.println("Hledaný záznam nebyl nalezen.\n Skontrolujte správnost zadaného jména a přijmení.");
                    }
                    
                    
                    
                    break;
                case 4:
                    //System.out.println("zvolena volba čtyři");
                    //System.out.println("Přejete si zadat další akci? [ano/ne]");
                    //String konec = "4";
                    
                    // tady musí být kód na zastavení celý aplikace nebo celý while zabalit do if s else
                    
                    //TAK TADY BUDE NEJSPÍŠ JENOM BREAK ABY SE CYKLUS ZASTAVIL
                    /*/ tady musí být část kódu funkce nebo metody kterou ještě neznám a nepamatuju si jak se jmenuje 
                    ale umí snímat klávesnici a hned při stisku správné klávesy program zastavit
                    */ 
                    
                    
                    
                    
                    //pokracovat = "ne";
                    return;
                default:
                    System.out.println("neplatná volba, zadej znovu");
            }
            scanner.nextLine();
        } 
    }
}
