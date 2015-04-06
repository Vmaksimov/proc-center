package ru.atc.pgu.proccenter.config;

import org.hibernate.dialect.HSQLDialect;
import org.hsqldb.types.Types;

public class CustomHSQLDialect extends HSQLDialect {
    public CustomHSQLDialect() {
        super();
        registerColumnType(Types.CLOB, "clob");
        registerColumnType(Types.BLOB, "blob");
    }
}