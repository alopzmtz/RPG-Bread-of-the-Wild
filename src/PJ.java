package botw;

import java.awt.Color;
import java.awt.Graphics;

public class PJ extends Gobject {
	public PJ(int x, int y, ID id) {
		super(x, y, id);

	}

	public void tick() {
		x += velX;
		y += velY;
	}
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}
}