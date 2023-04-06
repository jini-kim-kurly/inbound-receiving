package com.kurly.inbound;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HelloInboundReceiving {

    public String getMessageFromExternal(){
        HelloExternalApi helloExternalApi = new HelloExternalApi();
        return helloExternalApi.getMessage("RECEIVING");
    }

}

