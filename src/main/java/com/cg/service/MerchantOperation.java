package com.cg.service;

import java.util.List;

import com.cg.bean.Merchant;
import com.cg.bean.Product;

public interface MerchantOperation {
	 public List<Product> showProducts(int mid);
	 public Merchant getMerchantdetails(int id);

	
}
