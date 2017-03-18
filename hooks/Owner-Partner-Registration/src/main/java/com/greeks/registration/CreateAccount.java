package com.greeks.registration;

import javax.portlet.ActionRequest;

import java.util.List;

import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.struts.StrutsAction;
import com.liferay.portal.kernel.struts.StrutsPortletAction;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.model.AssetVocabulary;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;

public class CreateAccount implements StrutsPortletAction {

	@Override
	public void processAction(PortletConfig arg0, ActionRequest arg1,
			ActionResponse arg2) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processAction(StrutsPortletAction arg0, PortletConfig arg1,
			ActionRequest arg2, ActionResponse arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String render(PortletConfig arg0, RenderRequest arg1,
			RenderResponse arg2) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String render(StrutsPortletAction arg0, PortletConfig arg1,
			RenderRequest arg2, RenderResponse arg3) throws Exception {
		// TODO Auto-generated method stub
/*		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(AssetVocabulary.class, PortalClassLoaderUtil.getClassLoader());
		 dynamicQuery.add(PropertyFactoryUtil.forName("name").eq("Mail Notification"));
		 List<AssetCategory> assetCategories = AssetCategoryLocalServiceUtil.dynamicQuery(dynamicQuery);
		 out.print("assetCategories Size ="+assetCategories.size()); */

		return arg0.render(arg0, arg1, arg2, arg3);
	}

	@Override
	public void serveResource(PortletConfig arg0, ResourceRequest arg1,
			ResourceResponse arg2) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serveResource(StrutsPortletAction arg0, PortletConfig arg1,
			ResourceRequest arg2, ResourceResponse arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
