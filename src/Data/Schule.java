/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.TreeSet;

/**
 *
 * @author schueler
 */
public class Schule {
    private String name;
    private int SchulNummer;
    private TreeSet<Schueler> allSchueler;
    private TreeSet<Lehrer> allLehrer;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchulNummer() {
        return SchulNummer;
    }

    public void setSchulNummer(int SchulNummer) {
        this.SchulNummer = SchulNummer;
    }

    public TreeSet<Schueler> getAllSchueler() {
        return allSchueler;
    }

    public void setAllSchueler(TreeSet<Schueler> allSchueler) {
        this.allSchueler = allSchueler;
    }

    public TreeSet<Lehrer> getAllLehrer() {
        return allLehrer;
    }

    public void setAllLehrer(TreeSet<Lehrer> allLehrer) {
        this.allLehrer = allLehrer;
    }
    
    
    public void addSchueler(Schueler s) throws Exception
    {
        if(allSchueler.contains(s))
        {
            throw new Exception("Schueler exestiert bereits");
        }
        
        allSchueler.add(s);
    }
    
    public void addLehrer(Lehrer l) throws Exception{
        if(allLehrer.contains(l))
        {
            throw new Exception("Dieser Lehrer existiert bereits");
        }
        
        allLehrer.add(l);
    }
}
