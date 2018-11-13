package jck.engine.game;

import jck.engine.engine.Display;
import jck.engine.engine.DisplayBuilder;

/*

    This class conatains the gameloop wich we use to update data

 */


public class GameLoop {

    public GameLoop(){
        Display.createDisplay(new DisplayBuilder(1280, 720));

        //The underlying loop is the main loop in the game. (In this loop everything happens)
        while(!Display.isCloseRequested()){
            //These two lines updates the display and the display events (keyboard and mouse)
            Display.swapBuffers();
            Display.updateEvents();
            //Functional render/update code down here

        }


    }

}
