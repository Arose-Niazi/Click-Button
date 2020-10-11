import java.util.TimerTask;

public class LocUpdate extends TimerTask {
    ClickFrame f;

    public LocUpdate(ClickFrame f)
    {
        this.f = f;
    }

    public void run() {
        if (!f.isClicked()) {
            f.randomLocation();
        } else {
            cancel();
        }
    }
}
