package cloud.wouter.explosives.mixin;

import net.minecraft.server.MinecraftServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class ExampleMixin {
	private static final Logger LOGGER = LoggerFactory.getLogger("create-explosives");

	@Inject(at = @At("HEAD"), method = "loadLevel")
	private void init(CallbackInfo info) {
		LOGGER.info("Hello from the mixin!");
		// This code is injected into the start of MinecraftServer.loadWorld()V
	}
}
