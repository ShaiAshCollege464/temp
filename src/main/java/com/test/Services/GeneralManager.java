package com.test.Services;


import java.util.*;

/**
 * Created by Sigal on 5/21/2016.
 */

public interface GeneralManager {

    public <T> T loadObject(Class<T> clazz, int oid);

    public <T> List<T> getList(Class<T> clazz);

    public void save(Object entity);


}