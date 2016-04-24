
import java.awt.EventQueue;

import javax.swing.JFrame;




import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;



import javax.swing.JInternalFrame;

import java.awt.Color;

public class Allocation {

	private JFrame frmMemoryAllocation;
	private JTextField textField_h1;
	private JTextField textField_h2;
	private JTextField textField_h3;
	private JTextField textField_h4;
	private JTextField textField_h5;
	private JTextField textField_p1;
	private JTextField textField_p2;
	private JTextField textField_p3;
	private JTextField textField_p4;
	private JTextField textField_a1;
	private JTextField textField_a2;
	private JTextField textField_a3;
	private JTextField textField_a4;
	private JTextField textField_a5;
	
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	protected JTextField textField_f1;
	protected JTextField textField_f2;
	protected JTextField textField_f3;
	protected JTextField textField_f4;
	protected JTextField textField_f5;
	protected JTextField textField_r1;
	protected JTextField textField_r2;
	protected JTextField textField_r3;
	protected JTextField textField_r4;
	protected JTextField textField_r5;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JLabel lblNewLabel;
	private JButton btnNewButton_8;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JTextField textField_h6;
	private JTextField textField_h7;
	private JTextField textField_p5;
	private JTextField textField_p6;
	private JTextField textField_a6;
	private JTextField textField_a7;
	private JTextField textField_r6;
	private JTextField textField_r7;
	private JTextField textField_f6;
	private JTextField textField_f7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Allocation window = new Allocation();
					window.frmMemoryAllocation.setVisible(true);
					

					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Allocation() {
		 
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		textField_r1 = new JTextField();
		textField_r2 = new JTextField();
		textField_r3 = new JTextField();
		textField_r4 = new JTextField();
		textField_r5 = new JTextField();
		textField_r6 = new JTextField();
		textField_r7 = new JTextField();
		
		textField_f1 = new JTextField();
		textField_f2 = new JTextField();
		textField_f3 = new JTextField();
		textField_f4 = new JTextField();
		textField_f5 = new JTextField();
		textField_f6 = new JTextField();
		textField_f7 = new JTextField();
		
		final int bestie[] = new int[2];
		final int holes[] = new int[7];
		final int proc[] = new int[6];
		
 		frmMemoryAllocation = new JFrame();
		frmMemoryAllocation.setTitle("MEMORY ALLOCATION");
		frmMemoryAllocation.setBounds(100, 100, 1500, 700);
		frmMemoryAllocation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMemoryAllocation.getContentPane().setLayout(null);
		
		textField_h1 = new JTextField();
		textField_h1.setBounds(256, 32, 74, 20);           // Co-ordinates and sizes
		frmMemoryAllocation.getContentPane().add(textField_h1);
		textField_h1.setColumns(10);
		
		textField_h2 = new JTextField();
		textField_h2.setBounds(342, 32, 74, 20);
		frmMemoryAllocation.getContentPane().add(textField_h2);
		textField_h2.setColumns(10);
		
		textField_h3 = new JTextField();
		textField_h3.setBounds(435, 32, 74, 20);
		frmMemoryAllocation.getContentPane().add(textField_h3);
		textField_h3.setColumns(10);
		
		textField_h4 = new JTextField();
		textField_h4.setBounds(530, 32, 74, 20);
		frmMemoryAllocation.getContentPane().add(textField_h4);
		textField_h4.setColumns(10);
		
		textField_h5 = new JTextField();
		textField_h5.setBounds(621, 32, 67, 20);
		frmMemoryAllocation.getContentPane().add(textField_h5);
		textField_h5.setColumns(10);
		
		textField_p1 = new JTextField();
		textField_p1.setBounds(277, 88, 86, 20);
		frmMemoryAllocation.getContentPane().add(textField_p1);
		textField_p1.setColumns(10);
		
		textField_p2 = new JTextField();
		textField_p2.setBounds(389, 88, 86, 20);
		frmMemoryAllocation.getContentPane().add(textField_p2);
		textField_p2.setColumns(10);
		
		textField_p3 = new JTextField();
		textField_p3.setBounds(491, 88, 86, 20);
		frmMemoryAllocation.getContentPane().add(textField_p3);
		textField_p3.setColumns(10);
		
		textField_p4 = new JTextField();
		textField_p4.setBounds(587, 88, 86, 20);
		frmMemoryAllocation.getContentPane().add(textField_p4);
		textField_p4.setColumns(10);
		
		JLabel lblNewLabel_hole = new JLabel("ENTER SIZE IN KB OF  HOLES : ");
		lblNewLabel_hole.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_hole.setBounds(368, 7, 241, 14);
		frmMemoryAllocation.getContentPane().add(lblNewLabel_hole);
		
		JLabel lblNewLabel_process = new JLabel("ENTER SIZE IN KB OF  PROCESSES : ");
		lblNewLabel_process.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_process.setBounds(368, 63, 208, 14);
		frmMemoryAllocation.getContentPane().add(lblNewLabel_process);
		
		textField_a1 = new JTextField();
		textField_a1.setColumns(10);
		textField_a1.setBounds(256, 190, 74, 20);
		frmMemoryAllocation.getContentPane().add(textField_a1);
		
		textField_a2 = new JTextField();
		textField_a2.setColumns(10);
		textField_a2.setBounds(342, 190, 74, 20);
		frmMemoryAllocation.getContentPane().add(textField_a2);
		
		textField_a3 = new JTextField();
		textField_a3.setColumns(10);
		textField_a3.setBounds(435, 190, 74, 20);
		frmMemoryAllocation.getContentPane().add(textField_a3);
		
		textField_a4 = new JTextField();
		textField_a4.setColumns(10);
		textField_a4.setBounds(530, 190, 74, 20);
		frmMemoryAllocation.getContentPane().add(textField_a4);
		
		textField_a5 = new JTextField();
		textField_a5.setColumns(10);
		textField_a5.setBounds(621, 190, 67, 20);
		frmMemoryAllocation.getContentPane().add(textField_a5);
		
		JLabel lblNewLabel_1 = new JLabel("SIZES OF REMAINING CHUNKS ARE : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(370, 165, 284, 14);
		frmMemoryAllocation.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_f = new JLabel("BEFORE ALLOCATION VIEW OF HOLES : ");
		lblNewLabel_f.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_f.setBounds(366, 226 , 250 , 14);
		frmMemoryAllocation.getContentPane().add(lblNewLabel_f);
		
		JLabel lblNewLabel_f1 = new JLabel("AFTER ALLOCATION VIEW OF MEMORY :  ");
		lblNewLabel_f1.setForeground(Color.WHITE);
		lblNewLabel_f1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_f1.setBounds(344, 300 , 284 , 14 );
		frmMemoryAllocation.getContentPane().add(lblNewLabel_f1);
		
		
	    
	    JButton btnNewButton = new JButton("BEST FIT");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		int n = 7;
	    		int m = 6;
	    		
	    		
	    		int h[] = new int[n];
	    		int p[] = new int[m];
	    		
	    		int h2[] = new int[n];
	    		int p2[] = new int[m];
	    		
	    		
	    		
	    		int t[] = new int[7];
	    		t[0] = 10;
	    		int which = 0;
	    		for( int i = 0 ; i < 7 ; i++ )
	    		{
	    			if( holes[i] == 1 )
	    			{
	    				which = i;
	    				break;
	    			}
	    		}
	    		
	    		int whip = 0;
	    		for( int i = 0 ; i < 6 ; i++ )
	    		{
	    			if( proc[i] == 1 )
	    			{
	    				whip = i;
	    				break;
	    			}
	    		}
	    		
	    		if( whip == 0 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
	    		}
	    		else if( whip == 1 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
	    		}
	    		else if( whip == 2 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
	    		}
	    		else if( whip == 3 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
		    		p[3] = Integer.parseInt(textField_p4.getText());
	    		}
	    		else if( whip == 4 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
		    		p[3] = Integer.parseInt(textField_p4.getText());
		    		p[4] = Integer.parseInt(textField_p5.getText());
	    		}
	    		else
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
		    		p[3] = Integer.parseInt(textField_p4.getText());
		    		p[4] = Integer.parseInt(textField_p5.getText());
		    		p[5] = Integer.parseInt(textField_p6.getText());
	    		}

	    		
	    		textField_f1.setVisible(false);
	    	    textField_f2.setVisible(false);
	    	    textField_f3.setVisible(false);
	    	    textField_f4.setVisible(false);
	    	    textField_f5.setVisible(false);
	    	    textField_f6.setVisible(false);
	    	    textField_f7.setVisible(false);
	    	    
	    	    
	    		
	    		if( which == 1 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(false);
		    	    textField_f4.setVisible(false);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
		    	    
	    		}
	    		else if( which == 2)
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(false);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
	    		}
	    		else if( which == 3 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
	    		}
	    		else if( which == 4 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		h[4] = Integer.parseInt(textField_h5.getText());
		    		
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(true);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
	    		}
	    		else if( which == 5 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		h[4] = Integer.parseInt(textField_h5.getText());
		    		h[5] = Integer.parseInt(textField_h6.getText());
		    		
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(true);
		    	    textField_f6.setVisible(true);
		    	    textField_f7.setVisible(false);
	    		}
	    		else 
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		h[4] = Integer.parseInt(textField_h5.getText());
		    		h[5] = Integer.parseInt(textField_h6.getText());
		    		h[6] = Integer.parseInt(textField_h7.getText());
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(true);
		    	    textField_f6.setVisible(true);
		    	    textField_f7.setVisible(true);
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		for( int i = 0 ; i < (which+1) ; i++ )
	    	    {
	    	        h2[i] = h[i];
	    	    }
	    	    for( int i = 0 ; i < (whip+1) ; i++ )
	    	    {
	    	        p2[i] = p[i];
	    	    }
	    	    
	    	    String s = "";
	   
	    	    for( int i = 0 ; i < (whip+1) ; i++ )
	    	    {
	    	    	int act = 0;
	    	    	int minion[] = new int[(which+1)];
	    	    	
	    	    	for( int j = 0 ; j < (which+1) ; j++)
	    	    	{
	    	    		if( p2[i] <= h2[j] )
	    	            {
	    	                minion[j] = h2[j] - p2[i];
	    	            }
	    	            else
	    	            {
	    	                minion[j] = 10000;
	    	            }
	    	    	}
	    	    	int minio = minion[0];
	    	    	
	    	    	for( int j = 0 ; j < (which+1); j++ )
	    	    	{
	    	    		if( minio > minion[j] )
	    	            {
	    	                minio = minion[j];
	    	                act = j;
	    	            }
	    	    	}
	    	    	h2[act] = h2[act] - p[i];
	    	    	s += "PROCESS NO : " + (i+1) + "ENTERED HOLE NO : " + (act+1) + "\n" ;
	    	    	s += "SPACE REMAINING IS : ";
	    	    	 int k = 0;
 	                while( k <= which )
 	                {
 	                	s += "HOLE NO  " + (k+1) + " : " +  h2[k] + "  ";
 	                	k++;
 	                }
 	                s += "\n";
	    	    	
	    	    	
	    	    }
	    	    
	    	    
	    		
	    		
	    		textField_f1.setBounds(t[0], 250, (h[0]/2), 20);           
	    		frmMemoryAllocation.getContentPane().add(textField_f1);
	    		textField_f1.setColumns(10);
	    		textField_f1.setText(Integer.toString(h[0]) + " KB ");
	    		
