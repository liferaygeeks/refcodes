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

public class CreateAccountImpl implements StrutsPortletAction {
	
	private static final boolean _AUTO_SCREEN_NAME = false;

	@Override
	public void processAction(PortletConfig portletConfig,
			ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processAction(StrutsPortletAction originalStrutsPortletAction,
			PortletConfig portletConfig, ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		
		String firstName = ParamUtil.getString(actionRequest, "firstName");
		String lastName = ParamUtil.getString(actionRequest, "lastName");
		String emailAddress = ParamUtil.getString(actionRequest, "emailAddress");
		String ownerShip = ParamUtil.getString(actionRequest, "ownerShip");
		String phoneNumber = ParamUtil.getString(actionRequest, "phoneNumber");
		/*
		HttpServletRequest request = PortalUtil.getHttpServletRequest(
				actionRequest);
			HttpSession session = request.getSession();

			ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
				WebKeys.THEME_DISPLAY);

			Company company = themeDisplay.getCompany();

			boolean autoPassword = true;
			String password1 = null;
			String password2 = null;
			boolean autoScreenName = isAutoScreenName();
			String screenName = ParamUtil.getString(actionRequest, "screenName");
			String emailAddress = ParamUtil.getString(
				actionRequest, "emailAddress");
			long facebookId = ParamUtil.getLong(actionRequest, "facebookId");
			String openId = ParamUtil.getString(actionRequest, "openId");
			String firstName = ParamUtil.getString(actionRequest, "firstName");
			String middleName = ParamUtil.getString(actionRequest, "middleName");
			String lastName = ParamUtil.getString(actionRequest, "lastName");
			int prefixId = ParamUtil.getInteger(actionRequest, "prefixId");
			int suffixId = ParamUtil.getInteger(actionRequest, "suffixId");
			boolean male = ParamUtil.getBoolean(actionRequest, "male", true);
			int birthdayMonth = ParamUtil.getInteger(
				actionRequest, "birthdayMonth");
			int birthdayDay = ParamUtil.getInteger(actionRequest, "birthdayDay");
			int birthdayYear = ParamUtil.getInteger(actionRequest, "birthdayYear");
			String jobTitle = ParamUtil.getString(actionRequest, "jobTitle");
			long[] groupIds = null;
			long[] organizationIds = null;
			long[] roleIds = null;
			long[] userGroupIds = null;
			//boolean sendEmail = true;

			ServiceContext serviceContext = ServiceContextFactory.getInstance(
				User.class.getName(), actionRequest);

			if (PropsValues.LOGIN_CREATE_ACCOUNT_ALLOW_CUSTOM_PASSWORD) {
				autoPassword = false;

				password1 = ParamUtil.getString(actionRequest, "password1");
				password2 = ParamUtil.getString(actionRequest, "password2");
			}

			boolean openIdPending = false;

			Boolean openIdLoginPending = (Boolean)session.getAttribute(
				WebKeys.OPEN_ID_LOGIN_PENDING);

			if ((openIdLoginPending != null) && openIdLoginPending.booleanValue() &&
				Validator.isNotNull(openId)) {

				sendEmail = false;
				openIdPending = true;
			}

			User user = UserServiceUtil.addUserWithWorkflow(
				company.getCompanyId(), autoPassword, password1, password2,
				autoScreenName, screenName, emailAddress, facebookId, openId,
				themeDisplay.getLocale(), firstName, middleName, lastName, prefixId,
				suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle,
				groupIds, organizationIds, roleIds, userGroupIds, false,
				serviceContext);

			if (openIdPending) {
				session.setAttribute(
					WebKeys.OPEN_ID_LOGIN, new Long(user.getUserId()));

				session.removeAttribute(WebKeys.OPEN_ID_LOGIN_PENDING);
			}
			else {

				// Session messages

				if (user.getStatus() == WorkflowConstants.STATUS_APPROVED) {
					SessionMessages.add(
						request, "userAdded", user.getEmailAddress());
					SessionMessages.add(
						request, "userAddedPassword",
						user.getPasswordUnencrypted());
				}
				else {
					SessionMessages.add(
						request, "userPending", user.getEmailAddress());
				}
			}

*/
		originalStrutsPortletAction.processAction(originalStrutsPortletAction, portletConfig, actionRequest, actionResponse);
		
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
	            WebKeys.THEME_DISPLAY);
	    long userId = UserLocalServiceUtil.getUserIdByEmailAddress(themeDisplay.getCompanyId(), ParamUtil.getString(
	            actionRequest, "emailAddress"));
		
		BusinessUser businessUser = BusinessUserLocalServiceUtil.createBusinessUser(userId);
		
		businessUser.setFirstName(firstName);
		businessUser.setLastName(lastName);
		businessUser.setEmail(emailAddress);
		businessUser.setOwnerShip(ownerShip);
		businessUser.setCategoryId(0);
		businessUser.setPhoneNumber(phoneNumber);
		businessUser.setCreatedDate(new Date());
		businessUser.setCreatedBy(userId);
		BusinessUserLocalServiceUtil.addBusinessUser(businessUser);
		
		
	}

	@Override
	public String render(PortletConfig portletConfig,
			RenderRequest renderRequest, RenderResponse renderResponse)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String render(StrutsPortletAction originalStrutsPortletAction,
			PortletConfig portletConfig, RenderRequest renderRequest,
			RenderResponse renderResponse) throws Exception {
		// TODO Auto-generated method stub
		return originalStrutsPortletAction.render(originalStrutsPortletAction, portletConfig, renderRequest, renderResponse);
	}

	@Override
	public void serveResource(PortletConfig portletConfig,
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serveResource(StrutsPortletAction originalStrutsPortletAction,
			PortletConfig portletConfig, ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	protected boolean isAutoScreenName() {
		return _AUTO_SCREEN_NAME;
	}
	

}
