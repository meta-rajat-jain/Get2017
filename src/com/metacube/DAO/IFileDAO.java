package com.metacube.DAO;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project shopping cart  via  Design Pattern
 */
import java.io.FileNotFoundException;
import java.util.List;
/**
 * The Interface IFileDAO.
 */
public interface IFileDAO {

	/**
	 * Gets the all itens.
	 *
	 * @return the all itens
	 * @throws FileNotFoundException the file not found exception
	 */
	public List getAllItens() throws FileNotFoundException;

	
}
