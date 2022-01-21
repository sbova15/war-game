
public class Card {
	private int value;
	private String name;
	
    

     public Card(int value, String name) {
		
		this.value = value;
		this.name = name;
	}

    public String toString() {
    	if (value == 11) {
    		
    	return "Jack of " + name;	
    	}
    	
    	if (value == 12) {
    	return "Queen of " + name;
    	}
    	
    	if (value == 13) {
    	return "King of " + name;
    	}
    	
    	if (value == 14) {
    	return "King of " + name;
    	}
    	
    	else {
    	return value + " of " + name;
    }
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	
	public void describe() {
		
		System.out.println(toString());
		
	}

}