	    		t[1] = t[0] + (h[0]/2) + 20;
	    		

	    	
	    		textField_f2.setBounds(t[1], 250, (h[1]/2), 20);           
	    		frmMemoryAllocation.getContentPane().add(textField_f2);
	    		textField_f2.setColumns(10);
	    		textField_f2.setText(Integer.toString(h[1]) + " KB ");
	    		
	    		t[2] = t[1] + (h[1]/2) + 20;
	    		
	    		
	    		textField_f3.setBounds(t[2], 250, (h[2]/2), 20);           
	    		frmMemoryAllocation.getContentPane().add(textField_f3);
	    		textField_f3.setColumns(10);
	    		textField_f3.setText(Integer.toString(h[2]) + " KB ");
	    		
	    		t[3] = t[2] +  (h[2]/2) + 20;
	    		
	    		
	    		textField_f4.setBounds(t[3] , 250, (h[3]/2), 20);           
	    		frmMemoryAllocation.getContentPane().add(textField_f4);
	    		textField_f4.setColumns(10);
	    		textField_f4.setText(Integer.toString(h[3]) + " KB ");
	    		
	    		t[4] = t[3] + (h[3]/2) + 20;
	    		
	    		
	    		textField_f5.setBounds(t[4], 250, (h[4]/2), 20);           
	    		frmMemoryAllocation.getContentPane().add(textField_f5);
	    		textField_f5.setColumns(10);
	    		textField_f5.setBackground(Color.WHITE);
	    		textField_f5.setText(Integer.toString(h[4]) + " KB ");
	    		
	    		t[5] = t[4] + (h[4]/2) + 20;
	    		
	    		textField_f6.setBounds(t[5], 250, (h[5]/2), 20);           
	    		frmMemoryAllocation.getContentPane().add(textField_f6);
	    		textField_f6.setColumns(10);
	    		textField_f6.setText(Integer.toString(h[5]) + " KB ");
	    		
	    		t[6] = t[5] + (h[5]/2) + 20;
	    		
