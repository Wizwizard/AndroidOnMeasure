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
	 * ��ȫ�Լ��Զ���ķ���Ŷ�������������ò�������ʲô�����ع̶���С!
	 * @param measureSpec �����measureSpec
	 * @return �����Ĵ�С
	 */
	private int measure(int measureSpec){
		int result = 0;
		//�ֱ��ȡ����ģʽ �� ������С
		int specMode = MeasureSpec.getMode(measureSpec);
		int specSize = MeasureSpec.getSize(measureSpec);
		
		//����Ǿ�ȷ��ģʽ���ؾͰ�xml�ж������
		if(specMode == MeasureSpec.EXACTLY){
			result = specSize;
		}
		//��������ֵģʽ���Ͱ����Ƕ������
		else if(specMode == MeasureSpec.AT_MOST){
			result = 200;
		}
		
		return result;
	}
}
