package gui;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextArea;

public class MyJTextArea extends JTextArea {

	private static final long serialVersionUID = 1L;
	
	String hint;
	Boolean changed=false;

	public MyJTextArea(String text) {
		super(text);
		this.hint=text;
		this.setText(hint);
		
		
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				changed=true;
			}
		});
		
		this.addFocusListener(new FocusAdapter() {
			
			@Override
			public void focusGained(FocusEvent e) {
				super.focusGained(e);
				if(!changed)
					setText("");
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				super.focusLost(e);
				if(!changed) {
					setText(hint);
				}
			}
		});
		
	}


}