public class Monoposto extends Thread
{
    private static Semaforo S = new Semaforo();
    private static Box box = new Box(1);
    private int id;
    private String scuderia;
    
    /**
     * @param id da associare alla monoposto
     * @param scuderia a cui appartiene la monoposto
     * @param pilota che guida la monoposto
     * Il metodo crea un oggetto della classe Monoposto
     */
    public Monoposto(int id, String scuderia, String pilota)
    {
        super(pilota);
        this.id = id;
        this.scuderia = scuderia;
    }

    /**
     * Il metodo fa partire la monoposto, facendogli compiere 10 giri di pista.
     * Ogni 3 giri di pista una monoposto deve effettuare un pit-stop utilizzando la box.
     * La box può ospitare due sole monoposto per volta;
     */
    @Override
    public void run()
    {
        for(int X=1; X<=10; X++)
        {
            int tempo = (int) (Math.random()*4+1);
            try
            {
                sleep(tempo*1000);
            }
            catch(Exception E)
            {
                System.out.println(E.getMessage());
            }
            System.out.println(getName()+" ha finito il giro "+X);
            if(X%3 == 0)
            {
                S.P();
                box.rifornimento();
                box.riparti();
                S.V();
            }
        }
    }

}
