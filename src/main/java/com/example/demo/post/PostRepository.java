package com.example.demo.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class PostRepository {
    List<Post> posts;
    PostRepository(){
        this.posts = new ArrayList<>();
        this.posts.add(new Post(1, "title1", "hello java world1", "hongildong1"));
        this.posts.add(new Post(2, "title2", "hello java world2", "hongildong2"));
        this.posts.add(new Post(3, "title3", "hello java world3", "hongildong3"));
        this.posts.add(new Post(4, "title4", "hello java world4", "hongildong4"));
    }
    List<Post> findAll(){
        return this.posts;
    }
}
