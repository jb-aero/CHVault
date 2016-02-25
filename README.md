# CHVault
A [CommandHelper](https://github.com/sk89q/CommandHelper) extension providing access to Vault's API.

Download the correct version for your version of CommandHelper:
<br>[CH 3.3.1-Snapshot](https://letsbuild.net/jenkins/job/CHVault/10/) (Old version)
<br>[CH 3.3.1 (Release)](https://letsbuild.net/jenkins/job/CHVault/11/) (You probably want this one)
<br>[CH 3.3.2-Snapshot](https://letsbuild.net/jenkins/job/CHVault/lastSuccessfulBuild/) (Dev builds)


## Functions
### Permissions
Uses Vault to extend the potential of permissions checking with group and multiworld support.

#### boolean vault_has_permission(player, permission, [world]);
Checks the permission value of a player, optionally in a specific world.
When used on an offline player, the accuracy depends on the permission plugin.

#### array vault_pgroup(player, [world]);
Returns an array of groups that the player is in. When used on offline players,
the accuracy of this function is dependent on the permissions plugin.

### Chat

#### string vault_group_prefix(world, group);
Returns the prefix of group in world.

#### string vault_group_suffix(world, group);
Returns the suffix of group in world.

#### string vault_user_prefix(world, user);
Returns the prefix of user in world. Accuracy is plugin dependent if user is not online.

#### string vault_user_suffix(world, user);
Returns the suffix of user in world. Accuracy is plugin dependent if user is not online.

### Economy
Provides functions to hook into the server's economy plugin. To use any of these functions, you must have one of the following economy plugins installed: iConomy 4,5,6, BOSEconomy 6 & 7, EssentialsEcon, 3Co, MultiCurrency, MineConomy, eWallet, EconXP, CurrencyCore, CraftConomy. In addition, you must download the [Vault plugin](http://dev.bukkit.org/server-mods/vault/). Beyond this, there is no special setup to get the economy functions working, assuming they work for you in game using the plugin's default controls. Bank controls may not be supported in your particular plugin, check the details of that particular plugin.

#### void acc\_add(account\_name, to\_add):
Adds an amount to the specified account

#### double acc\_balance(account\_name):
Returns the balance of the given account name.

#### void acc\_divide(account\_name, to\_divide):
Divides the account by the given amount

#### void acc\_multiply(account\_name, to\_multiply):
Multiplies the account balance by the given amount

#### void acc\_remove(account\_name):
Removes the specified account from the game - Currently unimplemented, due to lack of support in Vault. Calling this function will currently always throw an exception.

#### void acc\_set(account\_name, value):
Sets the account's balance to the given amount

#### void acc\_subtract(account\_name, to\_subtract):
Subtracts the given amount from the specified account

#### void bacc\_add(bank\_name, value):
Adds the specified amount to the bank account's balance

#### void bacc\_balance(bank\_name):
Gets the specified bank account's balance

#### void bacc\_divide(bank\_name, value):
Divides the bank account's balance by the given value

#### void bacc\_multiply(bank\_name, value):
Multiplies the given bank account's balance by the given value

#### void bacc\_remove(bank\_name):
Removes the given bank account from the game

#### void bacc\_set(bank\_name, value):
Sets the bank account's balance to the given amount

#### void bacc\_subtract(bank\_name, value):
Subtracts the specified amount from the bank account's balance

