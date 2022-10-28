import java.awt.*;
import java.applet.*;

public class Temp extends Applet {
    public void paint(Graphics g){

        int width = 20;
        int height = 20;
        int x = 50;
        int y = 50;


        for(int k = 0;  k < 50; k++){

            g.drawOval(x,y,width,height );
            x+=50;
            y+=50;
      }

    }
}
