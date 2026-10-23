package com.inductiveautomation.ignition.examples.scripting;

import com.inductiveautomation.ignition.common.licensing.LicenseState;
import com.inductiveautomation.ignition.gateway.model.AbstractGatewayModuleHook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GatewayHook extends AbstractGatewayModuleHook {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void startup(LicenseState licenseState) {
        logger.info("Module installed and running");
    }

    @Override
    public void shutdown() {
    }
}
