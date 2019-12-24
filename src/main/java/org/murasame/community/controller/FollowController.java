package org.murasame.community.controller;

import org.murasame.community.annotation.LoginRequired;
import org.murasame.community.entity.User;
import org.murasame.community.service.FollowService;
import org.murasame.community.util.CommunityUtil;
import org.murasame.community.util.HostHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FollowController {

    @Autowired
    private FollowService followService;

    @Autowired
    private HostHolder hostHolder;


    @RequestMapping(path = "/follow", method = RequestMethod.POST)
    @ResponseBody
    @LoginRequired
    public String follow(int entityType, int entitId) {
        User user = hostHolder.getUser();

        followService.follow(user.getId(), entityType, entitId);

        return CommunityUtil.getJSONString(0, "已关注!");
    }

    @RequestMapping(path = "/unfollow", method = RequestMethod.POST)
    @ResponseBody
    @LoginRequired
    public String unfollow(int entityType, int entitId) {
        User user = hostHolder.getUser();

        followService.unfollow(user.getId(), entityType, entitId);

        return CommunityUtil.getJSONString(0, "已取消关注!");
    }

}
