public abstract class Watek extends Thread {

    int istart;

    Watek(int pocz) {
        istart = pocz;
    }

    public abstract void run();
}