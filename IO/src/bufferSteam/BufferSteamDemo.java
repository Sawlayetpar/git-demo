package bufferSteam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferSteamDemo {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(
				new FileReader("bufferOutput.txt"));
				BufferedWriter bw = new BufferedWriter(
				new FileWriter("copy_file.txt"))){
			
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
