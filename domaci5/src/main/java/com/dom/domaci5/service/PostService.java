package com.dom.domaci5.service;

import com.dom.domaci5.entity.Post;
import com.dom.domaci5.repositories.PostRepository;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class PostService {

    public PostService() {
    }
    @Inject
    private PostRepository postRepository;

    public  Post addPost(Post post) {
        return this.postRepository.addPost(post);
    }

    public List<Post> allPosts() {
        return this.postRepository.allPosts();
    }

    public Post findPost(Integer id) {
        return this.postRepository.findPost(id);
    }

    public void deletePost(Integer id) {
       this.postRepository.deletePost(id);
    }


}
