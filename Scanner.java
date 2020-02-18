
// This class is defined because Java-RTP does not support Scanner
// The students can make calls to the methods here as though to the
// JRE Scanner (though limited to a few methods) Then their
// programs become portable to other Java platforms
//
// This class acts like a simulator of Scanner from within Java


import hsa.*;
public class Scanner {
    public Scanner() {
    }
    
    public Scanner(Object source) {
    }
    
    public String next() {
	return Stdin.readString();
    }

    // This is slightly different from the real Scanner.nextLine()
    // because Scanner.nextLine() reads the extra CR at the end of
    // the line as a different line. Thus, to move with it to the
    // next line of text 2 calls are necessary. Here with hsa.*
    // the LF and CR are read as a single character and thus only one
    // readLine() is needed
    public String nextLine() {
	return Stdin.readLine();
    } 

    public short nextShort() {
	return Stdin.readShort();    
    }
    
    public int nextInt() {
	return Stdin.readInt();    
    }
    
    public long nextLong() {
	return Stdin.readLong();    
    }
    
    public double nextDouble() {
	return Stdin.readDouble();
    }    

    public float nextFloat() {
	return Stdin.readFloat();
    }    

    public boolean nextBoolean() {
	return Stdin.readBoolean();
    }    

    public byte nextByte() {
	return Stdin.readByte();    
    }    
}
