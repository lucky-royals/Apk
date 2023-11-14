import java.applet.Applet;
import java.awt.Graphics;

/*
	<applet code = MyApplet.class height = "500" width = "500">
	</applet>
*/
class MyApplet extends Applet
{
	int x, y;
	String str;

	public void init()
	{
		x = 100;
		y = 200;
		str = "This is my World";
	}
	public void paint(Graphics gp)
	{
		gp.drawString(str, x, y);
	}
}