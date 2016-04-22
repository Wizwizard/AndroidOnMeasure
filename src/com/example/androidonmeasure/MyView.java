package com.example.androidonmeasure;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View{
	
	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
		//super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		setMeasuredDimension(measure(widthMeasureSpec),measure(heightMeasureSpec));
	}
	
	/**
	 * 完全自己自定义的方法哦，你甚至可以让不管设置什么都返回固定大小!
	 * @param measureSpec 传入的measureSpec
	 * @return 处理后的大小
	 */
	private int measure(int measureSpec){
		int result = 0;
		//分别获取测量模式 和 测量大小
		int specMode = MeasureSpec.getMode(measureSpec);
		int specSize = MeasureSpec.getSize(measureSpec);
		
		//如果是精确度模式，呢就按xml中定义的来
		if(specMode == MeasureSpec.EXACTLY){
			result = specSize;
		}
		//如果是最大值模式，就按我们定义的来
		else if(specMode == MeasureSpec.AT_MOST){
			result = 200;
		}
		
		return result;
	}
}
