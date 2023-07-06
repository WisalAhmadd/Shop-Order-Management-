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

public class ZARA extends Dress {
        private boolean Stitch; 

        private String Dress;
        String[] Dresses = { "Linen(Blend)", "Floral", "Haul","Voluminous","SMIDOW","Embroidered" };	
        public ZARA(String size,int amount,Label lbl) {
		super(size, amount);
        try {
            Dress = (String) JOptionPane.showInputDialog(lbl, "Select The Type.", "Select The Type Of Dress ",
                    JOptionPane.QUESTION_MESSAGE, null, Dresses, Dresses[0]);
            if(JOptionPane.showConfirmDialog(lbl, "Would you like To be Stritched?","Stitching",JOptionPane.YES_NO_OPTION)==0) Stitch=true;
		else Stitch=false;
            double price;
            if (size.equals("Small"))
                price = 500.0;
            else if (size.equals("Medium"))
                price = 700.0;
            else
                price = 900.0;
            if (Dress.equals("Linen(Blend)"))
                price += 9000;
            if (Dress.equals("Floral"))
                price += 5500;
            if (Dress.equals("Haul"))
                price += 6000;
            if (Dress.equals("Voluminous"))
                price += 9500;
            if (Dress.equals("SMIDOW"))
                price += 15000;
            if (Dress.equals("Embroidered"))
                price += 7900;
            if(Stitch) price += 1500;
		setPrice(price);
            setPrice(price);
        } catch (NullPointerException e) {
        }
    }
	@Override
	public String toString() {
		if(Stitch) return super.toString()+" Stitched of ZARA " + Dress;
		else return super.toString()+" UnStitched of ZARA ";
	}
}
