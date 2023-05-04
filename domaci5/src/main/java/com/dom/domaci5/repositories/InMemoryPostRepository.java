package com.dom.domaci5.repositories;

import com.dom.domaci5.entity.Post;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InMemoryPostRepository implements  PostRepository{

    private static List<Post> posts = new CopyOnWriteArrayList<>();

    public InMemoryPostRepository() {
    }


    @Override
    public synchronized Post addPost(Post post) {
        Integer id = posts.size();
        post.setId(id);
        posts.add(Math.toIntExact(id), post);
        return post;
    }

    @Override
    public List<Post> allPosts() {
        return new ArrayList<>(posts);
    }

    @Override
    public Post findPost(Integer id) {
        return posts.get(id);
    }

    @Override
    public void deletePost(Integer id) {
        posts.remove(id.intValue());
    }
}
