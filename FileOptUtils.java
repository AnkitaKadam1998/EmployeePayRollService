package com.day27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileOptUtils 
// check isExist
{
	public void isFileExits(String path)
	{
		File file = new File(path);
		if(file.exists())
			System.out.println("File exits");
		else
			System.out.println("File does not exits ");
	}
	
	//List of file and folder
	
	public void listOfFilesandFolder(String path) {
		File dir = new File(path);
		File [] files=dir.listFiles();
		if (files.length == 0) {
		    System.out.println("The directory is empty");
		} else {
		    for (File aFile : files) {
		        System.out.println(aFile.getName() + " - " + aFile.length());
		    }
		}
	} 
	
	//create a folder
	
	public void createFolder(String path)
	{
		File folder = new File(path);
		if(!folder.exists())
		{
			folder.mkdirs();
			System.out.println(path+"Folder create");
		}
		else
		{
			System.out.println(path+"Folder already exist");
			
		}
	}
	
	//delete folder
		public void deleteFloder(String dir)throws IOException
		{
			File files = new File(dir);
			String pathDir = files.getAbsolutePath();
			
		Path path = Paths.get(pathDir);
		
		try
		{
			Files.delete(path);
			System.out.println(path+" Deleted successfully" );
		}
		catch(IOException e)
		{
			System.out.println(path+"does not exits");
			e.printStackTrace();	
		}
		}
		
		//create file
		
		public void createFile(String path)
		{
			File file = new File(path);
			try 
			{
				file.createNewFile();
				System.out.println(path+"File created successfully");
			}
			catch(IOException e)
			{
				System.out.println(path+"Unable to create file");
				e.printStackTrace();
			}
		}
		
		//write a file
		
		public void writeFile(String path)
		{
			try
			{
				FileWriter filewriter = new FileWriter(path);
				filewriter.write("This is first file");
				filewriter.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
		
		//readfile
		
		public void readFile(String path)
		{
			File file = new File(path);
			try
			{
				Scanner scan = new Scanner(file);
				while(scan.hasNextLine())
				{
					String line = scan.nextLine();
					System.out.println(line);
				}
				scan.close();
			}catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
		}
}
