package com.sda.concurrency.threads;

public class SimpleThread implements Runnable {  //implementacja interfejsu

    private String name;

    public SimpleThread(String name) {  //konstruktor
        this.name = name;
    }

    @Override // nadpisanie metody run
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {  //Zmodyfikuj run tak, aby wątek 4 razy przesypiał 5 sekund i wyświetlał swoje imię.
                Thread.sleep(5000);   // checked exception!!! (sleep)
                System.out.println("Wątek " + name);
            }
        }catch(InterruptedException exception){
            System.out.println("Ktos mnie obudzil");
        }
    }
}

