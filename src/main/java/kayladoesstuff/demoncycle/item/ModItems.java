package kayladoesstuff.demoncycle.item;

import kayladoesstuff.demoncycle.DemonCycleRemade;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    public static void addItemToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
    }

    public static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DemonCycleRemade.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DemonCycleRemade.LOGGER.info("Registering mod items for " + DemonCycleRemade.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientTabItemGroup);
    }
}
