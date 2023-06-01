package com.custom_actuator_metrics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final ResultMetrics resultMetrics;

    public TestController(final ResultMetrics resultMetrics) {

        this.resultMetrics = resultMetrics;

    }

    @RequestMapping(value = "/increase")
    public int increaseVar() {
        resultMetrics.globalCount++;
        return resultMetrics.globalCount;
    }

}
