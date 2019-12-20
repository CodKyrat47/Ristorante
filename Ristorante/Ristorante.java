public class Ristorante
{
    /* UN RISTORANTE HA UNA DISPENSA CONTENENTE INGREDIENTI E RICETTE,
       E DEI MENU' FISSI CHE USANO INGREDIENTI DELLA DISPENSA. 
       IMPLEMENTARE UN PROGRAMMA CHE POSSA FARE PRENOTAZIONI E DISDETTE.
       OGNI PERSONA SCEGLIE UNA RICETTA E AVVIENE UNO SCALO DI INGREDIENTI (ml,l,g,kg) DALLA DISPENSA. 
       AVVISARE QUANDO L'INGREDIENTE E' SOTTOSCORTA (AGGIUNTA OPZIONALE: SCONTRINO CON IL CONTO).
       CLASSI:
       1: DISPENSA (CONTIENE INGREDIENTI)
       2: RICETTE (EXTENDS DI DISPENSA)
       3: SALA (CONTIENE TAVOLI)
       4: MENU'(CONTIENE RICETTE)
       5: CONTO */
    public static void out (String s){System.out.println (s);}
    public static void o (String s){System.out.print (s);}
    public static void Ristorante (String[] args) throws Exception
    {
       Input in = new Input ();
       int Scelta;
       do {
            out ("#################");
            out ("#-- Benvenuti --#");
            out ("#################\n");
            out ("0) Esci");
            out ("1) Prenotazione");
            out ("2) Senza prenotazione");
            out ("3) Disdici");        
            o ("Scelta: ");
            Scelta = in.readInt ();            
            switch (Scelta){
                case 0: break;
        
                case 1: /*ASSEGNAZIONE DEL TAVOLO TRAMITE NUMERO DI PRENOTAZIONE 
                        GENERATO RANDOM E ASSEGNAZIONE DI PERSONE AL TAVOLO E 
                        SE SONO PIU' DI 4 OCCUPARE PIU' TAVOLI*/
                        break;
                
                case 2: /*FARE LO STESSO PER LE PRENOTAZIONI MA VERIFICARE PRIMA CHE
                        I TAVOLI NON SONO TUTTI OCCUPATI E IN QUEL CASO MANDARE IN 
                        OUTPUT CHE I POSTI SONO ESAURITI*/
                        break;
               
                case 3: //DISDIRE IN BASE AL NUMERO DELLA PRENOTAZIONE 
                        break;
                
                default :   out ("Inserire una scelta valida compresa tra 0 e 3");
                            break;
            }
       } while (Scelta != 0);
    }
}