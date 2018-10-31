package nc.impl.so.wa.piece.fetch;

import java.util.Collection;
import nc.impl.pub.ace.AcePieceFetchInfoVOPubServiceImpl;
import nc.bs.dao.BaseDAO;
import nc.bs.so.wa.piece.fetch.ace.rule.DataUniqueCheckRule;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.impl.pubapp.pub.smart.BatchSaveAction;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.bd.meta.BatchOperateVO;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.util.mmf.framework.db.MMSqlBuilder;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.data.IRowSet;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.smart.SmartDefVO;
import nc.vo.so.wa.piece.fetch.PieceFetchInfoVO;

public class PieceFetchInfoVOMaintainImpl extends AcePieceFetchInfoVOPubServiceImpl implements nc.itf.so.wa.piece.fetch.IPieceFetchInfoVOMaintain {

  private BaseDAO baseDao;

@Override
  public PieceFetchInfoVO[] query(IQueryScheme queryScheme)
      throws BusinessException {
      return super.pubquerybasedoc(queryScheme);
  }


  @Override
  public BatchOperateVO batchSave(BatchOperateVO batchVO) throws BusinessException {
    BatchSaveAction<PieceFetchInfoVO> saveAction = new BatchSaveAction<PieceFetchInfoVO>();
    BatchOperateVO retData = saveAction.batchSave(batchVO);
    //调用编码、名称唯一性校验规则
    new DataUniqueCheckRule().process(new BatchOperateVO[] {
      batchVO    });
    return retData;
  }


  @Override
  public SmartDefVO querySmartDefByPK(String pk_def) throws BusinessException,Exception {
	// TODO 自动生成的方法存根
	
	  MMSqlBuilder wheresql = new MMSqlBuilder();
	  wheresql.append("pk_def", pk_def);
	  Collection<SmartDefVO> Vos = null;
	  
	  try {
		  
		  Vos = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(SmartDefVO.class, wheresql.toString(), false);
	  
	  }catch (MetaDataException e){
		  
			 ExceptionUtils.wrappException(e);
	  }
		 
	  SmartDefVO[] smarts=(SmartDefVO[])Vos.toArray(new SmartDefVO[0]);
	  return smarts[0];
  }


  @Override
  public SmartDefVO[] querySmartDef() throws BusinessException, Exception {
	// TODO 自动生成的方法存根
	  
	  MMSqlBuilder wheresql = new MMSqlBuilder();
	  wheresql.append("pk_dir", "1001AF1000000008Z7GL");
	  
	  Collection<SmartDefVO> Vos = null;
	  try{
		  Vos = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(SmartDefVO.class, wheresql.toString(), false);
	  }catch (MetaDataException e){
			 ExceptionUtils.wrappException(e);
	  }
	  
	  return (SmartDefVO[])Vos.toArray(new SmartDefVO[0]);

  }


  @Override
  public IRowSet QueryFetchRecord(String id) throws BusinessException {
	// TODO 自动生成的方法存根
	  
	  DataAccessUtils dao = new DataAccessUtils();
	  String sql="select pk_ftid from so_piecefetchrecordvo where pk_ruleid='"+id+"'";
	  IRowSet rowset = dao.query(sql);	
	  return rowset;
	  
  }

  private BaseDAO getBaseDao() {
		// TODO 自动生成的方法存根
		if (this.baseDao == null)
		{
			this.baseDao = new BaseDAO();
		}
		return this.baseDao;
  }

  @Override
  public void DeleteExistsRecords(Class c, String condition) throws BusinessException {
	// TODO 自动生成的方法存根
	  this.getBaseDao().deleteByClause(c, condition);
  }
}
