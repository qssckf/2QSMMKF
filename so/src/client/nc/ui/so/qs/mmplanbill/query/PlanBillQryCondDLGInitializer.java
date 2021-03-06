package nc.ui.so.qs.mmplanbill.query;

import nc.itf.scmpub.reference.uap.setting.defaultdata.DefaultDataSettingAccessor;
import nc.ui.pubapp.uif2app.query2.IQueryConditionDLGInitializer;
import nc.ui.pubapp.uif2app.query2.QueryConditionDLGDelegator;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class PlanBillQryCondDLGInitializer implements IQueryConditionDLGInitializer{

	@Override
	public void initQueryConditionDLG(QueryConditionDLGDelegator dlgDelegator) {
		// TODO 自动生成的方法存根
		
		dlgDelegator.registerNeedPermissionOrgFieldCodes(new String[] { "so_preorder_b.pk_org" });
		
		initFilterRef(dlgDelegator);
		
	}
	
	private void initFilterRef(QueryConditionDLGDelegator condDLGDelegator) {
		// TODO 自动生成的方法存根
		
		DeptFilter carFilter=new DeptFilter(condDLGDelegator,"so_preorder_b.pk_org","so_preorder.cdeptid");
		
		carFilter.addEditorListener();

		
		
	}

}
