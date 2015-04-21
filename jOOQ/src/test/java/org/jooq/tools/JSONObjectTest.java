/*
 * Copyright (c) 2015 by Data Geekery GmbH (http://www.datageekery.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jooq.tools;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.jooq.tools.json.JSONObject;

import org.junit.Test;

/**
 * @author Alok Menghrajani
 */
public class JSONObjectTest {

    @Test
    public void testJSONObjectToString() {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("foo", "bar");
        assertEquals(new JSONObject(map).toString(), "{\"foo\":\"bar\"}");
        assertEquals(JSONObject.toJSONString(map), "{\"foo\":\"bar\"}");

        map.put("jOOQ", "isfun!");
        String s = new JSONObject(map).toString();
        assertTrue(s.equals("{\"foo\":\"bar\",\"jOOQ\":\"isfun!\"}") ||
            s.equals("{\"jOOQ\":\"isfun!\",\"foo\":\"bar\"}"));

        s = JSONObject.toJSONString(map);
        assertTrue(s.equals("{\"foo\":\"bar\",\"jOOQ\":\"isfun!\"}") ||
            s.equals("{\"jOOQ\":\"isfun!\",\"foo\":\"bar\"}"));
    }
}