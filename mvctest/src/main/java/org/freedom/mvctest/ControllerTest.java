package org.freedom.mvctest;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	public ModelAndView Register(@Valid User user, BindingResult bindingResult) {

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

}
