package com.yesgaori.memo.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.yesgaori.memo.common.FileManager;
import com.yesgaori.memo.post.domain.Post;
import com.yesgaori.memo.post.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	public int deletePost(int postId, Integer userId) {
		
		Post post = postRepository.selectPost(postId);
		
		if(userId == null || post.getUserId() != userId) {
			return 0;
		}
		
		FileManager.removeFile(post.getImagePath());
		
		return postRepository.deletePost(postId);
	}
	
	public int updatePost(int postId, String title, String content) {
		return postRepository.updatePost(postId, title, content);
	}
	
	
	
	
	public int addPost(int userId, String title, String content, MultipartFile file) {
		
		// file을 특정 디렉토리(폴더)에 저장하고,
		// 저장된 파일을 접근할 수 있는 url 경로를 만들고 table 저장
		String imagePath = FileManager.saveFile(userId, file);
		
		return postRepository.insertPost(userId, title, content, imagePath);
		
	}
	
	public List<Post> getPostList(int userId) {
		
		return postRepository.selectPostList(userId);
	}
	
	public Post getPost(int id) {
		
		Post post = postRepository.selectPost(id);
		
		return post;
	}
	
	
	
}
