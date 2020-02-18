package Uebung5;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class LotteryTest {

	@Test
	void RandomLotteryNumnberstest() {
		int Wiederholungen = 1000;
		for (int i = 0; i < Wiederholungen; i++) {
			assertTrue(LotteryTicket.checkValidLottoNumber(LotteryTicket.randomLottoNumbers()));
		}
	}

}
