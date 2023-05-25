public class Semaforo
{
    private int valore;

    public Semaforo()
    {
        valore = 1;
    }

    public synchronized void P()
    {
        while(valore == 0)
        {
            try
            {
                System.out.println(Thread.currentThread().getName()+" sta aspettando per il box");
                wait();
            }
            catch(Exception E)
            {
                System.out.println(E.getMessage());
            }
        }
        valore--;
    }

    public synchronized void V()
    {
        valore++;
        notify();
    }

}
