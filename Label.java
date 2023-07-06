/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShopStop;

/**
 *
 * @author Wisal Khattak
 */
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Label extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JLabel lblSize,lblDr,lblG,lblReport;
	private JComboBox<String> size;
	private JRadioButton rdAfghan,rdJunaidJ,rdSapphire,rdZARA;
	private ButtonGroup btnGroup;
	private JTextField txtDresss;
	private JButton btnAdd,btnOrder,btnGallery;

	int amount_of;
	ArrayList<Dress> list_of_Dress = new ArrayList<Dress>();
	
	public Label() {
		setLayout(null);
		setSize(600,400);
		setLocationRelativeTo(null);
		setTitle("                                                  Store By Wisal Ahmad 😎");
		init();
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd.addActionListener(this); 
		btnOrder.addActionListener(this);
		setVisible(true);
                setResizable(false);
	}
	
	public void init() {
		lblSize = new JLabel("Select size:");
		lblSize.setSize(250, 50);
		lblSize.setLocation(100, 10);
		add(lblSize);
		
		String[] sizes = {"Small","Medium","Large"};
		size = new JComboBox<String>(sizes);//
		size.setSelectedIndex(0);
		size.setSize(100, 25);
		size.setLocation(100, 50);
		add(size);
		
		lblDr = new JLabel("Select which type of Dress you want to order:");
		lblDr.setSize(500, 50);
		lblDr.setLocation(100, 75);
		add(lblDr);
		
		btnGroup = new ButtonGroup();
            
		
		rdAfghan= new JRadioButton("Afghani");
		rdAfghan.setSize(75, 50);
		rdAfghan.setLocation(100, 110);
		add(rdAfghan);
		
		rdJunaidJ = new JRadioButton("J.");
		rdJunaidJ.setSize(75, 50);
		rdJunaidJ.setLocation(175, 110);
		add(rdJunaidJ);
		
		rdSapphire = new JRadioButton("Sapphire");
		rdSapphire.setSize(90, 50);
		rdSapphire.setLocation(250, 110);
		add(rdSapphire);
		
		rdZARA = new JRadioButton("Zara");
		rdZARA.setSize(75, 50);
		rdZARA.setLocation(350, 110);
		add(rdZARA);
		
		btnGroup.add(rdAfghan);
		btnGroup.add(rdJunaidJ);
		btnGroup.add(rdSapphire);
		btnGroup.add(rdZARA);
		
		lblG = new JLabel("Type how many Dresses you want to order:");
		lblG.setSize(500, 50);
		lblG.setLocation(100, 145);
		add(lblG);
		
		txtDresss = new JTextField();
		txtDresss.setSize(300, 25);
		txtDresss.setLocation(100, 185);
		add(txtDresss);
		
		btnAdd = new JButton("Add");
		btnAdd.setSize(80, 40);
		btnAdd.setLocation(80, 230);
                btnAdd.setBackground(Color.orange);
		add(btnAdd);
		
		btnOrder = new JButton("Order");
		btnOrder.setSize(80, 40);
		btnOrder.setLocation(340, 230);
		btnOrder.setEnabled(true);
                btnOrder.setBackground(Color.GREEN);
		add(btnOrder);
		
                btnGallery = new JButton("Collections");
		btnGallery.setSize(100, 40);
		btnGallery.setLocation(200, 230);
		btnGallery.setEnabled(true);
                btnGallery.setBackground(Color.WHITE);
		add(btnGallery);
                btnGallery.addActionListener(this);
                
		lblReport = new JLabel();
		lblReport.setSize(500, 50);
		lblReport.setLocation(100, 270);
		add(lblReport);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String size_of = (String)size.getSelectedItem();
		if(e.getSource().equals(btnAdd)) {
			if( rdAfghan.isSelected() || rdSapphire.isSelected() || rdZARA.isSelected() || rdJunaidJ.isSelected() && !(txtDresss.getText().isEmpty())) {
				try {
					amount_of  = Integer.parseInt(txtDresss.getText().trim());
					Dress Drs;
					if(rdAfghan.isSelected())  
                                            { Drs = new Afghani(size_of,amount_of,this); }
					else if(rdJunaidJ.isSelected())  
                                            { Drs = new JJ(size_of,amount_of,this); }
					else if(rdSapphire.isSelected())   
                                            { Drs = new Sapphire(size_of,amount_of,this); }
					else 
                                            { Drs = new ZARA(size_of,amount_of,this); }
					txtDresss.setText(null);
					list_of_Dress.add(Drs);
					lblReport.setText(Drs.toString()+" added");
					btnGroup.clearSelection();
					btnOrder.setEnabled(true);
				}
				catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(this, "Enter an integer as amount");
				}
			}	
			else { JOptionPane.showMessageDialog(this, "Choose a Dress type and enter an amount"); 
	
			}
		}
		if(e.getSource().equals(btnOrder)) {
			String report = "";
			double pay=0.0;
			for(int i=0;i<list_of_Dress.size();i++) {
				Dress All_Dresses = list_of_Dress.get(i);
				report += All_Dresses.toString();
				double Total_PRICE = All_Dresses.getAmount() * All_Dresses.getPrice();
				pay += Total_PRICE; // add the total amount to be paid
				report = report + " - "+Total_PRICE+" Rs\n";
                             

			}
			JOptionPane.showMessageDialog(this, report);
			JOptionPane.showMessageDialog(this,	 "You should pay "+pay+" Rs");
                       JOptionPane.showMessageDialog(this,"Thank You For Your Order!    ");

			lblReport.setText(null);
			btnOrder.setEnabled(false);
			list_of_Dress.clear();
                        
		}
                
                if(e.getSource().equals(btnGallery)) {
                    
                    Gallery ss = new Gallery();

		}
                
	}
        
        

	public static void main(String[] args) {
            
           JOptionPane.showMessageDialog(null, "Welcome To Our Shopping Mart \n\n We Offer Local And Branded Fabrics & Garments \n \n                         Wisal Ahmad");
		new Label();

                
	}
}

