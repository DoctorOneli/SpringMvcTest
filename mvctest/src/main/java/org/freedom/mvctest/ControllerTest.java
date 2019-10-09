package org.freedom.mvctest;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ControllerTest {

	/**
	 * 初始注册页面
	 * 
	 * @param model
	 * @param user
	 * @return
	 */
	@RequestMapping("/test")
	public ModelAndView test(Model model, User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addObject("user", user);
		return modelAndView;
	}

	/**
	 * 注册
	 * 
	 * @param user（校验）
	 * @param bindingResult（校验结果）
	 * @return
	 */
	@RequestMapping("/register")
	public ModelAndView register(@Valid User user, BindingResult bindingResult) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);

		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("index");
		}

		else {
			modelAndView.setViewName("success");
		}

		return modelAndView;

	}
	/**
	 * 测试FreeMarker视图
	 * @return
	 */
	@GetMapping("/ftltest")
	public ModelAndView ftlTest()
	{
		ModelAndView modelAndView=new ModelAndView();
		User user=new User();
		user.setUsername("黎先生");
		user.setPassword("hhh666");
		user.setEmail("1006629349@qq.com");
		user.setAge(20);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("userftl");
		return modelAndView;
	}

}
