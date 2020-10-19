
public class Dimension {
	int width;
	int length;
	
	public Dimension(int width, int length) {
		this.width=width;
		this.length=length;
	}
	
	public void room() {
		this.width=0;
		this.length=0;
	}
	
	public void setWidth() {
		this.width=width;
	}
	
	public void setLength() {
		this.length=length;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public String toString() {
		return "Dimension width is " + getWidth() + " and length is " + getLength();
	}
	
	
}
