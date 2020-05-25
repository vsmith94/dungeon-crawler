package com.game.dc;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.awt.*;

public class MainGame extends ApplicationAdapter {

    SpriteBatch batch;
    Texture floor, wall, wallTop, plaster, boulder;

    @Override
    public void create() {
        batch = new SpriteBatch();
        floor = new Texture("floor33.gif");
        wall = new Texture("wall12.gif");
        wallTop = new Texture("roomWall33.gif");
        plaster = new Texture("roomFloor22.gif");
        boulder = new Texture("boulder.gif");
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        int x = 0;
        int y = 0;
        int width = 16;
        int height = 12;
        for (int a = 0; a < width; a++) {
            for (int b = 0; b < height; b++) {
                batch.draw(floor, x + (32 * a), y + (32 * b));
                if (b == height - 1) {
                    batch.draw(wall, x + (32 * a), y + (32 * (b + 1) + 1));
                    batch.draw(wall, x + (32 * a), y + (32 * (b + 2)));
                    batch.draw(wallTop, x + (32 * a), y + (32 * (b + 3)));
                    batch.draw(plaster, x + (32 * a), y + (32 * (b + 3) + 16));
                    batch.draw(plaster, x + (32 * a), y + (32 * (b + 4)));
                }
            }
        }
        for (int b = 0; b < height + 2; b++) {
            if (b < height) {
                batch.draw(wall, x + (32 * width + 1), y + (32 * b));
                batch.draw(wallTop, x + (32 * width + 24), y + (32 * b));
                batch.draw(plaster, x + (32 * (width + 1) + 8), y + (32 * b));
                batch.draw(plaster, x + (32 * (width + 2)), y + (32 * b));
            } else {
                batch.draw(wall, x + (32 * width), y + (32 * b));
                batch.draw(wallTop, x + (32 * width + 24), y + (32 * b));
                batch.draw(plaster, x + (32 * (width + 1) + 8), y + (32 * b));
                batch.draw(plaster, x + (32 * (width + 2)), y + (32 * b));
            }
        }
        batch.draw(wallTop, x + (32 * width), y + (32 * (height + 2)));
        batch.draw(wallTop, x + (32 * (width + 1)), y + (32 * (height + 2)));
        batch.draw(plaster, x + (32 * (width+1) + 8), y + (32 * (height + 2)));
        batch.draw(plaster, x + (32 * (width + 2)), y + (32 * (height + 2)));
        for (int a=0;a<3;a++){
            batch.draw(plaster, x + (32 * (width+a)), y + (32 * (height + 2) + 16));
            batch.draw(plaster, x + (32 * (width+a)), y + (32 * (height + 3)));
        }

        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        floor.dispose();
        wall.dispose();
        wallTop.dispose();
        plaster.dispose();
        boulder.dispose();
    }
}
