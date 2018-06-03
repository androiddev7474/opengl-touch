package com.test.gl.opengltouch;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.Log;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MyGLrenderer implements GLSurfaceView.Renderer {

    private MyGLsurfaceView myGLsurfaceView;
    private float xPos, yPos;
    private boolean down, up, move;

    public MyGLrenderer(Context context, MyGLsurfaceView myGLsurfaceView) {

        this.myGLsurfaceView = myGLsurfaceView;

    }


    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {

    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {

    }

    @Override
    public void onDrawFrame(GL10 gl) {

        if (down)
            Log.i("ACTION", "TOUCH" + " x, y: " + xPos + ", " + yPos);
        if (move)
            Log.i("ACTION", "MOVE" + " x, y: " + xPos + ", " + yPos );

    }

    public void setXpos(float xPos) {

        this.xPos = xPos;
    }

    public void setYpos(float yPos) {

        this.yPos = yPos;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setMove(boolean move) {
        this.move = move;
    }
}
