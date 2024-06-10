package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.io.File;

public class Utils {


    //à copier dans la classe Game
//    @Override
//    public void create() {
//        System.out.println(System.getProperty("user.home"));
//
//        //être certain que la methode supporte write and read
//        //copié dans le dossier gradle
//        FileHandle  fileHandle = Utils.getExternalPath("sand.png");
//        fileHandle.copyTo(Utils.getLocalPath("sand.png"));
//
//        spriteBatch = new SpriteBatch();
//        //sandTexture = new Texture(Gdx.files.internal("sand.png"));
//        sandTexture = new Texture(Utils.getExternalPath("sand.png"));// dans le user.home
//        textureSprite = new Sprite(sandTexture);
//        textureSprite.setBounds(0,0,200, 200);
//    }

    public static FileHandle getClassPath(String filepath){
        return Gdx.files.classpath(filepath);
    }

    public static FileHandle getInternalPath(String filepath){
        return Gdx.files.internal(filepath);
    }

    //private
    public static FileHandle getLocalPath(String filepath){
        return Gdx.files.local(filepath);
    }

    //open edit to the user
    public static FileHandle getExternalPath (String filepath){
        return Gdx.files.external(filepath);
    }
}
