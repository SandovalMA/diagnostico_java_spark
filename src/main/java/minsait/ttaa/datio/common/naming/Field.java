package minsait.ttaa.datio.common.naming;

import org.apache.spark.sql.Column;

import static org.apache.spark.sql.functions.col;

public class Field {

    Field(String name) {
        this.name = name;
    }

    String name = "field";

    public Column column() {
        return col(name);
    }
}