package com.dao;

import com.obj.Dept;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DeptDao {
    int insertDept(Dept dept);

    List<Dept> selectDept();

    List<Dept> selectDept1(String s);
    Dept selectDept2(int i);

    List<Dept> selectDept3(@Param("dname") String s, @Param("loc") String s1);
    List<Dept> selectDept4(Map<String ,String> map);
    List<Map<String,Object>> selectDept5();
    List<Dept> selectDept6(Dept dept);
    List<Dept> selectDept7(List<Integer> list);
    List<Map<String ,Object>> selectDept8();
}
