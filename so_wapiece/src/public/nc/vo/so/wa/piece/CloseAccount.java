/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package nc.vo.so.wa.piece;
	
import nc.vo.pub.*;

/**
 * <b> 在此处简要描述此类的功能 </b>
 * <p>
 *     在此处添加此类的描述信息
 * </p>
 * 创建日期:
 * @author 
 * @version NCPrj ??
 */
@SuppressWarnings("serial")
public class CloseAccount extends SuperVO {
	private java.lang.String pk_group;
	private java.lang.String pk_org;
	private java.lang.String pk_org_v;
	private java.lang.String pk_closeid;
	private java.lang.String year;
	private java.lang.String month;
	private java.lang.String closeder;
	private nc.vo.pub.lang.UFDateTime cloisedate;
	private java.lang.String uncloseder;
	private nc.vo.pub.lang.UFDateTime unclosedate;
	private nc.vo.pub.lang.UFBoolean closesf;
	private nc.vo.pub.lang.UFBoolean clacsf;
	private java.lang.String def1;
	private java.lang.String def2;
	private java.lang.String def3;
	private java.lang.String def4;
	private java.lang.String def5;
	private java.lang.String def6;
	private java.lang.String def7;
	private java.lang.String def8;
	private java.lang.String def9;
	private java.lang.String def10;
	private java.lang.String def11;
	private java.lang.String def12;
	private java.lang.String def13;
	private java.lang.String def14;
	private java.lang.String def15;
	private java.lang.String def16;
	private java.lang.String def17;
	private java.lang.String def18;
	private java.lang.String def19;
	private java.lang.String def20;
	private java.lang.Integer dr = 0;
	private nc.vo.pub.lang.UFDateTime ts;

	public static final String PK_GROUP = "pk_group";
	public static final String PK_ORG = "pk_org";
	public static final String PK_ORG_V = "pk_org_v";
	public static final String PK_CLOSEID = "pk_closeid";
	public static final String YEAR = "year";
	public static final String MONTH = "month";
	public static final String CLOSEDER = "closeder";
	public static final String CLOISEDATE = "cloisedate";
	public static final String UNCLOSEDER = "uncloseder";
	public static final String UNCLOSEDATE = "unclosedate";
	public static final String CLOSESF = "closesf";
	public static final String CLACSF = "clacsf";
	public static final String DEF1 = "def1";
	public static final String DEF2 = "def2";
	public static final String DEF3 = "def3";
	public static final String DEF4 = "def4";
	public static final String DEF5 = "def5";
	public static final String DEF6 = "def6";
	public static final String DEF7 = "def7";
	public static final String DEF8 = "def8";
	public static final String DEF9 = "def9";
	public static final String DEF10 = "def10";
	public static final String DEF11 = "def11";
	public static final String DEF12 = "def12";
	public static final String DEF13 = "def13";
	public static final String DEF14 = "def14";
	public static final String DEF15 = "def15";
	public static final String DEF16 = "def16";
	public static final String DEF17 = "def17";
	public static final String DEF18 = "def18";
	public static final String DEF19 = "def19";
	public static final String DEF20 = "def20";
			
