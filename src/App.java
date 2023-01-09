import java.util.ArrayList;

public class App {
    
    // Alle ArrayListen die in der App.java benutzt werden müssen
    public static ArrayList<Buchung> buchungen = new ArrayList<>();
    public static ArrayList<Medien> alleMedien = new ArrayList<>();
    public static ArrayList<Schallplatte> alleSchallplatten = new ArrayList<>();
    public static void main(String[] args) throws Exception {

    }
}
        //ArrayList zu den Buchungen 
    public static void buchung(){
        //Eigenschaften der Objekte
        
        Kunde k1 = new Kunde("Finn", "Harms", 17, 266363636);
        Kunde k2 = new Kunde("Frank", "Mier", 73, 12365)
        BlueRay b1 = new BlueRay("Reihngold", 6, 190, true, false);
        DvD d1 = new DvD("König der Löwen", 0, 90, true, false);
        CD c1 = new CD("Drei ???", 12, 60, true, false);
        Schallplatte s1 = new Schallplatte("ACDC", 6, 5, true, false)

    buchungen.add(new Buchung(k2, s1));
    buchungen.add(new Buchung(k2, s1));
    buchungen.add(new Buchung(k2, s1));
    buchungen.add(new Buchung(k2, s1));
    buchungen.add(new Buchung(k2, s1));

    
    int index = 0;
    for(Buchung buchung : buchungen){
        
        //Altersbeschränkung
        if(buchung.getKunde().getAlter() < buchung.getMedium().getFSK()){
            System.out.println("Nicht alt genug");
            buchungen.remove(index);
        }
        else{
            // Kunde hat zu viele Medien 
            if(buchung.getKunde().getAusleihen().length > 5){
                System.out.println("Zu viele Medien");
                buchungen.remove(index);
            }
            else{
                //Schallplatte überprüfen
                if(buchung.getKunde().getAusleihen() < buchung.getMedium().getDarfVerliehenwerden()){
                    System.out.println("Schallplatte kann nicht ausgeliehen werden");
                    buchung.remove(index);
            }
            else{
                
                buchung.getKunde().ausleihen[buchung.getKunde().getAusleihen().length] = buchung.getMedium();
                System.out.println("Buchvorgang erfolgreich ");
            }
        }
        index++; //Index immer +1
    }

       


        
    }

    public static void Buchungen(Buchung buchung) {
    }
//ArrayList zu den Verwarnungen
    
 public static void testWarnungen(){
        
Kunde k1 = new Kunde("Finn", "Harms", 17, 266363636);
Kunde k2 = new Kunde("Frank", "Mier", 73, 12365)
BlueRay b1 = new BlueRay("Reihngold", 6, 190, true, false);
DvD d1 = new DvD("König der Löwen", 0, 90, true, false);
CD c1 = new CD("Drei ???", 12, 60, true, false);
Schallplatte s1 = new Schallplatte("ACDC", 6, 5, true, false);


        buchungen.add(new Buchung(k2, d1));
        buchungen.add(new Buchung(k2, b1));
        buchungen.add(new Buchung(k1, d1));
        buchungen.add(new Buchung(k1, b1));
        buchungen.add(new Buchung(k2, s1));
        buchungen.add(new Buchung(k2, c1));
        buchungen.add(new Buchung(k2, s1));
        buchungen.add(new Buchung(k2, c1));

        int index = 0;
        for(Buchung buchung : buchungen){
            
           
    }

{
    //ArrayList, welche Gründe für die Verwarnung und Datum ausgibt
    Verwarnung v1 = new Verwarnung("3.12.22", "Verspätet");
    Verwarnung v2 = new Verwarnung("2.9.21", "Verspätet");
    Verwarnung v3 = new Verwarnung("3.2.22", "Kaputt");
     Verwarnung v4 = new Verwarnung("27.5.16", "Viel zu spät");
     Verwarnung v5 = new Verwarnung("1.1.23", "Kaputt");

    k1.getVerwarnungen().add(v2); 
    k1.getVerwarnungen().add(v1);
    k1.getVerwarnungen().add(v3);
    k1.getVerwarnungen().add(v4);
    k1.getVerwarnungen().add(v5);


    int index = 0;
        // verwarnungen werden überprüft
        for(Buchung buchung : buchungen){
            index++;
            if(buchung.getKunde().getAlter() < buchung.getMedium().getFSK()){
                System.out.println("Nicht alt genug");
                buchungen.remove(index);
            }
            else{
                if(buchung.getKunde().getAusleihen().length > 5){
                    System.out.println("Zu viele Medien ausgeliehen");
                    buchungen.remove(index);
                }
                else{
                    if(buchung.getKunde().getVerwarnungen().size() >= 5){
                        System.out.println(" zu viele Verwarnungen");
                        buchungen.remove(index);
                    }
                    else{
                    buchung.getKunde().ausleihen[buchung.getKunde().getAusleihen().length] = buchung.getMedium();
                    System.out.println("Buchvorgang  durcheführt");
                    }
                }
            }
        }
}
       

   {

    
        BlueRay b1 = new BlueRay("Reihngold", 6, 190, true, false);
        DvD d1 = new DvD("König der Löwen", 0, 90, true, false);
        CD c1 = new CD("Drei ???", 12, 60, true, false);
        Schallplatte s1 = new Schallplatte("ACDC", 6, 5, true, false);

        alleMedien.add(d1);
        alleMedien.add(b1);
        alleMedien.add(s1);
        alleMedien.add(c1);

        int i = 1;
        for(Medien medien : alleMedien){
            System.out.println(i);
            medien.zeigeDaten(); // Die Methode, welche die Daten der Unterklassen ausgibt wird verwendet
            i++; //i immer +1
        }
    }


    public static void ueberschreibeAusleihe(){
        
        for(Medien medien : alleMedien){
            if(medien.getverliehen() = true){
                medien.setVerliehen(false);
            }
            else{                                                           //Objekte werden von "von darf verliehen werden " zu "darf nicht verliehen werden " geändert und andrers herum
                medien.setVerliehen(true);
            }



        System.out.println("Ausleihe überschrieben"); //Ausleihe konnte überschrieben werden
        }

    }

    public static void aendereSchallplatten(){
        
        for(Schallplatte medien : alleSchallplatten){
            if(medien.getDarfVerliehenwerden() == true){
                medien.setDarfVerliehenwerden(false);
            }
            else{                                                               //Schallplatte wurdevon "von darf verliehen werden " zu "darf nicht verliehen werden " geändert und andrers herum
                medien.setDarfVerliehenwerden(true);
            }
        System.out.println("Ausleihe der Schallplatte überschreiben"); //!!
        }
        
    }
}


    }