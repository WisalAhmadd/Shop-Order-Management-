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

public class JJ extends Dress {
        private boolean Stitch; 
        private String Dress;
        String[] Dresses = { "Organza Classic" ,"Cotton Classic", "Wool Classic", "Classic Chiffon" ,"Classic Rayon" , "Silk Classic" , "Linon Classic",};

	public JJ(String size,int amount,Label lbl) {

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
            if (Dress.equals("Organza Classic"))
                price += 1250;
            if (Dress.equals("Cotton Classic"))
                price += 3000;
            if (Dress.equals("Wool Classic"))
                price += 3099;
            if (Dress.equals("Classic Chiffon"))
                price += 1599;
            if (Dress.equals("Silk Classic"))
                price += 2499;
            if (Dress.equals("Classic Rayon"))
                price += 2100;
            if (Dress.equals("Linon Classic"))
                price += 3200;
            if(Stitch) price += 1500;
		setPrice(price);
            setPrice(price);
        } catch (NullPointerException e) {
        }
    }

    @Override
	public String toString() {
		if(Stitch) return super.toString()+" Stitched Of J. " + Dress;
		else return super.toString() + "UnStitched J. " + Dress;
	}
}
