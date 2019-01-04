package com.company;

import javax.swing.*;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Key;
// I NEED OPEN&SAVE VAR HERE
import static com.company.Frame.OandSmode;


/*
THAT CLASS LISTENS TO PANE
IN ORDER TO MANAGE IT
 */

public class PaneListener
        implements KeyListener{ // There will be 3 funcs override


    private JTextPane pane;
    // INIT PANE

    PaneListener(JTextPane pane) {
        this.pane = pane;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e){

        /*
        if (e.getKeyCode() == KeyEvent.VK_COLON) {
            //
            sb.delete(0, sb.length());
            sb.append(":");

        }
        */


        // OPEN FILE IF USER PRESSES "O"
        if (e.getKeyCode() == KeyEvent.VK_O) {
            if (!OandSmode) return;
            JFileChooser file = new JFileChooser();
            // create filer for format
            FileNameExtensionFilter filter = null;
            try {
                // Adding extensions : Java, C, C++, Python
                filter = new FileNameExtensionFilter("Text & Dev files",
                        "txt", "c", "cpp", "java", "py" );
            } catch (IllegalArgumentException exc) { // If extension is wrong
                System.exit(-1); // EMERGENCY
            }

            // use that filter by applying it into JFileChooser's method
            file.setFileFilter(filter);

            int retVal = file.showOpenDialog(file);

            if (retVal == JFileChooser.APPROVE_OPTION) {
                File openFile = file.getSelectedFile();
                // load from file
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_I){
            pane.setEditable(true);
            OandSmode = false;
            pane.setText("\r");
            if (e.getKeyCode() == KeyEvent.VK_ESCAPE) OandSmode = true;
        }

        // SAVE FILE IF USER PRESSES "S"
        if (e.getKeyCode() == KeyEvent.VK_S)   {
            if (!OandSmode) return;
            JFileChooser file = new JFileChooser();

            int retVal = file.showSaveDialog(file);

            if (retVal == JFileChooser.APPROVE_OPTION) {
                File savedFile = file.getSelectedFile();
                FileWriter writer = null;
                try {
                    writer = new FileWriter(savedFile);
                    pane.write(writer);
                    writer.close();
                } catch (IOException ex) {
                    System.exit(-1); // GO OUT IF EXCEPTION IS CAUGHT || EMERGENCY
                }
            }
        }

        // EXIT IF USER PRESSES "Q" OR "ESCAPE"
        if ((e.getKeyCode() == KeyEvent.VK_Q) || (e.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            if (!OandSmode) return;
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
