package com.leonardoz.cditech.weapon;

import javax.enterprise.event.Observes;
import javax.enterprise.event.TransactionPhase;

public class Reload {

	void reloadShotgun(
			@Observes(during = TransactionPhase.AFTER_COMPLETION) ShotgunFired shotgunFired) {
		shotgunFired.info();
		shotgunFired.getUsedShotgun().putSomeAmmo();
	}

}
