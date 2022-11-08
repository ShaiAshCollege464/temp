package com.test.Services.impl;


import com.test.Persist;
import com.test.Services.GeneralManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Sigal on 5/21/2016.
 */

@Service
@DependsOn(value = {"persist"})
public class GeneralManagerImpl implements GeneralManager {


    @Autowired
    private Persist persist;

    public <T> T loadObject(Class<T> clazz, int oid) {
        return persist.loadObject(clazz, oid);
    }

    public <T> List<T> getList(Class<T> clazz) {
        return persist.getList(clazz);
    }

    public void save(Object entity) {
        persist.save(entity);
    }

}
