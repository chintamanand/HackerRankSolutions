/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
/**
 *
 * @author mahe
 */
public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void paint(Graphics g) {
        // TODO start asynchronous download of heavy resources
        g.drawString("Welcome to applets", 10,20);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
