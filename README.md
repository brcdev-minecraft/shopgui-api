# shopgui-api 
![GitHub release](https://img.shields.io/github/release/brcdev-minecraft/shopgui-api)
![Travis (.org)](https://img.shields.io/travis/brcdev-minecraft/shopgui-api)
![GitHub](https://img.shields.io/github/license/brcdev-minecraft/shopgui-api)
![GitHub last commit](https://img.shields.io/github/last-commit/brcdev-minecraft/shopgui-api)

This repository provides an open source library containing basic API for [ShopGUI+](https://www.spigotmc.org/resources/shopgui-1-7-1-14.6515/) spigot plugin.

## Dependencies
_Note: It's not recommended to use the `latest` version tag. Use fixed version from [Releases](../releases) instead._ 
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
	        implementation 'com.github.brcdev-minecraft:shopgui-api:latest'
	}
```