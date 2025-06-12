package sew.skateboard.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import sew.skateboard.entity.ModEntities;
import sew.skateboard.entity.custom.SkateboardEntity;

public class SkateboardItem extends Item {
    public SkateboardItem(Settings settings) {
        super(settings);
    }

}