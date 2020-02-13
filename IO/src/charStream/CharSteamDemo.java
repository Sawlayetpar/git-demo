package charStream;

import java.io.FileReader;
import java.io.FileWriter;

public class CharSteamDemo {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("MyReport.txt"); FileWriter fw = new FileWriter("report_copy.txt")) {

			int data;
			while ((data = fr.read()) != -1) {
				fw.write(data);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
