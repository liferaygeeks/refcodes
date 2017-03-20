package com.bizen.listener;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.model.BaseModelListener;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.GroupConstants;
import com.liferay.portal.model.LayoutConstants;
import com.liferay.portal.service.ClassNameLocalServiceUtil;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.asset.model.AssetCategory;

public class AssetCategoryListener extends BaseModelListener<AssetCategory>{
	
	@Override
	public void onAfterCreate(AssetCategory assetCategory)
			throws ModelListenerException {
		System.out.println("created asset category name : "+assetCategory.getName());
		String siteName=assetCategory.getName();
		String siteDescription=assetCategory.getName();
		ServiceContext serviceContext = new ServiceContext();
		String frindlyUrl="/";
		System.out.println("created asset category name :3 "+assetCategory.getName());
		try {
			
			Group  group= GroupLocalServiceUtil.createGroup(CounterLocalServiceUtil.increment());
			long primaryId=CounterLocalServiceUtil.increment();
			group.setActive(true);
			group.setClassName(Group.class.getName());
			group.setClassNameId(ClassNameLocalServiceUtil.getClassNameId(Group.class.getName()));
			group.setClassPK(primaryId);
			group.setCompanyId(PortalUtil.getDefaultCompanyId());
			group.setDescription(siteDescription);
			group.setCreatorUserId(assetCategory.getUserId());
			group.setCreatorUserUuid(assetCategory.getUserUuid());
			group.setFriendlyURL(frindlyUrl+siteName);
			group.setGroupId(primaryId);
			group.setLiveGroupId(GroupConstants.DEFAULT_LIVE_GROUP_ID);
			group.setManualMembership(true);
			group.setMembershipRestriction(GroupConstants.DEFAULT_MEMBERSHIP_RESTRICTION);
			group.setName(siteName);
			group.setNew(true);
			group.setParentGroupId(0L);
			group.setPrimaryKey(primaryId);
			group.setRemoteStagingGroupCount(0);;
			group.setSite(true);
			group.setType(GroupConstants.TYPE_SITE_OPEN);
			group.setUuid(serviceContext.getUuid());
			group.setTreePath(group.buildTreePath());
			GroupLocalServiceUtil.addGroup(group);
			
		  } catch (SystemException | PortalException  e) {
			e.getMessage();
		}
		      
		super.onAfterCreate(assetCategory);
	}

}
