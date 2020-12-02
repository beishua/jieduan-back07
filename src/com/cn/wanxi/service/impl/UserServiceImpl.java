//实现层
package com.cn.wanxi.service.impl;

import com.cn.wanxi.dao.IUserDao;
import com.cn.wanxi.dao.impl.UserImpl;
import com.cn.wanxi.model.UserModel;
import com.cn.wanxi.service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {
    @Override
    public int add(UserModel userModel) {
        IUserDao iUserDao=new UserImpl();
        boolean isHave= isHaveFindUsername(userModel.getUsername());
        if (isHave){
            return 4;
//            return "您输入的用户已存在，请重新输入!";
        }else{
            int count= iUserDao.add(userModel);
            return count;
        }
    }

    @Override
    public List<UserModel> findAll() {
        IUserDao iUserDao=new UserImpl();
        List<UserModel> list=iUserDao.findAll();
        return list;
    }

    @Override
    public int delete(Integer aa) {
        IUserDao iUserDao=new UserImpl();
        return iUserDao.delete(aa);
    }

    @Override
    public List<UserModel> findAllBySome(UserModel userModel) {
        IUserDao iUserDao=new UserImpl();
        List<UserModel> list=iUserDao.findAllBySome(userModel);
        return list;
    }

    @Override
    public UserModel findById(Integer id) {
        IUserDao iUserDao=new UserImpl();
        return iUserDao.findById(id);
    }

    @Override
    public int edit(UserModel userModel) {
        IUserDao iUserDao=new UserImpl();
        return iUserDao.edit(userModel);
    }

    @Override
    public int getCount(UserModel userModel) {
        IUserDao iUserDao=new UserImpl();
        return iUserDao.getCount(userModel);
    }

    @Override
    public int login(UserModel userModel) {
        //根据用户名和密码判断用户是否存在，存在返回true，否则返回false
        if (userModel.getCode().equals(userModel.getSessionCode())){
            if (isHaveFindByUsernameAndPassword(userModel)){
                return 1;
            }else{
                return 0;
            }
        }
            return 2;
    }


    private boolean isHaveFindByUsernameAndPassword(UserModel userModel){
        IUserDao iUserDao=new UserImpl();
        UserModel model=iUserDao.isHaveFindByUsernameAndPassword(userModel);
        return model !=null;
    }//根据用户名和密码判断用户是否存在，存在返回true，否则返回false

    private boolean isHaveFindUsername(String username){
        IUserDao iUserDao=new UserImpl();
        UserModel userModel=iUserDao.findByUsername(username);
        boolean isHave=(userModel==null);
        return !isHave;
    }
}
