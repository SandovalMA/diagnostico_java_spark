package minsait.ttaa.datio.engine;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

import static minsait.ttaa.datio.common.Common.*;
import static minsait.ttaa.datio.common.naming.PlayerInput.shortName;
import static minsait.ttaa.datio.common.naming.PlayerInput.teamPosition;
import static org.apache.spark.sql.SaveMode.Append;
import static org.apache.spark.sql.SaveMode.Overwrite;

abstract class Writer {

    static void write(Dataset<Row> df) {
        df
                .select()
                .coalesce(1)
                .write()
                .mode(Overwrite)
                //.csv(OUTPUT_PATH);
                .parquet(OUTPUT_PATH);

    }

}
