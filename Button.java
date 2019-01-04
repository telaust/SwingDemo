package com.company;

import javax.swing.*;

public class Button
        extends JButton {

    Button(String title) {
        super(title);
    }
    Button(String title, int width, int height) {
        super(title);
        this.setSize(width, height);
    }
}
