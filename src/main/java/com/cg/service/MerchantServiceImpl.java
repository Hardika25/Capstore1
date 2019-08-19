package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.Merchant;
import com.cg.bean.Product;
import com.cg.dao.MerchantDAO;
import com.cg.dao.ProductDAO;




@Service
@Transactional
public class MerchantServiceImpl implements MerchantOperation {
	@Autowired ProductDAO dao;
	@Autowired MerchantDAO dao1;
//	
//	
//
//	@Transactional(propagation=Propagation.REQUIRED)
//	public void addAccount(Account ob) {
//		// TODO Auto-generated method stub
//		Optional<Account> temp=dao.findById(ob.getMobile());
//		if(!temp.isPresent()) {
//			dao.save(ob);
//			
//		}
//		else
//			throw new ApplicationException("Account "+ob.getId()+ " already exists!");
//	}
//	@Transactional(propagation=Propagation.REQUIRED)
//	public Account findAccount(Long Mobileno) {
//		Optional<Account> acc= dao.findById(Mobileno);
//		if(acc.isPresent()) {
//		return acc.get();
//			
//		}
//		else
//			throw new ApplicationException("Account "+Mobileno+ " does-not exists!");
//	}
//
//@Transactional(propagation=Propagation.REQUIRED)
//	public void updateAccount(Account ob) {
//		// TODO Auto-generated method stub
//		Optional<Account> temp = dao.findById(ob.getMobile());
//		if(temp.isPresent()) {
//		
//			dao.save(ob);
//		}
//			else
//				throw new ApplicationException("Account "+ob.getMobile()+" didn't exists!");
//		}
//
//@Transactional(propagation=Propagation.REQUIRED)
//	public void deleteAccount(long mobile) {
//		Optional<Account> temp = dao.findById(mobile);
//		if(temp.isPresent()) {
//			dao.deleteById(mobile);
//		}
//		else
//			System.out.println("Account does-not exists");
//	}
//
//
//	
//@Transactional(readOnly=true)
//	public List<Account> getAllAccount() {
//		// TODO Auto-generated method stub
//	List<Account> acc= dao.findAll();
//	return acc;
//	}

@Override
public List<Product> showProducts(int mid) {
	List<Product> lst = dao.findAll();
	List<Product> returnProducts = new ArrayList<>();
	for(Product p :lst)
	{
		if(p.getMerchant().getMerchantId() == mid)
		{
			returnProducts.add(p);
		}
	}
	return returnProducts;
}

@Override
public Merchant getMerchantdetails(int id) {
	Merchant merchant = dao1.findById(id).get();
	return merchant;
}


//@Transactional(propagation=Propagation.REQUIRED)
//public void TransferMoney(Account from, Account to, double amount) throws InsuffecientFundException {
//	// TODO Auto-generated method stub
//	double new_balance=from.getBalance()-amount;
//	double new_balance1=to.getBalance()+amount;
//	if(new_balance<1000.00 && amount>0) {
//		new_balance=from.getBalance();
//		new_balance1=to.getBalance();
//		}
//	from.setBalance(new_balance);
//	to.setBalance(new_balance1);
//	updateAccount(from);
//	updateAccount(to);
//}
//
//@Transactional(propagation=Propagation.REQUIRED)
//public void withdraw(Account ob, double amount) throws InsuffecientFundException {
//	double new_balance=ob.getBalance()-amount;
//	if(new_balance<1000.0)
//	{
//		new_balance=ob.getBalance();
//		
//		throw new InsuffecientFundException("Insufficient Fund. It will effect minium balance",new_balance);
//	}
//	ob.setBalance(new_balance);
//	updateAccount(ob);
//	
//}
}
