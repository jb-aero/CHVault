package io.github.jbaero.chvault;

import com.laytonsmith.abstraction.MCOfflinePlayer;
import com.laytonsmith.abstraction.MCPlayer;
import com.laytonsmith.abstraction.bukkit.entities.BukkitMCPlayer;
import net.milkbowl.vault.economy.AbstractEconomy;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.OfflinePlayer;

import java.util.List;

// TODO this is no longer impl independent
public class EconomyWrapper extends AbstractEconomy {

	Economy e;

	public EconomyWrapper(Economy econ) {
		e = econ;
	}

	OfflinePlayer getPlayer(MCOfflinePlayer off) {
		if (off instanceof MCPlayer) {
			return (OfflinePlayer) ((BukkitMCPlayer) off).getHandle();
		}
		return (OfflinePlayer) off.getHandle();
	}

	@Override
	public boolean isEnabled() {
		return e.isEnabled();
	}

	@Override
	public String getName() {
		return e.getName();
	}

	@Override
	public boolean hasBankSupport() {
		return e.hasBankSupport();
	}

	@Override
	public int fractionalDigits() {
		return e.fractionalDigits();
	}

	@Override
	public String format(double v) {
		return e.format(v);
	}

	@Override
	public String currencyNamePlural() {
		return e.currencyNamePlural();
	}

	@Override
	public String currencyNameSingular() {
		return e.currencyNameSingular();
	}

	@Override
	@Deprecated
	public boolean hasAccount(String s) {
		return e.hasAccount(s);
	}

	@Override
	@Deprecated
	public boolean hasAccount(String s, String s1) {
		return e.hasAccount(s, s1);
	}

	@Override
	public boolean hasAccount(OfflinePlayer op) {
		return e.hasAccount(op);
	}

	@Override
	public boolean hasAccount(OfflinePlayer op, String s1) {
		return e.hasAccount(op, s1);
	}

	@Override
	@Deprecated
	public double getBalance(String s) {
		return e.getBalance(s);
	}

	public double getBalance(MCOfflinePlayer player) {
		return e.getBalance(getPlayer(player));
	}

	@Override
	@Deprecated
	public double getBalance(String s, String s1) {
		return e.getBalance(s, s1);
	}

	@Override
	@Deprecated
	public boolean has(String s, double v) {
		return e.has(s, v);
	}

	@Override
	@Deprecated
	public boolean has(String s, String s1, double v) {
		return e.has(s, s1, v);
	}

	@Override
	@Deprecated
	public EconomyResponse withdrawPlayer(String s, double v) {
		return e.withdrawPlayer(s, v);
	}

	@Override
	public double getBalance(OfflinePlayer op, String s1) {
		return e.getBalance(op, s1);
	}

	@Override
	public boolean has(OfflinePlayer op, double v) {
		return e.has(op, v);
	}

	@Override
	public boolean has(OfflinePlayer op, String s1, double v) {
		return e.has(op, s1, v);
	}

	@Override
	public EconomyResponse withdrawPlayer(OfflinePlayer op, double v) {
		return e.withdrawPlayer(op, v);
	}

	public EconomyResponse withdrawPlayer(MCOfflinePlayer player, double amount) {
		return e.withdrawPlayer(getPlayer(player), amount);
	}

	@Override
	@Deprecated
	public EconomyResponse withdrawPlayer(String s, String s1, double v) {
		return e.withdrawPlayer(s, s1, v);
	}

	@Override
	@Deprecated
	public EconomyResponse depositPlayer(String s, double v) {
		return e.depositPlayer(s, v);
	}

	@Override
	public EconomyResponse withdrawPlayer(OfflinePlayer op, String s1, double v) {
		return e.withdrawPlayer(op, s1, v);
	}

	@Override
	public EconomyResponse depositPlayer(OfflinePlayer op, double v) {
		return e.depositPlayer(op, v);
	}

	public EconomyResponse depositPlayer(MCOfflinePlayer player, double v) {
		return e.depositPlayer(getPlayer(player), v);
	}

	@Override
	@Deprecated
	public EconomyResponse depositPlayer(String s, String s1, double v) {
		return e.depositPlayer(s, s1, v);
	}

	@Override
	@Deprecated
	public EconomyResponse createBank(String s, String s1) {
		return e.createBank(s, s1);
	}

	@Override
	public EconomyResponse depositPlayer(OfflinePlayer op, String s1, double v) {
		return e.depositPlayer(op, s1, v);
	}

	@Override
	public EconomyResponse createBank(String s, OfflinePlayer op) {
		return e.createBank(s, op);
	}

	@Override
	public EconomyResponse deleteBank(String s) {
		return e.deleteBank(s);
	}

	@Override
	public EconomyResponse bankBalance(String s) {
		return e.bankBalance(s);
	}

	@Override
	public EconomyResponse bankHas(String s, double v) {
		return e.bankHas(s, v);
	}

	@Override
	public EconomyResponse bankWithdraw(String s, double v) {
		return e.bankWithdraw(s, v);
	}

	@Override
	public EconomyResponse bankDeposit(String s, double v) {
		return e.bankDeposit(s, v);
	}

	@Override
	@Deprecated
	public EconomyResponse isBankOwner(String s, String s1) {
		return e.isBankOwner(s, s1);
	}

	@Override
	@Deprecated
	public EconomyResponse isBankMember(String s, String s1) {
		return e.isBankMember(s, s1);
	}

	@Override
	public EconomyResponse isBankOwner(String s, OfflinePlayer op) {
		return e.isBankOwner(s, op);
	}

	@Override
	public EconomyResponse isBankMember(String s, OfflinePlayer op) {
		return e.isBankMember(s, op);
	}

	@Override
	public List<String> getBanks() {
		return e.getBanks();
	}

	@Override
	@Deprecated
	public boolean createPlayerAccount(String s) {
		return e.createPlayerAccount(s);
	}

	@Override
	@Deprecated
	public boolean createPlayerAccount(String s, String s1) {
		return e.createPlayerAccount(s, s1);
	}

	@Override
	public boolean createPlayerAccount(OfflinePlayer op) {
		return e.createPlayerAccount(op);
	}

	@Override
	public boolean createPlayerAccount(OfflinePlayer op, String s1) {
		return e.createPlayerAccount(op, s1);
	}
}
