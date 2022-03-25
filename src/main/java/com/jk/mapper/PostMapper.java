package com.jk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jk.entity.Post;

@Mapper
public interface PostMapper {
	
    List<Post> getAllEmps();

    Post getPost(int id);

    void insertPost(Post post);

    void updatePost(Post post);

    void deletePost(int id);

}
