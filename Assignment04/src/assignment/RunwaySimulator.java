package assignment;

import java.util.PriorityQueue;

public class RunwaySimulator {

	// private all of them 
	double duration;
	double landingProbability;
	double takeoffProbability;
	int numberOfLandings;
	int numberOfTakeoffs;
	int runwayUsage;
	int waitingPlanes;
	int averageWaitingTime;
	int averageTakeoffTime;

	PriorityQueue<Plane> queue = new PriorityQueue<Plane>();

	// resets all statistics to zero
	public void reset() {
		duration = 0;
		landingProbability = 0;
		takeoffProbability = 0;
		numberOfLandings = 0;
		numberOfTakeoffs = 0;
		runwayUsage = 0;
		waitingPlanes = 0;
		averageWaitingTime = 0;
		averageTakeoffTime = 0;
	}

	// displays the most recent simulation statistics in two columns 
	public void displayResults() {
		System.out.printf("Duration:          %2f \n" + duration,
				"Landing probability:     %2f \n" + landingProbability,
				"Number of landings:     %2f" + landingProbability,
				"Number of takeoffs:    %2f" + numberOfTakeoffs,
				"Number served:      %2f" + runwayUsage,
				"Number left waiting    %2f" + waitingPlanes,
				"Average landing time    %2f" + averageWaitingTime,
				"Average takeoff time   %2f" + averageTakeoffTime);
	}


	public void simulate (double duration , double takeoffProbability, double landingProbability) {

	}








}