	    		textField_f7.setBounds(t[6], 250, (h[6]/2), 20);           
	    		frmMemoryAllocation.getContentPane().add(textField_f7);
	    		textField_f7.setColumns(10);
	    		textField_f7.setText(Integer.toString(h[6]) + " KB ");

	    		
	    		
	    	    
	    		int flag = 1;
	    	    for( int i = 0 ; i < (which+1) ; i++ )
	    	    {
	    	    	if( h2[i] < 0 )
	    	    	{
	    	    		flag = 0;
	    	    		
	    	    	
	    	    		break;
	    	    	}
	    	    }
	    	    
	    	   
	    	    
	    	    
	    	    if( flag == 1)
	    	    {
	    	    	textField_a1.setText(Integer.toString(h2[0])  + " KB ");
		    	    textField_a2.setText(Integer.toString(h2[1])  + " KB ");
		    	    textField_a3.setText(Integer.toString(h2[2])  + " KB ");
		    	    textField_a4.setText(Integer.toString(h2[3])  + " KB ");
		    	    textField_a5.setText(Integer.toString(h2[4])  + " KB ");
		    	    textField_a6.setText(Integer.toString(h2[5])  + " KB ");
		    	    textField_a7.setText(Integer.toString(h2[6])  + " KB ");
		    	    
		    	   
		    	    textField_r1.setVisible(false);
		    	    textField_r2.setVisible(false);
		    	    textField_r3.setVisible(false);
		    	    textField_r4.setVisible(false);
		    	    textField_r5.setVisible(false);
		    	    textField_r6.setVisible(false);
		    	    textField_r7.setVisible(false);
		    	    textField_f1.setVisible(false);
		    	    textField_f2.setVisible(false);
		    	    textField_f3.setVisible(false);
		    	    textField_f4.setVisible(false);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
		    	    
		    	    
		    		textField_r1.setBounds(t[0], 350 , (h2[0]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r1);
		    		textField_r1.setColumns(10);
		    		textField_r1.setBackground(Color.WHITE);
		    		textField_r1.setText(Integer.toString(h2[0]));
		    		
		    		t[1] = t[0] + (h[0]/2) + 20;
		    		
		    		
		    		
		    		textField_r2.setBounds(t[1], 350 , (h2[1]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r2);
		    		textField_r2.setColumns(10);
		    		textField_r2.setText(Integer.toString(h2[1]));
		    		
		    		t[2] = t[1] + (h[1]/2) + 20;
		    		
		    		
		    		textField_r3.setBounds(t[2], 350, (h2[2]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r3);
		    		textField_r3.setColumns(10);
		    		textField_r3.setText(Integer.toString(h2[2]));
		    		
		    		t[3] = t[2] +  (h[2]/2) + 20;
		    		
		    		
		    		textField_r4.setBounds(t[3] , 350, (h2[3]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r4);
		    		textField_r4.setColumns(10);
		    		textField_r4.setText(Integer.toString(h2[3]));
		    		
		    		t[4] = t[3] + (h[3]/2) + 20;
		    		
		    		
		    		textField_r5.setBounds(t[4], 350, (h2[4]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r5);
		    		textField_r5.setColumns(10);
		    		textField_r5.setText(Integer.toString(h2[4]));
		    		
		    		t[5] = t[4] + (h[4]/2) + 20;
		    		
		    		textField_r6.setBounds(t[5], 350, (h2[5]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r6);
		    		textField_r6.setColumns(10);
		    		textField_r6.setText(Integer.toString(h2[5]));
		    		
		    		t[6] = t[5] + (h[5]/2) + 20;
		    		
		    		textField_r7.setBounds(t[6], 350, (h2[6]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r7);
		    		textField_r6.setColumns(10);
		    		textField_r6.setText(Integer.toString(h2[6]));
		    		
		    		
		    		int maxi2 = h2[0];
		    	    int mini2 = h2[0];
		    	    for( int i = 0 ; i < (which+1) ; i++ )
		    	    {
		    	        if( maxi2 < h2[i] )
		    	        {
		    	            maxi2 = h2[i];
		    	        }
		    	        if( mini2 > h2[i] )
		    	        {
		    	            mini2 = h2[i];
		    	        }
		    	    }
		    	    bestie[1] = mini2;
		    		
		    	    if( which == 1 )
		    		{
		    			textField_r1.setVisible(true);
			    	    textField_r2.setVisible(true);
			    	    textField_r3.setVisible(false);
			    	    textField_r4.setVisible(false);
			    	    textField_r5.setVisible(false);
			    	    textField_r6.setVisible(false);
			    	    textField_r7.setVisible(false);
			    	    textField_f1.setVisible(true);
			    	    textField_f2.setVisible(true);
			    	    textField_f3.setVisible(false);
			    	    textField_f4.setVisible(false);
			    	    textField_f5.setVisible(false);
			    	    textField_f6.setVisible(false);
			    	    textField_f7.setVisible(false);
			    	    
		    		}
		    	    else if ( which == 2 )
		    	    {
		    	    	textField_r1.setVisible(true);
			    	    textField_r2.setVisible(true);
			    	    textField_r3.setVisible(true);
			    	    textField_r4.setVisible(false);
			    	    textField_r5.setVisible(false);
			    	    textField_r6.setVisible(false);
			    	    textField_r7.setVisible(false);
			    	    textField_f1.setVisible(true);
			    	    textField_f2.setVisible(true);
			    	    textField_f3.setVisible(true);
			    	    textField_f4.setVisible(false);
			    	    textField_f5.setVisible(false);
			    	    textField_f6.setVisible(false);
			    	    textField_f7.setVisible(false);
		    	    }
		    	    else if ( which == 3 )
		    	    {
		    	    	textField_r1.setVisible(true);
			    	    textField_r2.setVisible(true);
			    	    textField_r3.setVisible(true);
			    	    textField_r4.setVisible(true);
			    	    textField_r5.setVisible(false);
			    	    textField_r6.setVisible(false);
			    	    textField_r7.setVisible(false);
			    	    textField_f1.setVisible(true);
			    	    textField_f2.setVisible(true);
			    	    textField_f3.setVisible(true);
			    	    textField_f4.setVisible(true);
			    	    textField_f5.setVisible(false);
			    	    textField_f6.setVisible(false);
			    	    textField_f7.setVisible(false);
		    	    }
		    	    else if( which == 4 )
		    	    {
		    	    	textField_r1.setVisible(true);
			    	    textField_r2.setVisible(true);
			    	    textField_r3.setVisible(true);
			    	    textField_r4.setVisible(true);
			    	    textField_r5.setVisible(true);
			    	    textField_r6.setVisible(false);
			    	    textField_r7.setVisible(false);
			    	    textField_f1.setVisible(true);
			    	    textField_f2.setVisible(true);
			    	    textField_f3.setVisible(true);
			    	    textField_f4.setVisible(true);
			    	    textField_f5.setVisible(true);
			    	    textField_f6.setVisible(false);
			    	    textField_f7.setVisible(false);
		    	    }
		    	    else if( which == 5 )
		    	    {
		    	    	textField_r1.setVisible(true);
			    	    textField_r2.setVisible(true);
			    	    textField_r3.setVisible(true);
			    	    textField_r4.setVisible(true);
			    	    textField_r5.setVisible(true);
			    	    textField_r6.setVisible(true);
			    	    textField_r7.setVisible(false);
			    	    textField_f1.setVisible(true);
			    	    textField_f2.setVisible(true);
			    	    textField_f3.setVisible(true);
			    	    textField_f4.setVisible(true);
			    	    textField_f5.setVisible(true);
			    	    textField_f6.setVisible(true);
			    	    textField_f7.setVisible(false);
		    	    }
		    	    else if( which == 6 )
		    	    {
		    	    	textField_r1.setVisible(true);
			    	    textField_r2.setVisible(true);
			    	    textField_r3.setVisible(true);
			    	    textField_r4.setVisible(true);
			    	    textField_r5.setVisible(true);
			    	    textField_r6.setVisible(true);
			    	    textField_r7.setVisible(true);
			    	    textField_f1.setVisible(true);
			    	    textField_f2.setVisible(true);
			    	    textField_f3.setVisible(true);
			    	    textField_f4.setVisible(true);
			    	    textField_f5.setVisible(true);
			    	    textField_f6.setVisible(true);
			    	    textField_f7.setVisible(true);
		    	    }
		    	    int rem;
		    	    lblNewLabel.setVisible(true);
		    	    int v1=0,v2=0;
		    	    for( int i = 0 ; i < (which+1) ; i++ )
		    	    {
		    	    	v1 += h[i];
		    	    	v2 += p2[i];
		    	    }
		    	    
		    	    rem = v1 - v2;
		    	    lblNewLabel.setText("TOTAL REMAINING EMPTY SPACE WOULD BE : " + rem + " KB ");
		    	    JOptionPane.showMessageDialog(null , s);
		    	    
	    	    }
	    	    else if( flag == 0)
	    	    {
	    	    	
	    	    		textField_a1.setText("ERR");
	    	    		textField_a2.setText("ERR");
	    	    		textField_a3.setText("ERR");
	    	    		textField_a4.setText("ERR");
	    	    		textField_a5.setText("ERR");
	    	    		textField_a6.setText("ERR");
	    	    		textField_a7.setText("ERR");
	    	    		
	    	    		JOptionPane.showMessageDialog(null, "ERROR..!!\n THIS ALGORITHM IS NOT SUITABLE");
	    	    		bestie[1] = 10000;
	    	    	    
	    	    }
	    	    
	    	   
	    	    
	    	    
	    	    
	    		
	    	}
	    });
	    
	    
	    
	    btnNewButton.setBounds(530, 131, 101, 23);
	    frmMemoryAllocation.getContentPane().add(btnNewButton);
	    
/*****************************************************************************************************************
 *****************************************************************************************************************/	    
	    
	    btnNewButton_2 = new JButton("FIRST FIT");
	    btnNewButton_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		int n = 7;
	    		int m = 6;
	    		
	    		
	    		int h[] = new int[n];
	    		int p[] = new int[m];
	    		
	    		int h1[] = new int[n];
	    		int p1[] = new int[m];
	    		
	    		
	    		    		
                int t[] = new int[7];
	    		t[0] = 10;
	    		int which = 0;
	    		for( int i = 0 ; i < 7 ; i++ )
	    		{
	    			if( holes[i] == 1 )
	    			{
	    				which = i;
	    				break;
	    			}
	    		}
	    		int whip = 0;
	    		for( int i = 0 ; i < 6 ; i++ )
	    		{
	    			if( proc[i] == 1)
	    			{
	    				whip = i;
	    				break;
	    			}
	    		}
	    		if( whip == 0 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
	    		}
	    		else if( whip == 1 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
	    		}
	    		else if( whip == 2 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
	    		}
	    		else if( whip == 3 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
		    		p[3] = Integer.parseInt(textField_p4.getText());
	    		}
	    		else if( whip == 4 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
		    		p[3] = Integer.parseInt(textField_p4.getText());
		    		p[4] = Integer.parseInt(textField_p5.getText());
	    		}
	    		else
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
		    		p[3] = Integer.parseInt(textField_p4.getText());
		    		p[4] = Integer.parseInt(textField_p5.getText());
		    		p[5] = Integer.parseInt(textField_p6.getText());
	    		}
	    		
	    		
	    		if( which == 1 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(false);
		    	    textField_f4.setVisible(false);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
		    	    
	    		}
	    		else if( which == 2)
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(false);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
	    		}
	    		else if( which == 3 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
	    		}
	    		else if( which == 4 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		h[4] = Integer.parseInt(textField_h5.getText());
		    		
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(true);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
	    		}
	    		else if( which == 5 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		h[4] = Integer.parseInt(textField_h5.getText());
		    		h[5] = Integer.parseInt(textField_h6.getText());
		    		
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(true);
		    	    textField_f6.setVisible(true);
		    	    textField_f7.setVisible(false);
	    		}
	    		else 
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		h[4] = Integer.parseInt(textField_h5.getText());
		    		h[5] = Integer.parseInt(textField_h6.getText());
		    		h[6] = Integer.parseInt(textField_h7.getText());
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(true);
		    	    textField_f6.setVisible(true);
		    	    textField_f7.setVisible(true);
	    		}
	    		
	    		
	    		
	    		
	    		
	    		for( int i = 0 ; i < (which+1) ; i++ )
	    	    {
	    	        h1[i] = h[i];
	    	    }
	    	    for( int i = 0 ; i < (whip+1) ; i++ )
	    	    {
	    	        p1[i] = p[i];
	    	    }
	    	    String s = "";
	    	    int cnt1 = 0;
	    	    for( int i = 0 ; i < (whip+1) ; i++ )
	    	    {
	    	        for( int j = 0 ; j < (which+1) ; j++ )
	    	        {
	    	            if( p1[i] <= h1[j] )
	    	            {
	    	                h1[j] = h1[j] - p1[i];
	    	                cnt1++;
	    	                s += "PROCESS NO : " + (i+1) + " ENTERED HOLE NO :  " + (j+1) +"\n";
	    	                s += "SPACE REMAINING IS :  ";
	    	                int k = 0;
	    	                while( k <= which )
	    	                {
	    	                	s += "HOLE NO  " + (k+1) + " : " +  h1[k] + "  ";
	    	                	k++;
	    	                }
	    	                s += "\n";
	    	                break;
	    	            }
	    	            else
	    	            {
	    	                continue;
	    	            }
	    	        }
	    	    }
	    	    
	    	    int flag = 1;
	    	    for( int i = 0 ; i < (which+1) ; i++ )
	    	    {
	    	    	if( h1[i] < 0 || cnt1 != (whip+1) )
	    	    	{
	    	    		flag = 0;
	    	    		
	    	    	
	    	    		break;
	    	    	}
	    	    }
	    	    
	    	   
	    	    
	    	    
	    	    if( flag == 1)
	    	    {
	    	    	textField_a1.setText(Integer.toString(h1[0])  + " KB ");
		    	    textField_a2.setText(Integer.toString(h1[1])  + " KB ");
		    	    textField_a3.setText(Integer.toString(h1[2])  + " KB ");
		    	    textField_a4.setText(Integer.toString(h1[3])  + " KB ");
		    	    textField_a5.setText(Integer.toString(h1[4])  + " KB ");
		    	    textField_a6.setText(Integer.toString(h1[5])  + " KB ");
		    	    textField_a7.setText(Integer.toString(h1[6])  + " KB ");
		    	    
		    	   
		    	    textField_r1.setVisible(false);
		    	    textField_r2.setVisible(false);
		    	    textField_r3.setVisible(false);
		    	    textField_r4.setVisible(false);
		    	    textField_r5.setVisible(false);
		    	    textField_r6.setVisible(false);
		    	    textField_r7.setVisible(false);
		    	    textField_f1.setVisible(false);
		    	    textField_f2.setVisible(false);
		    	    textField_f3.setVisible(false);
		    	    textField_f4.setVisible(false);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
		    	    
		    	    
		    	    textField_f1.setBounds(t[0], 250, (h[0]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f1);
		    		textField_f1.setColumns(10);
		    		textField_f1.setText(Integer.toString(h[0]) + " KB ");
		    		
		    		t[1] = t[0] + (h[0]/2) + 20;
		    		

		    		
		    		textField_f2.setBounds(t[1], 250, (h[1]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f2);
		    		textField_f2.setColumns(10);
		    		textField_f2.setText(Integer.toString(h[1]) + " KB ");
		    		
		    		t[2] = t[1] + (h[1]/2) + 20;
		    		
		    		
		    		textField_f3.setBounds(t[2], 250, (h[2]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f3);
		    		textField_f3.setColumns(10);
		    		textField_f3.setText(Integer.toString(h[2]) + " KB ");
		    		
		    		t[3] = t[2] +  (h[2]/2) + 20;
		    		
		    
		    		textField_f4.setBounds(t[3] , 250, (h[3]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f4);
		    		textField_f4.setColumns(10);
		    		textField_f4.setText(Integer.toString(h[3]) + " KB ");
		    		
		    		t[4] = t[3] + (h[3]/2) + 20;
		    		
		    		
		    		textField_f5.setBounds(t[4], 250, (h[4]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f5);
		    		textField_f5.setColumns(10);
		    		textField_f5.setBackground(Color.WHITE);
		    		textField_f5.setText(Integer.toString(h[4]) + " KB ");
		    		
		    		t[5] = t[4] + (h[4]/2) + 20;
		    		
		    		textField_f6.setBounds(t[5], 250, (h[5]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f6);
		    		textField_f6.setColumns(10);
		    		textField_f6.setText(Integer.toString(h[5]) + " KB ");
		    		
		    		t[6] = t[5] + (h[5]/2) + 20;
		    		
		    		textField_f7.setBounds(t[6], 250, (h[6]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f7);
		    		textField_f7.setColumns(10);
		    		textField_f7.setText(Integer.toString(h[6]) + " KB ");
		    		
		    		
		    		textField_r1.setBounds(t[0], 350 , (h1[0]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r1);
		    		textField_r1.setColumns(10);
		    		textField_r1.setBackground(Color.WHITE);
		    		textField_r1.setText(Integer.toString(h1[0]));
		    		
		    		t[1] = t[0] + (h[0]/2) + 20;
		    		
		    		
		    		
		    		textField_r2.setBounds(t[1], 350 , (h1[1]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r2);
		    		textField_r2.setColumns(10);
		    		textField_r2.setText(Integer.toString(h1[1]));
		    		
		    		t[2] = t[1] + (h[1]/2) + 20;
		    		
		    		
		    		textField_r3.setBounds(t[2], 350, (h1[2]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r3);
		    		textField_r3.setColumns(10);
		    		textField_r3.setText(Integer.toString(h1[2]));
		    		
		    		t[3] = t[2] +  (h[2]/2) + 20;
		    		
		    		
		    		textField_r4.setBounds(t[3] , 350, (h1[3]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r4);
		    		textField_r4.setColumns(10);
		    		textField_r4.setText(Integer.toString(h1[3]));
		    		
		    		t[4] = t[3] + (h[3]/2) + 20;
		    		
		    		
		    		textField_r5.setBounds(t[4], 350, (h1[4]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r5);
		    		textField_r5.setColumns(10);
		    		textField_r5.setText(Integer.toString(h1[4]));
		    		
		    		t[5] = t[4] + (h[4]/2) + 20;
		    		
		    		textField_r6.setBounds(t[5], 350, (h1[5]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r6);
		    		textField_r6.setColumns(10);
		    		textField_r6.setText(Integer.toString(h1[5]));
		    		
		    		t[6] = t[5] + (h[5]/2) + 20;
		    		
		    		textField_r7.setBounds(t[6], 350, (h1[6]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r7);
		    		textField_r7.setColumns(10);
		    		textField_r7.setText(Integer.toString(h1[6]));
		    		
		    		 if( which == 1 )
			    		{
			    			textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(false);
				    	    textField_r4.setVisible(false);
				    	    textField_r5.setVisible(false);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(false);
				    	    textField_f4.setVisible(false);
				    	    textField_f5.setVisible(false);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
				    	    
			    		}
			    	    else if ( which == 2 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(false);
				    	    textField_r5.setVisible(false);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(false);
				    	    textField_f5.setVisible(false);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if ( which == 3 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(false);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(false);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if( which == 4 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(true);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(true);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if( which == 5 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(true);
				    	    textField_r6.setVisible(true);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(true);
				    	    textField_f6.setVisible(true);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if( which == 6 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(true);
				    	    textField_r6.setVisible(true);
				    	    textField_r7.setVisible(true);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(true);
				    	    textField_f6.setVisible(true);
				    	    textField_f7.setVisible(true);
			    	    }
		    		
		    		int maxi = h1[0];
		    	    int mini = h1[0];
		    	    
		    	    
		    	    for( int i = 0 ; i < (which+1) ; i++ )
		    	    {
		    	        if( maxi < h1[i] )
		    	        {
		    	            maxi = h1[i];
		    	        }
		    	        if( mini > h1[i] )
		    	        {
		    	            mini = h1[i];
		    	        }
		    	    }
		    	    bestie[0] = mini;
		    	    int rem;
		    	    lblNewLabel.setVisible(true);
		    	    int v1=0,v2=0;
		    	    for( int i = 0 ; i < (which+1) ; i++ )
		    	    {
		    	    	v1 += h[i];
		    	    	v2 += p1[i];
		    	    }
		    	    
		    	    rem = v1 - v2;
		    	    lblNewLabel.setText("TOTAL REMAINING EMPTY SPACE WOULD BE : " + rem + " KB ");
		    	    JOptionPane.showMessageDialog(null , s);
		    	      
		    	    
		    	    
	    	    }
	    	    else if( flag == 0)
	    	    {
	    	    	
	    	    		textField_a1.setText("ERR");
	    	    		textField_a2.setText("ERR");
	    	    		textField_a3.setText("ERR");
	    	    		textField_a4.setText("ERR");
	    	    		textField_a5.setText("ERR");
	    	    		textField_a6.setText("ERR");
	    	    		textField_a7.setText("ERR");
	    	    		
	    	    		
	    	    		textField_r1.setBounds(t[0], 350 , (h[0]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_r1);
			    		textField_r1.setColumns(10);
			    		textField_r1.setBackground(Color.BLUE);
			    		textField_r1.setText(Integer.toString(h1[0]));
			    		
			    		t[1] = t[0] + (h[0]/2) + 20;
			    		
			    		
			    		
			    		textField_r2.setBounds(t[1], 350 , (h1[1]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_r2);
			    		textField_r2.setColumns(10);
			    		textField_r2.setText(Integer.toString(h1[1]));
			    		
			    		t[2] = t[1] + (h[1]/2) + 20;
			    		
			    		
			    		textField_r3.setBounds(t[2], 350, (h1[2]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_r3);
			    		textField_r3.setColumns(10);
			    		textField_r3.setText(Integer.toString(h1[2]));
			    		
			    		t[3] = t[2] +  (h[2]/2) + 20;
			    		
			    		
			    		textField_r4.setBounds(t[3] , 350, (h1[3]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_r4);
			    		textField_r4.setColumns(10);
			    		textField_r4.setText(Integer.toString(h1[3]));
			    		
			    		t[4] = t[3] + (h[3]/2) + 20;
			    		
			    		
			    		textField_r5.setBounds(t[4], 350, (h1[4]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_r5);
			    		textField_r5.setColumns(10);
			    		textField_r5.setText(Integer.toString(h1[4]));
			    		
			    		t[5] = t[4] + (h[4]/2) + 20;
			    		
			    		textField_r6.setBounds(t[5], 350, (h1[5]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_r6);
			    		textField_r6.setColumns(10);
			    		textField_r6.setText(Integer.toString(h1[5]));
			    		
			    		t[6] = t[5] + (h[5]/2) + 20;
			    		
			    		textField_r7.setBounds(t[6], 350, (h1[6]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_r7);
			    		textField_r7.setColumns(10);
			    		textField_r7.setText(Integer.toString(h1[6]));
	    	    		
	    	    		if( which == 1 )
			    		{
			    			textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(false);
				    	    textField_r4.setVisible(false);
				    	    textField_r5.setVisible(false);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(false);
				    	    textField_f4.setVisible(false);
				    	    textField_f5.setVisible(false);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
				    	    
			    		}
			    	    else if ( which == 2 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(false);
				    	    textField_r5.setVisible(false);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(false);
				    	    textField_f5.setVisible(false);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if ( which == 3 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(false);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(false);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if( which == 4 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(true);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(true);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if( which == 5 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(true);
				    	    textField_r6.setVisible(true);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(true);
				    	    textField_f6.setVisible(true);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if( which == 6 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(true);
				    	    textField_r6.setVisible(true);
				    	    textField_r7.setVisible(true);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(true);
				    	    textField_f6.setVisible(true);
				    	    textField_f7.setVisible(true);
			    	    }
	    	    		JOptionPane.showMessageDialog(null, "ERROR..!!\n THIS ALGORITHM IS NOT SUITABLE");
	    	    		bestie[0] = 10000;
	    	    	
	    	    }
	    	    
	    	    
	    	}
	    });
	    btnNewButton_2.setBounds(277, 131, 100, 23);
	    frmMemoryAllocation.getContentPane().add(btnNewButton_2);
	    
	    
	    
/******************************************************************************************************************
****************************************************************************************************************/	    
	    
	    
	    
	    btnNewButton_3 = new JButton("WORST FIT");
	    btnNewButton_3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		int n = 7;
	    		int m = 6;
	    		
	    		
	    		int h[] = new int[n];
	    		int p[] = new int[m];
	    		
	    		int h4[] = new int[n];
	    		int p4[] = new int[m];
	    		
	    		textField_f1.setVisible(false);
	    	    textField_f2.setVisible(false);
	    	    textField_f3.setVisible(false);
	    	    textField_f4.setVisible(false);
	    	    textField_f5.setVisible(false);
	    	    textField_f6.setVisible(false);
	    	    textField_f7.setVisible(false);
	    	    
	    	    textField_r1.setVisible(false);
	    	    textField_r2.setVisible(false);
	    	    textField_r3.setVisible(false);
	    	    textField_r4.setVisible(false);
	    	    textField_r5.setVisible(false);
	    	    textField_r6.setVisible(false);
	    	    
	    		
	    	    int t[] = new int[7];
	    		t[0] = 10;
	    		int which = 0;
	    		for( int i = 0 ; i < 7 ; i++ )
	    		{
	    			if( holes[i] == 1 )
	    			{
	    				which = i;
	    				break;
	    			}
	    		}
	    		int whip = 0;
	    		for( int i = 0 ; i < 6 ; i++ )
	    		{
	    			if( proc[i] == 1)
	    			{
	    				whip = i;
	    				break;
	    			}
	    		}
	    		if( whip == 0 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
	    		}
	    		else if( whip == 1 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
	    		}
	    		else if( whip == 2 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
	    		}
	    		else if( whip == 3 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
		    		p[3] = Integer.parseInt(textField_p4.getText());
	    		}
	    		else if( whip == 4 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
		    		p[3] = Integer.parseInt(textField_p4.getText());
		    		p[4] = Integer.parseInt(textField_p5.getText());
	    		}
	    		else
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
		    		p[3] = Integer.parseInt(textField_p4.getText());
		    		p[4] = Integer.parseInt(textField_p5.getText());
		    		p[5] = Integer.parseInt(textField_p6.getText());
	    		}
	    		
	    		
	    		if( which == 1 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(false);
		    	    textField_f4.setVisible(false);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
		    	    
	    		}
	    		else if( which == 2)
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(false);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
	    		}
	    		else if( which == 3 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
	    		}
	    		else if( which == 4 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		h[4] = Integer.parseInt(textField_h5.getText());
		    		
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(true);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
	    		}
	    		else if( which == 5 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		h[4] = Integer.parseInt(textField_h5.getText());
		    		h[5] = Integer.parseInt(textField_h6.getText());
		    		
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(true);
		    	    textField_f6.setVisible(true);
		    	    textField_f7.setVisible(false);
	    		}
	    		else 
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		h[4] = Integer.parseInt(textField_h5.getText());
		    		h[5] = Integer.parseInt(textField_h6.getText());
		    		h[6] = Integer.parseInt(textField_h7.getText());
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(true);
		    	    textField_f6.setVisible(true);
		    	    textField_f7.setVisible(true);
	    		}
	    		
	    		
	    		for( int i = 0 ; i < (which+1) ; i++ )
	    	    {
	    	        h4[i] = h[i];
	    	    }
	    	    for( int i = 0 ; i < (whip+1) ; i++ )
	    	    {
	    	        p4[i] = p[i];
	    	    }
	    	    int cn1 = 0;
	    	    
	    	    String s = "";
	    	    for( int i = 0 ; i < (whip+1) ; i++ )
	    	    {
	    	    	int act = 0;
	    	    	int minion[] = new int[(which+1)];
	    	    	
	    	    	for( int j = 0 ; j < (which+1) ; j++)
	    	    	{
	    	    		if( p4[i] <= h4[j] )
	    	            {
	    	                minion[j] = h4[j] - p4[i];
	    	            }
	    	            else
	    	            {
	    	                minion[j] = -100000;
	    	            }
	    	    	}
	    	    	int minio = minion[0];
	    	    	
	    	    	for( int j = 0 ; j < (which+1) ; j++ )
	    	    	{
	    	    		if( minion[j] > 0 )
	    	            {
	    	                if( minio <= minion[j])
	    	                {
	    	                	minio = minion[j];
		    	                act = j;
	    	                }
	    	            }
	    	    	}
	    	    	h4[act] = h4[act] - p4[i];
	    	    	if( h4[act] < 0 )
	    	    	{
	    	    		s += "SIMULATION STOPPED AT PROCESS NO : " + (i+1) + " AS ITS SIZE IS OUT OF RANGE : ";
	    	    	}
	    	    	else
	    	    	{
	    	    		s += "PROCESS NO : " + (i+1) + "ENTERS HOLE NO : " + (act+1);
	    	    		s += "SIZES OF REMAINING HOLES ARE : ";
	    	    		 int k = 0;
	    	                while( k <= which )
	    	                {
	    	                	s += "HOLE NO  " + (k+1) + " : " +  h4[k] + "  ";
	    	                	k++;
	    	                }
	    	                s += "\n";
	    	    	}
	    	    	
	    	    	
	    	    	cn1++;
	    	    }
	    	    
	    	    int flag = 1;
	    	    for( int i = 0 ; i < (which+1) ; i++ )
	    	    {
	    	    	if( h4[i] < 0 || cn1 != (whip+1) )
	    	    	{
	    	    		flag = 0;	
	    	    		break;
	    	    	}
	    	    }
	    	    
	    	    if( flag == 1)
	    	    {
	    	    	textField_a1.setText(Integer.toString(h4[0])  + " KB ");
		    	    textField_a2.setText(Integer.toString(h4[1])  + " KB ");
		    	    textField_a3.setText(Integer.toString(h4[2])  + " KB ");
		    	    textField_a4.setText(Integer.toString(h4[3])  + " KB ");
		    	    textField_a5.setText(Integer.toString(h4[4])  + " KB ");
		    	    textField_a6.setText(Integer.toString(h4[5])  + " KB ");
		    	    textField_a7.setText(Integer.toString(h4[6])  + " KB ");
		    	    
		    	   
		    	    textField_r1.setVisible(false);
		    	    textField_r2.setVisible(false);
		    	    textField_r3.setVisible(false);
		    	    textField_r4.setVisible(false);
		    	    textField_r5.setVisible(false);
		    	    textField_r6.setVisible(false);
		    	    textField_r7.setVisible(false);
		    	    textField_f1.setVisible(false);
		    	    textField_f2.setVisible(false);
		    	    textField_f3.setVisible(false);
		    	    textField_f4.setVisible(false);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
		    	    
		    	    
		    	    textField_f1.setBounds(t[0], 250, (h[0]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f1);
		    		textField_f1.setColumns(10);
		    		textField_f1.setText(Integer.toString(h[0]) + " KB ");
		    		
		    		t[1] = t[0] + (h[0]/2) + 20;
		    		

		    		
		    		textField_f2.setBounds(t[1], 250, (h[1]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f2);
		    		textField_f2.setColumns(10);
		    		textField_f2.setText(Integer.toString(h[1]) + " KB ");
		    		
		    		t[2] = t[1] + (h[1]/2) + 20;
		    		
		    		
		    		textField_f3.setBounds(t[2], 250, (h[2]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f3);
		    		textField_f3.setColumns(10);
		    		textField_f3.setText(Integer.toString(h[2]) + " KB ");
		    		
		    		t[3] = t[2] +  (h[2]/2) + 20;
		    		
		    
		    		textField_f4.setBounds(t[3] , 250, (h[3]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f4);
		    		textField_f4.setColumns(10);
		    		textField_f4.setText(Integer.toString(h[3]) + " KB ");
		    		
		    		t[4] = t[3] + (h[3]/2) + 20;
		    		
		    		
		    		textField_f5.setBounds(t[4], 250, (h[4]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f5);
		    		textField_f5.setColumns(10);
		    		textField_f5.setText(Integer.toString(h[4]) + " KB ");
		    		
		    		t[5] = t[4] + (h[4]/2) + 20;
		    		
		    		textField_f6.setBounds(t[5], 250, (h[5]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f6);
		    		textField_f5.setColumns(10);
		    		textField_f5.setText(Integer.toString(h[5]) + " KB ");
		    		
		    		t[6] = t[5] + (h[5]/2) + 20;
		    		
		    		textField_f7.setBounds(t[6], 250, (h[6]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f7);
		    		textField_f7.setColumns(10);
		    		textField_f7.setText(Integer.toString(h[6]) + " KB ");
		    		
		    		
		    		textField_r1.setBounds(t[0], 350 , (h4[0]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r1);
		  
		    		textField_r1.setColumns(10);
		    		textField_r1.setText(Integer.toString(h4[0]));
		    		
		    		t[1] = t[0] + (h[0]/2) + 20;
		    		
		    		
		    		
		    		textField_r2.setBounds(t[1], 350 , (h4[1]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r2);
		    		textField_r2.setColumns(10);
		    		textField_r2.setText(Integer.toString(h4[1]));
		    		
		    		t[2] = t[1] + (h[1]/2) + 20;
		    		
		    		
		    		textField_r3.setBounds(t[2], 350, (h4[2]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r3);
		    		textField_r3.setColumns(10);
		    		textField_r3.setText(Integer.toString(h4[2]));
		    		
		    		t[3] = t[2] +  (h[2]/2) + 20;
		    		
		    		
		    		textField_r4.setBounds(t[3] , 350, (h4[3]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r4);
		    		textField_r4.setColumns(10);
		    		textField_r4.setText(Integer.toString(h4[3]));
		    		
		    		t[4] = t[3] + (h[3]/2) + 20;
		    		
		    		
		    		textField_r5.setBounds(t[4], 350, (h4[4]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r5);
		    		textField_r5.setColumns(10);
		    		textField_r5.setText(Integer.toString(h4[4]));
		    		
		    		t[5] = t[4] + (h[4]/2) + 20;
		    		
		    		textField_r6.setBounds(t[5], 350, (h4[5]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r6);
		    		textField_r6.setColumns(10);
		    		textField_r6.setText(Integer.toString(h4[5]));
		    		
		    		t[6] = t[5] + (h[5]/2) + 20;
		    		
		    		textField_r7.setBounds(t[6], 350, (h4[6]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r7);
		    		textField_r7.setColumns(10);
		    		textField_r7.setText(Integer.toString(h4[6]));
		    		
		    		 if( which == 1 )
			    		{
			    			textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(false);
				    	    textField_r4.setVisible(false);
				    	    textField_r5.setVisible(false);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(false);
				    	    textField_f4.setVisible(false);
				    	    textField_f5.setVisible(false);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
				    	    
			    		}
			    	    else if ( which == 2 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(false);
				    	    textField_r5.setVisible(false);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(false);
				    	    textField_f5.setVisible(false);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if ( which == 3 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(false);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(false);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if( which == 4 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(true);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(true);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if( which == 5 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(true);
				    	    textField_r6.setVisible(true);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(true);
				    	    textField_f6.setVisible(true);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if( which == 6 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(true);
				    	    textField_r6.setVisible(true);
				    	    textField_r7.setVisible(true);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(true);
				    	    textField_f6.setVisible(true);
				    	    textField_f7.setVisible(true);
			    	    }
		    		
		    		int maxi = h4[0];
		    	    int mini = h4[0];
		    	    
		    	    
		    	    for( int i = 0 ; i < (which+1) ; i++ )
		    	    {
		    	        if( maxi < h4[i] )
		    	        {
		    	            maxi = h4[i];
		    	        }
		    	        if( mini > h4[i] )
		    	        {
		    	            mini = h4[i];
		    	        }
		    	    }
		    	    bestie[0] = mini;
		    	    int rem;
		    	    lblNewLabel.setVisible(true);
		    	    int v1=0,v2=0;
		    	    
		    	    for( int i = 0 ; i < (which+1) ; i++ )
		    	    {
		    	    	v1 += h[i];
		    	    	v2 += p4[i];
		    	    }
		    	    
		    	    rem = v1 - v2;
		    	    lblNewLabel.setText("TOTAL REMAINING EMPTY SPACE WOULD BE : " + rem + " KB ");
		    	    
		    	    
		    	    
	    	    }
	    	    else if( flag == 0)
	    	    {
	    	    	
	    	    		textField_a1.setText("ERR");
	    	    		textField_a2.setText("ERR");
	    	    		textField_a3.setText("ERR");
	    	    		textField_a4.setText("ERR");
	    	    		textField_a5.setText("ERR");
	    	    		textField_a6.setText("ERR");
	    	    		textField_a7.setText("ERR");
	    	    		textField_a1.setText(Integer.toString(h4[0])  + " KB ");
			    	    textField_a2.setText(Integer.toString(h4[1])  + " KB ");
			    	    textField_a3.setText(Integer.toString(h4[2])  + " KB ");
			    	    textField_a4.setText(Integer.toString(h4[3])  + " KB ");
			    	    textField_a5.setText(Integer.toString(h4[4])  + " KB ");
			    	    textField_a6.setText(Integer.toString(h4[5])  + " KB ");
			    	    textField_a7.setText(Integer.toString(h4[6])  + " KB ");
			    	    
			    	   
			    	    textField_r1.setVisible(false);
			    	    textField_r2.setVisible(false);
			    	    textField_r3.setVisible(false);
			    	    textField_r4.setVisible(false);
			    	    textField_r5.setVisible(false);
			    	    textField_r6.setVisible(false);
			    	    textField_r7.setVisible(false);
			    	    textField_f1.setVisible(false);
			    	    textField_f2.setVisible(false);
			    	    textField_f3.setVisible(false);
			    	    textField_f4.setVisible(false);
			    	    textField_f5.setVisible(false);
			    	    textField_f6.setVisible(false);
			    	    textField_f7.setVisible(false);
			    	    
			    	    
			    	    textField_f1.setBounds(t[0], 250, (h[0]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_f1);
			    		textField_f1.setColumns(10);
			    		textField_f1.setText(Integer.toString(h[0]) + " KB ");
			    		
			    		t[1] = t[0] + (h[0]/2) + 20;
			    		

			    		
			    		textField_f2.setBounds(t[1], 250, (h[1]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_f2);
			    		textField_f2.setColumns(10);
			    		textField_f2.setText(Integer.toString(h[1]) + " KB ");
			    		
			    		t[2] = t[1] + (h[1]/2) + 20;
			    		
			    		
			    		textField_f3.setBounds(t[2], 250, (h[2]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_f3);
			    		textField_f3.setColumns(10);
			    		textField_f3.setText(Integer.toString(h[2]) + " KB ");
			    		
			    		t[3] = t[2] +  (h[2]/2) + 20;
			    		
			    
			    		textField_f4.setBounds(t[3] , 250, (h[3]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_f4);
			    		textField_f4.setColumns(10);
			    		textField_f4.setText(Integer.toString(h[3]) + " KB ");
			    		
			    		t[4] = t[3] + (h[3]/2) + 20;
			    		
			    		
			    		textField_f5.setBounds(t[4], 250, (h[4]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_f5);
			    		textField_f5.setColumns(10);
			    		
			    		textField_f5.setBackground(Color.BLUE);
			    		textField_f5.setText(Integer.toString(h[4]) + " KB ");
			    		
			    		t[5] = t[4] + (h[4]/2) + 20;
			    		
			    		textField_f6.setBounds(t[5], 250, (h[5]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_f6);
			    		textField_f5.setColumns(10);
			    		textField_f5.setText(Integer.toString(h[5]) + " KB ");
			    		
			    		t[6] = t[5] + (h[5]/2) + 20;
			    		
			    		textField_f7.setBounds(t[6], 250, (h[6]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_f7);
			    		textField_f7.setColumns(10);
			    		textField_f7.setText(Integer.toString(h[6]) + " KB ");
			    		
			    		
			    		textField_r1.setBounds(t[0], 350 , (h[0]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_r1);
			    		textField_r1.setColumns(10);
			    		textField_r1.setBackground(Color.BLUE);
			    		textField_r1.setText(Integer.toString(h4[0]));
			    		
			    		t[1] = t[0] + (h[0]/2) + 20;
			    		
			    		
			    		
			    		textField_r2.setBounds(t[1], 350 , (h4[1]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_r2);
			    		textField_r2.setColumns(10);
			    		textField_r2.setText(Integer.toString(h4[1]));
			    		
			    		t[2] = t[1] + (h[1]/2) + 20;
			    		
			    		
			    		textField_r3.setBounds(t[2], 350, (h4[2]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_r3);
			    		textField_r3.setColumns(10);
			    		textField_r3.setText(Integer.toString(h4[2]));
			    		
			    		t[3] = t[2] +  (h[2]/2) + 20;
			    		
			    		
			    		textField_r4.setBounds(t[3] , 350, (h4[3]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_r4);
			    		textField_r4.setColumns(10);
			    		textField_r4.setText(Integer.toString(h4[3]));
			    		
			    		t[4] = t[3] + (h[3]/2) + 20;
			    		
			    		
			    		textField_r5.setBounds(t[4], 350, (h4[4]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_r5);
			    		textField_r5.setColumns(10);
			    		textField_r5.setText(Integer.toString(h4[4]));
			    		
			    		t[5] = t[4] + (h[4]/2) + 20;
			    		
			    		textField_r6.setBounds(t[5], 350, (h4[5]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_r6);
			    		textField_r6.setColumns(10);
			    		textField_r6.setText(Integer.toString(h4[5]));
			    		
			    		t[6] = t[5] + (h[5]/2) + 20;
			    		
			    		textField_r7.setBounds(t[6], 350, (h4[6]/2), 20);           
			    		frmMemoryAllocation.getContentPane().add(textField_r7);
			    		textField_r7.setColumns(10);
			    		textField_r7.setText(Integer.toString(h4[6]));
			    		
			    		 if( which == 1 )
				    		{
				    			textField_r1.setVisible(true);
					    	    textField_r2.setVisible(true);
					    	    textField_r3.setVisible(false);
					    	    textField_r4.setVisible(false);
					    	    textField_r5.setVisible(false);
					    	    textField_r6.setVisible(false);
					    	    textField_r7.setVisible(false);
					    	    textField_f1.setVisible(true);
					    	    textField_f2.setVisible(true);
					    	    textField_f3.setVisible(false);
					    	    textField_f4.setVisible(false);
					    	    textField_f5.setVisible(false);
					    	    textField_f6.setVisible(false);
					    	    textField_f7.setVisible(false);
					    	    
				    		}
				    	    else if ( which == 2 )
				    	    {
				    	    	textField_r1.setVisible(true);
					    	    textField_r2.setVisible(true);
					    	    textField_r3.setVisible(true);
					    	    textField_r4.setVisible(false);
					    	    textField_r5.setVisible(false);
					    	    textField_r6.setVisible(false);
					    	    textField_r7.setVisible(false);
					    	    textField_f1.setVisible(true);
					    	    textField_f2.setVisible(true);
					    	    textField_f3.setVisible(true);
					    	    textField_f4.setVisible(false);
					    	    textField_f5.setVisible(false);
					    	    textField_f6.setVisible(false);
					    	    textField_f7.setVisible(false);
				    	    }
				    	    else if ( which == 3 )
				    	    {
				    	    	textField_r1.setVisible(true);
					    	    textField_r2.setVisible(true);
					    	    textField_r3.setVisible(true);
					    	    textField_r4.setVisible(true);
					    	    textField_r5.setVisible(false);
					    	    textField_r6.setVisible(false);
					    	    textField_r7.setVisible(false);
					    	    textField_f1.setVisible(true);
					    	    textField_f2.setVisible(true);
					    	    textField_f3.setVisible(true);
					    	    textField_f4.setVisible(true);
					    	    textField_f5.setVisible(false);
					    	    textField_f6.setVisible(false);
					    	    textField_f7.setVisible(false);
				    	    }
				    	    else if( which == 4 )
				    	    {
				    	    	textField_r1.setVisible(true);
					    	    textField_r2.setVisible(true);
					    	    textField_r3.setVisible(true);
					    	    textField_r4.setVisible(true);
					    	    textField_r5.setVisible(true);
					    	    textField_r6.setVisible(false);
					    	    textField_r7.setVisible(false);
					    	    textField_f1.setVisible(true);
					    	    textField_f2.setVisible(true);
					    	    textField_f3.setVisible(true);
					    	    textField_f4.setVisible(true);
					    	    textField_f5.setVisible(true);
					    	    textField_f6.setVisible(false);
					    	    textField_f7.setVisible(false);
				    	    }
				    	    else if( which == 5 )
				    	    {
				    	    	textField_r1.setVisible(true);
					    	    textField_r2.setVisible(true);
					    	    textField_r3.setVisible(true);
					    	    textField_r4.setVisible(true);
					    	    textField_r5.setVisible(true);
					    	    textField_r6.setVisible(true);
					    	    textField_r7.setVisible(false);
					    	    textField_f1.setVisible(true);
					    	    textField_f2.setVisible(true);
					    	    textField_f3.setVisible(true);
					    	    textField_f4.setVisible(true);
					    	    textField_f5.setVisible(true);
					    	    textField_f6.setVisible(true);
					    	    textField_f7.setVisible(false);
				    	    }
				    	    else if( which == 6 )
				    	    {
				    	    	textField_r1.setVisible(true);
					    	    textField_r2.setVisible(true);
					    	    textField_r3.setVisible(true);
					    	    textField_r4.setVisible(true);
					    	    textField_r5.setVisible(true);
					    	    textField_r6.setVisible(true);
					    	    textField_r7.setVisible(true);
					    	    textField_f1.setVisible(true);
					    	    textField_f2.setVisible(true);
					    	    textField_f3.setVisible(true);
					    	    textField_f4.setVisible(true);
					    	    textField_f5.setVisible(true);
					    	    textField_f6.setVisible(true);
					    	    textField_f7.setVisible(true);
				    	    }
	    	    		JOptionPane.showMessageDialog(null, s + "\nERROR..!!\n THIS ALGORITHM IS NOT SUITABLE");
	    	    		
	    	    		
	    	    		
	    	    	
	    	    }
	    	    
	    	    
	    	    
	    	    
	    	   
	    	}
	    });
	    
	    
	    
	    
	    
	    
	    btnNewButton_3.setBounds(649, 131, 116, 23);
	    frmMemoryAllocation.getContentPane().add(btnNewButton_3);
	    
	    JButton btnNewButton_4 = new JButton("ANALYSE");
	    btnNewButton_4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		if( bestie[0] > bestie[1] )
	    		{
	    			JOptionPane.showMessageDialog(null, "ALGORITHM BEST SUITABLE IS : \n\n BEST FIT..!!" );
	    		}
	    		else 
	    		{
	    			JOptionPane.showMessageDialog(null, "ALGORITHM BEST SUITABLE IS : \n\n  FIRST FIT..!!" );
	    		}
	    		
	    		
	    		
	    		
	    		
	    	}
	    });
	    btnNewButton_4.setBounds(412, 461, 165, 23);
	    frmMemoryAllocation.getContentPane().add(btnNewButton_4);
	    
	    btnNewButton_5 = new JButton("REFRESH");
	    btnNewButton_5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		
	    		
	    	}
	    });
	    
	    
	    JInternalFrame internalFrame = new JInternalFrame("SIMULATOR");
	    internalFrame.setBorder(null);
	    internalFrame.getContentPane().setBackground(Color.RED);
	    internalFrame.getContentPane().setLayout(null);
	    
	    lblNewLabel = new JLabel("");
	    lblNewLabel.setForeground(Color.WHITE);
	    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
	    lblNewLabel.setBounds(638, 51, 691, 14);
	    internalFrame.getContentPane().add(lblNewLabel);
	    internalFrame.setBounds(0, 221, 1370, 350);
	    frmMemoryAllocation.getContentPane().add(internalFrame);
	    
	    btnNewButton_6 = new JButton("REFRESH");
	    btnNewButton_6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textField_r1.setVisible(false);
	    		textField_r2.setVisible(false);
	    		textField_r3.setVisible(false);
	    		textField_r4.setVisible(false);
	    		textField_r5.setVisible(false);
	    		
	    		textField_f1.setVisible(false);
	    		textField_f2.setVisible(false);
	    		textField_f3.setVisible(false);
	    		textField_f4.setVisible(false);
	    		textField_f5.setVisible(false);
	    		lblNewLabel.setVisible(false);
	    		
	    		
	    	}
	    });
	    btnNewButton_6.setBounds(703, 161, 89, 23);
	    frmMemoryAllocation.getContentPane().add(btnNewButton_6);
	    
	    btnNewButton_7 = new JButton("RESTART");
	    btnNewButton_7.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textField_h1.setText(null);
	    		textField_h2.setText(null);
	    		textField_h3.setText(null);
	    		textField_h4.setText(null);
	    		textField_h5.setText(null);
	    		textField_h6.setText(null);
	    		textField_h7.setText(null);
	    		
	    		textField_p1.setText(null);
	    		textField_p2.setText(null);
	    		textField_p3.setText(null);
	    		textField_p4.setText(null);
	    		textField_p5.setText(null);
	    		textField_p6.setText(null);
	    		
	    		textField_a1.setText(null);
	    		textField_a2.setText(null);
	    		textField_a3.setText(null);
	    		textField_a4.setText(null);
	    		textField_a5.setText(null);
	    		textField_a6.setText(null);
	    		textField_a7.setText(null);
	    		
	    		lblNewLabel.setVisible(false);
	    	}
	    });
	    btnNewButton_7.setBounds(802, 161, 150, 23);
	    frmMemoryAllocation.getContentPane().add(btnNewButton_7);
	    
	    btnNewButton_8 = new JButton("2");
	    btnNewButton_8.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for( int i = 0 ; i < 7 ; i++ )
	    		{
	    			holes[i] = 0;
	    		}
	    		holes[1] = 1;
	    		textField_h1.setVisible(true);
	    		textField_h2.setVisible(true);
	    		textField_h3.setVisible(false);
	    		textField_h4.setVisible(false);
	    		textField_h5.setVisible(false);
	    		textField_h6.setVisible(false);
	    		textField_h7.setVisible(false);
	    		textField_a1.setVisible(true);
	    		textField_a2.setVisible(true);
	    		textField_a3.setVisible(false);
	    		textField_a4.setVisible(false);
	    		textField_a5.setVisible(false);
	    		textField_a6.setVisible(false);
	    		textField_a7.setVisible(false);
	    			    		
	    	}
	    });
	    btnNewButton_8.setBounds(579, 3, 47, 23);
	    frmMemoryAllocation.getContentPane().add(btnNewButton_8);
	    
	    button = new JButton("3");
	    button.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for( int i = 0 ; i < 7 ; i++ )
	    		{
	    			holes[i] = 0;
	    		}
	    		holes[2] = 1;
	    		textField_h1.setVisible(true);
	    		textField_h2.setVisible(true);
	    		textField_h3.setVisible(true);
	    		textField_h4.setVisible(false);
	    		textField_h5.setVisible(false);
	    		textField_h6.setVisible(false);
	    		textField_h7.setVisible(false);
	    		textField_a1.setVisible(true);
	    		textField_a2.setVisible(true);
	    		textField_a3.setVisible(true);
	    		textField_a4.setVisible(false);
	    		textField_a5.setVisible(false);
	    		textField_a6.setVisible(false);
	    		textField_a7.setVisible(false);
	    	}
	    });
	    button.setBounds(641, 3, 47, 23);
	    frmMemoryAllocation.getContentPane().add(button);
	    
	    button_1 = new JButton("4");
	    button_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for( int i = 0 ; i < 7 ; i++ )
	    		{
	    			holes[i] = 0;
	    		}
	    		holes[3] = 1;
	    		textField_h1.setVisible(true);
	    		textField_h2.setVisible(true);
	    		textField_h3.setVisible(true);
	    		textField_h4.setVisible(true);
	    		textField_h5.setVisible(false);
	    		textField_h6.setVisible(false);
	    		textField_h7.setVisible(false);
	    		textField_a1.setVisible(true);
	    		textField_a2.setVisible(true);
	    		textField_a3.setVisible(true);
	    		textField_a4.setVisible(true);
	    		textField_a5.setVisible(false);
	    		textField_a6.setVisible(false);
	    		textField_a7.setVisible(false);
	    	}
	    });
	    button_1.setBounds(700, 3, 47, 23);
	    frmMemoryAllocation.getContentPane().add(button_1);
	    
	    button_2 = new JButton("5");
	    button_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		
	    		for( int i = 0 ; i < 7 ; i++ )
	    		{
	    			holes[i] = 0;
	    		}
	    		holes[4] = 1;
	    		
	    		textField_h1.setVisible(true);
	    		textField_h2.setVisible(true);
	    		textField_h3.setVisible(true);
	    		textField_h4.setVisible(true);
	    		textField_h5.setVisible(true);
	    		textField_h6.setVisible(false);
	    		textField_h7.setVisible(false);
	    		textField_a1.setVisible(true);
	    		textField_a2.setVisible(true);
	    		textField_a3.setVisible(true);
	    		textField_a4.setVisible(true);
	    		textField_a5.setVisible(true);
	    		textField_a6.setVisible(false);
	    		textField_a7.setVisible(false);
	    	}
	    });
	    button_2.setBounds(757, 3, 47, 23);
	    frmMemoryAllocation.getContentPane().add(button_2);
	    
	    button_3 = new JButton("6");
	    button_3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for( int i = 0 ; i < 7 ; i++ )
	    		{
	    			holes[i] = 0;
	    		}
	    		holes[5] = 1;
	    		textField_h1.setVisible(true);
	    		textField_h2.setVisible(true);
	    		textField_h3.setVisible(true);
	    		textField_h4.setVisible(true);
	    		textField_h5.setVisible(true);
	    		textField_h6.setVisible(true);
	    		textField_h6.setVisible(true);
	    		textField_a1.setVisible(true);
	    		textField_a2.setVisible(true);
	    		textField_a3.setVisible(true);
	    		textField_a4.setVisible(true);
	    		textField_a5.setVisible(true);
	    		textField_a6.setVisible(true);
	    		textField_a7.setVisible(false);
	    		
	    		
	    		
	    		
	    	}
	    });
	    button_3.setBounds(814, 3, 47, 23);
	    frmMemoryAllocation.getContentPane().add(button_3);
	    
	    button_4 = new JButton("7");
	    button_4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for( int i = 0 ; i < 7 ; i++ )
	    		{
	    			holes[i] = 0;
	    		}
	    		holes[6] = 1;
	    		textField_h1.setVisible(true);
	    		textField_h2.setVisible(true);
	    		textField_h3.setVisible(true);
	    		textField_h4.setVisible(true);
	    		textField_h5.setVisible(true);
	    		textField_h6.setVisible(true);
	    		textField_h7.setVisible(true);
	    		textField_a1.setVisible(true);
	    		textField_a2.setVisible(true);
	    		textField_a3.setVisible(true);
	    		textField_a4.setVisible(true);
	    		textField_a5.setVisible(true);
	    		textField_a6.setVisible(true);
	    		textField_a7.setVisible(true);
	    	}
	    });
	    button_4.setBounds(873, 3, 47, 23);
	    frmMemoryAllocation.getContentPane().add(button_4);
	    
	    button_5 = new JButton("1");
	    button_5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for( int i = 0 ; i < 6 ; i++ )
	    		{
	    			proc[i] = 0;
	    		}
	    		proc[0] = 1;
	    		textField_p1.setVisible(true);
	    		textField_p2.setVisible(false);
	    		textField_p3.setVisible(false);
	    		textField_p4.setVisible(false);
	    		textField_p5.setVisible(false);
	    		textField_p6.setVisible(false);
	    	}

	    });
	    button_5.setBounds(587, 59, 47, 23);
	    frmMemoryAllocation.getContentPane().add(button_5);
	    
	    button_6 = new JButton("2");
	    button_6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for( int i = 0 ; i < 6 ; i++ )
	    		{
	    			proc[i] = 0;
	    		}
	    		proc[1] = 1;
	    		textField_p1.setVisible(true);
	    		textField_p2.setVisible(true);
	    		textField_p3.setVisible(false);
	    		textField_p4.setVisible(false);
	    		textField_p5.setVisible(false);
	    		textField_p6.setVisible(false);
	    	}
	    });
	    button_6.setBounds(644, 59, 47, 23);
	    frmMemoryAllocation.getContentPane().add(button_6);
	    
	    button_7 = new JButton("3");
	    button_7.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for( int i = 0 ; i < 6 ; i++ )
	    		{
	    			proc[i] = 0;
	    		}
	    		proc[2] = 1;
	    		textField_p1.setVisible(true);
	    		textField_p2.setVisible(true);
	    		textField_p3.setVisible(true);
	    		textField_p4.setVisible(false);
	    		textField_p5.setVisible(false);
	    		textField_p6.setVisible(false);
	    	}
	    });
	    button_7.setBounds(700, 59, 47, 23);
	    frmMemoryAllocation.getContentPane().add(button_7);
	    
	    button_8 = new JButton("4");
	    button_8.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for( int i = 0 ; i < 6 ; i++ )
	    		{
	    			proc[i] = 0;
	    		}
	    		proc[3] = 1;
	    		textField_p1.setVisible(true);
	    		textField_p2.setVisible(true);
	    		textField_p3.setVisible(true);
	    		textField_p4.setVisible(true);
	    		textField_p5.setVisible(false);
	    		textField_p6.setVisible(false);
	    	}
	    });
	    button_8.setBounds(757, 59, 47, 23);
	    frmMemoryAllocation.getContentPane().add(button_8);
	    
	    button_9 = new JButton("5");
	    button_9.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for( int i = 0 ; i < 6 ; i++ )
	    		{
	    			proc[i] = 0;
	    		}
	    		proc[4] = 1;
	    		textField_p1.setVisible(true);
	    		textField_p2.setVisible(true);
	    		textField_p3.setVisible(true);
	    		textField_p4.setVisible(true);
	    		textField_p5.setVisible(true);
	    		textField_p6.setVisible(false);
	    		
	    	}
	    });
	    button_9.setBounds(814, 59, 47, 23);
	    frmMemoryAllocation.getContentPane().add(button_9);
	    
	    button_10 = new JButton("6");
	    button_10.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for( int i = 0 ; i < 6 ; i++ )
	    		{
	    			proc[i] = 0;
	    		}
	    		proc[5] = 1;
	    		textField_p1.setVisible(true);
	    		textField_p2.setVisible(true);
	    		textField_p3.setVisible(true);
	    		textField_p4.setVisible(true);
	    	
	    		textField_p5.setVisible(true);
	    		textField_p6.setVisible(true);
	    	}
	    });
	    button_10.setBounds(873, 59, 47, 23);
	    frmMemoryAllocation.getContentPane().add(button_10);
	    
	    textField_h6 = new JTextField();
	    textField_h6.setColumns(10);
	    textField_h6.setBounds(698, 32, 67, 20);
	    frmMemoryAllocation.getContentPane().add(textField_h6);
	    
	    textField_h7 = new JTextField();
	    textField_h7.setColumns(10);
	    textField_h7.setBounds(782, 32, 67, 20);
	    frmMemoryAllocation.getContentPane().add(textField_h7);
	    
	    textField_p5 = new JTextField();
	    textField_p5.setColumns(10);
	    textField_p5.setBounds(691, 88, 86, 20);
	    frmMemoryAllocation.getContentPane().add(textField_p5);
	    
	    textField_p6 = new JTextField();
	    textField_p6.setColumns(10);
	    textField_p6.setBounds(796, 88, 86, 20);
	    frmMemoryAllocation.getContentPane().add(textField_p6);
	    
	    textField_a6 = new JTextField();
	    textField_a6.setColumns(10);
	    textField_a6.setBounds(713, 190, 67, 20);
	    frmMemoryAllocation.getContentPane().add(textField_a6);
	    
	    textField_a7 = new JTextField();
	    textField_a7.setColumns(10);
	    textField_a7.setBounds(812, 190, 67, 20);
	    frmMemoryAllocation.getContentPane().add(textField_a7);
	    
	    
	    
//*********************************************************************************************************//
//*********************************************************************************************************//
	    
	    
	    
	    JButton btnNextFit = new JButton("NEXT FIT");
	    btnNextFit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		
	    		int n = 7;
	    		int m = 6;
	    		
	    		
	    		int h[] = new int[n];
	    		int p[] = new int[m];
	    		
	    		int h1[] = new int[n];
	    		int p1[] = new int[m];
	    		
	    		
	    		    		
                int t[] = new int[7];
	    		t[0] = 10;
	    		int which = 0;
	    		for( int i = 0 ; i < 7 ; i++ )
	    		{
	    			if( holes[i] == 1 )
	    			{
	    				which = i;
	    				break;
	    			}
	    		}
	    		int whip = 0;
	    		for( int i = 0 ; i < 6 ; i++ )
	    		{
	    			if( proc[i] == 1)
	    			{
	    				whip = i;
	    				break;
	    			}
	    		}
	    		if( whip == 0 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
	    		}
	    		else if( whip == 1 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
	    		}
	    		else if( whip == 2 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
	    		}
	    		else if( whip == 3 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
		    		p[3] = Integer.parseInt(textField_p4.getText());
	    		}
	    		else if( whip == 4 )
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
		    		p[3] = Integer.parseInt(textField_p4.getText());
		    		p[4] = Integer.parseInt(textField_p5.getText());
	    		}
	    		else
	    		{
	    			p[0] = Integer.parseInt(textField_p1.getText());
		    		p[1] = Integer.parseInt(textField_p2.getText());
		    		p[2] = Integer.parseInt(textField_p3.getText());
		    		p[3] = Integer.parseInt(textField_p4.getText());
		    		p[4] = Integer.parseInt(textField_p5.getText());
		    		p[5] = Integer.parseInt(textField_p6.getText());
	    		}
	    		
	    		
	    		if( which == 1 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(false);
		    	    textField_f4.setVisible(false);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
		    	    
	    		}
	    		else if( which == 2)
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(false);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
	    		}
	    		else if( which == 3 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
	    		}
	    		else if( which == 4 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		h[4] = Integer.parseInt(textField_h5.getText());
		    		
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(true);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
	    		}
	    		else if( which == 5 )
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		h[4] = Integer.parseInt(textField_h5.getText());
		    		h[5] = Integer.parseInt(textField_h6.getText());
		    		
		    		
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(true);
		    	    textField_f6.setVisible(true);
		    	    textField_f7.setVisible(false);
	    		}
	    		else 
	    		{
	    			h[0] = Integer.parseInt(textField_h1.getText());
		    		h[1] = Integer.parseInt(textField_h2.getText());
		    		h[2] = Integer.parseInt(textField_h3.getText());
		    		h[3] = Integer.parseInt(textField_h4.getText());
		    		h[4] = Integer.parseInt(textField_h5.getText());
		    		h[5] = Integer.parseInt(textField_h6.getText());
		    		h[6] = Integer.parseInt(textField_h7.getText());
		    		
	    			textField_f1.setVisible(true);
		    	    textField_f2.setVisible(true);
		    	    textField_f3.setVisible(true);
		    	    textField_f4.setVisible(true);
		    	    textField_f5.setVisible(true);
		    	    textField_f6.setVisible(true);
		    	    textField_f7.setVisible(true);
	    		}
	    		
	    		
	    		
	    		
	    		
	    		for( int i = 0 ; i < (which+1) ; i++ )
	    	    {
	    	        h1[i] = h[i];
	    	    }
	    	    for( int i = 0 ; i < (whip+1) ; i++ )
	    	    {
	    	        p1[i] = p[i];
	    	    }
	    	    String s = "";
	    	    int cnt1 = 0;
	    	    for( int i = 0 ; i < (whip+1) ; i++ )
	    	    {
	    	        for( int j = 0 ; j < (which+1) ; j++ )
	    	        {
	    	            if( p1[i] <= h1[j] )
	    	            {
	    	                h1[j] = h1[j] - p1[i];
	    	                s += "PROCESS NO : " + (i+1) + "ENTERED HOLE NO : " + (j+1) + "\n";
	    	                s+= "SIZES OF REMAINING HOLES ARE : ";
	    	                int k = 0;
	    	                while( k <= which )
	    	                {
	    	                	s += "HOLE NO  " + (k+1) + " : " +  h1[k] + "  ";
	    	                	k++;
	    	                }
	    	                s += "\n";
	    	                cnt1++;
	    	                break;
	    	            }
	    	            else
	    	            {
	    	                continue;
	    	            }
	    	        }
	    	    }
	    	    
	    	    int flag = 1;
	    	    for( int i = 0 ; i < (which+1) ; i++ )
	    	    {
	    	    	if( h1[i] < 0 || cnt1 != (whip+1) )
	    	    	{
	    	    		flag = 0;
	    	    		
	    	    	
	    	    		break;
	    	    	}
	    	    }
	    	    
	    	   
	    	    
	    	    
	    	    if( flag == 1)
	    	    {
	    	    	textField_a1.setText(Integer.toString(h1[0])  + " KB ");
		    	    textField_a2.setText(Integer.toString(h1[1])  + " KB ");
		    	    textField_a3.setText(Integer.toString(h1[2])  + " KB ");
		    	    textField_a4.setText(Integer.toString(h1[3])  + " KB ");
		    	    textField_a5.setText(Integer.toString(h1[4])  + " KB ");
		    	    textField_a6.setText(Integer.toString(h1[5])  + " KB ");
		    	    textField_a7.setText(Integer.toString(h1[6])  + " KB ");
		    	    
		    	   
		    	    textField_r1.setVisible(false);
		    	    textField_r2.setVisible(false);
		    	    textField_r3.setVisible(false);
		    	    textField_r4.setVisible(false);
		    	    textField_r5.setVisible(false);
		    	    textField_r6.setVisible(false);
		    	    textField_r7.setVisible(false);
		    	    textField_f1.setVisible(false);
		    	    textField_f2.setVisible(false);
		    	    textField_f3.setVisible(false);
		    	    textField_f4.setVisible(false);
		    	    textField_f5.setVisible(false);
		    	    textField_f6.setVisible(false);
		    	    textField_f7.setVisible(false);
		    	    
		    	    
		    	    textField_f1.setBounds(t[0], 250, (h[0]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f1);
		    		textField_f1.setColumns(10);
		    		textField_f1.setText(Integer.toString(h[0]) + " KB ");
		    		
		    		t[1] = t[0] + (h[0]/2) + 20;
		    		

		    		
		    		textField_f2.setBounds(t[1], 250, (h[1]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f2);
		    		textField_f2.setColumns(10);
		    		textField_f2.setText(Integer.toString(h[1]) + " KB ");
		    		
		    		t[2] = t[1] + (h[1]/2) + 20;
		    		
		    		
		    		textField_f3.setBounds(t[2], 250, (h[2]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f3);
		    		textField_f3.setColumns(10);
		    		textField_f3.setText(Integer.toString(h[2]) + " KB ");
		    		
		    		t[3] = t[2] +  (h[2]/2) + 20;
		    		
		    
		    		textField_f4.setBounds(t[3] , 250, (h[3]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f4);
		    		textField_f4.setColumns(10);
		    		textField_f4.setText(Integer.toString(h[3]) + " KB ");
		    		
		    		t[4] = t[3] + (h[3]/2) + 20;
		    		
		    		
		    		textField_f5.setBounds(t[4], 250, (h[4]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f5);
		    		textField_f5.setColumns(10);
		    		textField_f5.setBackground(Color.WHITE);
		    		textField_f5.setText(Integer.toString(h[4]) + " KB ");
		    		
		    		t[5] = t[4] + (h[4]/2) + 20;
		    		
		    		textField_f6.setBounds(t[5], 250, (h[5]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f6);
		    		textField_f6.setColumns(10);
		    		textField_f6.setText(Integer.toString(h[5]) + " KB ");
		    		
		    		t[6] = t[5] + (h[5]/2) + 20;
		    		
		    		textField_f7.setBounds(t[6], 250, (h[6]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_f7);
		    		textField_f7.setColumns(10);
		    		textField_f7.setText(Integer.toString(h[6]) + " KB ");
		    		
		    		
		    		textField_r1.setBounds(t[0], 350 , (h1[0]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r1);
		    		textField_r1.setColumns(10);
		    		textField_r1.setBackground(Color.WHITE);
		    		textField_r1.setText(Integer.toString(h1[0]));
		    		
		    		t[1] = t[0] + (h[0]/2) + 20;
		    		
		    		
		    		
		    		textField_r2.setBounds(t[1], 350 , (h1[1]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r2);
		    		textField_r2.setColumns(10);
		    		textField_r2.setText(Integer.toString(h1[1]));
		    		
		    		t[2] = t[1] + (h[1]/2) + 20;
		    		
		    		
		    		textField_r3.setBounds(t[2], 350, (h1[2]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r3);
		    		textField_r3.setColumns(10);
		    		textField_r3.setText(Integer.toString(h1[2]));
		    		
		    		t[3] = t[2] +  (h[2]/2) + 20;
		    		
		    		
		    		textField_r4.setBounds(t[3] , 350, (h1[3]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r4);
		    		textField_r4.setColumns(10);
		    		textField_r4.setText(Integer.toString(h1[3]));
		    		
		    		t[4] = t[3] + (h[3]/2) + 20;
		    		
		    		
		    		textField_r5.setBounds(t[4], 350, (h1[4]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r5);
		    		textField_r5.setColumns(10);
		    		textField_r5.setText(Integer.toString(h1[4]));
		    		
		    		t[5] = t[4] + (h[4]/2) + 20;
		    		
		    		textField_r6.setBounds(t[5], 350, (h1[5]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r6);
		    		textField_r6.setColumns(10);
		    		textField_r6.setText(Integer.toString(h1[5]));
		    		
		    		t[6] = t[5] + (h[5]/2) + 20;
		    		
		    		textField_r7.setBounds(t[6], 350, (h1[6]/2), 20);           
		    		frmMemoryAllocation.getContentPane().add(textField_r7);
		    		textField_r7.setColumns(10);
		    		textField_r7.setText(Integer.toString(h1[6]));
		    		
		    		 if( which == 1 )
			    		{
			    			textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(false);
				    	    textField_r4.setVisible(false);
				    	    textField_r5.setVisible(false);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(false);
				    	    textField_f4.setVisible(false);
				    	    textField_f5.setVisible(false);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
				    	    
			    		}
			    	    else if ( which == 2 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(false);
				    	    textField_r5.setVisible(false);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(false);
				    	    textField_f5.setVisible(false);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if ( which == 3 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(false);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(false);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if( which == 4 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(true);
				    	    textField_r6.setVisible(false);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(true);
				    	    textField_f6.setVisible(false);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if( which == 5 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(true);
				    	    textField_r6.setVisible(true);
				    	    textField_r7.setVisible(false);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(true);
				    	    textField_f6.setVisible(true);
				    	    textField_f7.setVisible(false);
			    	    }
			    	    else if( which == 6 )
			    	    {
			    	    	textField_r1.setVisible(true);
				    	    textField_r2.setVisible(true);
				    	    textField_r3.setVisible(true);
				    	    textField_r4.setVisible(true);
				    	    textField_r5.setVisible(true);
				    	    textField_r6.setVisible(true);
				    	    textField_r7.setVisible(true);
				    	    textField_f1.setVisible(true);
				    	    textField_f2.setVisible(true);
				    	    textField_f3.setVisible(true);
				    	    textField_f4.setVisible(true);
				    	    textField_f5.setVisible(true);
				    	    textField_f6.setVisible(true);
				    	    textField_f7.setVisible(true);
			    	    }
		    		
		    		int maxi = h1[0];
		    	    int mini = h1[0];
		    	    
		    	    
		    	    for( int i = 0 ; i < (which+1) ; i++ )
		    	    {
		    	        if( maxi < h1[i] )
		    	        {
		    	            maxi = h1[i];
		    	        }
		    	        if( mini > h1[i] )
		    	        {
		    	            mini = h1[i];
		    	        }
		    	    }
		    	    bestie[0] = mini;
		    	    int rem;
		    	    lblNewLabel.setVisible(true);
		    	    int v1=0,v2=0;
		    	    for( int i = 0 ; i < (which+1) ; i++ )
		    	    {
		    	    	v1 += h[i];
		    	    	v2 += p1[i];
		    	    }
		    	    
		    	    rem = v1 - v2;
		    	    lblNewLabel.setText("TOTAL REMAINING EMPTY SPACE WOULD BE : " + rem + " KB ");
		    	    JOptionPane.showMessageDialog(null , s);
		    	    
		    	    
	    	    }
	    	    else if( flag == 0)
	    	    {
	    	    	
	    	    		textField_a1.setText("ERR");
	    	    		textField_a2.setText("ERR");
	    	    		textField_a3.setText("ERR");
	    	    		textField_a4.setText("ERR");
	    	    		textField_a5.setText("ERR");
	    	    		textField_a6.setText("ERR");
	    	    		textField_a7.setText("ERR");
	    	    		JOptionPane.showMessageDialog(null, "ERROR..!!\n THIS ALGORITHM IS NOT SUITABLE");
	    	    		bestie[0] = 10000;
	    	    	
	    	    }
	    	    
	    	    
	    	}
	    		
	    	
	    });
	    btnNextFit.setBounds(393, 131, 116, 23);
	    frmMemoryAllocation.getContentPane().add(btnNextFit);
	    internalFrame.setVisible(true);
	    
	    
	}
}