	/**
	 * 属性pk_group的Getter方法.属性名：集团
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getPk_group () {
		return pk_group;
	}   
	/**
	 * 属性pk_group的Setter方法.属性名：集团
	 * 创建日期:
	 * @param newPk_group java.lang.String
	 */
	public void setPk_group (java.lang.String newPk_group ) {
	 	this.pk_group = newPk_group;
	} 	  
	/**
	 * 属性pk_org的Getter方法.属性名：组织
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org () {
		return pk_org;
	}   
	/**
	 * 属性pk_org的Setter方法.属性名：组织
	 * 创建日期:
	 * @param newPk_org java.lang.String
	 */
	public void setPk_org (java.lang.String newPk_org ) {
	 	this.pk_org = newPk_org;
	} 	  
	/**
	 * 属性pk_org_v的Getter方法.属性名：组织版本
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org_v () {
		return pk_org_v;
	}   
	/**
	 * 属性pk_org_v的Setter方法.属性名：组织版本
	 * 创建日期:
	 * @param newPk_org_v java.lang.String
	 */
	public void setPk_org_v (java.lang.String newPk_org_v ) {
	 	this.pk_org_v = newPk_org_v;
	} 	  
	/**
	 * 属性pk_closeid的Getter方法.属性名：主键
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getPk_closeid () {
		return pk_closeid;
	}   
	/**
	 * 属性pk_closeid的Setter方法.属性名：主键
	 * 创建日期:
	 * @param newPk_closeid java.lang.String
	 */
	public void setPk_closeid (java.lang.String newPk_closeid ) {
	 	this.pk_closeid = newPk_closeid;
	} 	  
	/**
	 * 属性year的Getter方法.属性名：年份
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getYear () {
		return year;
	}   
	/**
	 * 属性year的Setter方法.属性名：年份
	 * 创建日期:
	 * @param newYear java.lang.String
	 */
	public void setYear (java.lang.String newYear ) {
	 	this.year = newYear;
	} 	  
	/**
	 * 属性month的Getter方法.属性名：月份
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getMonth () {
		return month;
	}   
	/**
	 * 属性month的Setter方法.属性名：月份
	 * 创建日期:
	 * @param newMonth java.lang.String
	 */
	public void setMonth (java.lang.String newMonth ) {
	 	this.month = newMonth;
	} 	  
	/**
	 * 属性closeder的Getter方法.属性名：关账人
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getCloseder () {
		return closeder;
	}   
	/**
	 * 属性closeder的Setter方法.属性名：关账人
	 * 创建日期:
	 * @param newCloseder java.lang.String
	 */
	public void setCloseder (java.lang.String newCloseder ) {
	 	this.closeder = newCloseder;
	} 	  
	/**
	 * 属性cloisedate的Getter方法.属性名：关账时间
	 * 创建日期:
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getCloisedate () {
		return cloisedate;
	}   
	/**
	 * 属性cloisedate的Setter方法.属性名：关账时间
	 * 创建日期:
	 * @param newCloisedate nc.vo.pub.lang.UFDateTime
	 */
	public void setCloisedate (nc.vo.pub.lang.UFDateTime newCloisedate ) {
	 	this.cloisedate = newCloisedate;
	} 	  
	/**
	 * 属性uncloseder的Getter方法.属性名：反关账人
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getUncloseder () {
		return uncloseder;
	}   
	/**
	 * 属性uncloseder的Setter方法.属性名：反关账人
	 * 创建日期:
	 * @param newUncloseder java.lang.String
	 */
	public void setUncloseder (java.lang.String newUncloseder ) {
	 	this.uncloseder = newUncloseder;
	} 	  
	/**
	 * 属性unclosedate的Getter方法.属性名：反关账时间
	 * 创建日期:
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getUnclosedate () {
		return unclosedate;
	}   
	/**
	 * 属性unclosedate的Setter方法.属性名：反关账时间
	 * 创建日期:
	 * @param newUnclosedate nc.vo.pub.lang.UFDateTime
	 */
	public void setUnclosedate (nc.vo.pub.lang.UFDateTime newUnclosedate ) {
	 	this.unclosedate = newUnclosedate;
	} 	  
	/**
	 * 属性closesf的Getter方法.属性名：关账状态
	 * 创建日期:
	 * @return nc.vo.pub.lang.UFBoolean
	 */
	public nc.vo.pub.lang.UFBoolean getClosesf () {
		return closesf;
	}   
	/**
	 * 属性closesf的Setter方法.属性名：关账状态
	 * 创建日期:
	 * @param newClosesf nc.vo.pub.lang.UFBoolean
	 */
	public void setClosesf (nc.vo.pub.lang.UFBoolean newClosesf ) {
	 	this.closesf = newClosesf;
	} 	  
	/**
	 * 属性clacsf的Getter方法.属性名：计算状态
	 * 创建日期:
	 * @return nc.vo.pub.lang.UFBoolean
	 */
	public nc.vo.pub.lang.UFBoolean getClacsf () {
		return clacsf;
	}   
	/**
	 * 属性clacsf的Setter方法.属性名：计算状态
	 * 创建日期:
	 * @param newClacsf nc.vo.pub.lang.UFBoolean
	 */
	public void setClacsf (nc.vo.pub.lang.UFBoolean newClacsf ) {
	 	this.clacsf = newClacsf;
	} 	  
	/**
	 * 属性def1的Getter方法.属性名：自定义项1
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef1 () {
		return def1;
	}   
	/**
	 * 属性def1的Setter方法.属性名：自定义项1
	 * 创建日期:
	 * @param newDef1 java.lang.String
	 */
	public void setDef1 (java.lang.String newDef1 ) {
	 	this.def1 = newDef1;
	} 	  
	/**
	 * 属性def2的Getter方法.属性名：自定义项2
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef2 () {
		return def2;
	}   
	/**
	 * 属性def2的Setter方法.属性名：自定义项2
	 * 创建日期:
	 * @param newDef2 java.lang.String
	 */
	public void setDef2 (java.lang.String newDef2 ) {
	 	this.def2 = newDef2;
	} 	  
	/**
	 * 属性def3的Getter方法.属性名：自定义项3
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef3 () {
		return def3;
	}   
	/**
	 * 属性def3的Setter方法.属性名：自定义项3
	 * 创建日期:
	 * @param newDef3 java.lang.String
	 */
	public void setDef3 (java.lang.String newDef3 ) {
	 	this.def3 = newDef3;
	} 	  
	/**
	 * 属性def4的Getter方法.属性名：自定义项4
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef4 () {
		return def4;
	}   
	/**
	 * 属性def4的Setter方法.属性名：自定义项4
	 * 创建日期:
	 * @param newDef4 java.lang.String
	 */
	public void setDef4 (java.lang.String newDef4 ) {
	 	this.def4 = newDef4;
	} 	  
	/**
	 * 属性def5的Getter方法.属性名：自定义项5
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef5 () {
		return def5;
	}   
	/**
	 * 属性def5的Setter方法.属性名：自定义项5
	 * 创建日期:
	 * @param newDef5 java.lang.String
	 */
	public void setDef5 (java.lang.String newDef5 ) {
	 	this.def5 = newDef5;
	} 	  
	/**
	 * 属性def6的Getter方法.属性名：自定义项6
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef6 () {
		return def6;
	}   
	/**
	 * 属性def6的Setter方法.属性名：自定义项6
	 * 创建日期:
	 * @param newDef6 java.lang.String
	 */
	public void setDef6 (java.lang.String newDef6 ) {
	 	this.def6 = newDef6;
	} 	  
	/**
	 * 属性def7的Getter方法.属性名：自定义项7
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef7 () {
		return def7;
	}   
	/**
	 * 属性def7的Setter方法.属性名：自定义项7
	 * 创建日期:
	 * @param newDef7 java.lang.String
	 */
	public void setDef7 (java.lang.String newDef7 ) {
	 	this.def7 = newDef7;
	} 	  
	/**
	 * 属性def8的Getter方法.属性名：自定义项8
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef8 () {
		return def8;
	}   
	/**
	 * 属性def8的Setter方法.属性名：自定义项8
	 * 创建日期:
	 * @param newDef8 java.lang.String
	 */
	public void setDef8 (java.lang.String newDef8 ) {
	 	this.def8 = newDef8;
	} 	  
	/**
	 * 属性def9的Getter方法.属性名：自定义项9
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef9 () {
		return def9;
	}   
	/**
	 * 属性def9的Setter方法.属性名：自定义项9
	 * 创建日期:
	 * @param newDef9 java.lang.String
	 */
	public void setDef9 (java.lang.String newDef9 ) {
	 	this.def9 = newDef9;
	} 	  
	/**
	 * 属性def10的Getter方法.属性名：自定义项10
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef10 () {
		return def10;
	}   
	/**
	 * 属性def10的Setter方法.属性名：自定义项10
	 * 创建日期:
	 * @param newDef10 java.lang.String
	 */
	public void setDef10 (java.lang.String newDef10 ) {
	 	this.def10 = newDef10;
	} 	  
	/**
	 * 属性def11的Getter方法.属性名：自定义项11
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef11 () {
		return def11;
	}   
	/**
	 * 属性def11的Setter方法.属性名：自定义项11
	 * 创建日期:
	 * @param newDef11 java.lang.String
	 */
	public void setDef11 (java.lang.String newDef11 ) {
	 	this.def11 = newDef11;
	} 	  
	/**
	 * 属性def12的Getter方法.属性名：自定义项12
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef12 () {
		return def12;
	}   
	/**
	 * 属性def12的Setter方法.属性名：自定义项12
	 * 创建日期:
	 * @param newDef12 java.lang.String
	 */
	public void setDef12 (java.lang.String newDef12 ) {
	 	this.def12 = newDef12;
	} 	  
	/**
	 * 属性def13的Getter方法.属性名：自定义项13
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef13 () {
		return def13;
	}   
	/**
	 * 属性def13的Setter方法.属性名：自定义项13
	 * 创建日期:
	 * @param newDef13 java.lang.String
	 */
	public void setDef13 (java.lang.String newDef13 ) {
	 	this.def13 = newDef13;
	} 	  
	/**
	 * 属性def14的Getter方法.属性名：自定义项14
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef14 () {
		return def14;
	}   
	/**
	 * 属性def14的Setter方法.属性名：自定义项14
	 * 创建日期:
	 * @param newDef14 java.lang.String
	 */
	public void setDef14 (java.lang.String newDef14 ) {
	 	this.def14 = newDef14;
	} 	  
	/**
	 * 属性def15的Getter方法.属性名：自定义项15
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef15 () {
		return def15;
	}   
	/**
	 * 属性def15的Setter方法.属性名：自定义项15
	 * 创建日期:
	 * @param newDef15 java.lang.String
	 */
	public void setDef15 (java.lang.String newDef15 ) {
	 	this.def15 = newDef15;
	} 	  
	/**
	 * 属性def16的Getter方法.属性名：自定义项16
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef16 () {
		return def16;
	}   
	/**
	 * 属性def16的Setter方法.属性名：自定义项16
	 * 创建日期:
	 * @param newDef16 java.lang.String
	 */
	public void setDef16 (java.lang.String newDef16 ) {
	 	this.def16 = newDef16;
	} 	  
	/**
	 * 属性def17的Getter方法.属性名：自定义项17
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef17 () {
		return def17;
	}   
	/**
	 * 属性def17的Setter方法.属性名：自定义项17
	 * 创建日期:
	 * @param newDef17 java.lang.String
	 */
	public void setDef17 (java.lang.String newDef17 ) {
	 	this.def17 = newDef17;
	} 	  
	/**
	 * 属性def18的Getter方法.属性名：自定义项18
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef18 () {
		return def18;
	}   
	/**
	 * 属性def18的Setter方法.属性名：自定义项18
	 * 创建日期:
	 * @param newDef18 java.lang.String
	 */
	public void setDef18 (java.lang.String newDef18 ) {
	 	this.def18 = newDef18;
	} 	  
	/**
	 * 属性def19的Getter方法.属性名：自定义项19
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef19 () {
		return def19;
	}   
	/**
	 * 属性def19的Setter方法.属性名：自定义项19
	 * 创建日期:
	 * @param newDef19 java.lang.String
	 */
	public void setDef19 (java.lang.String newDef19 ) {
	 	this.def19 = newDef19;
	} 	  
	/**
	 * 属性def20的Getter方法.属性名：自定义项20
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getDef20 () {
		return def20;
	}   
	/**
	 * 属性def20的Setter方法.属性名：自定义项20
	 * 创建日期:
	 * @param newDef20 java.lang.String
	 */
	public void setDef20 (java.lang.String newDef20 ) {
	 	this.def20 = newDef20;
	} 	  
	/**
	 * 属性dr的Getter方法.属性名：dr
	 * 创建日期:
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getDr () {
		return dr;
	}   
	/**
	 * 属性dr的Setter方法.属性名：dr
	 * 创建日期:
	 * @param newDr java.lang.Integer
	 */
	public void setDr (java.lang.Integer newDr ) {
	 	this.dr = newDr;
	} 	  
	/**
	 * 属性ts的Getter方法.属性名：ts
	 * 创建日期:
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getTs () {
		return ts;
	}   
	/**
	 * 属性ts的Setter方法.属性名：ts
	 * 创建日期:
	 * @param newTs nc.vo.pub.lang.UFDateTime
	 */
	public void setTs (nc.vo.pub.lang.UFDateTime newTs ) {
	 	this.ts = newTs;
	} 	  
 
	/**
	  * <p>取得父VO主键字段.
	  * <p>
	  * 创建日期:
	  * @return java.lang.String
	  */
	public java.lang.String getParentPKFieldName() {
	    return null;
	}   
    
	/**
	  * <p>取得表主键.
	  * <p>
	  * 创建日期:
	  * @return java.lang.String
	  */
	public java.lang.String getPKFieldName() {
	  return "pk_closeid";
	}
    
	/**
	 * <p>返回表名称.
	 * <p>
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "so_closeaccount";
	}    
	
	/**
	 * <p>返回表名称.
	 * <p>
	 * 创建日期:
	 * @return java.lang.String
	 */
	public static java.lang.String getDefaultTableName() {
		return "so_closeaccount";
	}    
    
    /**
	  * 按照默认方式创建构造子.
	  *
	  * 创建日期:
	  */
     public CloseAccount() {
		super();	
	}    
	
	@nc.vo.annotation.MDEntityInfo(beanFullclassName =  "nc.vo.so.wa.piece.CloseAccount" )
	public IVOMeta getMetaData() {
   		return null;
  	}
} 


