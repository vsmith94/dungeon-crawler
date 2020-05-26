package com.game.dc;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.Map;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.MapRenderer;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.ScalingViewport;
import com.game.entities.Entity;
import com.game.entities.characters.CharacterEntity;
import com.game.util.SimpleMapRenderer;

public class MainGame extends Game {

    SpriteBatch batch;
    Texture img;
    ScalingViewport viewport;
    Map map;
    SimpleMapRenderer mapRenderer;

    @Override
    public void create() {
        batch = new SpriteBatch();

        // Map Testing stuff
        CharacterEntity player = new CharacterEntity(new Texture("player_idle.png"));
        map = new Map();
        MapLayer mapLayer = new MapLayer();
        mapLayer.getObjects().add(player);
        player.getSprite().setSize(64, 64);
        map.getLayers().add(mapLayer);
        mapRenderer = new SimpleMapRenderer(map, batch);

        viewport = new ScalingViewport(Scaling.fit, 1280, 720);
        viewport.apply(false);
    }

    @Override
    public void render() {
        // Reset screen
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Viewport controls
        viewport.update(1280, 720);
        batch.setProjectionMatrix(viewport.getCamera().combined);

        batch.begin();
        mapRenderer.render();
        // batch.draw(img, 0, 0, 800, 600);

        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
