package com.example.demo.post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;
import java.util.*;

// DemoApplication -> C -> S -> R 순서

@Controller
public class PostController {
    private PostService postService;
    PostController(){
        this.postService = new PostService();
    }
//    csr
    @GetMapping("/csr/json") //localhost:8080/csr/json //사용자의 접점 포인트
    @ResponseBody // 일반적으로 json 형태로 return
     public List<Post> findAll(){
        return postService.findAll();
    }


//    ssr : 사용자에게 화면(+data) return // 같은 프로젝트안에서 호출. 그렇기에 빠름
    @GetMapping("/ssr") //localhost:8080/csr/json //사용자의 접점 포인트
    public String findAllSsr(Model model){
        List<Post> posts = postService.findAll();
        model.addAttribute("posts", posts); //"posts"라는 키에 posts 값을 넣는다. "posts"에 데이터가 들어간다.
        return "post_list"; // post_list화면을 리턴할거야 // String 형태로 return하면 알아서 templates파일로 가서 문서를 찾는다.
    }
}