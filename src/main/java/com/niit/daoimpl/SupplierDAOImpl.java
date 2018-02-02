package com.niit.daoimpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.SupplierDAO;

import com.niit.model.Supplier;



@SuppressWarnings("deprecation")
@Repository("SupplierDAO")
public class SupplierDAOImpl implements SupplierDAO
{

		@Autowired
	    SessionFactory sessionFactory;
		
		
		   
		  public  SupplierDAOImpl(SessionFactory sessionFactory)
		  {
			  
			  this.sessionFactory=sessionFactory;
		  
		  }
		  
		  
		    @Transactional
		    
		    public boolean addSupplier(Supplier supplier) 
		    {
		        try
		        {
		        Session session=sessionFactory.getCurrentSession();
		        session.saveOrUpdate(supplier);
		        return true;
		        }
		        catch(Exception e)
		        {
		        	System.out.println(e.getMessage());
		        return false;
		        }
		    }
		    
		    
		    @Transactional
		    public List<Supplier> retrieveSupplier() 
		    {
		        Session session=sessionFactory.openSession();
		        @SuppressWarnings("rawtypes")
		        Query query=session.createQuery("from Supplier");
		        @SuppressWarnings("unchecked")
		        List<Supplier> listSupplier=query.list();
		        session.close();
		        return listSupplier;
		    }
		    
		    
		 
		    @Transactional
		    public Supplier deleteSupplier(int Supplier_id) 
		    {   
		    	Supplier SupplierToDelete = new Supplier();
		    	SupplierToDelete.setSupplierId(Supplier_id);
				sessionFactory.getCurrentSession().delete(SupplierToDelete);
				return SupplierToDelete;
				
		    }
		    
		 
		    @Transactional
		    
		    public boolean updateSupplier(Supplier supplier) 
		    {
		        try
		        {
		        sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		        return true;
		        }
		        catch(Exception e)
		        {
		        System.out.println("Exception Arised:"+e);
		        return false;
		        }
		    }
		    
		    
		    @Transactional
			
			public Supplier getSupplier(int supplierId) 
		    {
				String hql = "from"+" Supplier"+" where id=" + supplierId;
				@SuppressWarnings("rawtypes")
				Query query = sessionFactory.getCurrentSession().createQuery(hql);
				
				@SuppressWarnings("unchecked")
				List<Supplier> listSupplier = (List<Supplier>) query.list();
				
				if (listSupplier != null && !listSupplier.isEmpty()) {
					return listSupplier.get(0);
				}
				
			
				return null;
			}
		     
		}