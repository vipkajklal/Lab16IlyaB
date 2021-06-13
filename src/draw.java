import javax.swing.*;
import java.awt.*;

public class draw extends Canvas {
    public static void main(String[] args){
        JFrame frame = new JFrame("Drawing");
        Canvas canvas = new draw();
        canvas.setSize(600,400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(25,170,125, 90);
        g.drawLine(125, 90,225,170);
        g.drawRect(50, 150,150, 150 );
        g.drawRect(75, 200,50, 50 );
        g.drawArc(350,50,150,200,-70,325);
        g.drawLine(405,245,405,300);
        g.drawLine(450,245,450,300);
    }

}