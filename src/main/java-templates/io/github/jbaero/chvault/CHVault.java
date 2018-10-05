package io.github.jbaero.chvault;

import com.laytonsmith.PureUtilities.SimpleVersion;
import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.core.CHVersion;
import com.laytonsmith.core.exceptions.CRE.CRECastException;
import com.laytonsmith.core.exceptions.CRE.CREInvalidPluginException;
import com.laytonsmith.core.exceptions.CRE.CREPluginInternalException;
import com.laytonsmith.core.exceptions.CRE.CREThrowable;
import com.laytonsmith.core.extensions.AbstractExtension;
import com.laytonsmith.core.extensions.MSExtension;
import com.laytonsmith.core.functions.AbstractFunction;

@MSExtension(CHVault.name)
public class CHVault extends AbstractExtension {

	@Override
	public Version getVersion() {
		return new SimpleVersion("${project.version}");
	}

	@Override
	public void onStartup() {
		System.out.println(name + " " + getVersion() + " loaded.");
	}

	@Override
	public void onShutdown() {
		System.out.println(name + " " + getVersion() + " unloaded.");
	}

	public static final String name = "${project.name}";

	public static abstract class jFunction extends AbstractFunction {

		@Override
		public String getName() {
			return this.getClass().getSimpleName();
		}

		@Override
		public Version since() {
			return CHVersion.V3_2_0;
		}

		@Override
		public Boolean runAsync() {
			return false;
		}

		@Override
		public boolean isRestricted() {
			return true;
		}

		@Override
		public Class<? extends CREThrowable>[] thrown() {
			return new Class[]{CREPluginInternalException.class, CREInvalidPluginException.class, CRECastException.class};
		}
	}
}
