import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;



public class Main
{
    public JFrame win;
    public JLayeredPane swap;


    public Main()
    {
        makeWindow();
        makeStar(new int[]{50,50,50,100,36});//положение на экране по Х, положение на экране по Y, малый радиус, большой радиус, количество лучей
    }


    private void makeWindow()
    {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        panel.setOpaque(false);

        win = new JFrame("Star");
        swap = new JLayeredPane();
        swap = win.getLayeredPane();
        win.add(panel);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setResizable(false);
        win.getContentPane().setBackground(new Color(0,191,255));
        win.pack();
        win.setLayout(null);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }


    private void makeStar(int[] base)
    {
        int[] x = new int[base[4]*2];
        int[] y = new int[base[4]*2];

        for (int i = 0; i < base[4]*2; i++)
        {
            x[i] = (int)(((i%2)==0 ? base[3] : base[2])*Math.cos(((360/(base[4]*2)*i)-((360/(base[4]*2)/2)))*Math.PI/180))+0;
            y[i] = (int)(((i%2)==0 ? base[3] : base[2])*Math.sin(((360/(base[4]*2)*i)-((360/(base[4]*2)/2)))*Math.PI/180))+0;
        }

        BufferedImage bf = new BufferedImage(base[3]*2, base[3]*2, BufferedImage.TYPE_INT_ARGB);
        Graphics g = bf.createGraphics();

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(new Color(255,255,28));
        g2.translate(base[3], base[3]);
        g2.fillPolygon(x, y, base[4]*2);
        g2.dispose();

        JLabel jl = new JLabel();
        jl.setBounds(base[0], base[1], base[3]*2, base[3]*2);
        jl.setLayout(null);
        jl.setOpaque(false);
        jl.setIcon(new ImageIcon(bf));
        jl.setVisible(true);
        swap.add(jl, 0, 0);

        bf.flush();
    }


    public static void main(String[] args)
    {
        new Main();
    }
}
