package com.company;

import javax.swing.*;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
THAT CLASS PROVIDES INTERFACE FOR START PAGE
 */
public class Pane
        extends JTextPane{


    private final int    WIDTH  = 500;
    private final int    HEIGHT = 500;

    private final double VERSION = 0.1;
    private final int FONT_SIZE = 18;
    private final String FONT_FAM = "Arial";
    private final String MES = "Hello! This is Vim Emulator on Java!";

    Pane() {
        super();
        //String message = "Hello! This is Vim Emulator on Java!\nVersion: " + VERSION ;
        this.setText(MES);
        this.setEditable(false);


        SimpleAttributeSet attr = new SimpleAttributeSet();
        StyleConstants.setAlignment(attr, StyleConstants.ALIGN_CENTER);
        StyleConstants.setFontFamily(attr, FONT_FAM);
        StyleConstants.setFontSize(attr, FONT_SIZE);
        StyleConstants.setBackground(attr, Color.black);
        StyleConstants.setForeground(attr, Color.blue); // Font Color
        StyleConstants.setSpaceAbove(attr, HEIGHT/2 - 2*FONT_SIZE); // Here might be CENTER
        //StyleConstants.setSpaceBelow(attr, HEIGHT/2 );

        this.setParagraphAttributes(attr, true);

        /*
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_COLON) {
                    //
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        }); */

    }

}
