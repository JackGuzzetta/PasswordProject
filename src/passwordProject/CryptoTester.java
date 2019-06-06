package passwordProject;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class CryptoTester {
	private static Crypto r = new Crypto(9);
	public static void main(String[] args) {
		String file = "/Users/paulaguzzetta/password/src/passwordProject/Document.txt";
		String file2 = "/Users/paulaguzzetta/password/src/passwordProject/unDocument.txt";
		CryptoTester q = new CryptoTester();
		q.readfile(file);
		q.readMessage(file2);
	

	}
	
	public void readfile(String f){
	    File file = new File(f);
	    try {

	        Scanner sc = new Scanner(file);

	        while (sc.hasNextLine()) {
	            String i = sc.nextLine();
	            String n = r.getEncoded(i);
	            System.out.println(n);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	}
	public void readMessage(String f){
	    File file = new File(f);
	    try {

	        Scanner sc = new Scanner(file);

	        while (sc.hasNextLine()) {
	            String i = sc.nextLine();
	            String n = r.getMessage(i);
	            System.out.println(n);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	}
}
