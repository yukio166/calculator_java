package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ui extends JFrame {
	
	double v1,v2,r;
	String op,out;
	
	private JPanel contentPane;
	private JTextField outPut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui frame = new ui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui() {
		
		/*não sei o pq a variavel que eu criar aqui não vai funcionar
		*pode ser que não esteja na diretamente no "public class ui extends JFrame"
		*não é isso :(
		*/
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		outPut = new JTextField();
		outPut.setBounds(10, 84, 458, 93);
		contentPane.add(outPut);
		outPut.setColumns(10);
		
		JButton bnt7 = new JButton("7");
		bnt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=outPut.getText()+bnt7.getText();
				outPut.setText(n);//vai mostrar o n
			}
		});
		bnt7.setBounds(10, 260, 85, 87);
		contentPane.add(bnt7);
		
		JButton bnt8 = new JButton("8");
		bnt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=outPut.getText()+bnt8.getText();
				outPut.setText(n);//vai mostrar o n
			}
		});
		bnt8.setBounds(105, 260, 85, 87);
		contentPane.add(bnt8);
		
		JButton bnt9 = new JButton("9");
		bnt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=outPut.getText()+bnt9.getText();
				outPut.setText(n);//vai mostrar o n
			}
		});
		bnt9.setBounds(200, 260, 85, 87);
		contentPane.add(bnt9);
		
		JButton bnt4 = new JButton("4");
		bnt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=outPut.getText()+bnt4.getText();
				outPut.setText(n);//vai mostrar o n
			}
		});
		bnt4.setBounds(10, 357, 85, 87);
		contentPane.add(bnt4);
		
		JButton bnt5 = new JButton("5");
		bnt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=outPut.getText()+bnt5.getText();
				outPut.setText(n);//vai mostrar o n
			}
		});
		bnt5.setBounds(105, 357, 85, 87);
		contentPane.add(bnt5);
		
		JButton bnt6 = new JButton("6");
		bnt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=outPut.getText()+bnt6.getText();
				outPut.setText(n);//vai mostrar o n
			}
		});
		bnt6.setBounds(200, 357, 85, 87);
		contentPane.add(bnt6);
		
		JButton bnt1 = new JButton("1");
		bnt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// n é o nome da string para que aparesa no outPut
				String n=outPut.getText()+bnt1.getText();
				outPut.setText(n);//vai mostrar o n
			}
		});
		bnt1.setBounds(10, 454, 85, 87);
		contentPane.add(bnt1);
		
		JButton bnt2 = new JButton("2");
		bnt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// n é o nome da string para que aparesa no outPut
				String n=outPut.getText()+bnt2.getText();
				outPut.setText(n);//vai mostrar o n
			}
		});
		bnt2.setBounds(105, 454, 85, 87);
		contentPane.add(bnt2);
		
		JButton bnt3 = new JButton("3");
		bnt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=outPut.getText()+bnt3.getText();
				outPut.setText(n);//vai mostrar o n
			}
		});
		bnt3.setBounds(200, 454, 85, 87);
		contentPane.add(bnt3);
		
		JButton bnt0 = new JButton("0");
		bnt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=outPut.getText()+bnt0.getText();
				outPut.setText(n);//vai mostrar o n
			}
		});
		bnt0.setBounds(10, 551, 275, 62);
		contentPane.add(bnt0);
		
		JButton bntSubitracao = new JButton("-");
		bntSubitracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v1=Double.parseDouble(outPut.getText());//vai guardar o n1 em uma variavel
				outPut.setText(""); //vai apagar a area para digitar um novo numero
				op="-";//meia noite te conto
			}
		});
		bntSubitracao.setBounds(330, 308, 64, 87);
		contentPane.add(bntSubitracao);
		
		JButton bntClear = new JButton("CE");
		bntClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			outPut.setText(null);//vou nem falar
			}
		});
		bntClear.setBounds(330, 260, 64, 38);
		contentPane.add(bntClear);
		
		JButton bntSoma = new JButton("+");
		bntSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v1=Double.parseDouble(outPut.getText());//vai guardar o n1 em uma variavel
				outPut.setText(""); //vai apagar a area para digitar um novo numero
				op="+";//meia noite te conto
			}
		});
		bntSoma.setBounds(314, 405, 80, 184);
		contentPane.add(bntSoma);
		
		JButton bntMutiplicacao = new JButton("x");
		bntMutiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v1=Double.parseDouble(outPut.getText());//vai guardar o n1 em uma variavel
				outPut.setText(""); //vai apagar a area para digitar um novo numero
				op="x";//meia noite te conto
			}
		});
		bntMutiplicacao.setBounds(404, 260, 64, 87);
		contentPane.add(bntMutiplicacao);
		
		JButton bntDivisao = new JButton("/");
		bntDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v1=Double.parseDouble(outPut.getText());//vai guardar o n1 em uma variavel
				outPut.setText(""); //vai apagar a area para digitar um novo numero
				op="/";//meia noite te conto
			}
			}
		);
		bntDivisao.setBounds(404, 357, 64, 87);
		contentPane.add(bntDivisao);
		
		JButton bntResult = new JButton("=");
		bntResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v2=Double.parseDouble(outPut.getText());
				
				if(op=="+") {
					r=v1+v2;
					String result=String.valueOf(r);
					outPut.setText(result);
				}else if(op =="-") {
					r=v1-v2;
					String result=String.valueOf(r);
					outPut.setText(result);
				}else if(op=="x") {
					r=v1*v2;
					String result=String.valueOf(r);
					outPut.setText(result);
				}else if(op=="/") {
					r=v1/v2;
					String result=String.valueOf(r);
					outPut.setText(result);
					
				}
			}
		});
		bntResult.setBounds(404, 454, 64, 135);
		contentPane.add(bntResult);
	}
}
