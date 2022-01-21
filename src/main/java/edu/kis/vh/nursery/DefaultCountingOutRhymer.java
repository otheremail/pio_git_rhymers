package edu.kis.vh.nursery;

/**
 * @author Jakub
 * Klasa służy do dostarczania różnych wariantów wylicznek, w swoim działaniu przypomina stos.
 *
 */
public class DefaultCountingOutRhymer {

	public static final int STARTING_VALUE = -1;
	public static final int FULL = 11;
	public static final int NUMBERS_SIZE = 12;
	private final int[] numbers = new int[NUMBERS_SIZE];

	public int total = STARTING_VALUE;

	/**
	 * @param in
	 * Metoda sprawdza czy tablica numbers jest pełna, jeśli nie to wpisuje wartość in do tablicy. 
	 * 
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

		/**
		 * @return
		 * Metoda zwraca True jeśli wartość total jest taka sama jak STARTING_VALUE
		 */
		public boolean callCheck() {
			return total == STARTING_VALUE;
		}
		
			/**
			 * @return
			 * Metoda zwraca True jeśli wartość total jest taka sama jak FULL
			 */
			public boolean isFull() {
				return total == FULL;
			}
		
				/**
				 * @return
				 * Metoda zwraca elementy tablicy 
				 */
				protected int peekaboo() {
					if (callCheck())
						return STARTING_VALUE;
					return numbers[total];
				}
			
					/**
					 * @return
					 * Metoda zwraca poprzedni element tablicy 
					 */
					public int countOut() {
						if (callCheck())
							return STARTING_VALUE;
						return numbers[total--];
					}

}
