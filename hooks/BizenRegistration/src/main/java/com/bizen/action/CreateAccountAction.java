package com.bizen.action;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.bizen.constants.RegistrationConstant;
import com.bizen.util.BizenRegistarionUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.struts.BaseStrutsPortletAction;
import com.liferay.portal.kernel.struts.StrutsPortletAction;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.model.AssetVocabulary;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;
import com.liferay.portlet.asset.service.AssetVocabularyLocalServiceUtil;
import com.refcodes.portlets.businesscenter.model.BusinessUser;
import com.refcodes.portlets.businesscenter.service.BusinessUserLocalServiceUtil;

public class CreateAccountAction extends BaseStrutsPortletAction {
	
	

private static 	Log logger = LogFactoryUtil.getLog(CreateAccountAction.class.getName());

	@Override
	public void processAction(StrutsPortletAction originalStrutsPortletAction,
			PortletConfig portletConfig, ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception 
	{
		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);
	if(cmd.equalsIgnoreCase(Constants.ADD)){
		String firstName = ParamUtil.getString(actionRequest, "firstName");
		String lastName = ParamUtil.getString(actionRequest, "lastName");
		String emailAddress = ParamUtil.getString(actionRequest, "emailAddress");
		String ownerShip = ParamUtil.getString(actionRequest, "businessname");
		String phoneNumber = ParamUtil.getString(actionRequest, "mobilenumber");
		String categoryId = ParamUtil.getString(actionRequest, "category");
		originalStrutsPortletAction.processAction(originalStrutsPortletAction, portletConfig, actionRequest, actionResponse);
		
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
	            WebKeys.THEME_DISPLAY);
		User user = UserLocalServiceUtil.getUserByEmailAddress(themeDisplay.getCompanyId(), emailAddress);
		
		BusinessUser businessUser = BusinessUserLocalServiceUtil.createBusinessUser(user.getUserId());
		
		businessUser.setFirstName(firstName);
		businessUser.setLastName(lastName);
		businessUser.setEmail(emailAddress);
		businessUser.setOwnerShip(ownerShip);
		businessUser.setCategoryId(0);
		businessUser.setPhoneNumber(phoneNumber);
		businessUser.setCreatedDate(new Date());
		businessUser.setCreatedBy(user.getUserId());
		BusinessUserLocalServiceUtil.addBusinessUser(businessUser);
		logger.info("after adding in businessuser table");
	}
		
		
		
	}
	@Override
	public String render(StrutsPortletAction originalStrutsPortletAction,PortletConfig portletConfig,
			RenderRequest renderRequest, RenderResponse renderResponse) throws Exception
	{
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		renderRequest.setAttribute(RegistrationConstant.CATEGORIES, BizenRegistarionUtil.getCategoriesByVocabulary(PropsUtil.get(RegistrationConstant.VOCABULARY_NAME),themeDisplay.getScopeGroupId()));
		return  originalStrutsPortletAction.render(null, portletConfig, renderRequest, renderResponse);
	
	}
	
	
	

}
