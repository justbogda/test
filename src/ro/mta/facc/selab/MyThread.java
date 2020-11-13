package ro.mta.facc.selab;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Se executa pe un alt thread!");
    }
}
