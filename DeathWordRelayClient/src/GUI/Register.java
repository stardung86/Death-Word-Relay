package GUI;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Register extends JFrame {
	Login myLogin;
	
	private Container cont;
	
	private ImageIcon idImg = new ImageIcon("Img/idLb.png");
	private ImageIcon pwImg = new ImageIcon("Img/pwLb.png");
	private ImageIcon nickImg = new ImageIcon("Img/nickLb.png");
	private ImageIcon submitImg = new ImageIcon("Img/submitBt.png");
	private ImageIcon cancelImg = new ImageIcon("Img/cancelBt.png");
	
	
	private JTextField IDtxt = new JTextField();
	private JTextField PWtxt = new JTextField();
	private JTextField NickNametxt = new JTextField();
	
	JButton SubmitBtn = new JButton(submitImg);
	JButton CancelBtn = new JButton(cancelImg);
	
	JLabel IDlbl = new JLabel(idImg);
	JLabel PWlbl = new JLabel(pwImg);
	JLabel NickNamelbl = new JLabel(nickImg);
	
	JLabel IDCautionlbl = new JLabel("at least 6 to 12 chracters");
	JLabel IDCautionlbl2 = new JLabel("only english and number accepted");
	JLabel PWCautionlbl = new JLabel("at least 6 to 12 chracters");
	JLabel NickNameCautionlbl = new JLabel("at least 1 to 12 chracters");
	
	public Register(){
		super("Register");
		
		this.getContentPane().setLayout(null);
		this.setBounds(0, 0, 470, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		cont = this.getContentPane();
		
		SubmitBtn.setBounds(60, 230, submitImg.getIconWidth(), submitImg.getIconHeight());
		SubmitBtn.setBackground(Color.red);
		SubmitBtn.setBorderPainted(false);
		SubmitBtn.setFocusPainted(false);
		SubmitBtn.setContentAreaFilled(false);


		
		
		CancelBtn.setBounds(222, 230, cancelImg.getIconWidth(), cancelImg.getIconHeight());
		CancelBtn.setBackground(Color.red);
		CancelBtn.setBorderPainted(false);
		CancelBtn.setFocusPainted(false);
		CancelBtn.setContentAreaFilled(false);

		
				
		
		IDlbl.setBounds(43, 34, idImg.getIconWidth(), idImg.getIconHeight());
		IDtxt.setBounds(190, 34, 172, 26);
		PWlbl.setBounds(43, 105, pwImg.getIconWidth(), pwImg.getIconHeight());
		PWtxt.setBounds(190, 105, 172, 26);
		NickNamelbl.setBounds(40, 160, nickImg.getIconWidth(), nickImg.getIconHeight());
		NickNametxt.setBounds(190, 160, 172, 26);
		
		IDCautionlbl.setBounds(223, 60, 200, 16);
		IDCautionlbl.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		IDCautionlbl2.setBounds(220, 80, 200, 16);
		IDCautionlbl2.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		PWCautionlbl.setBounds(223, 135, 200, 16);
		PWCautionlbl.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		NickNameCautionlbl.setBounds(223, 192, 200, 16);
		NickNameCautionlbl.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		
		cont.add(SubmitBtn);
		cont.add(CancelBtn);
		cont.add(NickNamelbl);
		cont.add(NickNametxt);
		cont.add(IDlbl);
		cont.add(IDtxt);
		cont.add(PWlbl);
		cont.add(PWtxt);
		cont.add(IDCautionlbl);
		cont.add(IDCautionlbl2);
		cont.add(PWCautionlbl);
		cont.add(NickNameCautionlbl);
		cont.setBackground(Color.white);
		
	}
}
