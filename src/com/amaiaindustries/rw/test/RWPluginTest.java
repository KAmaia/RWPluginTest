package com.amaiaindustries.rw.test;

import com.amaiaindustries.rw.Utils.*;

import net.risingworld.api.*;
import net.risingworld.api.events.*;
import net.risingworld.api.events.player.*;


/**
 * @author Krystal Amaia
 */


public class RWPluginTest extends Plugin implements Listener {
	@java.lang.Override
	public void onEnable() {
		registerEventListener(this);
		System.out.println("Hello from Amaia Industries");
	}
	@EventMethod(Threading.Sync)
	public void onPlayerHitEvent(PlayerDamageEvent phe){
		System.out.println("Hit for: " + AIUtilities.convertShortToString(phe.getDamage()) + " damage");
		phe.getPlayer().sendTextMessage("You Have Been Hit And Taken: "
			                                   + phe.getDamage()
			                                   + " Damage.");
		phe.getPlayer().sendTextMessage("You now have: " + phe.getPlayer().getHealth() + " Health remaining.");
	}
	@java.lang.Override
	public void onDisable() {

	}
}
