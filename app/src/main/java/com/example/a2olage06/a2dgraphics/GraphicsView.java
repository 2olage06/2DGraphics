package com.example.a2olage06.a2dgraphics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by 2olage06 on 11/04/2018.
 */

public class GraphicsView extends View implements View.OnTouchListener
{
    Paint p;
    Bitmap heroBmp;

    int counter = 0;
    //public float curX;
    //public float curY;


    public GraphicsView (Context ctx)
    {
        super(ctx);

        heroBmp = BitmapFactory.decodeResource(ctx.getResources(), R.drawable.hero);

        p = new Paint();
        p.setColor(Color.RED);
        p.setTextSize(24);

        this.setOnTouchListener(this);
    }

    public void onDraw (Canvas canvas)
    {
        p.setStyle(Paint.Style.FILL);
        canvas.drawRect(10, 10, 110, 110, p);
        //canvas.drawText("Hello Graphics World!", 0, 200, p);

        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(3);
        canvas.drawRect(10,400,410,500,p);

        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(1);
        canvas.drawBitmap(heroBmp, curX, curY, null);

        counter++;

        canvas.drawText("Counter: " + counter, 0, 200, p);
    }

    public boolean onTouch(View view, MotionEvent ev)
    {
        curX = ev.getX();
        curY= ev.getY();
        return true;
    }
}

