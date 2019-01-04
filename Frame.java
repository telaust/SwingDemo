package com.company;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Key;


public class Frame
        extends JFrame{

    // private final double VERSION = 0.1;
    private final int    WIDTH  = 500;
    private final int    HEIGHT = 500;
    // OPEN AND SAVE MODE is ENABLE NOW
    public static boolean OandSmode = true;

    Frame(String title) { // Extends JFrame's constructor
        super(title);

        setDefaultLookAndFeelDecorated(true); // Look&Feel

        setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        setSize(new Dimension(WIDTH, HEIGHT));

        /* INIT PANE */
        Pane pane = new Pane();


        var sb = new StringBuilder("[No file chosen]");

        // We've got label at left bottom
        // Here will be MODEs
        JLabel sbar = new JLabel(sb.toString());

        // Но чуть правее будет JTextField, куда мы будем писать команды


        /* INIT TEXT AREA */ /*
        String msg = "mes";

        String message = "Hello! This is Vim Emulator on Java!\nVersion: " + VERSION + "\n";
        var area = new JTextArea();

        area.setText(message);
        area.setEditable(false); // Сразу отнимаем возмодность печатать в area
        area.setOpaque(false);


        // make text area scrollable
        var spane = new JScrollPane(area);
        // make lines wrap if they are too long to fit the width
        area.setLineWrap(true);
        // words will be wrapped by white spaces
        area.setWrapStyleWord(true); */

        var spane = new JScrollPane(pane); // make it scrollable




        // Layout
        createLayout(spane, sbar);

        // LISTEN TO PANE
        PaneListener paneListener = new PaneListener(pane);
        pane.addKeyListener(paneListener);

        /* // FOR AREA
        area.addKeyListener(new KeyListener(){
            // Считываем клавиши :: слушаем JTextArea
            @Override
            public void keyPressed(KeyEvent e){
                // Тут все возможные hot keys in vim

                // Motion UP
                if (e.getKeyCode() == KeyEvent.VK_K || e.getKeyCode() == KeyEvent.VK_UP ){
                    //

                    var a = e.getKeyCode() ;
                    a = KeyEvent.VK_UP;

                    area.setEditable(false); // отнимаем возможность печатать что-либо




                    System.out.println("up");
                }

                // Motion DOWN
                if (e.getKeyCode() == KeyEvent.VK_J || e.getKeyCode() == KeyEvent.VK_DOWN ){


                    System.out.println("down");
                }

                // Motion LEFT
                if (e.getKeyCode() == KeyEvent.VK_H || e.getKeyCode() == KeyEvent.VK_LEFT ){


                    System.out.println("left");
                }

                // Motion RIGHT
                if (e.getKeyCode() == KeyEvent.VK_L || e.getKeyCode() == KeyEvent.VK_RIGHT ){


                    System.out.println("right");
                }



            }

            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("typed");
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("rel");
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        }); */

        setVisible(true);
        setLocationRelativeTo(null);
    }

    private void createLayout(JComponent... args) {

        var pane = getContentPane();
        var gl = new GroupLayout(pane);

        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(gl.createParallelGroup()
            .addComponent(args[0])
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addComponent(args[0])
        );
    }

}
