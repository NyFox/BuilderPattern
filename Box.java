import java.io.Serializable;

public class Box implements Serializable{
	
	private static final long serialVersionUID = 502044808014224581L;
	private String Laptop;
	private float GHz;
	private String GRU;
	private int RAM;
	
	public static class Builder{
		
	private String Laptop;
	private float GHz;
	private String GRU;
	private int RAM;
	
	public Builder Laptop(String Laptop){
		this.Laptop = Laptop;
		return this;
	}
	
	public Builder GHz(float GHz){
	     this.GHz = GHz;
	     return this;
	}
	
	public Builder GRU(String GRU){
		this.GRU = GRU;
		return this;
	}
	
	public Builder RAM(int RAM){
		this.RAM = RAM;
		return this;
	}
	
	public Box build(){
		return new Box(this);
	}
	
 }
	
	private Box(Builder build){
		Laptop = build.Laptop;
		GHz = build.GHz;
		GRU = build.GRU;
		RAM = build.RAM;
	}
	
   
	 @Override
	    public String toString() {
	        return "Feature your laptop : => {" +
	                "Laptop='" + Laptop + '\'' +
	                ", GRU=" + GRU +
	                ", GHz=" + GHz +
	                ", RAM=" + RAM + "Mb" +
	                '}';
	    }
	
}

