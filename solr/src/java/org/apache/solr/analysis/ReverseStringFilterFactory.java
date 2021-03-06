/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.solr.analysis;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.reverse.ReverseStringFilter;

/**
 * A FilterFactory which reverses the input.
 *
 * @version $Id: ReverseStringFilterFactory.java 923670 2010-03-16 10:36:22Z uschindler $
 * @since solr 1.4
 */
public class ReverseStringFilterFactory extends BaseTokenFilterFactory {
  public ReverseStringFilter create(TokenStream in) {
    assureMatchVersion();
    return new ReverseStringFilter(luceneMatchVersion,in);
  }
}

