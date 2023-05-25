public class Box
{
    private int id;

    public Box(int id)
    {
        this.id = id;
    }

    public void rifornimento()
    {
        System.out.println(Thread.currentThread().getName()+" sta effettuando il rifornimento");
        int tempo = (int) (Math.random()*5+1);
        try
        {
            Thread.currentThread().sleep(tempo*1000);
        }
        catch(Exception E)
        {
            System.out.println(E.getMessage());
        }
    }

    public void riparti()
    {
        System.out.println(Thread.currentThread().getName()+" torna in campo");
    }
    
}
