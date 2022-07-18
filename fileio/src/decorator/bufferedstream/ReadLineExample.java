package decorator.bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadLineExample {

	public static void main(String[] args) throws IOException {
		//줄(line) 단위로 문자 읽기
		//BufferedReader 사용 - 보조 스트림(버퍼링 기능 사용)
		Reader fr = new FileReader("reader.txt");	//기반 스트림
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String data = br.readLine();	//줄 단위 문자열 읽기(readLine())
			if(data == null) break;
			System.out.println(data);
		}
		
		br.close();
	}

}
