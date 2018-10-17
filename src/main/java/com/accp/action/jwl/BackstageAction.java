package com.accp.action.jwl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.accp.biz.jwl.BackstageBiz;

@Controller
@RequestMapping("/jwl")
public class BackstageAction {
	@Autowired
	private BackstageBiz biz;
	
	@GetMapping("getList")
    public  String query(Integer pid,Integer p,Integer s, Model model) throws Exception{	
		if(pid==0) {
			model.addAttribute("list", biz.queryAllArea(pid,p,s));
			return "jwl/gjdqgl";
		}else {
			model.addAttribute("list", biz.queryAllArea(pid,p,s));
			model.addAttribute("city",biz.queryBy(pid));
			return "jwl/gjdqgl-city";
		}
    }

	@GetMapping("getAdvVo")
	public String queryAllAdvVo(Integer atid,Integer p,Integer s,Model model) throws Exception {
		model.addAttribute("atid", atid);
		model.addAttribute("fl", biz.queryAllAdv());
		model.addAttribute("AdvVo", biz.queryAllAdvVo(atid, p, s));
		return "jwl/ggwgl";
	}
	
	@GetMapping("getNews")
	public String queryAllNews(String userName,Integer p,Integer s,Model model) throws Exception {
		System.out.println(userName);
		model.addAttribute("news", biz.queryAllNews(userName,p, s));
		return "jwl/xtznx";
	}
	
	@GetMapping("getObj")
    public  String queryBy(Integer p, Model model) throws Exception{	
		if(p==1||p==2) {
			model.addAttribute("list",biz.queryBy(p));
			return "jwl/gjdqgl-update";
		}else {
			model.addAttribute("list", biz.queryBy(p));
			return "jwl/gjdqgl-update2";
		}
    }
	
	@GetMapping("/re")
	public String delete(String id) {
		String[] ids =  id.split(",");
		biz.removeAdv(ids);
		return "redirect:/jwl/getAdvVo?atid=0&p=1&s=4";
	}
}
