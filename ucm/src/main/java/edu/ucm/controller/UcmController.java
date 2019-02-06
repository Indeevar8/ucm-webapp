package edu.ucm.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ucm.model.Evaluator;
import edu.ucm.repository.EvaluatorRepository;

@Controller
public class UcmController {

	@Autowired
	private EvaluatorRepository evaluatorRepository;

	@GetMapping(value = "/")
	public String index() {
		return "home";
	}

	@GetMapping(path = "/scheduler")
	public String scheduler(Model model) {

		List<String> number = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		model.addAttribute("number", number);

		List<Integer> even = number.stream().map(s -> Integer.valueOf(s)).filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		List<Integer> odd = number.stream().map(s -> Integer.valueOf(s)).filter(n -> n % 2 != 0)
				.collect(Collectors.toList());
		String message = " Hello i sent this message from controller ";
		model.addAttribute("message", message);
		model.addAttribute("even", even);
		model.addAttribute("odd", odd);
		return "scheduler";

	}

	@RequestMapping(value = "/evaluator", method = RequestMethod.POST)
	public String compueEvenOdd(@ModelAttribute Evaluator evaluator, Model model) {
		System.out.println("computes even/odd");
		evaluatorRepository.save(evaluator);
		return null;

	}

}
