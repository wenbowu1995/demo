package testCoupon;

import java.awt.*;

class TrayIconDemo {
    private static TrayIconDemo instance = new TrayIconDemo();
    private SystemTray tray;
    private Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
    private TrayIcon trayIcon;
    void message(String content) throws AWTException {
        if (tray==null){
            tray = SystemTray.getSystemTray();
            trayIcon = new TrayIcon(image, "Tray Demo");
            trayIcon.setImageAutoSize(true);
            tray.add(trayIcon);
            trayIcon.displayMessage(content, "", TrayIcon.MessageType.NONE);
        }else {
            trayIcon.displayMessage(content, "", TrayIcon.MessageType.NONE);
        }
    }
    private TrayIconDemo(){}

    public static TrayIconDemo getInstance(){
        return instance;
    }
    public static void main(String[] args) throws AWTException {
        TrayIconDemo.getInstance().message("22");
    }
}

