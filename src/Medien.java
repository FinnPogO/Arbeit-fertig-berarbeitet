public abstract class Medien {  //Oberklasse von CD,Dvd,Blueray,Schallplatte
    String titel;
    int FSK;
    int laenge;
    boolean verliehen;
    
    
    //Constructor
        public Medien(String titel, int FSK, int laenge, boolean verliehen){
            setFSK(FSK);
            setLaenge(laenge);
            setTitel(titel);
            setVerliehen(verliehen);
        }
    
        public abstract void zeigeDaten();      //Abstrakte Methode, die die Daten von den Unterklassen ausgibt, falls sie aufgerufeb wird
    
        //Setter und Getter
    
        public void setFSK(int fSK) {
            FSK = fSK;
        }
        public int getFSK() {
            return FSK;
        }
        public void setLaenge(int laenge) {
            this.laenge = laenge;
        }
        public int getLaenge() {
            return laenge;
        }
        public void setTitel(String titel) {
            this.titel = titel;
        }
        public String getTitel() {
            return titel;
        }
        public void setVerliehen(boolean verliehen) {
            this.verliehen = verliehen;
        }

        public Medien[] getDarfVerliehenwerden() {
            return null;
        }

        public boolean getVerliehen() {
            return false;
        }
        
    }
    