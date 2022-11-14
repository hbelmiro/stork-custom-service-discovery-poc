package org.acme.servicediscovery;

import io.smallrye.stork.api.ServiceDiscovery;
import io.smallrye.stork.api.config.ServiceConfig;
import io.smallrye.stork.api.config.ServiceDiscoveryType;
import io.smallrye.stork.spi.ServiceDiscoveryProvider;
import io.smallrye.stork.spi.StorkInfrastructure;

@ServiceDiscoveryType("kogito")
public class KogitoServiceDiscoveryProvider
        implements ServiceDiscoveryProvider<KogitoConfiguration> {

    @Override
    public ServiceDiscovery createServiceDiscovery(KogitoConfiguration config,
                                                   String serviceName,
                                                   ServiceConfig serviceConfig,
                                                   StorkInfrastructure storkInfrastructure) {
        return new KogitoServiceDiscovery();
    }
}
