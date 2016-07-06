import javax.swing.*;
/** Detyra12_03_1 uses switch to convert points, which are given by the user, into letter grades. 
  * Era Ibrahimi */
public class Detyra12_03_1 {
	 public static void main(String[] args)
		{int nota = new Integer(JOptionPane.showInputDialog("Type the grade")).intValue();
		 String notaString = "Your grade is "; //for easier use below, we declare this
		 switch(nota)
		 { case 100:   case 99:   case 98:   
		   case 97:    case 96:   case 95:   
		   case 94:    case 93:   case 92:   
		   case 91:    case 90:
		   { JOptionPane.showMessageDialog(null, notaString + "A"); break;} 
		   
		   case 89:   case 88:   case 87:  
		   case 86:   case 85:   case 84:   
		   case 83:   case 82:   case 81:   
		   case 80: 
		   { JOptionPane.showMessageDialog(null, notaString + "B"); break;}
		   
		   case 79:   case 78:   case 77:  
		   case 76:   case 75:   case 74:  
		   case 73:   case 72:   case 71:   
		   case 70:
		    { JOptionPane.showMessageDialog(null, notaString + "C"); break;}
		   
		   case 69:   case 68:   case 67:   
		   case 66:   case 65:   case 64:   
		   case 63:   case 62:   case 61:   
		   case 60:   
		    { JOptionPane.showMessageDialog(null, notaString + "D"); break;}
		   
		   case 59:   case 58:   case 57:   
		   case 56:   case 55:   case 54:   
		   case 53:   case 52:   case 51:   
		   case 50:   
		    { JOptionPane.showMessageDialog(null, notaString + "E"); break;}
		   
		   default: JOptionPane.showMessageDialog(null, "You have not passed. Your grade is F.");
		   
		 }
		 
	}
}
