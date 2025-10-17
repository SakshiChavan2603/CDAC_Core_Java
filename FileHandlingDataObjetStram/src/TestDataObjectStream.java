import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataObjectStream {

	public static void main(String[] args) {
		File f = new File("myfile.txt");
		DataOutputStream dos = null;
		try {
			if(f.exists()) {
				dos = new DataOutputStream(new FileOutputStream(f,true));
			}else {
				dos = new DataOutputStream(new FileOutputStream(f));
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("myfile.txt"));
			DataOutputStream dos1 = dos;){
			
			dos1.writeDouble(20.20);
			dos1.writeInt(12);
			dos1.writeUTF("sakshi");
			System.out.println("Read data");
			double n1 = dis.readDouble();
			int n2 = dis.readInt();
			String s = dis.readUTF();
			System.out.println(n1 + " " + n2 + " " + s);
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
