package com.service;

import com.obj.Dept;

import java.util.List;
import java.util.Map;

public interface DeptService {
    int addDept(Dept dept);
    List<Dept> findStudent();
    List<Dept> selectDept1(String s);
    List<Dept> selectDept3(String s,String s1);
    List<Dept> selectDept4(Map<String ,String> map);
    Dept selectDept2(int i);
    List<Map<String,Object>> selectDept5();
    List<Dept> selectDept6(Dept dept);
    List<Dept> selectDept7(List<Integer> list);
    List<Map<String ,Object>> selectDept8();
}
