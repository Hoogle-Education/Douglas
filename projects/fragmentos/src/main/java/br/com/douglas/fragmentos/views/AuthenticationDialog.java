package br.com.douglas.fragmentos.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

import br.com.douglas.fragmentos.model.Usuario;

public class AuthenticationDialog{

	private JDialog dialog;
	private JButton button;
	private JTextField emailTextField, usernameTextField, passwordTextField;
	private Usuario user;
	
	public AuthenticationDialog() {
		JFrame frame = new JFrame();
		dialog = new JDialog(frame, "Autentique seu usário!", true);
		dialog.setLayout(null);
		button = new JButton("Autenticar");
	
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				user = new Usuario();
				user.setEmail(emailTextField.getText());
				user.setPassword(passwordTextField.getText());
				user.setUsername(usernameTextField.getText());
				dialog.setVisible(false);				
			}
		});
		
		emailTextField = new JTextField("Email: ");
		usernameTextField = new JTextField("Username: ");
		passwordTextField = new JTextField("Password: ");
		
		emailTextField.setBounds(50, 30, 150, 30);
		usernameTextField.setBounds(50, 80, 150, 30);
		passwordTextField.setBounds(50, 130, 150, 30);
		button.setBounds(50, 180, 150, 30);
		
		dialog.add(emailTextField);
		dialog.add(usernameTextField);
		dialog.add(passwordTextField);
		
		dialog.add(button);
		dialog.setSize(250, 300);
		dialog.setVisible(true);
	}
	
	public Usuario getUsuario() {
		return this.user;
	}
	
}
