import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class ClickFrame extends JFrame {
    private final JButton clickButton;
    private boolean clicked;

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
                clicked=true;
                JOptionPane.showMessageDialog(null,"Wow! You did it!");
            }
        });
    }

    public boolean isClicked() {
        return clicked;
    }

    public void randomLocation()
    {
        clickButton.setLocation(setRandomButtonLocation());
    }

    private Point setRandomButtonLocation()
    {
        Random rand = new Random();
        int x = 0;
        do
        {
            x = rand.nextInt(600);
        } while (x == clickButton.getX());
        int y = 0;
        do
        {
            y = rand.nextInt(400);
        } while (y == clickButton.getY());

        return new Point(x,y);
    }
}
