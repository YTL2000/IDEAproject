package com.ytl.dao;

import com.ytl.entity.Role;

/**
 * @version 1.0
 * @auther YTL
 * @className attactImpl
 * since 1.0
 */

public class QLDIWeaponImpl implements IWeapon,Horse{
    @Override
    public String attact(Role role) {
        return role.getName()+"拿着青龙偃月刀";
    }
    @Override
    public String ZuoQi(Role role) {
        return "骑着"+role.getHorse();
    }
}
