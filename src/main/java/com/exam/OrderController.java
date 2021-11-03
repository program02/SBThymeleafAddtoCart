package com.exam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	static List<Product2> plist;
	static {
		plist = new ArrayList<>();
		plist.add(new Product2(100, "Book", 100,0));
		plist.add(new Product2(101, "Book2", 200,1));
		plist.add(new Product2(102, "Book3", 300,2));
	}

	@RequestMapping("order")
	public String orders(Model m) {
		m.addAttribute("plist", plist);
		return "orders.html";
	}

	@RequestMapping("add")
	public String add(Model m,@ModelAttribute Product2 p) {

		if (p != null) {
			int n=plist.size();
			p.setCartindex(n);
			plist.add(p);
		}
		m.addAttribute("plist", plist);
		return "orders.html";
	}
	@RequestMapping("del")
	public String del(Model m,@ModelAttribute Product2 p) {
		if (p != null) {
			plist.remove(p.getCartindex());
		}
		for (int i=0;i<plist.size();i++) {
			plist.get(i).setCartindex(i);
		}
		m.addAttribute("plist", plist);
		return "orders.html";
	}

}
