package com.company;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Panel(String name, int width, int height) {
        super.setName(name);
        super.setSize(width, height);
        super.setBorder(BorderFactory.createEtchedBorder());
    }
    Panel(String name, int width, int height, Component comp) {
        super.setName(name);
        super.setSize(width, height);
        super.setBorder(BorderFactory.createEtchedBorder());
        super.add(comp);
    }
    Panel(String name, int width, int height, LayoutManager layout) {
        super.setName(name);
        super.setSize(width, height);
        super.setBorder(BorderFactory.createEtchedBorder());
        super.setLayout(layout);
    }
    Panel(String name, int width, int height, LayoutManager layout, Component comp) {
        super.setName(name);
        super.setSize(width, height);
        super.setBorder(BorderFactory.createEtchedBorder());
        super.setLayout(layout);
        super.add(comp);
    }
}
