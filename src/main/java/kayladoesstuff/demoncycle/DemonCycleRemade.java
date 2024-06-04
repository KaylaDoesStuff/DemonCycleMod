package kayladoesstuff.demoncycle;

import kayladoesstuff.demoncycle.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemonCycleRemade implements ModInitializer {
	public static final String MOD_ID = "demoncycleremade";
    public static final Logger LOGGER = LoggerFactory.getLogger("demoncycleremade");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}