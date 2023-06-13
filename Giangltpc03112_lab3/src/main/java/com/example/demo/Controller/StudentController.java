package com.example.demo.Controller;

import Model.Student;
import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

	@RequestMapping(value = "/student/form", method = RequestMethod.GET)
	public String showForm(Model model) {
		model.addAttribute("sv", new Student());
		return "student/form";
	}

	@RequestMapping(value = "/student/save", method = RequestMethod.POST)
	public String save(@Valid @ModelAttribute("sv") Student sv, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("message", "Vui lòng sửa các lỗi sau:");
		} else {
			model.addAttribute("message", "Chúc mừng, bạn đã nhập đúng");
		}
		return "student/form";
	}

	@ModelAttribute("genders")
	public Map<Boolean, String> getGenders() {
		Map<Boolean, String> map = new HashMap<>();
		map.put(true, "Male");
		map.put(false, "Female");
		return map;
	}

	@ModelAttribute("faculties")
	public List<String> getFaculties() {
		return Arrays.asList("CNTT", "DLNHKS", "QTDN");
	}

	@ModelAttribute("hobbies")
	public Map<String, String> getHobbies() {
		Map<String, String> map = new HashMap<>();
		map.put("T", "Travelling");
		map.put("M", "Music");
		map.put("F", "Food");
		map.put("O", "Other");
		return map;
	}
}
