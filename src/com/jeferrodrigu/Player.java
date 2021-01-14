package com.jeferrodrigu;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Player implements Runnable {
    private final int playerCode;

    public Player(int id) {
        this.playerCode = id;
    }

    @Override
    public void run() {
        while (true) {
            String card = getPlayedCard();
            sayPlayedCard(card);
            // en esta parte debe sincronizarse para que se impriman las jugadas de cada jugador
            // solo cuando le toque el turno a cada quien. Las cartas de skip, salta el turno de la persona.
            // la carta de win, termina el juego para todos
        }
    }

    private void sayPlayedCard(String playedCard) {
        System.out.println("Player " + this.playerCode+1 + ": has played " + playedCard);
    }

    private String getPlayedCard(){
        if (Math.random() > 0.99) {
            return "win";
        } else if (Math.random() > 0.7) {
            return "skip";
        } else if (Math.random() > 0.8) {
            return "reverse";
        } else {
            return Math.floor(Math.random()*10)+"";
        }
    }
}
