package com.cafe24.paint.main;

import com.cafe24.paint.i.Drawable;
import com.cafe24.paint.point.ColorPoint;
import com.cafe24.paint.point.Point;
import com.cafe24.paint.shape.Circle;
import com.cafe24.paint.shape.Rect;
import com.cafe24.paint.shape.Shape;
import com.cafe24.paint.shape.Triangle;
import com.cafe24.paint.text.GraphicString;

public class MainApp {

	
	public static void main(String[] args) {
		// 점 찍기
		Point p1 = new Point(10, 20);
		draw(p1);
		
		// 색깔 점 찍기
		Point p2 = new ColorPoint(50,  100,  "red");
		draw(p2);
		
		// 점 지우기
		p1.show(false);
		p2.show(false);
		
		Shape triangle = new Triangle();
		draw(triangle);
		
		Shape rect = new Rect();
		draw(rect);
		
		Shape circle = new Circle();
		draw(circle);
		
		draw(new GraphicString("hello~~"));
		
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	


}
