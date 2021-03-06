/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.sqoop.mapreduce.parquet.kite;

import org.apache.avro.generic.GenericRecord;
import org.apache.hadoop.io.NullWritable;
import org.apache.sqoop.mapreduce.MergeParquetReducer;

import java.io.IOException;

/**
 * An implementation of {@link MergeParquetReducer} which depends on the Kite Dataset API.
 */
public class KiteMergeParquetReducer extends MergeParquetReducer<GenericRecord, NullWritable> {

  @Override
  protected void write(Context context, GenericRecord record) throws IOException, InterruptedException {
    context.write(record, null);
  }
}
