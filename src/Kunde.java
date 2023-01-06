import java.util.ArrayList;

public class Kunde extends Mensch{     //Erbt von Mensch
int kundennummer;
 int alter;
 Medien[] ausleihen = new Medien[4]; 
   
 ArrayList<Verwarnung> verwarnungen = new ArrayList<>();  //ArrayList zählt die anzahl der verwarnungen der Kunden


    //Constructor
    public Kunde(String vorname, String nachname, int alter, int kundennummer){
        super(vorname, nachname);
        setKundennummer(kundennummer);
        setAlter(alter);
    }


        //Setter und Getter
    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }
    public int getKundennummer() {
        return kundennummer;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }
    public int getAlter() {
        return alter;
    }
    public void setAusleihen(Medien[] ausleihen) {
        this.ausleihen = ausleihen;
    }
    public Medien[] getAusleihen() {
        return ausleihen;
    }
    public void setVerwarnungen(ArrayList<Verwarnung> verwarnungen) {
        this.verwarnungen = verwarnungen;
    }
    public ArrayList<Verwarnung> getVerwarnungen() {
        return verwarnungen;
    }
  
}

    
