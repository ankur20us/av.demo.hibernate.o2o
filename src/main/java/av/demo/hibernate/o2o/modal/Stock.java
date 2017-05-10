package av.demo.hibernate.o2o.modal;

public class Stock {

	private int stockId;
	private String stock_name;
	private String stock_code;
	
	private StockDetail stockDetail;
	
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public String getStock_code() {
		return stock_code;
	}
	public void setStock_code(String stock_code) {
		this.stock_code = stock_code;
	}
	
	public StockDetail getStockDetail() {
		return stockDetail;
	}
	public void setStockDetail(StockDetail stockDetail) {
		this.stockDetail = stockDetail;
	}
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stock_name=" + stock_name + ", stock_code=" + stock_code + "]";
	}
	
}
