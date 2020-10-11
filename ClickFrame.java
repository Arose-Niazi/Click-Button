import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class ClickFrame extends JFrame {
    private final JButton clickButton;
    private Point location;

    public ClickFrame(String name)
    {
        super(name);
        clickButton = new JButton("CLICK ME!");

        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,500);

        add(clickButton);

        clickButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Wow! You did it!");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                location = clickButton.getLocation();
                clickButton.setLocation(setRandomButtonLocation());
            }

            private Point setRandomButtonLocation()
            {
                Random rand = new Random();
                int x = 0;
                do
                {
                    x = rand.nextInt(600);
                } while (x == (int) location.getX());
                int y = 0;
                do
                {
                    y = rand.nextInt(400);
                } while (y == (int) location.getY());

                return new Point(x,y);
            }
        });
    }
}
