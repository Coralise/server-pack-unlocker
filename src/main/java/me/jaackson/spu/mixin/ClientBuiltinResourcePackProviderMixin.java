package me.jaackson.spu.mixin;

import net.minecraft.client.resource.ClientBuiltinResourcePackProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(ClientBuiltinResourcePackProvider.class)
public class ClientBuiltinResourcePackProviderMixin {

	// target
	// Lnet/minecraft/resource/ResourcePackProfile;<init>(
	// 	Ljava/lang/String;
	// 	Z
	// 	Ljava/util/function/Supplier;
	// 	Lnet/minecraft/text/Text;
	// 	Lnet/minecraft/text/Text;
	// 	Lnet/minecraft/resource/ResourcePackCompatibility;
	// 	Lnet/minecraft/resource/ResourcePackProfile$InsertionPosition;
	// 	Z
	// 	Lnet/minecraft/resource/ResourcePackSource;)V
	
	@ModifyArg(method = "loadServerPack", at = @At(value = "INVOKE", target = "Lnet/minecraft/resource/ResourcePackProfile;<init>(Ljava/lang/String;ZLjava/util/function/Supplier;Lnet/minecraft/text/Text;Lnet/minecraft/text/Text;Lnet/minecraft/resource/ResourcePackCompatibility;Lnet/minecraft/resource/ResourcePackProfile$InsertionPosition;ZLnet/minecraft/resource/ResourcePackSource;)V"), index = 7)
	public boolean falsify(boolean bool) {
		return false;
	}
	
}