package av.demo.hibernate.o2o.modal.service;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import av.demo.hibernate.o2o.modal.Stock;
import av.demo.hibernate.o2o.modal.StockDetail;

public class Example {

	public static void main(String[] args) {
		SessionFactory factory = null;
		Session session = null;
		
		try {
			
			Configuration 	cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			System.out.println("hello");	

			factory = cfg.buildSessionFactory();
			session = factory.openSession();
			
			/***
			 * AV:
			 * 		Inserting the data
			 */
			Transaction tx = null;
			
			tx = session.beginTransaction();
			Stock stock = new Stock();			
				stock.setStock_code("GGHH");
				stock.setStock_name("SIP");
				
			StockDetail stockDetail = new StockDetail();
				stockDetail.setCompDesc("Bot platform");
				stockDetail.setCompName("Kore");
				stockDetail.setRemark("chutiyapa");
				stockDetail.setListedDate(new Date());
				
			stock.setStockDetail(stockDetail);
			stockDetail.setStock(stock);
			
			session.save(stock);
			tx.commit();
			
			/***
			 * AV:
			 * 		Getting the data
			 */
			stock = (Stock)session.load(Stock.class, 0);
			System.out.println(stock);
			System.out.println(stock.getStockDetail());
		
			
			/***
			 * AV:
			 * 		Deleting the data
			 */
			tx = session.beginTransaction();
				stock = (Stock)session.load(Stock.class, 0);
				session.delete(stock);
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session != null){
				session.close();
			}
			if(factory != null){
				factory.close();				
			}
		}
	}
	
}
