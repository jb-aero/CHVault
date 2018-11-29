package io.github.jbaero.chvault.functions;

import com.laytonsmith.annotations.api;
import com.laytonsmith.core.Static;
import com.laytonsmith.core.constructs.CString;
import com.laytonsmith.core.constructs.Target;
import com.laytonsmith.core.environments.Environment;
import com.laytonsmith.core.exceptions.CRE.CREPluginInternalException;
import com.laytonsmith.core.exceptions.ConfigRuntimeException;
import com.laytonsmith.core.natives.interfaces.Mixed;
import io.github.jbaero.chvault.CHVault.jFunction;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

/**
 * Chat, 2/24/2016 9:31 PM
 *
 * @author jb_aero
 */
public class ChatFormatting {

	static Chat getChat(Target t) throws CREPluginInternalException {

		try {
			return Bukkit.getServer().getServicesManager().getRegistration(Chat.class).getProvider();
		} catch (NullPointerException npe) {
			throw new CREPluginInternalException("Could not connect to chat features of Vault.", t);
		}
	}

	@api
	public static class vault_group_prefix extends jFunction {

		public Mixed exec(Target t, Environment environment, Mixed... args) throws ConfigRuntimeException {
			Static.checkPlugin("Vault", t);
			return new CString(getChat(t).getGroupPrefix(args[0].val(), args[1].val()), t);
		}

		public String getName() {
			return "vault_group_prefix";
		}

		public Integer[] numArgs() {
			return new Integer[]{2};
		}

		public String docs() {
			return "string {world, group} Returns the prefix of group in world.";
		}
	}

	@api
	public static class vault_group_suffix extends jFunction {

		public Mixed exec(Target t, Environment environment, Mixed... args) throws ConfigRuntimeException {
			Static.checkPlugin("Vault", t);
			return new CString(getChat(t).getGroupSuffix(args[0].val(), args[1].val()), t);
		}

		public String getName() {
			return "vault_group_suffix";
		}

		public Integer[] numArgs() {
			return new Integer[]{2};
		}

		public String docs() {
			return "string {world, group} Returns the suffix of group in world.";
		}
	}

	@api
	public static class vault_user_prefix extends jFunction {

		public Mixed exec(Target t, Environment environment, Mixed... args) throws ConfigRuntimeException {
			Static.checkPlugin("Vault", t);
			return new CString(getChat(t).getPlayerPrefix(args[0].val(),
					(OfflinePlayer) Static.GetUser(args[1], t).getHandle()), t);
		}

		public String getName() {
			return "vault_user_prefix";
		}

		public Integer[] numArgs() {
			return new Integer[]{2};
		}

		public String docs() {
			return "string {world, user} Returns the prefix of user in world. Accuracy is plugin dependent.";
		}
	}

	@api
	public static class vault_user_suffix extends jFunction {

		public Mixed exec(Target t, Environment environment, Mixed... args) throws ConfigRuntimeException {
			Static.checkPlugin("Vault", t);
			return new CString(getChat(t).getPlayerSuffix(args[0].val(),
					(OfflinePlayer) Static.GetUser(args[1], t).getHandle()), t);
		}

		public String getName() {
			return "vault_user_suffix";
		}

		public Integer[] numArgs() {
			return new Integer[]{2};
		}

		public String docs() {
			return "string {world, user} Returns the suffix of user in world. Accuracy is plugin dependent.";
		}
	}
}
