package com.test.abstraction;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LargeResponses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArrayList<Long> arrList=new ArrayList<>();
            System.out.print("Enter the file name with extension : ");

            Scanner input = new Scanner(System.in);
            File file = new File(input.nextLine());
            input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();               
                String[] lineArr=line.split("\t",-1);    
               // System.out.println(lineArr[7]);
                long bytes=Long.parseLong(lineArr[7]);
                if(bytes>5000){
                	arrList.add(bytes);
                }
                //System.out.println(line);
            }
            input.close();
            Long totalBytes=new Long(0);
            File outfile=new File("bytes_filename.txt");
            FileWriter fw=new FileWriter(outfile);
            fw.write(arrList.size());
            for(Long bytes:arrList){
            	totalBytes=totalBytes+bytes;
            }
            fw.write(totalBytes.toString());
            fw.flush();
            fw.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

	}

}
