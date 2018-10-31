package nc.itf.so.wa.piece.fetch;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.smart.SmartDefVO;
import nc.vo.so.wa.piece.fetch.PieceFetchInfoVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.data.IRowSet;
import nc.itf.pubapp.pub.smart.ISmartService;

public interface IPieceFetchInfoVOMaintain extends ISmartService{
    
	public PieceFetchInfoVO[] query(IQueryScheme queryScheme) throws BusinessException, Exception;
	
	public SmartDefVO querySmartDefByPK(String pk_def) throws BusinessException, Exception;
	
	public SmartDefVO[] querySmartDef() throws BusinessException, Exception;
	
	public void DeleteExistsRecords(Class c,String condition)  throws BusinessException;
	
	public abstract IRowSet QueryFetchRecord(String code) throws BusinessException;
}
