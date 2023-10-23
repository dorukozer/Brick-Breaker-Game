package domain;

import java.awt.Point;

import java.util.Timer;

import domain.timertask.UpdateExplosiveParticleTask;

public class GiftBox {

	int deltaX, deltaY, x, y;
	private static int radius = 5;
	private boolean drawable;
	private String color;

	public boolean isDrawable() {
		return drawable;
	}

	public void setDrawable(boolean drawable) {
		this.drawable = drawable;
	}

	Timer timer;
	UpdateExplosiveParticleTask timerTask;
	DownwardPath myPath;

	public GiftBox() {
		myPath = new DownwardPath();
		drawable = true;
	}

	public int getDeltaX() {
		return deltaX;
	}

	public void setDeltaX(int deltaX) {
		this.deltaX = deltaX;
	}

	public int getDeltaY() {
		return deltaY;
	}

	public void setDeltaY(int deltaY) {
		this.deltaY = deltaY;
	}

	public static int getRadius() {
		return radius;
	}

	public static void setRadius(int radius) {
		GiftBox.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	public UpdateExplosiveParticleTask getTimerTask() {
		return timerTask;
	}

	public void setTimerTask(UpdateExplosiveParticleTask timerTask) {
		this.timerTask = timerTask;
	}

	public DownwardPath getMyPath() {
		return myPath;
	}

	public void setMyPath(DownwardPath myPath) {
		this.myPath = myPath;
	}

	public void move() {
		Point p = myPath.nextPosition();
		this.x = (int) p.getX();
		this.y = (int) p.getY();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;

	}

	public void setUpwardPathY(int y) {
		myPath.setY(y);
	}

	public void setUpwardPathX(int x) {
		myPath.setX(x);
	}
}