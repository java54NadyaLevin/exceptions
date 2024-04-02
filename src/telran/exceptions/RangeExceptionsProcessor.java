package telran.exceptions;

public class RangeExceptionsProcessor {
	private RangeExceptions rangeException;
	private int counterGreaterMax; // how many numbers have been greater than max range
	private int counterLessMin; // how many numbers have been less than min range
	private int counterRange; // in range

	public RangeExceptionsProcessor(RangeExceptions rangeException) {
		this.rangeException = rangeException;
	}

	public void numberProcessor(int number) {
		try {
			rangeException.checkNumber(number);
			counterRange++;
		} catch (NumberGreaterRangeMaxException e) {
			counterGreaterMax++;
		} catch (NumberLessRangeMinException e) {
			counterLessMin++;
		}
	}

	public RangeExceptions getRangeException() {
		return rangeException;
	}

	public int getCounterGreaterMax() {
		return counterGreaterMax;
	}

	public int getCounterLessMin() {
		return counterLessMin;
	}

	public int getCounterRange() {
		return counterRange;
	}

}
