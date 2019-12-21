package org.murasame.community.dao;

import org.apache.ibatis.annotations.Mapper;
import org.murasame.community.entity.Comment;

import java.util.List;

@Mapper
public interface CommentMapper {

    List<Comment> selectCommentsByEntity(int entityType, int entityId, int offset, int limit);

    int selectCountByEntity(int entityType, int entityId);

}
