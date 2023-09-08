package com.douglas.convesor.program;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class ImagePainter extends Canvas {

	private static final long serialVersionUID = 1L;

	private String imgFilename;
	
	public ImagePainter(String imgFilename) {
		this.imgFilename = imgFilename;
	}

	public void paint(Graphics graphics) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img = toolkit.getImage(imgFilename);
		graphics.drawImage(img, 120, 100, this);
	}
	
}
