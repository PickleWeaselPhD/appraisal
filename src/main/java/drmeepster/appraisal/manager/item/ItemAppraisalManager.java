package drmeepster.appraisal.manager.item;

import drmeepster.appraisal.context.ItemAppraisalContext;
import drmeepster.appraisal.manager.AbstractAppraisalManager;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

/**
 * The <code>AppraisalManager</code> for <code>Item</code>.
 *
 * @param <T> class of the owning object
 */
public class ItemAppraisalManager<T extends Item> extends AbstractAppraisalManager<T, ItemAppraisalContext>{

	public static final String KEY_TYPE = "appraisal.item";
	
	public ItemAppraisalManager(T item){
		super(item, Registry.ITEM, KEY_TYPE);
	}
}
