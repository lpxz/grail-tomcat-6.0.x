/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.catalina.ssi;


import java.io.PrintWriter;
/**
 * Implements the Server-side #exec command
 * 
 * @author Bip Thelin
 * @author Paul Speed
 * @author Dan Sandberg
 * @author David Becker
 * @version $Id: SSIConfig.java,v 1.1 2010/06/30 05:06:59 smhuang Exp $
 */
public final class SSIConfig implements SSICommand {
    /**
     * @see SSICommand
     */
    public long process(SSIMediator ssiMediator, String commandName,
            String[] paramNames, String[] paramValues, PrintWriter writer) {
        for (int i = 0; i < paramNames.length; i++) {
            String paramName = paramNames[i];
            String paramValue = paramValues[i];
            String substitutedValue = ssiMediator
                    .substituteVariables(paramValue);
            if (paramName.equalsIgnoreCase("errmsg")) {
                ssiMediator.setConfigErrMsg(substitutedValue);
            } else if (paramName.equalsIgnoreCase("sizefmt")) {
                ssiMediator.setConfigSizeFmt(substitutedValue);
            } else if (paramName.equalsIgnoreCase("timefmt")) {
                ssiMediator.setConfigTimeFmt(substitutedValue);
            } else {
                ssiMediator.log("#config--Invalid attribute: " + paramName);
                //We need to fetch this value each time, since it may change
                // during the
                // loop
                String configErrMsg = ssiMediator.getConfigErrMsg();
                writer.write(configErrMsg);
            }
        }
        // Setting config options doesn't really change the page
        return 0;
    }
}