package com.bizen.listener;

import com.liferay.portal.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModelListener;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.GroupConstants;
import com.liferay.portal.service.ClassNameLocalServiceUtil;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.asset.model.AssetCategory;

public class AssetCategoryListener extends BaseModelListener<AssetCategory>{
	
	private static Log _log = LogFactoryUtil.getLog(AssetCategoryListener.class);
	@Override
	public void onAfterCreate(AssetCategory assetCategory)
			throws ModelListenerException {
		
		_log.info("Inside onAfterCreate inside AssetCategoryListener class");
		String siteName=assetCategory.getName();
		ServiceContext serviceContext = new ServiceContext();
		String frindlyUrl="/";
		
			try {
				GroupLocalServiceUtil.addGroup(assetCategory.getUserId(), 0L, Group.class.getName(), ClassNameLocalServiceUtil.getClassNameId(Group.class.getName()), GroupConstants.DEFAULT_LIVE_GROUP_ID, assetCategory.getName(),
						assetCategory.getName(), GroupConstants.TYPE_SITE_OPEN, true, GroupConstants.DEFAULT_MEMBERSHIP_RESTRICTION, frindlyUrl+siteName, true, true, serviceContext);
			} catch (PortalException|SystemException e) {
				e.getMessage();
			} 
			_log.info("site created by name "+siteName);
			
		  
		      
		super.onAfterCreate(assetCategory);
	}

}
