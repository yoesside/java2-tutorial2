
public class Window {
	String direction;
	
	public Window(String direction) {
		this.direction =direction;
	}
	
	public void Window() {
		this.direction="@";
	}
	
	public void setDirection() {
		this.direction =direction;
	}
	
	public String getDirection() {
		return this.direction;
	}
	
	public String toString() {
		return "Window facing " + getDirection();
	}
	
}
