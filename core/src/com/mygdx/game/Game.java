package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import org.w3c.dom.Text;

public class Game extends ApplicationAdapter {

	public Texture sandTexture;
	public SpriteBatch spriteBatch;
	public Sprite textureSprite;

	@Override
	public void create() {
		spriteBatch = new SpriteBatch();
		sandTexture = new Texture(Utils.getExternalPath("sand.png"));
		textureSprite = new Sprite(sandTexture);
		textureSprite.setSize(5, 5);
		textureSprite.setBounds(0,0,200, 200);
	}



	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		spriteBatch.begin();
		spriteBatch.draw(sandTexture, 0, 0, 200, 200);
		textureSprite.draw(spriteBatch);
		spriteBatch.end();
	}

	@Override
	public void dispose() {
		sandTexture.dispose();
		spriteBatch.dispose();
	}

	@Override
	public void resize(int width, int height) {
		spriteBatch.getProjectionMatrix().setToOrtho2D(0, 0, width, height);
	}




















//	SpriteBatch batch;
//	Texture img;
//
//	@Override
//	public void create () {
//		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");
//	}
//
//	@Override
//	public void render () {
//		ScreenUtils.clear(1, 0, 0, 1);
//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();
//	}
//
//	@Override
//	public void dispose () {
//		batch.dispose();
//		img.dispose();
//	}
}
