package com.bizen.listener;

import com.liferay.portal.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModelListener;
import com.liferay.portal.model.Group;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.model.AssetVocabulary;
import com.liferay.portlet.asset.service.AssetVocabularyLocalServiceUtil;

public class AssetCategoryListener extends BaseModelListener<AssetCategory>{
	
	private static Log _log = LogFactoryUtil.getLog(AssetCategoryListener.class);
	
	
	public void onBeforeRemove(AssetCategory assetCategory)
			throws ModelListenerException {
		
		_log.info("Inside onBeforeRemove in listener"+assetCategory.getName());
		Group deleteGroup=null;
		AssetVocabulary assetVocabulary=null;
		long vocabularyId= assetCategory.getVocabularyId();
		
		String businessType= "Business Type";
		
		
		try {
			assetVocabulary=AssetVocabularyLocalServiceUtil.getAssetVocabulary(vocabularyId);
			if(assetVocabulary.getName().equalsIgnoreCase(businessType)){
			
			
				deleteGroup=GroupLocalServiceUtil.fetchGroup(assetCategory.getCompanyId(), assetCategory.getName());
			_log.info("deleteGroup"+deleteGroup);
			
			GroupLocalServiceUtil.deleteGroup(deleteGroup.getGroupId());
			
			_log.info("Site Removed by name"+assetCategory.getName());
			}
		} catch (PortalException |SystemException e) {
			e.getMessage();
			_log.info("Exception during onAfterRemove "+e.getMessage());
			
		} 
		
		_log.info("End of onAfterRemove in listener");
		
		}
}
