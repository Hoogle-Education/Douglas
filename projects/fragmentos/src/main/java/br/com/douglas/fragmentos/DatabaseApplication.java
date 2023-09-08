package br.com.douglas.fragmentos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;

import br.com.douglas.fragmentos.model.Usuario;
import br.com.douglas.fragmentos.views.AuthenticationDialog;
public class DatabaseApplication implements ActionListener {
	
	JFrame home = new JFrame();
	JTable tableOfFragmentos;
	JMenuBar menuBar;
	JMenu menuArquivo, menuAjuda;
	JMenuItem menuItemAutenticar, menuItemSair, menuItemAjuda, menuItemSobre;
	Usuario usuario = null;	
	
	public DatabaseApplication() {
		
				
//		JScrollPane scroll = new JScrollPane(tableOfFragmentos);
//		home.add(scroll);
//		
//		scroll.addComponentListener(new ComponentAdapter() {
//			@Override
//			public void componentResized(ComponentEvent event) {
//				final double NUMERIC_SIZE_CONSTRAINT = 1/100;
//				final double FILENAME_SIZE_CONSTRAINT = 5/100;
//				
//				int numericFieldWidth = (int) Math.floor(scroll.getWidth() * NUMERIC_SIZE_CONSTRAINT);
//				int fileFieldWith = (int) Math.floor(scroll.getWidth() * FILENAME_SIZE_CONSTRAINT);
//				
//				tableOfFragmentos.getColumnModel().getColumn(0).setPreferredWidth(numericFieldWidth);
//				tableOfFragmentos.getColumnModel().getColumn(1).setPreferredWidth(fileFieldWith);
//				tableOfFragmentos.getColumnModel().getColumn(2).setPreferredWidth(fileFieldWith);
//				tableOfFragmentos.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
//			}
//		});
		
		addMenu();
		
		home.setSize(1080, 720);
		home.setTitle("Analisador de fragmentos.");
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		home.setLayout(null);
		home.setVisible(true);
	}

	public static void main(String[] args) {		
		new DatabaseApplication();	
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		switch(event.getActionCommand()) {
			case "Sair" -> System.exit(0);
			case "Autenticar" -> {
				AuthenticationDialog authenticationDialog = new AuthenticationDialog();
				usuario = authenticationDialog.getUsuario();
				System.out.println("Usuario registrado: " + usuario);
			}
			case "Ajuda" -> {
				
			}
			case "Sobre" -> {
				System.out.println((new File("").getAbsolutePath()));
				File projectRoot = new File("");
				String imgPath = projectRoot.getAbsolutePath() + "\\src\\main\\resources\\assets\\profile.png";
				BufferedImage picture;
				try {
					picture = ImageIO.read(new File(imgPath));
					JLabel pictureLabel = new JLabel(new ImageIcon(picture));
					home.setVisible(false);
					home.add(pictureLabel);
					home.setVisible(true);
				} catch (IOException e) {
					System.out.println("Unable to load images!");
				}
			}
		}
	}
	
	public void addMenu() {
		menuBar = new JMenuBar();
		
		menuArquivo = new JMenu("Arquivo");
		menuArquivo.setMnemonic(KeyEvent.VK_A);
		
		menuItemAutenticar = new JMenuItem("Autenticar");
		menuItemAutenticar.setMnemonic(KeyEvent.VK_A);
		menuItemAutenticar.addActionListener(this);
		menuArquivo.add(menuItemAutenticar);
		
		menuItemSair = new JMenuItem("Sair");
		menuItemSair.setMnemonic(KeyEvent.VK_E);
		menuItemSair.addActionListener(this);
		menuArquivo.add(menuItemSair);
		
		menuAjuda = new JMenu("Ajuda");
		
		menuItemAjuda = new JMenuItem("Ajuda");
		menuItemAjuda.setMnemonic(KeyEvent.VK_H);
		menuItemAjuda.addActionListener(this);
		menuAjuda.add(menuItemAjuda);
		
		
		menuItemSobre = new JMenuItem("Sobre");
		menuItemSobre.setMnemonic(KeyEvent.VK_S);
		menuItemSobre.addActionListener(this);
		menuAjuda.add(menuItemSobre);
		
		menuBar.add(menuArquivo);
		menuBar.add(menuAjuda);
		
		home.setJMenuBar(menuBar);
	}

	private Usuario requestUserAuthenticationDialog() {
		Usuario user = new Usuario();
		
		
		
		return user;
	}
	
}
