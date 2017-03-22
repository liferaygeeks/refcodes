package com.bizen.util;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.bizen.action.CreateAccountAction;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.model.AssetVocabulary;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;
import com.liferay.portlet.asset.service.AssetVocabularyLocalServiceUtil;

public class BizenRegistarionUtil {
	private	static Log logger = LogFactoryUtil.getLog(BizenRegistarionUtil.class.getName());
	public static Map<String,String> getCategoriesByVocabulary(String vocabularyName,long groupId) {
		Map<String,String> categories = new TreeMap<String, String>();
		
		try {
			AssetVocabulary 	vocabulary = AssetVocabularyLocalServiceUtil.getGroupVocabulary(groupId, vocabularyName);
		
		List<AssetCategory> categoryList = AssetCategoryLocalServiceUtil.getVocabularyCategories(vocabulary.getVocabularyId(), -1, -1, null); 
		
			for(AssetCategory assesCategory:categoryList){
			
			categories.put(assesCategory.getCategoryId()+"", assesCategory.getName());
			
		}
		} catch (PortalException e) {
		
			logger.error("OOps Seems like there is no Vocabulary created with name "+vocabularyName+" ERROR MESSAGE"+e.getMessage());
		} catch (SystemException e) {
			
			logger.error("OOps Seems like there is no Vocabulary created with name "+vocabularyName+" ERROR MESSAGE"+e.getMessage());
		}
		return categories;
		
	}
}
