public class BlueRay extends Medien {   //Erbt von Medien
    boolean is3D;

    

    //Constructor
    public BlueRay(String titel, int FSK, int laenge, boolean verliehen,  boolean ist3d){
        super(titel, FSK, laenge, verliehen);
        setIs3D(ist3d);
    }

    // Methode gibt die Daten der Blueray aus (Wenn sie aufgerufen wird)
    public void zeigeDaten(){
        System.out.println(getTitel() + " " + getFSK() + " " + getLaenge() + " " + " " + getIs3d());
    }



        //Setter und Getter
    public void setIs3D(boolean is3d) {
        is3D = is3d;
    }
    public boolean getIs3d(){
        return is3D;
    }
}