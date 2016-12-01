/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eos.io;

import java.awt.Rectangle;

import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;
import java.awt.Color;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

/**
 *
 * @author M. Dommert
 * 
 * Utility class which extends JTextPane. 
 * AppendingTextPane introduces a new class based on javax.swing.JTextPane and 
 * extends JTextPane with an appendText method. The appendText method can be
 * used to add text (string format) to existing TextPane. 
 * 
 * Usage: 
 *      - in JFrame create new AppendingTextPane object
 *              AppendingTextPane newPane = new AppendingTextPane();
 *      - add text via .appendText(XXXX)
 * 
 * Methods available:
 *      - appendText:               plain, black
 *      - appendTextMajor:          bold, black
 *      - appendTextErrorMajor:     bold, red
 *      - appendTextErrorMinor:     plain, red
 *      . appendTextSuccess:        bold, blue
 * 
 */
public class AppendingTextPane extends JTextPane {
    public AppendingTextPane() {
        super();
    }

    public AppendingTextPane(StyledDocument doc) {
        super(doc);
    }
    
    // Appends text to the document and ensure that it is visible
    public void appendText(String text) {
        try {
            StyledDocument doc = (StyledDocument) getDocument();
            // set font style
            Style style = doc.addStyle("StyleName", null);
            // Insert the text
            getDocument().insertString(getDocument().getLength(), text, style);
            // Convert the new end location
            // to view co-ordinates
            Rectangle r = modelToView(doc.getLength());
            // Finally, scroll so that the new text is visible
            if (r != null) {
                scrollRectToVisible(r);
            }
        } catch (BadLocationException e) {
            System.out.println("Failed to append text: " + e);
        }
    }
    
    public void appendTextMajor(String text) {
        try {
            StyledDocument doc = (StyledDocument) getDocument();
            // set font style
            Style style = doc.addStyle("StyleName", null);
            StyleConstants.setForeground(style, Color.BLACK);
            StyleConstants.setBold(style, true);
            // Insert the text
            getDocument().insertString(getDocument().getLength(), text, style);
            // Convert the new end location
            // to view co-ordinates
            Rectangle r = modelToView(doc.getLength());
            // Finally, scroll so that the new text is visible
            if (r != null) {
                scrollRectToVisible(r);
            }
        } catch (BadLocationException e) {
            System.out.println("Failed to append text: " + e);
        }
    }
    
    public void appendTextErrorMinor(String text) {
        try {
            StyledDocument doc = (StyledDocument) getDocument();
            // set font style
            Style style = doc.addStyle("StyleName", null);
            StyleConstants.setForeground(style, Color.RED);
            // Insert the text
            getDocument().insertString(getDocument().getLength(), text, style);
            // Convert the new end location
            // to view co-ordinates
            Rectangle r = modelToView(doc.getLength());
            // Finally, scroll so that the new text is visible
            if (r != null) {
                scrollRectToVisible(r);
            }
        } catch (BadLocationException e) {
            System.out.println("Failed to append text: " + e);
        }
    }
    
    public void appendTextErrorMajor(String text) {
        try {
            StyledDocument doc = (StyledDocument) getDocument();
            // set font style
            Style style = doc.addStyle("StyleName", null);
            StyleConstants.setForeground(style, Color.RED);
            StyleConstants.setBold(style, true);
            // Insert the text
            getDocument().insertString(getDocument().getLength(), text, style);
            // Convert the new end location
            // to view co-ordinates
            Rectangle r = modelToView(doc.getLength());
            // Finally, scroll so that the new text is visible
            if (r != null) {
                scrollRectToVisible(r);
            }
        } catch (BadLocationException e) {
            System.out.println("Failed to append text: " + e);
        }
    }
    
        public void appendTextSuccess(String text) {
        try {
            StyledDocument doc = (StyledDocument) getDocument();
            // set font style
            Style style = doc.addStyle("StyleName", null);
            StyleConstants.setForeground(style, Color.BLUE);
            StyleConstants.setBold(style, true);
            // Insert the text
            getDocument().insertString(getDocument().getLength(), text, style);
            // Convert the new end location
            // to view co-ordinates
            Rectangle r = modelToView(doc.getLength());
            // Finally, scroll so that the new text is visible
            if (r != null) {
                scrollRectToVisible(r);
            }
        } catch (BadLocationException e) {
            System.out.println("Failed to append text: " + e);
        }
    }
    
}