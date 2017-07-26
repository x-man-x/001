package com.xxx.weixin.mp.event.care;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xxx.weixin.common.event.EventRequest;

/**
 * Created by exizhai on 11/22/2015.
 */
public class SessionCreateEvent extends EventRequest {

    @JsonProperty("KfAccount")
    private String care;

    public String getCare() {
        return care;
    }

    public void setCare(String care) {
        this.care = care;
    }
}
