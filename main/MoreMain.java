package mod.main;

import mod.blocks.AluminumBlock;
import mod.blocks.ChromiumBlock;
import mod.blocks.CobaltBlock;
import mod.blocks.CopperBlock;
import mod.blocks.LeadBlock;
import mod.blocks.NickelBlock;
import mod.blocks.PlatinumBlock;
import mod.blocks.RadioactiveCoalBlock;
import mod.blocks.SilverBlock;
import mod.blocks.TinBlock;
import mod.blocks.TitaniumBlock;
import mod.blocks.VanadiumBlock;
import mod.blocks.ZincBlock;
import mod.dust.AluminumDust;
import mod.dust.ChromiumDust;
import mod.dust.CobaltDust;
import mod.dust.CopperDust;
import mod.dust.LeadDust;
import mod.dust.NickelDust;
import mod.dust.PlatinumDust;
import mod.dust.SilverDust;
import mod.dust.TinDust;
import mod.dust.TitaniumDust;
import mod.dust.VanadiumDust;
import mod.dust.ZincDust;
import mod.ingots.AluminumIngot;
import mod.ingots.ChromiumIngot;
import mod.ingots.CobaltIngot;
import mod.ingots.CopperIngot;
import mod.ingots.LeadIngot;
import mod.ingots.NickelIngot;
import mod.ingots.PlatinumIngot;
import mod.ingots.RadioactiveCoal;
import mod.ingots.SilverIngot;
import mod.ingots.SulfurPowder;
import mod.ingots.TinIngot;
import mod.ingots.TitaniumIngot;
import mod.ingots.VanadiumIngot;
import mod.ingots.ZincIngot;
import mod.oregen.AluminumOreWorldGeneration;
import mod.oregen.ChromiumOreWorldGeneration;
import mod.oregen.CobaltOreWorldGeneration;
import mod.oregen.CopperOreWorldGeneration;
import mod.oregen.LeadOreWorldGeneration;
import mod.oregen.NickelOreWorldGeneration;
import mod.oregen.PlatinumOreWorldGeneration;
import mod.oregen.RadioactiveCoalOreWorldGeneration;
import mod.oregen.SilverOreWorldGeneration;
import mod.oregen.SulfurOreWorldGeneration;
import mod.oregen.TinOreWorldGeneration;
import mod.oregen.TitaniumOreWorldGeneration;
import mod.oregen.VanadiumOreWorldGeneration;
import mod.oregen.ZincOreWorldGeneration;
import mod.ores.AluminumOre;
import mod.ores.ChromiumOre;
import mod.ores.CobaltOre;
import mod.ores.CopperOre;
import mod.ores.LeadOre;
import mod.ores.NickelOre;
import mod.ores.PlatinumOre;
import mod.ores.RadioactiveCoalOre;
import mod.ores.SilverOre;
import mod.ores.SulfurOre;
import mod.ores.TinOre;
import mod.ores.TitaniumOre;
import mod.ores.VanadiumOre;
import mod.ores.ZincOre;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLLoadEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid="More", name = "More", version = "1.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MoreMain {
	//IDs
	
	int aluminumOreBlockID;
	int chromiumOreBlockID;
	int cobaltOreBlockID;
	int copperOreBlockID;
	int leadOreBlockID;
	int nickelOreBlockID;
	int platinumOreBlockID;
	int radioactiveCoalOreBlockID;
	int silverOreBlockID;
	int sulfurOreBlockID;
	int tinOreBlockID;
	int titaniumOreBlockID;
	int vanadiumOreBlockID;
	int zincOreBlockID;
	
	int sulfurPowderID;
	
	int aluminumIngotID;
	int chromiumIngotID;
	int cobaltIngotID;
	int copperIngotID;
	int leadIngotID;
	int nickelIngotID;
	int platinumIngotID;
	int radioactiveCoalID;
	int silverIngotID;
	int tinIngotID;
	int titaniumIngotID;
	int vanadiumIngotID;
	int zincIngotID;
	
	int aluminumBlockID;
	int chromiumBlockID;
	int cobaltBlockID;
	int copperBlockID;
	int leadBlockID;
	int nickelBlockID;
	int platinumBlockID;
	int radioactivecoalBlockID;
	int silverBlockID;
	int tinBlockID;
	int titaniumBlockID;
	int vanadiumBlockID;
	int zincBlockID;
	
	int aluminumDustID;
	int chromiumDustID;
	int cobaltDustID;
	int copperDustID;
	int leadDustID;
	int nickelDustID;
	int platinumDustID;
	int silverDustID;
	int tinDustID;
	int titaniumDustID;
	int vanadiumDustID;
	int zincDustID;
	


	//Block Selections
	public static Block aluminumOre;
	public static Block chromiumOre;
	public static Block cobaltOre;
	public static Block copperOre;
	public static Block leadOre;
	public static Block nickelOre;
	public static Block platinumOre;
	public static Block radioactivecoalOre;
	public static Block silverOre;
	public static Block sulfurOre;
	public static Block tinOre;
	public static Block titaniumOre;
	public static Block vanadiumOre;
	public static Block zincOre;
	
	//Item Selection
	
	public static Item aluminumIngot;
	public static Item chromiumIngot;
	public static Item cobaltIngot;
	public static Item copperIngot;
	public static Item leadIngot;
	public static Item nickelIngot;
	public static Item platinumIngot;
	public static Item silverIngot;
	public static Item tinIngot;
	public static Item titaniumIngot;
	public static Item vanadiumIngot;
	public static Item zincIngot;

	public static Item radioactiveCoal;
	public static Item sulfurPowder;
	
	public static Block aluminumBlock;
	public static Block chromiumBlock;		
	public static Block cobaltBlock;
	public static Block copperBlock;
	public static Block leadBlock;
	public static Block nickelBlock;
	public static Block platinumBlock;
	public static Block silverBlock;
	public static Block tinBlock;	
	public static Block titaniumBlock;
	public static Block vanadiumBlock;
	public static Block zincBlock;
	public static Block radioactivecoalBlock;
	
	public static Item aluminumDust;
	public static Item chromiumDust;
	public static Item cobaltDust;
	public static Item copperDust;
	public static Item leadDust;
	public static Item nickelDust;
	public static Item platinumDust;
	public static Item silverDust;
	public static Item tinDust;
	public static Item titaniumDust;
	public static Item vanadiumDust;
	public static Item zincDust;
	

	//Instance Of Mod
	public static MoreMain instance;

		private static final FMLPreInitializationEvent event = null;

		@EventHandler
		public void preInit (FMLPreInitializationEvent event) 
		{
			
		//Config Code
Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	config.load();
	
	aluminumOreBlockID = config.get("Ore IDs", "Aluminum Ore ID", 1000).getInt();
	chromiumOreBlockID = config.get("Ore IDs", "Chromium Ore ID", 1001).getInt();
	cobaltOreBlockID = config.get("Ore IDs", "Cobalt Ore ID", 1002).getInt();
	copperOreBlockID = config.get("Ore IDs", "Copper Ore ID", 1003).getInt();
	leadOreBlockID = config.get("Ore IDs", "Lead Ore ID", 1004).getInt();
	nickelOreBlockID = config.get("Ore IDs", "Nickel Ore ID", 1005).getInt();
    platinumOreBlockID = config.get("Ore IDs", "Platinum Ore ID", 1006).getInt();
	radioactiveCoalOreBlockID = config.get("Ore IDs", "RadioactiveCoal Ore ID", 1007).getInt();
	silverOreBlockID = config.get("Ore IDs", "Silver Ore ID", 1008).getInt();
	sulfurOreBlockID = config.get("Ore IDs", "Sulfur Ore ID", 1009).getInt();
	tinOreBlockID = config.get("Ore IDs", "Tin Ore ID", 1010).getInt();
	titaniumOreBlockID = config.get("Ore IDs", "Titanium Ore ID", 1011).getInt();
	vanadiumOreBlockID = config.get("Ore IDs", "Vanadium Ore ID", 1012).getInt();
	zincOreBlockID = config.get("Ore IDs", "Zinc Ore ID", 1013).getInt();
	
	
	aluminumIngotID = config.get("Item IDs", "Aluminum Ingot", 1014).getInt();
	chromiumIngotID = config.get("Item IDs", "Chromium Ingot", 1015).getInt();
	cobaltIngotID = config.get("Item IDs", "Cobalt Ingot", 1016).getInt();
	copperIngotID = config.get("Item IDs", "Copper Ingot", 1017).getInt();
	leadIngotID = config.get("Item IDs", "Lead Ingot", 1018).getInt();
	nickelIngotID = config.get("Item IDs", "Nickel Ingot", 1019).getInt();
	platinumIngotID = config.get("Item IDs", "Platinum Ingot", 1020).getInt();
	silverIngotID = config.get("Item IDs", "Silver Ingot", 1021).getInt();
	sulfurPowderID = config.get("Item IDs", "Suflur Powder", 1040).getInt();
	tinIngotID = config.get("Item IDs", "Tin Ingot", 1022).getInt();
	titaniumIngotID = config.get("Item IDs", "Titanium Ingot", 1023).getInt();
	vanadiumIngotID = config.get("Item IDs", "Vanadium Ingot", 1024).getInt();
	zincIngotID = config.get("Item IDs", "Zinc Ingot", 1025).getInt();
	radioactiveCoalID = config.get("Item IDs", "Radioactive Coal", 1026).getInt();
	
	aluminumBlockID = config.get("Block IDs", "Aluminum Block", 1027).getInt();
	chromiumBlockID = config.get("Block IDs", "Chromium Block", 1028).getInt();
	cobaltBlockID = config.get("Block IDs", "Cobalt Block", 1029).getInt();
	copperBlockID = config.get("Block IDs", "Copper Block", 1030).getInt();
	leadBlockID = config.get("Block IDs", "Lead Block", 1031).getInt();
	nickelBlockID = config.get("Block IDs", "Nickel Block", 1032).getInt();
	platinumBlockID = config.get("Block IDs", "Platinum Block", 1033).getInt();
	radioactivecoalBlockID = config.get("Block IDs", "Radioactive Coal Block", 1034).getInt();
	silverBlockID = config.get("Block IDs", "Silver Block", 1035).getInt();
	tinBlockID = config.get("Block IDs", "Tin Block", 1036).getInt();
	titaniumBlockID = config.get("Block IDs", "Titanium Block", 1037).getInt();
	vanadiumBlockID = config.get("Block IDs", "Vanadium Block", 1038).getInt();
	zincBlockID = config.get("Block IDs", "Zinc Block", 1039).getInt();
	
	aluminumDustID = config.get("Item IDs", "Aluminum Dust", 1041).getInt();
	chromiumDustID = config.get("Item IDs", "Chromium Dust", 1042).getInt();
	cobaltDustID = config.get("Item IDs", "Cobalt Dust", 1043).getInt();
	copperDustID = config.get("Item IDs", "Copper Dust", 1044).getInt();
	leadDustID = config.get("Item IDs", "Lead Dust", 1045).getInt();
	nickelDustID = config.get("Item IDs", "Nickel Dust", 1046).getInt();
    platinumDustID = config.get("Item IDs", "Platinum Dust", 1047).getInt();
	silverDustID = config.get("Item IDs", "Silver Dust", 1048).getInt();
	tinDustID = config.get("Item IDs", "Tin Dust", 1049).getInt();
	titaniumDustID = config.get("Item IDs", "Titanium Dust", 1050).getInt();
	vanadiumDustID = config.get("Item IDs", "Vanadium Dust", 1051).getInt();
	zincDustID = config.get("Item IDs", "Zinc Dust", 1052).getInt();

		
	config.save();

	//Initialization
	this.aluminumOre = new AluminumOre(aluminumOreBlockID, null);
	this.chromiumOre = new ChromiumOre(chromiumOreBlockID, null);
	this.cobaltOre = new CobaltOre(cobaltOreBlockID, null);
	this.copperOre = new CopperOre(copperOreBlockID, null);
	this.leadOre = new LeadOre(leadOreBlockID, null);
	this.nickelOre = new NickelOre(nickelOreBlockID, null);
	this.platinumOre = new PlatinumOre(platinumOreBlockID, null);
	this.radioactivecoalOre = new RadioactiveCoalOre(radioactiveCoalOreBlockID, null);
	this.silverOre = new SilverOre(silverOreBlockID, null);
	this.sulfurOre = new SulfurOre(sulfurOreBlockID, null);
	this.tinOre = new TinOre(tinOreBlockID, null);
	this.titaniumOre = new TitaniumOre(titaniumOreBlockID, null);
	this.vanadiumOre = new VanadiumOre(vanadiumOreBlockID, null);
	this.zincOre = new ZincOre(zincOreBlockID, null);
	
	this.aluminumIngot = new AluminumIngot(aluminumIngotID);
	this.chromiumIngot = new ChromiumIngot(chromiumIngotID);
	this.cobaltIngot = new CobaltIngot(cobaltIngotID);
	this.copperIngot = new CopperIngot(copperIngotID);
	this.leadIngot = new LeadIngot(leadIngotID);
	this.nickelIngot = new NickelIngot(nickelIngotID);
	this.platinumIngot = new PlatinumIngot(platinumIngotID);
	this.silverIngot = new SilverIngot(silverIngotID);
	this.sulfurPowder = new SulfurPowder(sulfurPowderID);
	this.tinIngot = new TinIngot(tinIngotID);
	this.titaniumIngot = new TitaniumIngot(titaniumIngotID);
	this.vanadiumIngot = new VanadiumIngot(vanadiumIngotID);
	this.zincIngot = new ZincIngot(zincIngotID);
	this.radioactiveCoal = new RadioactiveCoal(radioactiveCoalID);
	
	
	this.aluminumBlock = new AluminumBlock(aluminumBlockID, Material.iron);
	this.chromiumBlock = new ChromiumBlock(chromiumBlockID, Material.iron);
	this.cobaltBlock = new CobaltBlock(cobaltBlockID, Material.iron);
	this.copperBlock = new CopperBlock(copperBlockID, Material.iron);
	this.leadBlock = new LeadBlock(leadBlockID, Material.iron);
	this.nickelBlock = new NickelBlock(nickelBlockID, Material.iron);
	this.platinumBlock = new PlatinumBlock(platinumBlockID, Material.iron);
	this.radioactivecoalBlock = new RadioactiveCoalBlock(radioactivecoalBlockID, Material.iron);
	this.silverBlock = new SilverBlock(silverBlockID, Material.iron);
	this.tinBlock = new TinBlock(tinBlockID, Material.iron);
	this.titaniumBlock = new TitaniumBlock(titaniumBlockID, Material.iron);
	this.vanadiumBlock = new VanadiumBlock(vanadiumBlockID, Material.iron);
	this.zincBlock = new ZincBlock(zincBlockID, Material.iron);
	
	this.aluminumDust = new AluminumDust(aluminumDustID);
	this.chromiumDust = new ChromiumDust(chromiumDustID);
	this.cobaltDust = new CobaltDust(cobaltDustID);
	this.copperDust = new CopperDust(copperDustID);
	this.leadDust = new LeadDust(leadDustID);
	this.nickelDust = new NickelDust(nickelDustID);
	this.platinumDust = new PlatinumDust(platinumDustID);
	this.silverDust = new SilverDust(silverDustID);
	this.tinDust = new TinDust(tinDustID);
	this.titaniumDust = new TitaniumDust(titaniumDustID);
	this.vanadiumDust = new VanadiumDust(vanadiumDustID);
	this.zincDust = new ZincDust(zincDustID);
	
	
	AluminumOreWorldGeneration Aluminum_genWorld = new AluminumOreWorldGeneration();
	ChromiumOreWorldGeneration Chromium_genWorld = new ChromiumOreWorldGeneration();
	CobaltOreWorldGeneration Cobalt_genWorld = new CobaltOreWorldGeneration();
	CopperOreWorldGeneration Copper_genWorld = new CopperOreWorldGeneration();
	LeadOreWorldGeneration Lead_genWorld = new LeadOreWorldGeneration();
	NickelOreWorldGeneration Nickel_genWorld = new NickelOreWorldGeneration();
	PlatinumOreWorldGeneration Platinum_genWorld = new PlatinumOreWorldGeneration();
	RadioactiveCoalOreWorldGeneration RadioactiveCoal_genWorld = new RadioactiveCoalOreWorldGeneration();
	SilverOreWorldGeneration Silver_genWorld = new SilverOreWorldGeneration();
	SulfurOreWorldGeneration Sulfur_genWorld = new SulfurOreWorldGeneration();
	TinOreWorldGeneration Tin_genWorld = new TinOreWorldGeneration();
	TitaniumOreWorldGeneration Titanium_genWorld = new TitaniumOreWorldGeneration();
	VanadiumOreWorldGeneration Vanadium_genWorld = new VanadiumOreWorldGeneration();
	ZincOreWorldGeneration Zinc_genWorld = new ZincOreWorldGeneration();

	
	
//registry	
	//ores
	LanguageRegistry.addName(aluminumOre, "Aluminum Ore");
	MinecraftForge.setBlockHarvestLevel(aluminumOre, "pickaxe", 1);
	GameRegistry.registerBlock(aluminumOre);
	
	LanguageRegistry.addName(chromiumOre, "Chromium Ore");
	MinecraftForge.setBlockHarvestLevel(chromiumOre, "pickaxe", 1);
	GameRegistry.registerBlock(chromiumOre);
	
	LanguageRegistry.addName(cobaltOre, "Cobalt Ore");
	MinecraftForge.setBlockHarvestLevel(cobaltOre, "pickaxe", 2);
	GameRegistry.registerBlock(cobaltOre);
	
	LanguageRegistry.addName(copperOre, "Copper Ore");
	MinecraftForge.setBlockHarvestLevel(copperOre, "pickaxe", 1);
	GameRegistry.registerBlock(copperOre);
	
	LanguageRegistry.addName(leadOre, "Lead Ore");
	MinecraftForge.setBlockHarvestLevel(leadOre, "pickaxe", 2);
	GameRegistry.registerBlock(leadOre);
	
	LanguageRegistry.addName(nickelOre, "Nickel Ore");
	MinecraftForge.setBlockHarvestLevel(nickelOre, "pickaxe", 1);
	GameRegistry.registerBlock(nickelOre);
	
	LanguageRegistry.addName(platinumOre, "Platinum Ore");
	MinecraftForge.setBlockHarvestLevel(platinumOre, "pickaxe", 2);
	GameRegistry.registerBlock(platinumOre);
	
	LanguageRegistry.addName(radioactivecoalOre, "Radioactive Coal Ore");
	MinecraftForge.setBlockHarvestLevel(radioactivecoalOre, "pickaxe", 3);
	GameRegistry.registerBlock(radioactivecoalOre);
	
	LanguageRegistry.addName(silverOre, "Silver Ore");
	MinecraftForge.setBlockHarvestLevel(silverOre, "pickaxe", 2);
	GameRegistry.registerBlock(silverOre);
	
	LanguageRegistry.addName(sulfurOre, "Sulfur Ore");
	MinecraftForge.setBlockHarvestLevel(sulfurOre, "pickaxe", 1);
	GameRegistry.registerBlock(sulfurOre);
	
	LanguageRegistry.addName(tinOre, "Tin Ore");
	MinecraftForge.setBlockHarvestLevel(tinOre, "pickaxe", 2);
	GameRegistry.registerBlock(tinOre);
	
	LanguageRegistry.addName(titaniumOre, "Titanium Ore");
	MinecraftForge.setBlockHarvestLevel(titaniumOre, "pickaxe", 3);
	GameRegistry.registerBlock(titaniumOre);
	
	LanguageRegistry.addName(vanadiumOre, "Vanadium Ore");
	MinecraftForge.setBlockHarvestLevel(vanadiumOre, "pickaxe", 1);
	GameRegistry.registerBlock(vanadiumOre);
	
	LanguageRegistry.addName(zincOre, "Zinc Ore");
	MinecraftForge.setBlockHarvestLevel(zincOre, "pickaxe", 1);
	GameRegistry.registerBlock(zincOre);
	//ingots
	LanguageRegistry.addName(aluminumIngot, "Aluminum Ingot");
	GameRegistry.addSmelting(aluminumOreBlockID, new ItemStack(aluminumIngot), 0.5F);
	LanguageRegistry.addName(chromiumIngot, "Chromium Ingot");
	GameRegistry.addSmelting(chromiumOreBlockID, new ItemStack(chromiumIngot), 0.5F);
	LanguageRegistry.addName(cobaltIngot, "Cobalt Ingot");
	GameRegistry.addSmelting(cobaltOreBlockID, new ItemStack(cobaltIngot), 0.8F);
	LanguageRegistry.addName(copperIngot, "Copper Ingot");
	GameRegistry.addSmelting(copperOreBlockID, new ItemStack(copperIngot), 0.5F);
	LanguageRegistry.addName(leadIngot, "Lead Ingot");
	GameRegistry.addSmelting(leadOreBlockID, new ItemStack(leadIngot), 0.675F);
	LanguageRegistry.addName(nickelIngot, "Nickel Ingot");
	GameRegistry.addSmelting(nickelOreBlockID, new ItemStack(nickelIngot), 0.55F);
	LanguageRegistry.addName(platinumIngot, "Platinum Ingot");
	GameRegistry.addSmelting(platinumOreBlockID, new ItemStack(platinumIngot), 0.7F);
	LanguageRegistry.addName(silverIngot, "Silver Ingot");
	GameRegistry.addSmelting(silverOreBlockID, new ItemStack(silverIngot), 0.675F);
	LanguageRegistry.addName(tinIngot, "Tin Ingot");
	GameRegistry.addSmelting(tinOreBlockID, new ItemStack(tinIngot), 0.7F);
	LanguageRegistry.addName(titaniumIngot, "Titanium Ingot");
	GameRegistry.addSmelting(titaniumOreBlockID, new ItemStack(titaniumIngot), 1.0F);
	LanguageRegistry.addName(vanadiumIngot, "Vanadium Ingot");
	GameRegistry.addSmelting(vanadiumOreBlockID, new ItemStack(vanadiumIngot), 0.575F);
	LanguageRegistry.addName(zincIngot, "Zinc Ingot");
	GameRegistry.addSmelting(zincOreBlockID, new ItemStack(zincIngot), 0.525F);
	LanguageRegistry.addName(radioactiveCoal, "Radioactive Coal");
	GameRegistry.registerFuelHandler(new Fuels());

	//Blocks
	LanguageRegistry.addName(aluminumBlock, "Aluminum Block");
	MinecraftForge.setBlockHarvestLevel(aluminumBlock, "pickaxe", 1);
	GameRegistry.registerBlock(aluminumBlock);
	
	LanguageRegistry.addName(chromiumBlock, "Chromium Block");
	MinecraftForge.setBlockHarvestLevel(chromiumBlock, "pickaxe", 1);
	GameRegistry.registerBlock(chromiumBlock);
	
	LanguageRegistry.addName(cobaltBlock, "Cobalt Block");
	MinecraftForge.setBlockHarvestLevel(aluminumBlock, "pickaxe", 2);
	GameRegistry.registerBlock(cobaltBlock);
	
	LanguageRegistry.addName(copperBlock, "Copper Block");
	MinecraftForge.setBlockHarvestLevel(copperBlock, "pickaxe", 1);
	GameRegistry.registerBlock(copperBlock);
	
	LanguageRegistry.addName(leadBlock, "Lead Block");
	MinecraftForge.setBlockHarvestLevel(leadBlock, "pickaxe", 2);
	GameRegistry.registerBlock(leadBlock);
	
	LanguageRegistry.addName(nickelBlock, "Nickel Block");
	MinecraftForge.setBlockHarvestLevel(nickelBlock, "pickaxe", 1);
	GameRegistry.registerBlock(nickelBlock);
	
	LanguageRegistry.addName(platinumBlock, "Platinum Block");
	MinecraftForge.setBlockHarvestLevel(platinumBlock, "pickaxe", 2);
	GameRegistry.registerBlock(platinumBlock);
	
	LanguageRegistry.addName(radioactivecoalBlock, "Radioactive Coal Block");
	MinecraftForge.setBlockHarvestLevel(radioactivecoalBlock, "pickaxe", 3);
	GameRegistry.registerBlock(radioactivecoalBlock);
	
	LanguageRegistry.addName(silverBlock, "Silver Block");
	MinecraftForge.setBlockHarvestLevel(silverBlock, "pickaxe", 2);
	GameRegistry.registerBlock(silverBlock);
	
	LanguageRegistry.addName(tinBlock, "Tin Block");
	MinecraftForge.setBlockHarvestLevel(tinBlock, "pickaxe", 2);
	GameRegistry.registerBlock(tinBlock);
	
	LanguageRegistry.addName(titaniumBlock, "Titanium Block");
	MinecraftForge.setBlockHarvestLevel(titaniumBlock, "pickaxe", 3);
	GameRegistry.registerBlock(titaniumBlock);
	
	LanguageRegistry.addName(vanadiumBlock, "Vanadium Block");
	MinecraftForge.setBlockHarvestLevel(vanadiumBlock, "pickaxe", 1);
	GameRegistry.registerBlock(vanadiumBlock);
	
	LanguageRegistry.addName(zincBlock, "Zinc Block");
	MinecraftForge.setBlockHarvestLevel(zincBlock, "pickaxe", 1);
	GameRegistry.registerBlock(zincBlock);
	
	//World Gen
	GameRegistry.registerWorldGenerator(Aluminum_genWorld);
	GameRegistry.registerWorldGenerator(Chromium_genWorld);
	GameRegistry.registerWorldGenerator(Cobalt_genWorld);
	GameRegistry.registerWorldGenerator(Copper_genWorld);
	GameRegistry.registerWorldGenerator(Lead_genWorld);
	GameRegistry.registerWorldGenerator(Nickel_genWorld);
	GameRegistry.registerWorldGenerator(Platinum_genWorld);
	GameRegistry.registerWorldGenerator(RadioactiveCoal_genWorld);
	GameRegistry.registerWorldGenerator(Silver_genWorld);
	GameRegistry.registerWorldGenerator(Sulfur_genWorld);
	GameRegistry.registerWorldGenerator(Tin_genWorld);
	GameRegistry.registerWorldGenerator(Titanium_genWorld);
	GameRegistry.registerWorldGenerator(Vanadium_genWorld);
	GameRegistry.registerWorldGenerator(Zinc_genWorld);
	
	//block crafting
	GameRegistry.addShapedRecipe(new ItemStack(aluminumBlock), "xxx", "xxx", "xxx", 'x', aluminumIngot);
	GameRegistry.addShapedRecipe(new ItemStack(chromiumBlock), "xxx", "xxx", "xxx", 'x', chromiumIngot);
	GameRegistry.addShapedRecipe(new ItemStack(cobaltBlock), "xxx", "xxx", "xxx", 'x', cobaltIngot);
	GameRegistry.addShapedRecipe(new ItemStack(copperBlock), "xxx", "xxx", "xxx", 'x', copperIngot);
	GameRegistry.addShapedRecipe(new ItemStack(leadBlock), "xxx", "xxx", "xxx", 'x', leadIngot);
	GameRegistry.addShapedRecipe(new ItemStack(nickelBlock), "xxx", "xxx", "xxx", 'x', nickelIngot);
	GameRegistry.addShapedRecipe(new ItemStack(platinumBlock), "xxx", "xxx", "xxx", 'x', platinumIngot);
	GameRegistry.addShapedRecipe(new ItemStack(radioactivecoalBlock), "xxx", "xxx", "xxx", 'x', radioactiveCoal);
	GameRegistry.addShapedRecipe(new ItemStack(silverBlock), "xxx", "xxx", "xxx", 'x', silverIngot);
	GameRegistry.addShapedRecipe(new ItemStack(tinBlock), "xxx", "xxx", "xxx", 'x', tinIngot);
	GameRegistry.addShapedRecipe(new ItemStack(titaniumBlock), "xxx", "xxx", "xxx", 'x', titaniumIngot);
	GameRegistry.addShapedRecipe(new ItemStack(vanadiumBlock), "xxx", "xxx", "xxx", 'x', vanadiumIngot);
	GameRegistry.addShapedRecipe(new ItemStack(zincBlock), "xxx", "xxx", "xxx", 'x', zincIngot);
	CraftingManager.getInstance().addRecipe(new ItemStack(aluminumIngot, 9),"C",Character.valueOf('C'), aluminumBlock);
	CraftingManager.getInstance().addRecipe(new ItemStack(chromiumIngot, 9),"C",Character.valueOf('C'), chromiumBlock);
	CraftingManager.getInstance().addRecipe(new ItemStack(cobaltIngot, 9),"C",Character.valueOf('C'), cobaltBlock);
	CraftingManager.getInstance().addRecipe(new ItemStack(copperIngot, 9),"C",Character.valueOf('C'), copperBlock);
	CraftingManager.getInstance().addRecipe(new ItemStack(leadIngot, 9),"C",Character.valueOf('C'), leadBlock);
	CraftingManager.getInstance().addRecipe(new ItemStack(nickelIngot, 9),"C",Character.valueOf('C'), nickelBlock);
	CraftingManager.getInstance().addRecipe(new ItemStack(platinumIngot, 9),"C",Character.valueOf('C'), platinumBlock);
	CraftingManager.getInstance().addRecipe(new ItemStack(radioactiveCoal, 9),"C",Character.valueOf('C'), radioactivecoalBlock);
	CraftingManager.getInstance().addRecipe(new ItemStack(silverIngot, 9),"C",Character.valueOf('C'), silverBlock);
	CraftingManager.getInstance().addRecipe(new ItemStack(tinIngot, 9),"C",Character.valueOf('C'), tinBlock);
	CraftingManager.getInstance().addRecipe(new ItemStack(titaniumIngot, 9),"C",Character.valueOf('C'), titaniumBlock);
	CraftingManager.getInstance().addRecipe(new ItemStack(vanadiumIngot, 9),"C",Character.valueOf('C'), vanadiumBlock);
	CraftingManager.getInstance().addRecipe(new ItemStack(zincIngot, 9),"C",Character.valueOf('C'), zincBlock);
    LanguageRegistry.addName(aluminumDust, "Aluminum Dust");
    LanguageRegistry.addName(chromiumDust, "Chromium Dust");
    LanguageRegistry.addName(cobaltDust, "Cobalt Dust");
    LanguageRegistry.addName(copperDust, "Copper Dust");
    LanguageRegistry.addName(leadDust, "Lead Dust");
    LanguageRegistry.addName(nickelDust, "Nickel Dust");
    LanguageRegistry.addName(platinumDust, "Platinum Dust");
    LanguageRegistry.addName(silverDust, "Silver Dust");
    LanguageRegistry.addName(tinDust, "Tin Dust");
    LanguageRegistry.addName(titaniumDust, "Titanium Dust");
    LanguageRegistry.addName(vanadiumDust, "Vanadium Dust");
    LanguageRegistry.addName(zincDust, "Zinc Dust");
	CraftingManager.getInstance().addRecipe(new ItemStack(aluminumDust, 1),"D" ,Character.valueOf('D'), aluminumOre);
	CraftingManager.getInstance().addRecipe(new ItemStack(chromiumDust, 1),"D" ,Character.valueOf('D'), chromiumOre);
	CraftingManager.getInstance().addRecipe(new ItemStack(cobaltDust, 1),"D" ,Character.valueOf('D'), cobaltOre);
	CraftingManager.getInstance().addRecipe(new ItemStack(copperDust, 1),"D" ,Character.valueOf('D'), copperOre);
	CraftingManager.getInstance().addRecipe(new ItemStack(leadDust, 1),"D" ,Character.valueOf('D'), leadOre);
	CraftingManager.getInstance().addRecipe(new ItemStack(nickelDust, 1),"D" ,Character.valueOf('D'), nickelOre);
	CraftingManager.getInstance().addRecipe(new ItemStack(platinumDust, 1),"D" ,Character.valueOf('D'), platinumOre);
	CraftingManager.getInstance().addRecipe(new ItemStack(silverDust, 1),"D" ,Character.valueOf('D'), silverOre);
	CraftingManager.getInstance().addRecipe(new ItemStack(tinDust, 1),"D" ,Character.valueOf('D'), tinOre);
	CraftingManager.getInstance().addRecipe(new ItemStack(titaniumDust, 1),"D" ,Character.valueOf('D'), titaniumOre);
	CraftingManager.getInstance().addRecipe(new ItemStack(vanadiumDust, 1),"D" ,Character.valueOf('D'), vanadiumOre);
	CraftingManager.getInstance().addRecipe(new ItemStack(zincDust, 1),"D" ,Character.valueOf('D'), zincOre);
		
		}
		@EventHandler
		public void load(FMLLoadEvent event)
		{
		}
		@EventHandler
		public void postInit(FMLPostInitializationEvent event)
		{	
		}
		@EventHandler
		public void ServerStart(FMLServerStartingEvent event)
		{	
		}
		{
	}	
}	

