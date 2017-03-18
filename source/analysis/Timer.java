package analysis;


public final class Timer {

	// Beginning and end of the period
	private static long start, end;

	public Timer(){
		start = 0;
		end   = 0;
	}

	/** Start trigger */
	public static void start(){
		setStart(System.currentTimeMillis());
	}

	/** End trigger */
	public static void stop(){
		setEnd(System.currentTimeMillis());
	}

	/** Elapsed Time */
	public static long elapsedTime(){
		return getEnd() - getStart();
	}

	//Getter and setters
	public static long getStart() {
		return start;
	}

	public static void setStart(long start) {
		Timer.start = start;
	}

	public static long getEnd() {
		return end;
	}

	public static void setEnd(long end) {
		Timer.end = end;
	}
}
