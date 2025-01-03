package nl.timthebest8.learningtomod;

import net.fabricmc.api.ModInitializer;

import nl.timthebest8.learningtomod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearningToMod implements ModInitializer {
	public static final String MOD_ID = "learningtomod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}