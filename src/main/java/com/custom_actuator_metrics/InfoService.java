package com.custom_actuator_metrics;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class InfoService implements InfoContributor {

    final ResultMetrics resultMetrics;

    public InfoService(final ResultMetrics resultMetrics) {
        this.resultMetrics = resultMetrics;
    }

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("globalCount", resultMetrics.globalCount);
    }
}
