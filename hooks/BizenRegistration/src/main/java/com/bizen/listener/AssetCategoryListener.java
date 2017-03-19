package com.bizen.listener;

import java.net.HttpRetryException;

import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.ModelListenerException;
import com.liferay.portal.model.BaseModelListener;
import com.liferay.portlet.asset.model.AssetCategory;

public class AssetCategoryListener extends BaseModelListener<AssetCategory>{
	
	@Override
	public void onAfterCreate(AssetCategory assetCategory)
			throws ModelListenerException {

		System.out.println("created asset category name : "+assetCategory.getName());
		
		//GroupLocalServiceUtil.addGroup(userId, className, classPK, name, description, type, friendlyURL, site, active, serviceContext)

		super.onAfterCreate(assetCategory);
	}

}
