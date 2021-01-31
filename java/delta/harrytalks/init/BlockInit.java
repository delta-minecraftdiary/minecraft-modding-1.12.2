package delta.harrytalks.init;

import delta.harrytalks.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON);
}
