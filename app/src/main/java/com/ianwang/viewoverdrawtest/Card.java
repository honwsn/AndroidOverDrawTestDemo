package com.ianwang.viewoverdrawtest;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by ianwang on 2015/5/12.
 * honwsn@gmail.com
 */
public class Card {
    public  RectF area;
    private Bitmap bitmap;
    private Paint paint = new Paint();

    public Card(RectF area){
        this.area = area;
    }

    public  void setBitmap(Bitmap bitmap){
        this.bitmap = bitmap;
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(bitmap,null,area,paint);
    }
}
