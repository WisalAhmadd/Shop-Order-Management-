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

public class Afghani extends Dress {
    private boolean Stitch; 

    private String Dress;
    String[] Dresses = { "Kuchi", "Kandahari", "Kaboolai","Tribal","Tribal Classic","Perahan Yunba" };

    public Afghani(String size, int amount, Label lbl) {
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
            if (Dress.equals("Kuchi"))
                price += 2225;
            if (Dress.equals("Kandahari"))
                price += 2225;
            if (Dress.equals("Tribal"))
                price += 2225;
            if (Dress.equals("Tribal Classic"))
                price += 4225;
            if (Dress.equals("Perahan Tunba"))
                price += 2225;
            if (Dress.equals("Kaboolai"))
                price += 4000;
            if(Stitch) price += 1500;
		setPrice(price);
            setPrice(price);
        } catch (NullPointerException e) {
        }
    }

    @Override
	public String toString() {
		if(Stitch) return super.toString()+" Stitch Of Afghani " + Dress;
		else return super.toString() + " Unstitched  Of Afghani " + Dress  ;
	}
}

