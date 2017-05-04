/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.rdb.sharding.parser.sql.context;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * 列对象.
 *
 * @author zhangliang
 */
@AllArgsConstructor
@Getter
@EqualsAndHashCode(exclude = "autoIncrement")
public final class ShardingColumnContext {
    
    private final String columnName;
    
    private final String tableName;
    
    private final boolean autoIncrement;
    
    public ShardingColumnContext(final String columnName, final String tableName) {
        this(columnName, tableName, false);
    }
}
