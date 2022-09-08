package main.java.customroom.mixin;

import org.spongepowered.asm.mixin.Mixin;
import iskallia.vault.world.vault.gen.VaultRoomNames;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.StringTextComponent;

@Mixin(VaultRoomNames.class)
public abstract class VaultRoomNamesMixin {
    private static ITextComponent getName() {
        switch (filterKey) {
            case "test_room": {
                return (ITextComponent) new StringTextComponent("Testing Room")
                        .func_240699_a_(TextFormatting.YELLOW);
            }
        }
    }
}
