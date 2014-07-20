/*
 * Copyright 2013 bankinterface.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bankinterface.result;

import java.util.Map;

/**
 * 预支付结果对象,封装经过支付机构规则转换后的支付参数
 * 
 */
public class PrePayResult extends Result {
    private String              requestUrl;
    private String              charset;
    private Map<String, String> parameters;

    /**
     * 请求地址
     * 
     * @return
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * 请求地址
     * 
     * @param requestUrl
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    /**
     * 字符集
     * 
     * @return
     */
    public String getCharset() {
        return charset;
    }

    /**
     * 字符集
     * 
     * @param charset
     */
    public void setCharset(String charset) {
        this.charset = charset;
    }

    /**
     * 请求参数
     * 
     * @return
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * 请求参数
     * 
     * @param parameters
     */
    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

}
