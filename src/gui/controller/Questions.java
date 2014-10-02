package gui.controller;
import java.util.Scanner;

import javax.swing.*;
public class Questions {
	private Scanner input;
	String myAnswer;
	public void start()
	{
		askQuestionsGUI();
	}
	
	private void askQuestionsGUI()
	{
		
		input = new Scanner(System.in);
		JOptionPane.showConfirmDialog(null, "What do you want for breakfast?");
		String myAnswer = JOptionPane.showInputDialog(null,"What do you want for breakfast?");
		myAnswer =  JOptionPane.showInputDialog(null,"Is that so well "+myAnswer+" does not sound very good to me.");
		
	}



}
