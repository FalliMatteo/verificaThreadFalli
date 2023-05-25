public class App
{
    public static void main(String[] args) throws Exception
    {
        Monoposto M1 = new Monoposto(1, "Mercedes", "Didilescu");
        Monoposto M2 = new Monoposto(3, "Redbull", "Gonzales");
        Monoposto M3 = new Monoposto(4, "Chapati", "Swarang");
        M1.start();
        M2.start();
        M3.start();
        M1.join();
        M2.join();
        M3.join();
        System.out.println("La gara è finita");
    }

}
