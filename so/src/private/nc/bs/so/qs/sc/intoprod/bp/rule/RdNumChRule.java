package nc.bs.so.qs.sc.intoprod.bp.rule;

import nc.impl.pubapp.pattern.rule.IRule;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.so.qs.sc.RdPorductDetailVO;

public class RdNumChRule<E extends SuperVO> implements IRule<E>{
	
	public static IMDPersistenceQueryService getMDQueryService()
	{
		return MDPersistenceService.lookupPersistenceQueryService();
	}

	@Override
	public void process(E[] objs) {
		// TODO 自动生成的方法存根
		try{
			
			for(SuperVO obj:objs){
				
				String srcbid=(String) obj.getAttributeValue("vsrcrdid");
				
				RdPorductDetailVO detailvo = this.getMDQueryService().queryBillOfVOByPK(RdPorductDetailVO.class, srcbid, false);
				
				if(detailvo!=null){
					
					if(detailvo.getTintoprodnum().toDouble() >= detailvo.getProdnum().toDouble()){
						throw new BusinessException("投产数量已经超过排产数量，不能保存！");
					}
					
				}else{
					throw new BusinessException("没有找到来源单据，排产保存异常，请重试！");
				}
				
			}
			
			
		}catch(Exception e){
			ExceptionUtils.wrappException(e);
		}
	}

}
