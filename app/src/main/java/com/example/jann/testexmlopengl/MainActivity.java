package com.example.jann.testexmlopengl;
import android.app.Activity;
import android.opengl.*;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity {


    BasicRenderer myRenderer;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRenderer = new BasicRenderer(this);

        GLSurfaceView glView = (GLSurfaceView)findViewById(R.id.GLView);
        glView.setRenderer(myRenderer);





    }
}
