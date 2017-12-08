/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ambari.metrics.adservice.resource

import javax.ws.rs.core.MediaType.APPLICATION_JSON
import javax.ws.rs.core.Response
import javax.ws.rs.{GET, Path, Produces}

import org.apache.ambari.metrics.adservice.service.DetectionService

import com.google.inject.Inject

@Path("/detection")
class DetectionResource {

  @Inject
  var detectionService: DetectionService = _

  @GET
  @Produces(Array(APPLICATION_JSON))
  @Path("/state")
  def getState: Response = {
    Response.ok.entity(detectionService.state()).build()
  }
}
