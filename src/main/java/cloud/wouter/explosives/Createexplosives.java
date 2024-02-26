package cloud.wouter.explosives;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Createexplosives implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("create-explosives");

//	public static final Block EXAMPLE_BLOCK  = new Block(FabricBlockSettings.create().strength(4.0f));


	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

//		Registry.register(Registries.BLOCK, new ResourceLocation("tutorial", "example_block"), EXAMPLE_BLOCK);
	}
}
