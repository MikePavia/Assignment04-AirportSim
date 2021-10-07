package assignment;



public class Plane implements Comparable<Plane> {

	private static int planeCount = 0;


	private double runwayTime;
	private double arrivalTime;
	private char status;  // T for takeoff or l for landing
	public static final char LANDING = 'l';
	public static final char TAKEOFF = 't';
	//	private boolean landed;
	//	private boolean takenOff;
	private int planeNumber;

	// Plane plane = new Plane(0, Plane.LANDING);
	
	public Plane (double arrivalTime, char landingOrTakeoff ) {
		this.planeNumber = planeCount++;
		this.arrivalTime = arrivalTime;
		this.status = landingOrTakeoff;

	} // end of constructor 

	/**
	 * getter for arrival time
	 * @return
	 */
	public double getArrivalTime() {
		return this.arrivalTime;
	}

	/**
	 *getter for runway time 
	 * @return
	 */
	public double getRunwayTime() {
		return this.runwayTime;
	}

	/**
	 * gets the number of planes that have entered the queue 
	 * @return
	 */
	public int getPlaneNumber() {
		return this.planeNumber;
	}

	/**
	 * gets the status of the plane either taking off or landing 
	 * @return
	 */
	public char getStatus() {
		return status;
	}

	/**
	 * compares the planes in the queue and figures out priority of plane 
	 * @param arrivalTime
	 * @param status
	 * @return
	 */
	@Override
	public int compareTo(Plane other) {
		
		if (this.status == other.status) {
			if(this.arrivalTime > other.arrivalTime) {
			return 0;
			}
		}else if(this.status == Plane.LANDING) {
			return -1;
		}else return 1;
			
		
			
		
		
	}

	




} // end of plane class
