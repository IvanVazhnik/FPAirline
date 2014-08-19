package plane;

public class Airline {
	
	
	
	public static Plane buildPlane(PlaneType model){
		
		Plane plane = null;
		
		
		switch(model){
		
		case PASSANGER:
			plane = new PassangerPlane();
			break;
			
		case FREIGHT:
			plane = new FreighterPlane();
			break;
			default :
				
			
			
		}
		return plane;
		
		
	}

}
