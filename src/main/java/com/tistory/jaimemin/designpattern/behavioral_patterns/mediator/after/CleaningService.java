package com.tistory.jaimemin.designpattern.behavioral_patterns.mediator.after;

public class CleaningService {

	private FrontDesk frontDesk = new FrontDesk();

	public void getTowers(Integer guestId, int numberOfTowers) {
		String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
		System.out.println("provide " + numberOfTowers + " to " + roomNumber);
	}
}
