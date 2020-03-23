
/**
 * Write a description of class Getraenk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Getraenk extends Artikel
{
    private String groesse; // kann gross oder klein sein
    
    public Getraenk(int pNr, String pBezeichnung, String pGroesse, double pPreis)
    {
        super(pNr,pBezeichnung,pPreis);
        groesse = pGroesse;
    }
}
