package com.metacube.UnitTest;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project shopping cart  via  Design Pattern
 */
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.metacube.DAO.BaseDao;
import com.metacube.DAO.DAOFactory;
import com.metacube.Facade.ProductFacade;
import com.metacube.controller.ProductController;
import com.metacube.enums.DBType;
import com.metacube.enums.Status;

public class ProductControllerTest {

	static ProductFacade productFacade;
	static ProductController productController;
	static BaseDao dao;
	
	//This method setUpClass will initialize the object
		@BeforeClass
		public static void setUpClass() {
			productFacade = ProductFacade.getInstance();
			dao = DAOFactory.getInstance(DBType.FileDao);
			productController = new ProductController();
			productFacade.getAllProduct();
		}
		
		
		/**When Id is not in Product List**/
		@Test
		public void testSearchProduct1(){
			String id = "aaabsdf";
			Status st = productFacade.searchproduct(id);
			assertEquals(st,Status.NOT_Found);
		}
		
		/**When Id is in Product List**/
		@Test
		public void testSearchProduct2(){
			String id = "1001";
			Status st = productFacade.searchproduct(id);
			assertEquals(st,Status.Found);
		}
		

}
