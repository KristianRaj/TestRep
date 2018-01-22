/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author schueler
 */
public class Schueler implements Comparable<Schueler>{
    private String name;
    private int SchuelerId;
    private int Jahrgang; 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchuelerId() {
        return SchuelerId;
    }

    public void setSchuelerId(int SchuelerId) {
        this.SchuelerId = SchuelerId;
    }

    public int getJahrgang() {
        return Jahrgang;
    }

    public void setJahrgang(int Jahrgang) {
        this.Jahrgang = Jahrgang;
    }

    @Override
    public String toString() {
        return "Schueler{" + "name=" + name + ", SchuelerId=" + SchuelerId + ", Jahrgang=" + Jahrgang + '}';
    }

    @Override
    public int compareTo(Schueler o) {
        return o.getSchuelerId() - this.getSchuelerId();
    }

    
    
}
