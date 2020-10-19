import java.util.ArrayList;

public class Room {
	
	ArrayList<Window> inWindow = new ArrayList<Window> ();
	ArrayList<Dimension> inDimension = new ArrayList<Dimension>();
	Dimension dms = new Dimension();
	Window wi = new Window();
	String name;
	int noOfChairs;
    boolean isBooked;
    
	public Room(String name, int noOfChairs, boolean isBooked, Dimension dms, Window wi) {
		this.name=name;
		this.noOfChairs=noOfChairs;
		this.isBooked=isBooked;
		inDimension.add(dms);
		inWindow.add(wi);
	}
	
	public void room() {
		this.name="@";
		this.noOfChairs=0;
		this.isBooked=true;
		this.inDimension=null;
		this.inWindow=null;
	}
	
	public void setName() {this.name=name;
	}
	
	public void setNoChairs() {this.noOfChairs=noOfChairs;
	}
	
	public void setisBooked() {this.isBooked=isBooked;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNoOfChairs() {
		return this.noOfChairs;
	}
	
	public boolean getIsBooked() {
		return this.isBooked;
	}
	
	public void showDimension() {
		for(int i = 0; i<inWindow.size();i++) {
			System.out.println(inWindow.get(i));
		}
	}
	public void showWindow() {
		for(int i = 0;i<inWindow.size();i++) {
			System.out.print(inWindow.get(i));
		}
	}
	
	public String toString() {
		return "Rhe room name is " + getName() + " ,dimension: "+inDimension+" and "+inWindow+ " ,no of chair is: "+getNoOfChairs()+ " status booked: "+ getIsBooked();
	}
	
	
}
