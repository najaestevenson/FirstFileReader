package com.coding.fileReader;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Reader {
	public static void main(String [] args) {

		try (BufferedReader bf = new BufferedReader(new FileReader("/Users/najaestevenson/Documents/happy.txt"))){
//			File myFile = new File("/Users/najaestevenson/Documents/happy.txt");
//			FileReader fileReader = new FileReader(myFile);
//			BufferedReader reader = new BufferedReader(fileReader);
			
			String line = null;
			while((line = bf.readLine()) !=null){
				System.out.println(line);
			}
			//reader.close();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}


