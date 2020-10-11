import java.util.Timer;

public class ClickButton {
    public static void main(String args[])
    {
        ClickFrame f = new ClickFrame("Click Button");
        f.setVisible(true);
        Timer timer = new Timer();
        timer.schedule(new LocUpdate(f),
                0,        //initial delay
                300);  //subsequent rate

    }
}
