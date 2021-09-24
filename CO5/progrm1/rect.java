import java.awt.*;
import java.applet.Applet;

/*
<applet code="rect"  width=400 height=500>
</applet>
*/
public class rect extends Applet
{
public void init()
{
 setBackground(Color.blue);
}
public void paint(Graphics g)
{
g.drawLine(10,10,50,10);
g.setColor(Color.yellow);
g.drawRect(70,10,35,50);
g.drawOval(150,10,100,100);
}

}

