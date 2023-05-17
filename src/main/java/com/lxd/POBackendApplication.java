package com.lxd;

import com.lxd.resources.POItemResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class POBackendApplication extends Application<POBackendConfiguration> {

    public static void main(final String[] args) throws Exception {
        new POBackendApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropWizardDemo";
    }

    @Override
    public void initialize(final Bootstrap<POBackendConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final POBackendConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        environment.jersey().register(new POItemResource());
    }

}
