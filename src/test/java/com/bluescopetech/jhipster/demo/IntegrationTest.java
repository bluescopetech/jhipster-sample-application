package com.bluescopetech.jhipster.demo;

import com.bluescopetech.jhipster.demo.JhipsterSampleApplicationApp;
import com.bluescopetech.jhipster.demo.config.AsyncSyncConfiguration;
import com.bluescopetech.jhipster.demo.config.EmbeddedElasticsearch;
import com.bluescopetech.jhipster.demo.config.EmbeddedKafka;
import com.bluescopetech.jhipster.demo.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JhipsterSampleApplicationApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
