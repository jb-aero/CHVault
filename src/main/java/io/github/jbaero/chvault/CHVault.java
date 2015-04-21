package io.github.jbaero.chvault;

import com.laytonsmith.PureUtilities.SimpleVersion;
import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.core.extensions.AbstractExtension;

public class CHVault extends AbstractExtension {

	@Override
	public Version getVersion() {
		return new SimpleVersion(1, 1, 1);
	}

	@Override
	public void onStartup() {
		System.out.println("CHVault " + getVersion() + " loaded.");
	}

	@Override
	public void onShutdown() {
		System.out.println("CHVault " + getVersion() + " unloaded.");
	}
}
