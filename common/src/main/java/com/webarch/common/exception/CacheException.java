/*
        Copyright  DR.YangLong

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
*/
package com.webarch.common.exception;

/**
 * functional describe:系统缓存异常
 *
 * @author DR.YangLong [410357434@163.com]
 * @version 1.0 2015/5/15 8:57
 */
public class CacheException extends TransfarException{

    public CacheException() {
    }

    public CacheException(String message) {
        super(message);
    }
}
