package org.teamfarce.mirch;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.math.Vector2;

/**
 * Initiates the Java Program
 * @author jacobwunwin
 *
 */
class Application {
    public static void main(String[] args) {
    	LwjglApplicationConfiguration config = new LwjglApplicationConfiguration(); //create a new libGDX objext
        config.title = "MIRCH"; //configure the title
        config.width = 1366; //configure the width and height
        config.height = 768;
        new LwjglApplication(new MIRCH(), config); //start the game
    }
}
