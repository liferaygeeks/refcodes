package com.bizen.project;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.struts.StrutsPortletAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.CompanyConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.refcodes.portlets.businesscenter.model.BusinessUser;
import com.refcodes.portlets.businesscenter.service.BusinessUserLocalServiceUtil;

public class CreateAccountImpl extends BaseStrutsPortletAction {
	
	

	

	@Override
	public void processAction(StrutsPortletAction originalStrutsPortletAction,
			PortletConfig portletConfig, ActionRequest actionRequest,
			ActionResponse actionResponse) 
	{
		// TODO Auto-generated method stub
		
		String firstName = ParamUtil.getString(actionRequest, "firstName");
		String lastName = ParamUtil.getString(actionRequest, "lastName");
		String emailAddress = ParamUtil.getString(actionRequest, "emailAddress");
		String ownerShip = ParamUtil.getString(actionRequest, "ownerShip");
		String phoneNumber = ParamUtil.getString(actionRequest, "phoneNumber");
		
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
		System.out.println("after adding in businessuser table");
		
		
	}

	
	
	

}
