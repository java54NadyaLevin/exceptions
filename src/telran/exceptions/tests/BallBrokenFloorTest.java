package telran.exceptions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.exceptions.BallBrokenFloor;

class BallBrokenFloorTest {

	private static final int N_FLOORS = 40;

	@Test
	void test() throws Exception {
		BallBrokenFloor bbf = new BallBrokenFloor(N_FLOORS);
		assertEquals(bbf.getBrokenFloor(), getMinBrokenFloor(bbf));
	}

	private int getMinBrokenFloor(BallBrokenFloor bbf) throws Exception {
		int right = N_FLOORS - 1;
		int left = 0;
		int middle = (left+right)/2;
		int res = -1;
	
		while(left <= right) {
			try {
				bbf.checkFloor(middle);
				left = middle + 1;
			} catch (Exception e){
				right = middle - 1;
				res = middle;
			}
			middle = (left + right) / 2;
		}
		return res;
	}
	
}
