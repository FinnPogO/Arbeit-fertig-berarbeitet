public class DvD extends Medien{  //Erbt von Medien
    boolean isFullHD;



//Constructor
    public DvD(String titel, int FSK, int laenge, boolean verliehen, boolean isFullHD){
        super(titel, FSK, laenge, verliehen);
        setFullHD(isFullHD);
    }


      // Methode zeigeDaten gibt die Daten der DvD aus (Wenn sie aufgerufen wird)
        public void zeigeDaten(){
            System.out.println(getTitel() + " " + getFSK() + " " + getLaenge() + " " + " " + getIsFullHD());
        }

        //Setter und Getter
    
    public void setFullHD(boolean isFullHD) {
        this.isFullHD = isFullHD;
    }
    public boolean getIsFullHD(){
        return isFullHD;
    }
}
