package io.github.jbaero.chvault;

import com.laytonsmith.PureUtilities.SimpleVersion;
import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.core.extensions.AbstractExtension;
import com.laytonsmith.core.extensions.MSExtension;

@MSExtension("${project.name}")
public class CHVault extends AbstractExtension {

	@Override
	public Version getVersion() {
		return new SimpleVersion("${project.version}");
	}

	@Override
	public void onStartup() {
		System.out.println("${project.name} " + getVersion() + " loaded.");
	}

	@Override
	public void onShutdown() {
		System.out.println("${project.name} " + getVersion() + " unloaded.");
	}
}
