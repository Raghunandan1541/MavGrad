package com.upgrad.mavgrad.controller;

import com.upgrad.mavgrad.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {
	@RequestMapping("/getallposts")
	public String getAllPosts(Model model) {
		ArrayList<Post> posts = new ArrayList<>();

		Post post1 = new Post();
		post1.setTitle("Greed");
		post1.setBody("Ban");
		post1.setDate(new Date());

		Post post2 = new Post();
		post2.setTitle("Wrath");
		post2.setBody("Meliodas");
		post2.setDate(new Date());

		Post post3 = new Post();
		post3.setTitle("Sloth");
		post3.setBody("King");
		post3.setDate(new Date());

		posts.add(post1);
		posts.add(post2);
		posts.add(post3);

		model.addAttribute("posts", posts);
		return "index";
	}
}