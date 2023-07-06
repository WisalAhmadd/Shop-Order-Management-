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
import javax.swing.JOptionPane;

public class Sapphire extends Dress {
        private boolean Stitch; 

        private String Dress;
        String[] Dresses = { "Fusion", "EMBROIDERED DOBBY", "CAMBRIC PANTS" ,"ZARI LAWN","JACQUARD SUIT","DYED SUIT"};

	public Sapphire(String size,int amount,Label lbl) {
		super(size, amount);
        try {
            Dress = (String) JOptionPane.showInputDialog(lbl, "Select The Type.", "Select The Type Of Dress ",
                    JOptionPane.QUESTION_MESSAGE, null, Dresses, Dresses[0]);
            if(JOptionPane.showConfirmDialog(lbl, "Would you like To be Stritched?","Stitching",JOptionPane.YES_NO_OPTION)==0) Stitch=true;
		else Stitch=false;
            double price;
            if (size.equals("Small"))
                price = 500;
            else if (size.equals("Medium"))
                price = 700;
            else
                price = 900;
            if (Dress.equals("Fusion"))
                price += 1250;
            if (Dress.equals("EMBROIDERED DOBBY"))
                price += 1599;
            if (Dress.equals("CAMBRIC PANTS"))
                price += 1199;
            if (Dress.equals("ZARI LAWN"))
                price += 1499;
            if (Dress.equals("JACQUARD SUIT"))
                price += 1799;
            if (Dress.equals("DYED SUIT"))
                price += 1400;
            if(Stitch) price += 1500;
		setPrice(price);
            setPrice(price);
        } catch (NullPointerException e) {
        }
    }

	@Override
	public String toString() {
		if(Stitch) return super.toString()+" Stitch Of Sapphire " + Dress;
		else return super.toString() + " Unstitched Of Sapphire" + Dress;
	}
}
