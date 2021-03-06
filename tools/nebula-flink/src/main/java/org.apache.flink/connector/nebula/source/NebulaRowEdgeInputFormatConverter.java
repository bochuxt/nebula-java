/* Copyright (c) 2020 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package org.apache.flink.connector.nebula.source;

import com.vesoft.nebula.data.Property;
import org.apache.flink.types.Row;

public class NebulaRowEdgeInputFormatConverter implements NebulaInputFormatConverter<Row>{

    @Override
    public Row convert(com.vesoft.nebula.data.Row row) {
        Property[] properties = row.getProperties();

        Row record = new Row(properties.length + 2);
        record.setField(0, row.getDefaultProperties()[0]);
        record.setField(1, row.getDefaultProperties()[1]);
        for(int pos=0;pos<row.getProperties().length; pos++){
            record.setField(pos+2, properties[pos]);
        }
        return record;
    }
}
