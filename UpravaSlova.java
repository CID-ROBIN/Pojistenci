/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojistenych;

import java.util.Scanner;

/**
 *
 * @author Cid Corso
 */
public class UpravaSlova {
    
    
    
    //public String slovo;
    //public String slovoPrijmeni;
    //public String slovoJmeno; 
    
        
    public UpravaSlova() {
        //this.slovo = slovoJmeno;
        //this.slovo = slovoPrijmeni;
    }
     
    /*
    public UpravaSlova(String slovoPrijmeni) {
        this.slovo = slovoPrijmeni;
    }
    */
    
    public String uprav() {
    
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        
        // vstup od uživatele
        //System.out.println("Zadej písmena pro převedení.");
        String slovo = scanner.nextLine().trim().toLowerCase();
        
        // uložení prvního znaku slova do pomocné proměnné
        String SlovoVelkym = slovo.toUpperCase();
        var PrvniPismenoSlova = SlovoVelkym.charAt(0);
        
        // uložení zbytku slova do pomocné proměnné
        String ZbytekSlova = slovo.substring(1, slovo.length());
        
        // složení celýho slova s velkým písmenem na začátku
        String KonecnaPodobaSlova = PrvniPismenoSlova + ZbytekSlova;
        
        return KonecnaPodobaSlova;
        
    }
    
    /*
    @Override
    public String toString() {
        return String.format("%s", slovo );
    }
        
    /*public String uprav() {
    
        // uložení prvního znaku slova do pomocné proměnné
        String SlovoVelkym = SlovoPrijmeni.toUpperCase();
        var PrvniPismenoSlova = SlovoVelkym.charAt(0);
        
        // uložení zbytku slova do pomocné proměnné
        String ZbytekSlova = SlovoPrijmeni.substring(1, SlovoPrijmeni.length());
        
        // složení celýho slova s velkým písmenem na začátku
        String KonecnaPodobaSlova = PrvniPismenoSlova + ZbytekSlova;
        
        return KonecnaPodobaSlova;
        
    }
    */
    
}
