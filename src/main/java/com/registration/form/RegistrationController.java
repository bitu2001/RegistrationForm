package com.registration.form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.registration.form.dao.User;

@Controller
public class RegistrationController {

	@Autowired
	User user;

	@RequestMapping("/userReg")
	public String registration() {
		return "registration";
	}

	/*
	 * @RequestMapping("/userDetails") public ModelAndView userInfo(UserRegistration
	 * reg) { ModelMap model = new ModelMap(); model.addAttribute("name",
	 * reg.getName()); model.addAttribute("email", reg.getEmail());
	 * model.addAttribute("password", reg.getPassword());
	 * model.addAttribute("gender", reg.getGender()); model.addAttribute("hobby",
	 * reg.getHobby());
	 * 
	 * ModelAndView mView = new ModelAndView("user-details");
	 * mView.addObject("userobj", reg); return mView; }
	 */

	@RequestMapping("/userDetails")
	public String userInfo(UserRegistration reg) {
		user.save(reg);
		return "operation";
	}

	@RequestMapping("/operation")
	public ModelAndView operation(Long UId, String ddString) {

		if (ddString.equals("select")) {
			System.out.println(ddString);
			
			UserRegistration reg= user.findById(UId).orElse(new UserRegistration());
			
			ModelMap model = new ModelMap();
			model.put("name", reg.getName());
			model.put("email", reg.getEmail());
			model.put("password", reg.getPassword());
			model.put("gender", reg.getGender());
			model.put("hobby", reg.getHobby());

			ModelAndView mView = new ModelAndView("operation");
			mView.addObject("userobj", reg);
			return mView;
		} else if (ddString.equals("delete")) {
			System.out.println(ddString);
			user.deleteById(UId);
		} else if (ddString.equals("update")) {
			System.out.println(ddString);

			UserRegistration reg= user.findById(UId).orElse(new UserRegistration());
			reg.setName("Updated_name");
			reg.setEmail("updated_email");
			reg.setHobby("updated Hobby");
			user.save(reg);
		} else {
		}

		return new ModelAndView("operation");
	}

}
