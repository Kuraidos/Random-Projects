package com.company;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {

    public static void main(String[] args) throws IOException {
	File preProcessFile= new File("C:\\Users\\serel\\Desktop\\Desertation\\fused2\\fused\\config\\fused-outputs\\ext.tab");
	File postProcessFile = new File("C:\\Users\\serel\\Desktop\\Desertation\\fused2\\fused\\config\\fused-outputs\\post-process-ext.csv");

	Scanner reader = new Scanner(preProcessFile);
	FileWriter myWriter= new FileWriter(postProcessFile);

        boolean firstLine=true;
        while (reader.hasNextLine())
        {

            String data = reader.nextLine();
            String[] splitValues= data.split(" ");

            for(int i=0;i<splitValues.length;i++)
            {

                myWriter.append(splitValues[i]);
                if(i+1==splitValues.length)
                {
                    if(firstLine)
                    {
                        firstLine=false;
                        myWriter.append(",Power");
                    }
                    else
                    {
                        myWriter.append(","+(Double.parseDouble(splitValues[1])*Double.parseDouble(splitValues[2])));
                    }
                    myWriter.append("\n");
                }
                else
                {
                    myWriter.append(",");
                }
            }
        }
    reader.close();
    myWriter.close();
}}
