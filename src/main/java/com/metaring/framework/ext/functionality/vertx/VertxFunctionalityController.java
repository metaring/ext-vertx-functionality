package com.metaring.framework.ext.functionality.vertx;

import com.metaring.framework.ext.vertx.VertxUtilties;
import com.metaring.framework.functionality.FunctionalityController;

public class VertxFunctionalityController implements FunctionalityController {

    @Override
    public void execute(Runnable action) {
        VertxUtilties.INSTANCE_AS_EXECUTOR.execute(action);
    }
}