package com.classDesign.service;

import com.classDesign.bean.Province;
import com.classDesign.dao.ProvinceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService {
    @Autowired
    ProvinceMapper provinceMapper;

    /**
     * 获取所有的省份以及对应的人数
     * @return
     */
    public List<Province> getAllProvinceAndPeople(){
        return provinceMapper.selectByExample(null);
    }
}
