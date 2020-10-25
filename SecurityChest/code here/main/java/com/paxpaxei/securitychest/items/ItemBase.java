package com.paxpaxei.securitychest.items;

import com.paxpaxei.securitychest.SecurityChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(SecurityChest.TAB));
    }
}
