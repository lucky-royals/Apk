import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
	<applet code = KeyEventDemo.class height = "500" width = "500">
	</applet>
*/
public class KeyEventDemo extends Applet implements KeyListener
{
	public void init()
	{
		String msg = "";
		addKeyListener(this);
	}
	
	public void keyTyped(KeyEvent ke)
	{
		msg += ke.getKeyChar();//"KEY IS TYPED";
		repaint();
	}
	public void keyPressed(KeyEvent ke)
	{
		//msg += "KEY IS PRESSED";
		//repaint();
		showstatus(KEY IS PRESSED);
	}
	public void keyReleased(KeyEvent ke)
	{
		//msg += "KEY IS RELEASED";
		//repaint();
		showstatus(KEY IS RELEASED);
	}
	public void paint(Graphics gp)
	{
		gp.drawString(msg, 50, 100);
	}
}