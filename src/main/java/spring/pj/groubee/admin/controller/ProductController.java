package spring.pj.groubee.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import spring.pj.groubee.admin.service.ProductService;
import spring.pj.groubee.admin.vo.Product;

//사용하고있는 포트라고 나오면 포트 죽이세요(cmd)
//netstat -ano | find "8020"
//taskkill /f /pid pid번호  ex) taskkill /f /pid 12345


//RestController : req, res없어도 json데이터 넘겨주겠음
@RestController
@RequestMapping(value = "/api")
@CrossOrigin("http://localhost:8020/")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping(value="/product")
	public List<Product> fetchMember() {
		return service.listAll();
	}
	
	// index : List 가져오기
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Product> viewHome(Model model) {
		
		Map<String, Object> map = new HashMap<String, Object>();
			List<Product> list = service.listAll();
			map.put("list", list);
		
		System.out.println(map);
		return list;
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getProductDetail(@RequestParam String id, Model model) {
		Map<String, Object> map = new HashMap<String, Object>();

		Product resultVo = null;
		String resultMsg = "";
		String result = "";
		try {
			if(id != null) {
				resultVo = service.get(Integer.parseInt(id));
				resultMsg = "상품 상세 조회에 성공했습니다.";
				result = "success";
			}
		} catch (Exception e) {
			e.printStackTrace();
			resultMsg = "상품 상세 조회에 실패했습니다.";
			result = "fail";
		}

		map.put("result", result);
		map.put("detail", resultVo);
		map.put("resultMsg", resultMsg);
		System.out.println("response data: " + map);
		return map;
	}
	
//	@RequestMapping("/")
//	public String viewHome(Model model) {
//		
//		List<Member> list = service.listAll();
//		model.addAttribute("list",list);
//		
//		return "index";   // templates/index.html
//	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> regProduct(@RequestBody Product param, Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		String resultMsg = "상품 등록에 실패했습니다.";
		String result = "fail";
		Product resultVo = null;
		
		try {
			resultVo = service.save(param);
			if(resultVo.getId() != 0) {
				resultMsg = "상품 등록에 성공하였습니다.";
				result = "success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		map.put("result", result);
		map.put("resultId", resultVo.getId());
		map.put("resultMsg", resultMsg);
		return map;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updateProduct(@RequestBody Product param, Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		String resultMsg = "상품 수정에 실패했습니다.";
		String result = "fail";
		Product resultVo = null;
		
		try {
			resultVo = service.save(param);
			if(resultVo.getId() != 0) {
				resultMsg = "상품 수정에 성공하였습니다.";
				result = "success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		map.put("result", result);
		map.put("resultId", resultVo.getId());
		map.put("resultMsg", resultMsg);
		return map;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> deleteProduct(@RequestBody HashMap<String, String> param, Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		String resultMsg = "상품 삭제에 실패했습니다.";
		String result = "fail";
		try {
			if(param.get("id") != null) {
				service.delete(Integer.parseInt(param.get("id")));
				resultMsg = "상품 삭제에 성공했습니다.";
				result = "success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		map.put("result", result);
		map.put("resultMsg", resultMsg);
		return map;
	}
}
