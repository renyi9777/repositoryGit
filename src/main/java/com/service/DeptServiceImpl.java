package com.service;

import com.dao.DeptDao;
import com.obj.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptDao deptDao;

    @Override
    public int addDept(Dept dept) {
        return deptDao.insertDept(dept);
    }

    @Override
    public List<Dept> findStudent() {
        return deptDao.selectDept();
    }

    @Override
    public List<Dept> selectDept1(String s) {
        return deptDao.selectDept1(s);
    }

    @Override
    public List<Dept> selectDept3(String s, String s1) {
        return deptDao.selectDept3(s,s1);
    }

    @Override
    public List<Dept> selectDept4(Map<String, String> map) {
        return deptDao.selectDept4(map);
    }


    @Override
    public Dept selectDept2(int i) {
        return deptDao.selectDept2(i);
    }

    @Override
    public List<Map<String, Object>> selectDept5() {
        return deptDao.selectDept5();
    }

    @Override
    public List<Dept> selectDept6(Dept dept) {
        return deptDao.selectDept6(dept);
    }

    @Override
    public List<Dept> selectDept7(List<Integer> list) {
        return deptDao.selectDept7(list);
    }

    @Override
    public List<Map<String, Object>> selectDept8() {
        return deptDao.selectDept8();
    }


}
