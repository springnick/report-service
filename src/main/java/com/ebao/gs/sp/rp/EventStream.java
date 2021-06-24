package com.ebao.gs.sp.rp;

import org.springframework.messaging.SubscribableChannel;

public interface EventStream {


    SubscribableChannel inbound();
}
