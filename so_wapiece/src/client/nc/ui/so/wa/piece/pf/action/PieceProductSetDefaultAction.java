package nc.ui.so.wa.piece.pf.action;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import nc.bs.framework.common.NCLocator;
import nc.itf.so.wa.piece.IPieceWaMaintain;
import nc.itf.so.wa.piece.pf.IPieceProductVOMaintain;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.uif2.NCAction;
import nc.ui.uif2.ShowStatusBarMsgUtil;
import nc.ui.uif2.model.BatchBillTableModel;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.so.wa.piece.PieceProductVO;

public class PieceProductSetDefaultAction extends NCAction{
	
	private IPieceProductVOMaintain service;
	
	private IMDPersistenceQueryService getMDQueryService() {
		return MDPersistenceService.lookupPersistenceQueryService();
	}
	
	public IPieceProductVOMaintain getService() {
		
		if(this.service==null){
			this.service=NCLocator.getInstance().lookup(IPieceProductVOMaintain.class);
		}
		
		return this.service;
	}

	public PieceProductSetDefaultAction(){
		this.setBtnName("设为默认");
		this.setCode("SetDefault");
	}

	private BatchBillTableModel model = null;
	
	public BatchBillTableModel getModel() {
		return model;
	}

	public void setModel(BatchBillTableModel model) {
		this.model = model;
		this.model.addAppEventListener(this);
	}

	@Override
	public void doAction(ActionEvent e) throws Exception {
		// TODO 自动生成的方法存根

		Object[] vos=this.getModel().getSelectedOperaDatas();
		
		String pk_oldid=null;
		
		List<String> ids=new ArrayList();
		
		if(vos.length>0 && vos.length>1 ){
			throw new BusinessException("不能选择大于一条的计件产品记录进行设置默认操作！");
		}
		
		PieceProductVO vo=(PieceProductVO) this.getModel().getSelectedData();
		
		if(UFBoolean.TRUE.equals(vo.getIsdefault())){
			throw new BusinessException("当前选择记录已经为默认状态，不能重复设置！");
		}
		
		pk_oldid=this.getService().isHaveDefault(vo.getPk_org());

		if(pk_oldid!=null){
			
			int res = MessageDialog.showYesNoDlg(getModel().getContext().getEntranceUI(),"警告","当前组织已经存在计件产品，设置默认操作将情况将清空已有产品默认状态，是否继续？");

			if(res==8){
				
				return;
				
			}

		}
		
		PieceProductVO ret=this.getService().setDefault(vo);
		
		ids.add(pk_oldid);
		ids.add(ret.getPk_ppid());
		
		PieceProductVO[] retvos=(PieceProductVO[]) this.getMDQueryService().queryBillOfVOByPKsWithOrder(PieceProductVO.class, ids.toArray(new String[ids.size()]), false);
		
		int rows=this.getModel().getRowCount();
		
		for(PieceProductVO retvo:retvos){
			
			for(int i=0;i<rows;i++){
				
				PieceProductVO rowobj=(PieceProductVO) this.getModel().getRow(i);
				
				if(rowobj.getPk_ppid().equals(retvo.getPk_ppid())){
					
					this.getModel().updateLine(i, retvo);
					break;
				}
				
			}
			
		}
		
		ShowStatusBarMsgUtil.showStatusBarMsg("设置状态操作执行完毕！", this.getModel().getContext());
		
		
		
	}

}
