package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.Main;

public class DesktopLauncher {
    public static void main (String[] arg) {
        System.setProperty("user.name","admin");
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = 480; config.height = 800;
        new LwjglApplication(new Main(), config);
    }
}