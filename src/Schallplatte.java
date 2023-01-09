public class Schallplatte extends Medien{   //Erbt von Medein
    boolean darfVerliehenwerden;




    //Constructor
    public Schallplatte(String titel, int FSK, int laenge, boolean verliehen, boolean darfVerliehenwerden){
        super(titel, FSK, laenge, verliehen);
        setDarfVerliehenwerden(darfVerliehenwerden);
    }

    // Methode zeigeDaten gibt die Daten der Schallplatte aus (Wenn sie aufgerufen wird)
    public void zeigeDaten(){
        System.out.println(getTitel() + " " + getFSK() + " " + getLaenge() + " " + " " + getDarfVerliehenwerden());
    }


    //Setter und Getter
    public void setDarfVerliehenwerden(boolean darfVerliehenwerden) {
        this.darfVerliehenwerden = darfVerliehenwerden;
    }
    
    public Medien[] getDarfVerliehenwerden() {
        return super.getDarfVerliehenwerden();
    }
    

    
}
