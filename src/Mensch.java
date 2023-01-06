public abstract class Mensch {      //Oberklasse von Kunde 
    String vorname;
   String nachname;



//Constructor
   public Mensch(String vorname, String nachname){
       setNachname(nachname);
       setVorname(vorname);
   }



   //Setter und Getter
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