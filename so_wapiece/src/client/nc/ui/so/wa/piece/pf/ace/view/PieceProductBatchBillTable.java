package nc.ui.so.wa.piece.pf.ace.view;

import javax.swing.JComponent;
import nc.ui.pub.bill.BillItem;
import nc.ui.pubapp.uif2app.view.ShowUpableBatchBillTable;
import nc.ui.so.wa.piece.ace.view.dialog.PieceFormulaPane;

public class PieceProductBatchBillTable extends ShowUpableBatchBillTable {
	
	private PieceFormulaPane formulapanel;

	public PieceProductBatchBillTable() {}

	@Override
	protected void onEdit() {
		// TODO 自动生成的方法存根
		super.onEdit();
		
		getBillCardPanel().getBodyItem("isdefault").setEdit(false);
	}
	
	

}
