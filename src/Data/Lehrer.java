/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;

/**
 *
 * @author schueler
 */
public class Lehrer implements Comparable<Lehrer>{
    private String name;
    private int LehrerId;
    private ArrayList<String> gegenstaende;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLehrerId() {
        return LehrerId;
    }

    public void setLehrerId(int LehrerId) {
        this.LehrerId = LehrerId;
    }

    public ArrayList<String> getGegenstaende() {
        return gegenstaende;
    }

    public void setGegenstaende(ArrayList<String> gegenstaende) {
        this.gegenstaende = gegenstaende;
    }
    
    public void addGegenstand(String g) throws Exception{
        if(gegenstaende.contains(g))
        {
            throw new Exception("Gegenstand ist schon eingetragen");
        }
        
        gegenstaende.add(g);
    }

    @Override
    public int compareTo(Lehrer o) {
        return o.getLehrerId() - this.getLehrerId();
    }
}
