package com.fz.service.impl;

import com.fz.entity.TUser;
import com.fz.dao.TUserDao;
import com.fz.service.TUserService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (TUser)表服务实现类
 *
 * @author makejava
 * @since 2023-04-23 19:41:45
 */
@Service("tUserService")
public class TUserServiceImpl implements TUserService {
    @Resource
    private TUserDao tUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public TUser queryById(Integer userId) {
        return this.tUserDao.queryById(userId);
    }

    //根据用户信息查询其他属性
    @Override
    public List<TUser> queryByUser(TUser TUser) {
        return tUserDao.queryByUser(TUser);
    }
    //根据用户账号查询其他属性
    @Override
    public List<TUser> queryByName(String string) {
        return tUserDao.queryByName(string);
    }

    /**
     * 分页查询
     *
     * @param tUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TUser> queryByPage(TUser tUser, PageRequest pageRequest) {
        long total = this.tUserDao.count(tUser);
        return new PageImpl<>(this.tUserDao.queryAllByLimit(tUser, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public TUser insert(TUser tUser) {
        this.tUserDao.insert(tUser);
        return tUser;
    }

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public TUser update(TUser tUser) {
        this.tUserDao.update(tUser);
        return this.queryById(tUser.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userId) {
        return this.tUserDao.deleteById(userId) > 0;
    }



    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        List<TUser> userList = tUserDao.queryByName(s);
        if(userList!= null && userList.size() >0 ){
            TUser t =userList.get(0);
            if(t!= null){
                BCryptPasswordEncoder b =new BCryptPasswordEncoder();//加密
                     String username = t.getUserName();
                     String password = t.getPassword();
//                System.out.println(password);
//                System.out.println(password.length());
                List<SimpleGrantedAuthority> authority = new ArrayList<>();
                //设置相关账号的角色信息
                authority.add(new SimpleGrantedAuthority("ROLE_USER"));
//                    UserDetails userDetails2 =new User(username,"{noop}"+password,authority);// 不加密
                    UserDetails userDetails1 =new User(
                            username,
                            password,
                            true,
                            true,
                            true,
                            true,   //用户状态，过期，是否可用，凭证
                            authority
                    );//加密
                    return userDetails1;








            }

        }
        return null;
    }


    public static void main(String[] args) {
        BCryptPasswordEncoder b =new BCryptPasswordEncoder();
        System.out.println(b.encode("123"));
        System.out.println(b.encode("123"));
        System.out.println(b.encode("123"));
    }
}
