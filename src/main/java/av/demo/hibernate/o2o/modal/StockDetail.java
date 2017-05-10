package av.demo.hibernate.o2o.modal;

import java.util.Date;

public class StockDetail {

	private int stockId;
	private String compName;
	private String compDesc;
	private String remark;
	private Date listedDate;
	
	private Stock stock;
	
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getCompDesc() {
		return compDesc;
	}
	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getListedDate() {
		return listedDate;
	}
	public void setListedDate(Date listedDate) {
		this.listedDate = listedDate;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "StockDetail [stockId=" + stockId + ", compName=" + compName + ", compDesc=" + compDesc + ", remark="
				+ remark + ", listedDate=" + listedDate + "]";
	}
	
	
}
