package zoho_crm;
import java.util.Properties;
import java.util.*;
import java.io.*;

public class MyStrings {
	
	private String string;
	
	MyStrings(String string){
		this.string = string;
	}
	
	public void concat(String s2) {
		
	}
	
	public static void checkTwoFilesEqual(File file1,File file2) throws FileNotFoundException {
		FileReader reader1 = new FileReader(file1);
		Scanner scanner1 = new Scanner(reader1);
		
		FileReader reader2 = new FileReader(file2);
		Scanner scanner2 = new Scanner(reader2);
		if(file1.length() != file2.length()) {
			System.out.println("Not equal");
			return;
		}
		
		while(scanner1.hasNext() && scanner2.hasNext()) {
			String word1 = scanner1.next();
			String word2 = scanner2.next();
			if(!word1.equals(word2)) {
				System.out.println("not equal");
				return;
			}
		}
		System.out.println("Equal");
	}
	
	public static void checkTextFile(File file) throws IOException {
		FileReader reader = new FileReader(file);
		Scanner scanner = new Scanner(reader);
		String ext = "";
		int i = file.getName().lastIndexOf(".");
		if(i>0) {
			ext = file.getName().substring(i+1);
		}
		if(!ext.equals("txt")) {
			System.out.println("File is not a text file");
		}
		else {
			int counter = 1;
			while(scanner.hasNext()) {
				System.out.println(counter++ + " " + scanner.nextLine());
			}
		}
		scanner.close();
	}
	
	public static void usingRandomAccessFile() {
		String filePath = "textfile.txt";
		try {
		    RandomAccessFile randomFile = new RandomAccessFile(filePath, "rw");
		    randomFile.seek(1);
		    int number = randomFile.readInt();
		    randomFile.seek(12);
		    randomFile.writeByte(10);
		    randomFile.close();
		} catch (IOException ex) {
		    System.err.println("I/O Error: " + ex);
		}
	}
	
	public static void getUserFile() throws IOException {
		Scanner scanner = new Scanner(System.in);
		String fileName = "";
		System.out.println("Enter file name");
		fileName = scanner.nextLine();
		File file = new File(fileName);
		PrintWriter printer = new PrintWriter(new FileWriter(file));
		System.out.println("Enter contents , press 'C' to terminate");
		String line = scanner.nextLine();
		while(!line.equals("C")) {
			printer.println(line);
			line = scanner.nextLine();
		}
		printer.close();
		scanner.close();
	}
	
	public static void main(String[] args) throws IOException {
		String s = new String("asbc");
		
//		Properties properties = System.getProperties();
//        // Java 8
//        properties.forEach((k, v) -> System.out.println(k + ":" + v));

        try {
			FileReader fr = new FileReader(new File("textfile.txt"));
			File copy = new File("copytextfile.txt");
			PrintWriter fw = new PrintWriter(copy);
			Scanner scanner = new Scanner(fr);
			boolean isFound = false;
			String word = "vsp";
			while(scanner.hasNext())
			{
				String line = scanner.next();
				System.out.println(line);
				fw.println(line);
				if(line.indexOf(word) != -1) {
					isFound = true;
				}
			}
			fr.close();
			fw.close();
			System.out.println(isFound);
			checkTextFile(copy);
			//getUserFile();
			checkTwoFilesEqual(copy, copy);
			usingRandomAccessFile();
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
        	e.printStackTrace();
		}
        
	}
}
