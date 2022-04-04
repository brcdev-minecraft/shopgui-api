# shopgui-api

![GitHub release](https://img.shields.io/github/release/brcdev-minecraft/shopgui-api)
![GitHub](https://img.shields.io/github/license/brcdev-minecraft/shopgui-api)
![GitHub last commit](https://img.shields.io/github/last-commit/brcdev-minecraft/shopgui-api)

This repository provides an open source library containing basic API
for [ShopGUI+](https://www.spigotmc.org/resources/shopgui-1-7-1-14.6515/) spigot plugin.

## Hooking into ShopGUI+

**Do not hook into ShopGUI+ directly in `onEnable` method of your plugin!**

Due to the way ShopGUI+ loads up itself and dependant items from other plugins, at the point of `onEnable` you may get a
NPE. It might work but it's considered as unsafe and we won't provide support if it doesn't.
See [example implementations](#example-implementations) below for more exact examples.

Instead, listen for `ShopGUIPlusPostEnableEvent` event in your plugin and perform the startup logic there:

```java
  @EventHandler public void onShopGUIPlusPostEnable(ShopGUIPlusPostEnableEvent event){
  ShopGuiPlusApi.registerItemProvider(...);
  }
```

This guarantees your code gets executed when ShopGUI+ had started up, but not loaded its shops yet, so you can register
your items, spawners, economies etc. safely.

## How to use

1. Add Maven/Gradle dependency to your project (code snippets are available in the section below)
2. Add `ShopGUIPlus` to `depend` or `softdepend` section of `plugin.yml` in your plugin project
3. Hook into ShopGUI+ as described in paragraph above
4. You can start adding desired implementation to your plugin

Tips:

* Registering of spawner or economy provider must be performed at server startup (as described in the first pagraph
  above)
* You can get ShopGUI+'s main class with `ShopGuiPlusApi#getPlugin` static method
* The API is still very basic and incomplete - we're open for ideas as well as pull requests

## Version compatibility matrix

When using this API, make sure you use valid version corresponding to ShopGUI+'s version your plugin is going to be used
with.

| ShopGUI+ version  | API version |
| --- | --- |
| 1.74.0 - ... | 2.4.0
| 1.72.0 - 1.73.1 | 2.3.0
| 1.58.0 - 1.71.0 | 2.2.0
| 1.45.1 - 1.57.0 | 2.1.1
| 1.45.0 | 2.1.0
| 1.43.0 - 1.44.3 | 2.0.0
| 1.42.0 - 1.42.3 | 1.5.1
| 1.36.0 - 1.41.0 | 1.5.0
| 1.35.0 - 1.35.1  | 1.4.0
| 1.33.0 - 1.34.2 | 1.3.0
| 1.29.1 - 1.32.1 | 1.2.0
| 1.29.0 | 1.1.0
| 1.20.3 - 1.28.1 | 1.0.1
| 1.20.0 - 1.20.2 | 1.0.0

## Dependencies

_Note: It's not recommended to use the `latest` version tag. Use fixed version
from [Releases](https://github.com/brcdev-minecraft/shopgui-api/releases) instead._

### Maven

```
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

```
	<dependency>
	    <groupId>com.github.brcdev-minecraft</groupId>
	    <artifactId>shopgui-api</artifactId>
	    <version>latest</version>
	    <scope>provided</scope>
	</dependency>
```

### Gradle

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

```
	dependencies {
	        compileOnly 'com.github.brcdev-minecraft:shopgui-api:latest'
	}
```

## Example implementations

There are some examples of implementing a spawners provider available at our GitHub:

* [MySpawners - example of spawners plugin hooking into ShopGUI+](https://github.com/brcdev-minecraft/shopgui-api-example-spawner-provider)
* [MyEconomy - example of economy plugin hooking into ShopGUI+](https://github.com/brcdev-minecraft/shopgui-api-example-economy-provider)
* [MyItems - example of items plugin hooking into ShopGUI+](https://github.com/brcdev-minecraft/shopgui-api-example-item-provider)

More example plugins showing API possibilities are coming soon.

## Contact

You can contact the maintainers at our Discord server - http://discord.brcdev.net/
