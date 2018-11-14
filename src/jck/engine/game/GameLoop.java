package jck.engine.game;

import jck.engine.engine.Display;
import jck.engine.engine.DisplayBuilder;

/*

    This class conatains the gameloop wich we use to update data

 */


public class GameLoop {

    public GameLoop(String title){
        Display.createDisplay(new DisplayBuilder(1280, 720).setFullscreen(GameSettings.FULLSCREEN).setVsync(GameSettings.VSYNC).setTitle(title));

        //The underlying loop is the main loop in the game. (In this loop everything happens)
        while(!Display.isCloseRequested()){
            //These two lines updates the display and the display events (keyboard and mouse)
            Display.swapBuffers();
            Display.updateEvents();

            //Functional render/update code down here
            update();
            render();
            displayGui();

        }
        //Clean-up right here
        Display.disposeDisplay();
    }


    private void update(){//In this method the first updates of the frame happens (Player movement/camera updates
        double delta = Display.getDelta();



    }

    private void render(){

    }

    private void displayGui(){

    }
}
