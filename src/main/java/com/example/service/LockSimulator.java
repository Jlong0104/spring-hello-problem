package com.example.service;

public class LockSimulator {

    public static final Object globalLock = new Object();

    public void start() {
        new Thread(() -> {
            try {
                Thread.sleep(100_000);
                System.out.println("💥 Simulating lock contention...");

                synchronized (globalLock) {
                    while (true) {
                        Thread.sleep(100);
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}