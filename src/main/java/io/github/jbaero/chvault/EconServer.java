package io.github.jbaero.chvault;

import com.laytonsmith.abstraction.Implementation;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;

public class EconServer {

	public static EconomyWrapper getEconomy() {
		Economy econ;
		switch (Implementation.GetServerType()) {
			case BUKKIT:
				econ = BukkitEconServer.getEconomy();
				return econ == null ? null : new EconomyWrapper(econ);
			default:
				return null;
		}
	}

	public static class BukkitEconServer {

		public static Economy getEconomy() {
			try {
				return Bukkit.getServer().getServicesManager().getRegistration(Economy.class).getProvider();
			} catch (NullPointerException npe) {
				return null;
			}
		}
	}
}
