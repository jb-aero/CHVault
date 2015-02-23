package com.zeoldcraft.chvault;

import net.milkbowl.vault.economy.AbstractEconomy;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;

import java.util.List;

public class EconomyWrapper extends AbstractEconomy {

	Economy e;

	public EconomyWrapper(Economy econ) {
		e = econ;
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
	public boolean hasAccount(String s) {
		return e.hasAccount(s);
	}

	@Override
	public boolean hasAccount(String s, String s1) {
		return e.hasAccount(s, s1);
	}

	@Override
	public double getBalance(String s) {
		return e.getBalance(s);
	}

	@Override
	public double getBalance(String s, String s1) {
		return e.getBalance(s, s1);
	}

	@Override
	public boolean has(String s, double v) {
		return e.has(s, v);
	}

	@Override
	public boolean has(String s, String s1, double v) {
		return e.has(s, s1, v);
	}

	@Override
	public EconomyResponse withdrawPlayer(String s, double v) {
		return e.withdrawPlayer(s, v);
	}

	@Override
	public EconomyResponse withdrawPlayer(String s, String s1, double v) {
		return e.withdrawPlayer(s, s1, v);
	}

	@Override
	public EconomyResponse depositPlayer(String s, double v) {
		return e.depositPlayer(s, v);
	}

	@Override
	public EconomyResponse depositPlayer(String s, String s1, double v) {
		return e.depositPlayer(s, s1, v);
	}

	@Override
	public EconomyResponse createBank(String s, String s1) {
		return e.createBank(s, s1);
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
	public EconomyResponse isBankOwner(String s, String s1) {
		return e.isBankOwner(s, s1);
	}

	@Override
	public EconomyResponse isBankMember(String s, String s1) {
		return e.isBankMember(s, s1);
	}

	@Override
	public List<String> getBanks() {
		return e.getBanks();
	}

	@Override
	public boolean createPlayerAccount(String s) {
		return e.createPlayerAccount(s);
	}

	@Override
	public boolean createPlayerAccount(String s, String s1) {
		return e.createPlayerAccount(s, s1);
	}
}
