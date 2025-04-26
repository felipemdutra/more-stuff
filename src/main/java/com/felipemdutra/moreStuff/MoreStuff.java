package com.felipemdutra.moreStuff;

import com.felipemdutra.moreStuff.item.ModItems;
import com.felipemdutra.moreStuff.item.custom.CustomToolMaterials;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreStuff implements ModInitializer {
    public static final String ID = "more-stuff";
    public static final Logger LOGGER = LoggerFactory.getLogger(ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing {}", ID);

        CustomToolMaterials.initialize();
        ModItems.initialize();
    }
}
