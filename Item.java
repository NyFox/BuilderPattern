import java.io.*;

public class Item {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       
		Box itemWrite = new Box.Builder()
				.Laptop("Acer")
				.GHz(2.50f)
				.GRU("Intel i5-3210")
				.RAM(4214)
				.build();
        /*
		FileOutputStream fos = new FileOutputStream("box.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(itemWrite);
        oos.flush();
        oos.close();
		*/
		
		Box boxRead;
        FileInputStream fis = new FileInputStream("box.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        boxRead = (Box)ois.readObject();
        ois.close();

        System.out.println(boxRead.toString());		
			
	  //System.out.println(item);	// debug class Box
		
	}

}
