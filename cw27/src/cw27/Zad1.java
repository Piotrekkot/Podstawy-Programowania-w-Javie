package cw27;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;

public class Zad1 {

	public static void main(String[] args) {
		Scanner scan = null;
		try{
			scan = new Scanner(new File("C:/Users/s13830/Desktop/MonaLisa.ppm"));
			
		}catch(IOException e){
			System.out.println(e);
			
		}
		
		int width = 357;
		int height = 353;
		
		
		BufferedImage img = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		for(int i=0;i<height;i++){
			for(int j=0;j<(width);j++){
				int red = scan.nextInt();
				int green = scan.nextInt();
				int blue = scan.nextInt();
				
				Color color = new Color(red, green, blue);
				
				img.setRGB(j,i,color.getRGB());
			}
			
		}
		
		final JFrame f = new JFrame("MonaLisa");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new JLabel(new ImageIcon(img)));
		f.pack();
		f.setVisible(true);

	}

}
