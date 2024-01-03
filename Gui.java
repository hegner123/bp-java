
import java.awt.*; 
import bpComponents.*;

public class Gui extends Frame {
    public Gui(String title) {
        super(title);
        setLayout(new FlowLayout());
        add(new Label(title));
        ButtonGroup testButtons = new ButtonGroup();
        testButtons.init();
        add(testButtons);
    }
}
