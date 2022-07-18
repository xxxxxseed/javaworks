package decorator.bufferedstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("animal.txt");	//기반스트림
				BufferedWriter bw = new BufferedWriter(fw)){//보조스트림(기반)
			
			//데이터 쓰기
			bw.write("cat");
			bw.write(32);	//space
			bw.write("dog");
			bw.write(32);	//space
			bw.write("chicken");
			bw.write(32);	//space
			bw.write("pig");
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
