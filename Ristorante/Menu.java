
public class Menu extends Ricette 
{
    public static void out(String s){System.out.println(s);}
    public void o(String s){System.out.print(s);}
    Input in= new Input();
    public Menu()
    {

    }
    public void VisualizzaMenu() throws Exception{
      int Scelta,Scelta1;
      int Q;
      do{
        out("#############");
        out("#-- MENU' --#");
        out("#############\n");
        out("1) Antipasti");
        out("2) Primi piatti");
        out("3) Secondi");
        out("4) Dolce");
        o("Scelta: ");
        Scelta=in.readInt();
        if(Scelta<1||Scelta>4){
            out("Inserire un opzione valida compresa tra 1-4");
        }
      }while(Scelta<1||Scelta>4);
      switch(Scelta){
        
          case 1: //RICHIAMO METODO INGREDIENTI E VISUALIZZAZIONE ANTIPASTI
                    //SCELTA ANTIPASTI
                    Scelta1=in.readInt();
                        break;
                     
          case 2: //RICHIAMO METODO INGREDIENTI E VISUALIZZAZIONE PRIMI PIATTI
                    //SCELTA PRIMI PIATTI
                    out("Quantita': ");
                    Q=in.readInt();
                    Scelta1=in.readInt();
                        break;
                        
          case 3: //RICHIAMO METODO INGREDIENTI E VISUALIZZAZIONE SECONDI
                    // SCELTA SECONDI
                    Scelta1=in.readInt();
                        break;
                        
          case 4: //RICHIAMO METODO INGREDIENTI E VISUALIZZAZIONE DOLCI
                    //SCELTA DOLCI
                   Scelta1=in.readInt();
                        break;
      }
    }
}
