public class Mitarbeiter {
    String vorname;
    String nachname;
    int mitarbeiternummer;

    //Constructor
    public Mitarbeiter(String vorname, String nachname, int mitarbeiternummer){
        setMitarbeiternummer(mitarbeiternummer);
        setNachname(nachname);
        setVorname(vorname);
    }


    //Setter und Getter

    public void setMitarbeiternummer(int mitarbeiternummer) {
        this.mitarbeiternummer = mitarbeiternummer;
    }
    public int getMitarbeiternummer() {
        return mitarbeiternummer;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public String getNachname() {
        return nachname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getVorname() {
        return vorname;
    }
    
}
