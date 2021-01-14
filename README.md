# Sincronización de hilos.

Se debe realizar un programa donde 4 jugadores simulen una partida de un juego de cartas. El juego consiste en que hay cartas con numreos del 0-9, hay cartas de skip que se saltan el turno del siguiente jugador
y cartas de reverse, para invertir el orden de los turnos, y hay una carta win, que termina el juego automáticamente.

Los jugadores deberían imprimir secuencialmente cada una de sus jugadas en la consola, especificando el codigo del usuario, debería quedar un log de cada jugada que se hizo, de la siguiente forma.

```
Jugador 1, comienza el juego, juega un 3.
Jugador 2, juega un 3.
Jugador 3, juega un skip, se salta al Jugador 4.
Jugador 1, juega un 2.
Jugador 2, juega un 7.
Jugador 3, juega un reverse, invierte el orden de los turnos.
Jugador 2, juega un 5.
Jugador 1, juega un 7.
Jugador 2, juega un skip, se salta al Jugador 4.
Jugador 3, juega un 6.
Jugador 4, juega la carta win, el juego ha terminado.
```

Usted debe complementar el método run, que se encuentra en la clase Player, para que los jugadores impriman sus jugadas de manera ordenada.
