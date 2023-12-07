package net.jimmy.jimmy;

import net.fabricmc.api.ModInitializer;

import net.jimmy.jimmy.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Jimmy implements ModInitializer {
    public static final String MOD_ID = "jimmy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}