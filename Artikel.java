
/**
 * Write a description of class Artikel here.
 *
 * @author Sven Frimont
 * @version 17.03.2020
 */
public abstract class Artikel
{
    // instance variables - replace the example below with your own
    private int nr;
    private String bezeichnung;
    private double preis;
    
    public Artikel(int pNr, String pBezeichnung, double pPreis)
    {
        nr = pNr;
        bezeichnung = pBezeichnung;
        preis = pPreis;
    }
    

}
