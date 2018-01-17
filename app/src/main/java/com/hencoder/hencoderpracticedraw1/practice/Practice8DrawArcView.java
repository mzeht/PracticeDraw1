package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {


    private int mWidth;
    private int mHeight;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mWidth = getMeasuredWidth();
        mHeight = getMeasuredHeight();

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL); // 填充模式
        //红色

        canvas.drawArc(mWidth/4, mHeight/4, (mWidth/4)*3, (mHeight/4)*3, 0, -60, true, paint); // 绘制扇形
        canvas.drawArc(mWidth/4, mHeight/4, (mWidth/4)*3, (mHeight/4)*3, 20, 140, false, paint); // 绘制弧形
        paint.setStyle(Paint.Style.STROKE); //
        canvas.drawArc(mWidth/4, mHeight/4, (mWidth/4)*3, (mHeight/4)*3, 180, 60, false, paint); // 绘制不封口的弧形

    }
}
