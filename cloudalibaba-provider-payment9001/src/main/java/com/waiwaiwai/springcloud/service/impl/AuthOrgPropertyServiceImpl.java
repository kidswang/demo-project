package com.waiwaiwai.springcloud.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.waiwaiwai.springcloud.mapper.AuthOrgPropertyMapper;
import com.waiwaiwai.springcloud.entity.AuthOrgProperty;
import com.waiwaiwai.springcloud.service.AuthOrgPropertyService;
/**
 * @Author: Administrator
 * @DateTime: 2020/11/4 11:37
 * @Description:
 */
@Service
public class AuthOrgPropertyServiceImpl extends ServiceImpl<AuthOrgPropertyMapper, AuthOrgProperty> implements AuthOrgPropertyService{

}
