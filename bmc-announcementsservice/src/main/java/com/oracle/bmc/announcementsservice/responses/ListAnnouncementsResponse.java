/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.announcementsservice.responses;

import com.oracle.bmc.announcementsservice.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListAnnouncementsResponse {

    /**
     *
     */
    private String opcNextPage;

    /**
     *
     */
    private String opcRequestId;

    /**
     * The returned AnnouncementsCollection instance.
     */
    private AnnouncementsCollection announcementsCollection;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListAnnouncementsResponse o) {
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            announcementsCollection(o.getAnnouncementsCollection());

            return this;
        }
    }
}
