package com.cafe24.paint.point;

public class ColorPoint extends Point {
	
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);  // 부모에 기본 생성자가 없을경우, 거기 있는 생성자에 맞춰 넣으면 됨
		this.color = color;
	}

	@Override
	public void show() {
		System.out.println("좌표 (" + this.x + ", " + this.y + ")에 "+ this.color +"점을 찍었습니다.");
	}
	
	

}
