package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int STARTING_VALUE = -1;
	public static final int FULL = 11;
	public static final int NUMBERS_SIZE = 12;
	private final int[] numbers = new int[NUMBERS_SIZE];



  private int total = STARTING_VALUE;

	public int getTotal() {
		return total;
	}


	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

		public boolean callCheck() {
			return total == STARTING_VALUE;
		}
		
			public boolean isFull() {
				return total == FULL;
			}
		
				 int peekaboo() {
					if (callCheck())
						return STARTING_VALUE;
					return numbers[total];
				}
			
					public int countOut() {
						if (callCheck())
							return STARTING_VALUE;
						return numbers[total--];
					}

}
