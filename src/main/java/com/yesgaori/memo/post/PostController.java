package com.yesgaori.memo.post;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yesgaori.memo.post.domain.Post;
import com.yesgaori.memo.post.service.PostService;

@RequestMapping("/post")
@Controller
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/list-view")
	public String postList(Model model
							, HttpSession session) {
		
		int userId = (Integer)session.getAttribute("userId");
		List<Post> postList = postService.getPostList(userId);
		model.addAttribute(postList);
		
		return "post/list";
	}
	
	@GetMapping("/creat-view")
	public String postInput() {
		
		return "post/input";
	}
	
	
}
