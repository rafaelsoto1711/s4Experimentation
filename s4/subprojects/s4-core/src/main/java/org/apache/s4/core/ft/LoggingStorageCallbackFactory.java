/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.s4.core.ft;

import org.apache.s4.core.ft.CheckpointingFramework.StorageResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A factory for creating storage callbacks that simply log callback results
 * 
 */
public class LoggingStorageCallbackFactory implements StorageCallbackFactory {

    @Override
    public StorageCallback createStorageCallback() {
        return new StorageCallbackLogger();
    }

    /**
     * A basic storage callback that simply logs results from storage operations
     * 
     */
    static class StorageCallbackLogger implements StorageCallback {

        private static Logger logger = LoggerFactory
                .getLogger(LoggingStorageCallbackFactory.StorageCallbackLogger.class);

        @Override
        public void storageOperationResult(StorageResultCode code, Object message) {
            if (StorageResultCode.SUCCESS == code) {
                if (logger.isDebugEnabled()) {
                    logger.debug("Callback from storage: " + StorageResultCode.SUCCESS.name() + " : " + message);
                }
            } else {
                logger.warn("Callback from storage: " + StorageResultCode.FAILURE.name() + " : " + message);
            }
        }
    }

}
