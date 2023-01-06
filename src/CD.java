public class CD extends Medien{     //Erbt von Medien
    boolean istLP;


    //Constructor
    public CD(String titel, int FSK, int laenge, boolean verliehen, boolean istLP){
        super(titel, FSK, laenge, verliehen);
        setLP(istLP);
    }

     // Methode zeigeDaten gibt die Daten der CD aus (Wenn sie aufgerufen wird)

    public void zeigeDaten(){
        System.out.println(getTitel() + " " + getFSK() + " " + getLaenge() + " " + " " + getIsLP());

        //Setter und Getter
    }

    public void setLP(boolean isLP) {
        this.istLP = isLP;
    }
    public boolean getIsLP(){
        return istLP;
    }

    
   

}
