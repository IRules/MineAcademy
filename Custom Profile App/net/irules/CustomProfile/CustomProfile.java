package net.irules.CustomProfile;

import javax.swing.*;
import java.io.IOException;

public class CustomProfile {

	public static void main(String[] args) throws IOException {
//		CustomerProfile customerProfile = new CustomerProfile();
//
//		// BufferReader to read console ( even in IDE conditions )
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//		/*
//		* Used in the tutorial from MineAcademy, but I prefer BufferedReader
//		Scanner scanner = new Scanner(System.in);
//		 */
//
//		System.out.print("What is your name?" + "\n Answer: ");
//		String name = bufferedReader.readLine();
//
//		System.out.println("Hi, " + name);
//	}


		String name = JOptionPane.showInputDialog("What is your name?");

		JOptionPane.showMessageDialog(null, "Hi, " + name + "!");

		int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age name?"));

		JOptionPane.showMessageDialog(null, "Your age is: " + age);
	}
}
