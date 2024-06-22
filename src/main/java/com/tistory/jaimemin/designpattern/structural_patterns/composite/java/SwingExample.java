package com.tistory.jaimemin.designpattern.structural_patterns.composite.java;

import javax.swing.*;

public class SwingExample {

	/**
	 * JFrame, JTextField, JButton 다 타고타고 들어가면 Component에서 만나게 됨
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		JTextField textField = new JTextField();
		textField.setBounds(200, 200, 200, 40);
		frame.add(textField);

		JButton button = new JButton("click");
		button.setBounds(200, 100, 60, 40);
		button.addActionListener(e -> textField.setText("Hello Swing"));
		frame.add(button);

		frame.setSize(600, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
