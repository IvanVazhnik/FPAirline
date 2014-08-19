package plane;

public abstract class Plane {
	
	
	public Plane (PlaneType model){
		
		
		this.model = model;
	//	arrangeParts();
		
		}
	
	//private void arrangeParts(){
		
		String name;
		int flyRange;
		int fuelConsumpion;
		int flySpeed;
		
		
	//}
	
	protected abstract void construct();
	
	private PlaneType model = null;
	
	public PlaneType getModel(){
		return model;
		
	}
	
	public void setModel(PlaneType model)
	{
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFlyRange() {
		return flyRange;
	}

	public void setFlyRange(int flyRange) {
		this.flyRange = flyRange;
	}

	public int getFuelConsumpion() {
		return fuelConsumpion;
	}

	public void setFuelConsumpion(int fuelConsumpion) {
		this.fuelConsumpion = fuelConsumpion;
	}

	public int getFlySpeed() {
		return flySpeed;
	}

	public void setFlySpeed(int flySpeed) {
		this.flySpeed = flySpeed;
	}
	
	
	
}