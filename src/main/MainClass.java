package main;

import plane.Airline;
import plane.Plane;
import plane.FreighterPlane;
import plane.PassangerPlane;
import plane.PlaneType;

	public class MainClass {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
		
			System.out.println(Airline.buildPlane(PlaneType.PASSANGER));
			System.out.println(Airline.buildPlane(PlaneType.FREIGHT));
			
		
		}

	}
