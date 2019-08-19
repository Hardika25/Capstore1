package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Merchant;
import com.cg.bean.Product;
import com.cg.service.MerchantServiceImpl;
@CrossOrigin(origins= "http://localhost:4200/")
@RestController

public class MerchantController {
	
@Autowired MerchantServiceImpl service;

//	@PutMapping(value="/inventoryControl", consumes= {"application/json"})
//	public String create(@RequestBody Product ob) {
//	service.addAccount(ob);
//	return "Account created!!";
//	}
//	
//	@PutMapping(value="/update/{mobile}", consumes= {"application/json"})
//	public String update(@RequestBody Account ob) {
//		
//		//Account ac = service.findAccount(mobile);
//		System.out.println(ob);
//	service.updateAccount(ob);
//	return "Account updated!!";
//	}
//	@DeleteMapping(value="/delete/{mobile}")
//	public String delete(@PathVariable long mobile) {
//		service.deleteAccount(mobile);
//		return "Account deleted";
//	}
	@GetMapping(value="/inventoryControl/{mid}")
	public  List<Product> find(@PathVariable int mid) {
		List<Product> li = service.showProducts(mid);
		return li;
	}
	
	@GetMapping(value="/merchantprofile/{mid}")
	public Merchant findMerchant(@PathVariable int mid) {
		Merchant mer=service.getMerchantdetails(mid);
		return mer;
	}
	
//	@GetMapping(value="/{mobileno}")
//	public Account findbyId(@PathVariable long mobileno){
//	
//		Account acc =  service.findAccount(mobileno);
//		
//		return acc;
//	}
//	
//	
//	@PostMapping(value="/amount/mobile/{mobile}/mobile/{mobile}/amount/{amount}")
//public String TransferMoney(@PathVariable long  from, long to,double amount) throws  InsuffecientFundException {
//		Account acc1 =  service.findAccount(from);
//		Account acc2 =  service.findAccount(to);
//		service.TransferMoney(acc1,acc2,amount);
//		return "Money transferred";
//	}
//	@PostMapping(value="/withdraw/mobile/{mobile}/amount/{amount}")
//	public String withdraw(@PathVariable long mobile, double amount)  throws InsuffecientFundException{
//		Account acc =  service.findAccount(mobile);
//		System.out.println(acc);
//		service.withdraw(acc, amount);
//		return "Withdraw your Amount";
//}
	

}













