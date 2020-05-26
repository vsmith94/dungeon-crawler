package com.game.dc.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.game.dc.MainGame;

public class DesktopLauncher {

    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Dungeon Crawler";
        config.width = 1280;
        config.height = 720;
        new LwjglApplication(new MainGame(), config);
    }
}
