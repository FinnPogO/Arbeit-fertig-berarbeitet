public class Verwarnung {
    String datum;
    String grund;
   
       //Constructor
   
       public Verwarnung(String datum, String grund){
           setDatum(datum);
           setGrund(grund);
    }
   
   public void setDatum(String datum) {
       this.datum = datum;
   }
   public String getDatum() {
       return datum;
   }
   public void setGrund(String grund) {
       this.grund = grund;
   }
   public String getGrund() {
       return grund;
   }
   
   //Für die ArrayList, in welcher Verwarnung angegeben werden mit grund und Datum
   
   
   }
   
