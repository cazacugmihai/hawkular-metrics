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

package org.hawkular.metrics.api.jaxrs.influx.query.parse.type;

import static org.hawkular.metrics.api.jaxrs.influx.query.parse.InfluxQueryParser.ListSeriesContext;
import static org.hawkular.metrics.api.jaxrs.influx.query.parse.InfluxQueryParser.SelectQueryContext;
import static org.hawkular.metrics.api.jaxrs.influx.query.parse.type.QueryType.LIST_SERIES;
import static org.hawkular.metrics.api.jaxrs.influx.query.parse.type.QueryType.SELECT;

import org.antlr.v4.runtime.tree.RuleNode;
import org.hawkular.metrics.api.jaxrs.influx.query.parse.InfluxQueryBaseVisitor;

/**
 * @author Thomas Segismont
 * @deprecated as of 0.17
 */
@Deprecated
public class QueryTypeVisitor extends InfluxQueryBaseVisitor<QueryType> {

    private boolean stopVisiting;

    public QueryTypeVisitor() {
        stopVisiting = false;
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, QueryType currentResult) {
        return !stopVisiting;
    }

    @Override
    public QueryType visitListSeries(ListSeriesContext ctx) {
        stopVisiting = true;
        return LIST_SERIES;
    }

    @Override
    public QueryType visitSelectQuery(SelectQueryContext ctx) {
        stopVisiting = true;
        return SELECT;
    }
}
