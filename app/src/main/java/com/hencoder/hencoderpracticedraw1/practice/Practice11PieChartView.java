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

public class Practice11PieChartView extends View {
    private int mWidth;
    private int mHeight;

    private int chartred = Color.parseColor("#EE2B29");


    private float partOne = 150;                                     //流入大单数
    private int partOneColor = Color.parseColor("#EE755C");

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mWidth = getMeasuredWidth();
        mHeight = getMeasuredHeight();
        float width = 50;


        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL); // 填充模式
        //红色
        paint.setColor(chartred);

        canvas.drawArc(mWidth/4, mHeight/4, (mWidth/4)*3, (mHeight/4)*3, -180, 110, true, paint); // 绘制扇形
//        canvas.drawArc(mWidth/4, mHeight/4, (mWidth/4)*3, (mHeight/4)*3, 20, 140, true, paint); // 绘制弧形
//        paint.setStyle(Paint.Style.STROKE); // 画线模式
//        canvas.drawArc(mWidth/4, mHeight/4, (mWidth/4)*3, (mHeight/4)*3, 180, 60, false, paint); // 绘制不封口的弧形

    }
}
