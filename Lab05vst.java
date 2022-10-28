// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 620;
        int x1 = 10;
        int y1 = 630;
        int x2 = 990;
        int y2 = 630;
        g.drawRect(10,10,width,height);

        for(int k = 0;  k < 35; k++) {
            g.drawLine(x1, y1, x2, y2);
            x1+=28;
            y2-=18;
        }

         x1 = 10;
         y1 = 630;
         x2 = 990;
         y2 = 630;
        for(int k = 0;  k < 35; k++) {
            g.drawLine(x1, y1, x2, y2);
            y1 -= 18;
            x2 -= 28;
        }

        x1 = 990;
        y1 = 10;
        x2 = 10;
        y2 = 10;
        for(int k = 0;  k < 35; k++) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 18;
            x2 += 28;
        }

        x1 = 990;
        y1 = 10;
        x2 = 10;
        y2 = 10;
        for(int k = 0;  k < 35; k++) {
            g.drawLine(x1, y1, x2, y2);
            y2 += 18;
            x1 -= 28;
        }

    }
}

