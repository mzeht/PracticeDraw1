package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.PxDpUtil;

public class Practice2DrawCircleView extends View {


    int mWidth;
    int mHeight;
    int mRadius;

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        mWidth = getMeasuredWidth();
        mHeight = getMeasuredHeight();
        mRadius = mHeight / 5;
//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        Paint mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        Log.d("getdensity", String.valueOf(PxDpUtil.getdensity(getContext())));
        Log.d("getdensityDpi", String.valueOf(PxDpUtil.getdensityDpi((getContext()))));
        canvas.drawCircle(mWidth/3, mHeight/4, mRadius, mPaint);


        // 2.空心圆
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(PxDpUtil.dip2px(getContext(), 2));
        canvas.drawCircle((mWidth/3)*2, mHeight/4, mRadius, mPaint);

        // 3. 蓝色实心圆
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(mWidth/3, (mHeight/4)*3, mRadius, mPaint);

        // 4.线宽为20的空心圆
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(PxDpUtil.dip2px(getContext(), 20));
        mPaint.setColor(Color.BLACK);
        canvas.drawCircle((mWidth/3)*2, (mHeight/4)*3, mRadius, mPaint);

    }
}
