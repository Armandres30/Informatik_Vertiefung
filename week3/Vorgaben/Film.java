public class Film  implements Comparable {
    
    // Attribute
    public String titel;
    public double preis; // in EUR
    public int    laenge; // in min
    public String beschreibung;
    public String erscheinungsdatum; // ISO-8601 (JJJJ-MM-TT)
    
    // Konstruktor
    public Film(String titel, double preis, int laenge, String beschreibung, String erscheinungsdatum) {
        this.titel = titel;
        this.preis = preis;
        this.laenge = laenge;
        this.beschreibung = beschreibung;
        this.erscheinungsdatum = erscheinungsdatum;
    }
    
    // Methoden
    public String toString() {
        return  "Film={" + 
                "titel=" + this.titel + "," +
                "preis=" + this.preis + "," +
                "laenge=" + this.laenge + "," +
                "beschreibung=" + this.beschreibung + "," +
                "erscheinungsdatum=" + this.erscheinungsdatum +
                "}";
    }
    
    public int compareTo(Comparable other) {
        if(other instanceof Film){
            return this.titel.compareTo(other.titel); //titel cannot be resolved or is not a field. Warum?
        }else {
            return 0;
        }
        
    }
    
}
