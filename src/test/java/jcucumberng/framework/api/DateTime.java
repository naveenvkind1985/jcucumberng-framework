package jcucumberng.framework.api;

/**
 * {@code DateTime} handles actions for manipulating date and time.
 * 
 * @author Kat Rollo <rollo.katherine@gmail.com>
 */
public final class DateTime {

	// Prevent instantiation
	private DateTime() {
	}

	/**
	 * Converts seconds to millis with specified range. Defaults to given
	 * {@code begin} or {@code end} if {@code waitTime} is less than or greater than
	 * respectively.
	 * 
	 * @param waitTime value in seconds from a {@code .properties} file
	 * @param begin    lowerbound value of the range in seconds, inclusive
	 * @param end      upperbound value of the range in seconds, inclusive
	 * @return int - value in millis
	 */
	public static int convertSecondsToMillisWithRange(String waitTime, int begin, int end) {
		int secs = Integer.parseInt(waitTime);
		if (secs < begin) {
			secs = begin;
		}
		if (secs > end) {
			secs = end;
		}
		return secs * 1000;
	}

}
