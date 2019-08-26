package wxWeb.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import wxWeb.domain.Good;
import wxWeb.service.GoodService;

@Controller
@RequestMapping("/PCGood")
public class GoodController {
	
	@Autowired
	@Qualifier("GoodService")
	private GoodService goodService;
	
	@RequestMapping("/SelectAll")
	public String selectAllControl (Model model) {
		System.out.println("开始查询");
		List<Good> good_list = goodService.selectAllServ();
		if(good_list.isEmpty()==false) {
			System.out.println(good_list.size());
		}
		model.addAttribute("good_list",good_list);
		return "success";
	}
		
	@RequestMapping("/SelectWithId")
	public String selectWithId(String id,Model model) {
		int id_int = 0;
		try {
		    id_int = Integer.parseInt(id);
		} catch (NumberFormatException e) {
		    e.printStackTrace();
		}
		Good good = goodService.selectWithIdServ(id_int);
		model.addAttribute("good",good);
		return "success";
	}
	
	@RequestMapping("/SelectWithKey")
	public String selectWithKey(String key,Model model) {
		if(key.isEmpty()) {
			//获取失败
			return "fail";
		}
		List<Good> key_good_list = goodService.SelectWithKeyServ(key);
		model.addAttribute("key_good_list", key_good_list);
		return "success";
	}
	
	@RequestMapping("/UpdatePrice")
	public String updatePrice(Good good,Model model) {
		if(good == null) {
			//获取数据失败
			return "fail";
		}
		int flag = goodService.UpdatePriceServ(good.getPrice(), good.getNewPrice(), good.getDiscount(), good.getId());
		if(flag == 0) {
			//修改失败
			return "fail";
		}
		//修改成功
		return "success";
	}
	
	@RequestMapping("/UpdateDetail")
	public String updateDetail(String Detail,String id) {
		int id_int = 0;
		try {
		    id_int = Integer.parseInt(id);
		} catch (NumberFormatException e) {
		    e.printStackTrace();
		}
		int flag = goodService.UpdateDetailServ(Detail, id_int);
		//int flag = 1;
		if(flag == 0) {
			//修改失败
			return "fail";
		}
		//修改成功
		System.out.println("更改详情成功");
		return "success";
	}
	
	@RequestMapping("/UpdateInventory")
	public String updateInventory(String inventory,String id) {
		int inventory_int= 0;
		int id_int = 0;
		int flag = 0;
		try {
		    id_int = Integer.parseInt(id);
		    inventory_int = Integer.parseInt(inventory);
		    flag = goodService.UpdateInventoryServ(inventory_int, id_int);
		} catch (NumberFormatException e) {
		    e.printStackTrace();
		}
		//int flag = 1;
		if(flag == 0) {
			//修改失败
			return "fail";
		}
		return "success";
	}
	
	@RequestMapping("/UpdateName")
	public String updateName(String name,String id) {
		int id_int = 0;
		int flag = 0;
		try {
		    id_int = Integer.parseInt(id);
		    flag = goodService.UpdateNameServ(name, id_int);
		} catch (NumberFormatException e) {
		    e.printStackTrace();
		}
		//int flag = 1;
		if(flag == 0) {
			//修改失败
			return "fail";
		}
		return "success";
	}
	
	@RequestMapping("/UpdateType")
	public String updateType(String type,String id) {
		int id_int = 0;
		int flag = 0;
		try {
		    id_int = Integer.parseInt(id);
		    flag = goodService.UpdateTypeServ(type, id_int);
		} catch (NumberFormatException e) {
		    e.printStackTrace();
		}
		//int flag = 1;
		if(flag == 0) {
			//修改失败
			return "fail";
		}
		return "success";
	}
	
	@RequestMapping("/UpdateIsValue")
	public String updateIsValue(String isValue,String id) {
		int id_int = 0;
		int flag = 0;
		try {
		    id_int = Integer.parseInt(id);
		    flag = goodService.UpdateIsValueServ(isValue, id_int);
		} catch (NumberFormatException e) {
		    e.printStackTrace();
		}
		//int flag = 1;
		if(flag == 0) {
			//修改失败
			return "fail";
		}
		return "success";
	}
	
	@RequestMapping("/InsertGood")
	public String insertGood() {
		return "success";
	}
}
