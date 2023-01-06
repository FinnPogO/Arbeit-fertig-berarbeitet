public class Buchung {
    Kunde kunde;
    Medien medium;     
        
        //Constructor
    
        public Buchung(Kunde kunde, Medien medium){
            setKunde(kunde);
            setMedium(medium);
        }
    
            //Setter und Getter
        
        public void setKunde(Kunde kunde) {
            this.kunde = kunde;
        }
        public Kunde getKunde() {
            return kunde;
        }
        public void setMedium(Medien medium) {
            this.medium = medium;
        }
        public Medien getMedium() {
            return medium;
        }
    
    
        //Klasse Buchung für die Arraylist
        //Kunde und Medien werden verbunden damit sie zusammen in der ArrayList ausgegeben werden können
    }