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

package org.apache.solr.util;

import org.apache.lucene.spatial.geometry.LatLng;

/**
 * This interface defines the requirements of a GeotargetAdapter. A
 * GeotargetAdapter is used by a QParser to geotarget a client based on IP
 * 
 */
public interface GeotargetAdapter {
  /**
   * Get the approximate location from an IP
   * 
   * @param ip
   *          the client's IP address
   * @return LatLng the approximate location of the specified IP
   */
  public LatLng getCurrentLocation(String ip);
}
