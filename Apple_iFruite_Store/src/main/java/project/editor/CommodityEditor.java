package project.editor;

import java.beans.PropertyEditorSupport;

import project.entity.Commodity;
import project.service.CommodityService;


public class CommodityEditor extends PropertyEditorSupport {
	
	private final CommodityService commodityService;
	
	public CommodityEditor(CommodityService commodityService){
		this.commodityService = commodityService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Commodity commodity = commodityService.findOne(Integer.valueOf(text));
		setValue(commodity);
	}
}
