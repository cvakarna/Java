package com.siva.AdvancedOOExamples;

import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;

public enum ShowEnum {
	INSTANCE;
	static Logger logger = Logger.getLogger(ShowEnum.class);
	private Set<String> availableSeats;

	private ShowEnum() {
		availableSeats = new HashSet<>();
		availableSeats.add("1A");
		availableSeats.add("1B");

	}

	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}

	private static void ticketAgentBooking(String seat) {
		ShowEnum show = ShowEnum.INSTANCE;
		if (show.bookSeat(seat)) {
			logger.info("seat alloted");
		} else
			logger.info("seat not alloted");

	}

	public static void main(String[] args) {
		ticketAgentBooking("1A");
		ticketAgentBooking("1A");
	}

}
