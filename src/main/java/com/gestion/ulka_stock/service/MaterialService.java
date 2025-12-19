package com.gestion.ulka_stock.service;

import com.gestion.ulka_stock.dao.MaterialDao;
import com.gestion.ulka_stock.model.Material;

import java.util.List;

public class MaterialService {
    private final MaterialDao materialDao = new MaterialDao();

    public List<Material> getAllMaterials() {
        return materialDao.findAll();
    }
}