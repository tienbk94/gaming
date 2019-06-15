package vn.gaming.game.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/game")
public class GameListController {

	@GetMapping("/list")
	public String showProductList(Model model) {

		return "game/index";
	}
}
