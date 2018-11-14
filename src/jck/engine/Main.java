package jck.engine;

/*
    @author Casper Klinkhamer
    This is the main class for the engine project. The gameloop is at a different location because that doesn't fit in here.

 */

import jck.engine.game.GameLoop;

public class Main {

    public static final String VERSION = "0.0.1 pre-aplha";

    public static void main(String[] args) {
        System.out.println("version: " + VERSION);

        new GameLoop("JCK-Engine" + VERSION);
    }

}
