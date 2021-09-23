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
g.drawLine(100,300,50,76);

g.setColor(Color.yellow);
g.drawRect(100,300,50,76);
g.drawOval(200,300,50,76);
}

}

