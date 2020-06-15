/*
 * Copyright (C) 2015-2020 Samuel Audet
 *
 * Licensed either under the Apache License, Version 2.0, or (at your option)
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation (subject to the "Classpath" exception),
 * either version 2, or any later version (collectively, the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     http://www.gnu.org/licenses/
 *     http://www.gnu.org/software/classpath/license.html
 *
 * or as provided in the LICENSE.txt file that accompanied this code.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bytedeco.cuda.presets;

import org.bytedeco.javacpp.annotation.NoException;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.Info;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

/**
 *
 * @author Samuel Audet
 */
@Properties(inherit = nppc.class, value = {
    @Platform(include = "<nppi_arithmetic_and_logical_operations.h>", link = "nppial@.11"),
    @Platform(value = "windows-x86_64", preload = "nppial64_11")},
        global = "org.bytedeco.cuda.global.nppial")
@NoException
public class nppial implements InfoMapper {
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("nppiSub_32s_C4IRSfs", "nppiSub_32s_C4RSfs", "nppiSub_32s_C4IRSfs_Ctx", "nppiSub_32s_C4RSfs_Ctx").skip());
    }
}
