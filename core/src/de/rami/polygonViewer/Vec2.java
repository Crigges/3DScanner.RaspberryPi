package de.rami.polygonViewer;

/**
 * Wraapper-Klasse f�r einen zweidimensionalen Punkt
 *
 */
public class Vec2 {
	
	public float x, y = 0;
	
	/** returns a new vector */
	public static Vec2 vec2(float x, float y){
		return new Vec2(x, y);
	}
	
	public Vec2(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Gibt einen auf eins normierten Vektor zur�ck, der in die Richtung des Winkels zeigt.
	 * @param ang
	 * @return
	 */
	public static Vec2 degreesToVec(float ang){
		return vec2((float) Math.cos(Math.toRadians(ang)), (float) Math.sin(Math.toRadians(ang)));
	}
		
	
	public Vec2 mul(float f){
		return vec2(this.x * f, this.y * f);
	}
}
