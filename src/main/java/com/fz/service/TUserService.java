package com.fz.service;

import com.fz.entity.TUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * (TUser)表服务接口
 *
 * @author makejava
 * @since 2023-04-23 19:41:45
 */
public interface TUserService extends UserDetailsService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    TUser queryById(Integer userId);

    //根据用户信息查询其他属性
    List<TUser> queryByUser(TUser tUser);

    //根据用户账号查询
    List<TUser> queryByName(String string);

    /**
     * 分页查询
     *
     * @param tUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TUser> queryByPage(TUser tUser, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    TUser insert(TUser tUser);

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    TUser update(TUser tUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userId);

}
