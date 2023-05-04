package com.dom.domaci5.repositories;

import com.dom.domaci5.entity.Post;

import java.util.List;

public interface PostRepository {

    public Post addPost(Post post);
    public List<Post> allPosts();
    public Post findPost(Integer id);
    public void deletePost(Integer id);
}
