import javax.swing.JOptionPane; 
public class Hello {     
	public static void main(String [] args){         
		String name = JOptionPane.showInputDialog("What is your name: ");         
		JOptionPane.showMessageDialog(null, "Hello "+ name + ", Welcome to the World", "Name", JOptionPane.INFORMATION_MESSAGE);     
    }     
    // public static void main(String [] args){     
    //     HashMap<String, Double> seconds = new HashMap<String, Double>();     
    //     Scanner input = new Scanner(System.in);     
    //     System.out.print("Enter a time less than 4.5 seconds: ");     
    //     seconds.put("seconds", input.nextDouble());     
    //     for(Map.Entry<String, Double> t : seconds.entrySet()) {     
    //         double height = 100.0 - (4.9* (t.getValue() *2));     
    //         System.out.println("The height fo the object is: "+ height +" meters");     
    //     }     
    // } 
}


