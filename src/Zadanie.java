public class Zadanie {

    public static void main(String[] args) { 

        Mapa m = new Mapa(2);
        Watek w1 = new WatekMapy(m, 1, "test1");
        Watek w2 = new WatekMapy(m, 2, "test2");
        w1.start();
        w2.start();

        try {
            w1.join();
            w2.join();
        } catch (InterruptedException ignored) {
        }

        Object ob = m.odbierz();

<<<<<<< HEAD
        System.out.println(ob.toString());  
    }
=======
        System.out.println(ob.toString());
    }  
>>>>>>> feature/2
}   
 