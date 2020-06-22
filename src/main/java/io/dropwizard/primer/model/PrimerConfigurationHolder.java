package io.dropwizard.primer.model;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class PrimerConfigurationHolder {

    private final AtomicLong lastUpdatedTimestamp;
    private AtomicReference<PrimerBundleConfiguration> configReference;

    public PrimerConfigurationHolder(PrimerBundleConfiguration primerBundleConfiguration) {
        this.configReference = new AtomicReference<>(primerBundleConfiguration);
        this.lastUpdatedTimestamp = new AtomicLong(System.currentTimeMillis());
    }

    public PrimerBundleConfiguration getConfig() {
        return configReference.get();
    }

    public void setConfig(PrimerBundleConfiguration config) {
        configReference.set(config);
        this.lastUpdatedTimestamp.set(System.currentTimeMillis());
    }


}
