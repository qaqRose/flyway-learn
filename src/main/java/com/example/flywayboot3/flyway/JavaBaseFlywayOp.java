package com.example.flywayboot3.flyway;

import lombok.extern.slf4j.Slf4j;
import org.flywaydb.core.api.callback.BaseCallback;
import org.flywaydb.core.api.callback.Callback;
import org.flywaydb.core.api.callback.Context;
import org.flywaydb.core.api.callback.Event;
import org.springframework.stereotype.Component;

/**
 * java flyway操作
 * 这里只是简单打印
 */
@Slf4j
@Component
public class JavaBaseFlywayOp extends BaseCallback {

    @Override
    public void handle(Event event, Context context) {
        log.info("event {} context {} ", event, context);
    }
}
