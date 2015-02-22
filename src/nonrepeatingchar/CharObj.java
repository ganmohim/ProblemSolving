package nonrepeatingchar;

public class CharObj {
	private Character c;
	private int count;
	
	public CharObj(char c) {
		this.c = c;
		count = 0;
	}
	
	public Character getChar() {
		return c;
	}
	
	public int getCount() {
		return count;
	}
	
	public void increment() {
		count++;
	}

}
