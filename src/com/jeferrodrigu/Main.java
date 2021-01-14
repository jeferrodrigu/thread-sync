package com.jeferrodrigu;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static final Player[] players = new Player[4];

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            players[i] = new Player(i);
            new Thread(players[i]).start();
        }
    }
}
