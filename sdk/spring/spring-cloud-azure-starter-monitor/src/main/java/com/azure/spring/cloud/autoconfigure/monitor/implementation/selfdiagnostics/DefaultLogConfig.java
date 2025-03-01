// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.monitor.implementation.selfdiagnostics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConditionalOnMissingClass({"ch.qos.logback.classic.LoggerContext"})
class DefaultLogConfig {

    @Bean
    Logger selfDiagnosticsLogger() {
        Logger logger = LoggerFactory.getLogger(SelfDiagnostics.class);
        String selfDiagLevelDefinedByUser = System.getenv(SelfDiagAutoConfig.SELF_DIAGNOSTICS_LEVEL_ENV_VAR);
        if (selfDiagLevelDefinedByUser != null) {
            String loggerLevel = findLevel(logger);
            logger.warn("You have defined a self-diagnostics level at " + selfDiagLevelDefinedByUser + ". The self-diagnostics level was not set to this value because Logback is not used. The self-diagnostics level is " + loggerLevel + ".");
        }
        return logger;
    }

    private static String findLevel(Logger logger) {
        if (logger.isErrorEnabled()) {
            return "ERROR";
        }
        if (logger.isWarnEnabled()) {
            return "WARN";
        }
        if (logger.isInfoEnabled()) {
            return "INFO";
        }
        if (logger.isDebugEnabled()) {
            return "DEBUG";
        }
        if (logger.isTraceEnabled()) {
            return "TRACE";
        }
        return "UNKNOWN";
    }
}
