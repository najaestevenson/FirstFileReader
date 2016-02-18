package com.coding.fileReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Writing {
	public static void main(String[] args) {
		String fileName = "/Users/najaestevenson/Documents/happy.txt";
		try{
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.newLine();
			bufferedWriter.write("So... I had a whole little poem here but when I wrote this it actually erased everything so... ughhhhhh!");
			bufferedWriter.write("So this is Me, adding to my Happy file");
			bufferedWriter.newLine();
			bufferedWriter.write("I love Java. I love my Class. Go you guys!");
			bufferedWriter.close();
		}
		catch(IOException ex){
			System.out.println("This isn't working try again!");
		}
	}

}
