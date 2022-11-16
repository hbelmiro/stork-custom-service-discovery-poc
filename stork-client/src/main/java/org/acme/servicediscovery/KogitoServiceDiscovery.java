package org.acme.servicediscovery;

import io.smallrye.mutiny.Uni;
import io.smallrye.stork.api.ServiceDiscovery;
import io.smallrye.stork.api.ServiceInstance;
import io.smallrye.stork.impl.DefaultServiceInstance;
import io.smallrye.stork.utils.ServiceInstanceIds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

public class KogitoServiceDiscovery implements ServiceDiscovery {

    private static final Logger LOGGER = LoggerFactory.getLogger(KogitoServiceDiscovery.class);

    @Override
    public Uni<List<ServiceInstance>> getServiceInstances() {
        LOGGER.debug("Getting service instances");

        // Proceed to the lookup...
        // Here, we just return a DefaultServiceInstance with the configured host and port
        // The last parameter specifies whether the communication with the instance should happen over a secure connection

        // Service
//        DefaultServiceInstance instance =
//                new DefaultServiceInstance(ServiceInstanceIds.next(), "knative-serving-quarkus-demo.default.10.110.137.209.sslip.io", 80, false);

        // Pod
        DefaultServiceInstance instance =
                new DefaultServiceInstance(ServiceInstanceIds.next(), "172.17.0.23", 8080, false);

        return Uni.createFrom().item(() -> Collections.singletonList(instance));
    }
}
