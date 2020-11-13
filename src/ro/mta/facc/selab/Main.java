package ro.mta.facc.selab;

public class Main {
    public static void main(String[] args)
    {
        Carte c = new Carte("Biblia pierduta", "Igor Bergler", 2017, 600);
        Biblioteca b = new Biblioteca();
        b.add(c);

        b.add(new Carte("Invitatie la vals", "Mihail Drumes", 1910, 250));
        b.add(new Carte("Amintiri din copilarie", "Ion Creanga", 1880, 80));

        b.add(new Carte("Moara cu noroc", "Ioan Slavici", 1890, 120));

        b.sort();
        System.out.println(b);

        MyThread thread = new MyThread();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("alt thread!");
            }
        }).start();
    }
}
