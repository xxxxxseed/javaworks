package test;

public class HashCodeReturn {

	public static void main(String[] args) {

		int h = 0;
		byte[] value = {0x66, 0x67, 0x68, 0x69};	//f, g, h, i
		for(byte v : value) {
			//h = (2^n - 1) * h
			h = 31 * h + (v & 0xff);
			System.out.printf("h=%,9d, h=%6x\n", h, h);
		}
		
	}

}
