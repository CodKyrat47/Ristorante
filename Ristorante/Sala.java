public class Sala
{
    public static void out (String s){System.out.println(s);}
    public void o (String s){System.out.print(s);} 
    Input in = new Input ();
    private int tavoli [] = {2,4,6,2,4,6,2,4,6,2};  private final int max = 10;
    private boolean occupato [] = {false,false,false,false,false,false,false,false,false,false};    
    public Sala ()
    {
        this.tavoli = tavoli;
        this.occupato = occupato;
    }
    public void prenotazione () throws Exception
    {
        int p, i;
        boolean trovato = false;
        do {
            out ("Tavolo per quante persone? ");   p = in.readInt ();
            if (p < 1)
                out ("Prenotare per almeno una persona");
            else if (p > 6)
                out ("Non ci e' possibile attualmente prenotare per piu' di sei persone");
        } while (p < 1 || p > 6);
        for (i=0; i < max; i++)
        {
            if (!occupato [i])
            {
                if (tavoli [i] == p || tavoli [i] == p+1)
                {
                    out ("Tavolo n." + (i+1) + "prenotato per " + p + " persone");
                    trovato = true; 
                    occupato [i] = true;
                    i = 10;
                }                               
            }            
        }
        if (!trovato)
                out ("Non ci sono tavoli disponibili per " + p + " persone. Ci dispiace");
    }
    public void senzaPrenotazione () throws Exception
    {
        int p, i;
        boolean trovato = false;
        do {
            out ("Tavolo per quante persone? ");   p = in.readInt ();
            if (p < 1)
                out ("Preparazione tavolo per almeno una persona");
            else if (p > 6)
                out ("Non ci e' possibile preparare un tavolo per piu' di sei persone");
        } while (p < 1 || p > 6);
        for (i=0; i < max; i++)
        {
            if (!occupato [i])
            {
                if (tavoli [i] == p || tavoli [i] == p+1)
                {
                    out ("E' il vostro giorno fortunato! Tavolo n." + (i+1) + "libero per " + p + " persone!");
                    trovato = true; 
                    occupato [i] = true;
                    i = 10;
                }                               
            }            
        }
        if (!trovato)
                out ("Non ci sono attualmente tavoli disponibili per " + p + " persone. Ci dispiace. La prossima volta provate a prenotare");
    }
    public void disdetta () throws Exception
    {        
        int i;
        out ("Numero tavolo da disdire: ");    i = in.readInt ();      i --;
        if (occupato [i])
        {
            out ("Disdetta effettuata");
            occupato [i] = false;
        }
        else
            out ("Errore. Tavolo privo di prenotazione");
    }
    public int getPersoneTavolo (int i) {return tavoli [i];} 
    public boolean getTavoloOccupato (int i) {return occupato [i];}
}