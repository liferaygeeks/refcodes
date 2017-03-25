package com.bizen.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.bizen.constants.RegistrationConstant;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.struts.BaseStrutsPortletAction;
import com.liferay.portal.kernel.struts.StrutsPortletAction;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.GroupConstants;
import com.liferay.portal.service.ClassNameLocalServiceUtil;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.model.AssetVocabulary;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;
import com.liferay.portlet.asset.service.AssetVocabularyLocalServiceUtil;

public class SiteCreationAction extends BaseStrutsPortletAction {
	
	private static Log _log = LogFactoryUtil.getLog(SiteCreationAction.class);
	@Override
	public String render(StrutsPortletAction originalStrutsPortletAction,
			PortletConfig portletConfig, RenderRequest renderRequest,
			RenderResponse renderResponse) throws Exception {
		return originalStrutsPortletAction.render(originalStrutsPortletAction, portletConfig, renderRequest, renderResponse);
	}

	@Override
	public void processAction(StrutsPortletAction originalStrutsPortletAction,
			PortletConfig portletConfig, ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		_log.info(" start of SiteCreationAction  Inside process action!!!!!!!!!!!!!!!! ");
				
			/*Call for default Struts Action*/
		
			
		
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
				WebKeys.THEME_DISPLAY);
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Group.class.getName(), actionRequest);

			long userId = PortalUtil.getUserId(actionRequest);
			Group siteCreated = null;
		    String siteName=ParamUtil.getString(actionRequest,"title");
            String siteDescription=ParamUtil.getString(actionRequest,"title");
            long vocabularyId = ParamUtil.getLong(actionRequest, "vocabularyId");
            String cmd = ParamUtil.getString(actionRequest, Constants.CMD);
            long editCategoryId=ParamUtil.getLong(actionRequest, "categoryId");
            
            
            _log.info("edit category Id"+editCategoryId);
            AssetCategory editCategory=null;
            String frindlyUrl="/";
            Group siteUpdate=null;
          
            String vobularyname= GetterUtil.get(PropsUtil.get(RegistrationConstant.VOCABULARY_NAME), "Business Type");
            AssetVocabulary assetVocabulary = AssetVocabularyLocalServiceUtil.getAssetVocabulary(vocabularyId);
            _log.info("site created by assetVocabulary "+assetVocabulary.getName());
			try {
				if(vobularyname.equalsIgnoreCase(assetVocabulary.getName()) && cmd.equals(Constants.ADD) ){
					originalStrutsPortletAction.processAction(originalStrutsPortletAction, portletConfig, actionRequest, actionResponse);
					_log.info("inside add method");	
			 siteCreated=GroupLocalServiceUtil.addGroup(userId, 0L, Group.class.getName(), ClassNameLocalServiceUtil.getClassNameId(Group.class.getName()), GroupConstants.DEFAULT_LIVE_GROUP_ID, siteName,
						siteDescription, GroupConstants.TYPE_SITE_PRIVATE, true, GroupConstants.DEFAULT_MEMBERSHIP_RESTRICTION, frindlyUrl+siteName, true, true, serviceContext);
				_log.info("site created by name "+siteName);
				
				}else if(vobularyname.equalsIgnoreCase(assetVocabulary.getName()) && cmd.equals(Constants.UPDATE)){
					
				_log.info("inside update method");	
				editCategory=AssetCategoryLocalServiceUtil.getAssetCategory(editCategoryId);
				_log.info("inside update editCategory"+editCategory);
				siteUpdate=GroupLocalServiceUtil.getGroup(themeDisplay.getCompanyId(), editCategory.getName());
					GroupLocalServiceUtil.updateGroup(siteUpdate.getGroupId(), 0L, siteName, siteName,
							GroupConstants.TYPE_SITE_PRIVATE, true, GroupConstants.DEFAULT_MEMBERSHIP_RESTRICTION, frindlyUrl+siteName, true, serviceContext);
					_log.info("Category Edited !!!!!!!!!!");
					originalStrutsPortletAction.processAction(originalStrutsPortletAction, portletConfig, actionRequest, actionResponse);
				}else{
					
					originalStrutsPortletAction.processAction(originalStrutsPortletAction, portletConfig, actionRequest, actionResponse);
					
				}
			} catch (PortalException|SystemException e) {
				
				_log.info("In exception in SiteCreationAction  "+e.getMessage());
			}
			
			_log.info("end of SiteCreationAction  Inside process action!!!!!!!!!!!!!!!! ");
			
	}
}
