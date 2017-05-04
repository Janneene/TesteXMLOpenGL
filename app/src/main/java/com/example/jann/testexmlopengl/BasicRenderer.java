package com.example.jann.testexmlopengl;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.content.Context;
import android.opengl.GLU;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.GLSurfaceView;

/**
 * Created by Jann on 03/05/2017.
 */
public class BasicRenderer implements Renderer {
    private Context mContext;
    private float mWidth, mHeight;


    private int command;
    public int DO_THIS = 1;
    public int DO_THAT = 2;

    public BasicRenderer(Context context){
        mContext=context;
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {

    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i, int i1) {

    }

    @Override
    public void onDrawFrame(GL10 gl) {

        if(command==DO_THIS){
            //doThis();
        } else if(command==DO_THAT){
            //doThat();
        }

        gl.glClear(GL10.GL_COLOR_BUFFER_BIT |
                GL10.GL_DEPTH_BUFFER_BIT);


    }

    public void queueDoSomethingNextTick(int command){

        this.command = command;

    }

}


