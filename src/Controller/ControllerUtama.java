package Controller;

import View.MenuUtama;

public class ControllerUtama {
    private MenuUtama frame;
    public ControllerUtama(MenuUtama frame) {
        this.frame = frame;
    }
    public void hide() {
        frame.setVisible(false);
    }
    public void quit() {
        frame.dispose();
    }
}
