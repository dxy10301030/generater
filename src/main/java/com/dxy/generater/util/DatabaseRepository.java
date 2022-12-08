package com.dxy.generater.util;

import com.dxy.generater.entity.DatabaseInfo;

public interface DatabaseRepository {
    <T> void execute(String sql);
}
