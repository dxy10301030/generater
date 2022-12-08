package com.dxy.generater.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DatabaseInfo {
    private String url;
    private String userName;
    private String password;
    private String database_type;
}
