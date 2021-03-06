/*
 * Copyright 2014-2016 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.hawkular.metrics.api.jaxrs.influx.query.parse.definition;

/**
 * @author Thomas Segismont
 * @deprecated as of 0.17
 */
@Deprecated
public class NameFunctionArgument implements FunctionArgument {
    private final boolean prefixed;
    private final String prefix;
    private final String name;

    public NameFunctionArgument(String prefix, String name) {
        this.prefixed = (prefix != null);
        this.prefix = prefix;
        this.name = name;
    }

    public boolean isPrefixed() {
        return prefixed;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getName() {
        return name;
    }
}
