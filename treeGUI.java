import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class treeGUI extends JPanel{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JTextField tf;
	
	public treeGUI() { 
		// for add
		btn1 = new JButton("Insert");
		btn1.setSize(20, 10);
		btn1.setBackground(Color.gray);
		
		// for remove
		btn2 = new JButton("Delete");
		btn2.setSize(20, 10);
		btn2.setBackground(Color.gray);
		
		// for search
		btn3 = new JButton("Search");
		btn3.setSize(20, 10);
		btn3.setBackground(Color.gray);
		
		tf = new JTextField(10);
		tf.setSize(10, 10);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Insert");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Delete");
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Search");
			}
		});
	 
		FlowLayout layout = new FlowLayout();
    setLayout(layout);
    add(tf, BorderLayout.NORTH);
    add(btn1, BorderLayout.NORTH);
    add(btn2, BorderLayout.NORTH);
    add(btn3, BorderLayout.NORTH);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLACK);
		
		// root
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(430, 50, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(450, 50, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(470, 50, 20, 20);
		
		// from the root to its left child
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawLine(300, 130, 430, 70);
		
		// from the root to its middle left child
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawLine(420, 130, 450, 70);
		
		// from the root to its middle right child
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawLine(510, 130, 470, 70);
		
		// from the root to its right child
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawLine(630, 130, 490, 70);
		
		// left child level 1
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(280, 130, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(300, 130, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(320, 130, 20, 20);
		
		// middle left child level 1
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(400, 130, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(420, 130, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(440, 130, 20, 20);
		
		// middle right child level 1
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(490, 130, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(510, 130, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(530, 130, 20, 20);
		
		// right child level 1
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(610, 130, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(630, 130, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(650, 130, 20, 20);
		
		// left child level 2 from left child level 1
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(110, 210, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(130, 210, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(150, 210, 20, 20);
		
		// middle left child level 2 from the left child level 1
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(180, 210, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(200, 210, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(220, 210, 20, 20);
		
		// middle right child level 2 from the left child level 1
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(250, 210, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(270, 210, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(290, 210, 20, 20);
		
		// right child level 2 from the left child level 1
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(320, 210, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(340, 210, 20, 20);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(360, 210, 20, 20);
		
		// left child level 2 from the middle left child level 1
//		g2d.setStroke(new BasicStroke(2f));
//		g2d.drawRect(220, 210, 20, 20);
//		g2d.setStroke(new BasicStroke(2f));
//		g2d.drawRect(240, 210, 20, 20);
//		g2d.setStroke(new BasicStroke(2f));
//		g2d.drawRect(260, 210, 20, 20);
//		
		// from left child level 1 to its left child level 2
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawLine(150, 210, 280, 150);
		
		// from left child level 1 to its middle left child level 2
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawLine(210, 210 , 300,  150);
		
		// from the left child level 1 to its middle right child level 2
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawLine(270, 210, 320, 150);
		
		// from the left child level 1 to its right child level 2
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawLine(330, 210, 340, 150);
		
		// g2d.clearRect(580, 130, 30, 30);
 	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("2-3-4 Tree Simulator");
		Color color = new Color(167, 220, 95);
		frame.add(new treeGUI());
		frame.setTitle("2-3-4 Tree Simulator");
		frame.setBackground(color);
		frame.setSize(1000, 900);
//		frame.pack();
//		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}