package com.coen92.projects.web.arscupidum.reviewservice.configuration;

import com.coen92.projects.web.arscupidum.reviewservice.Application;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration
@EnableJdbcRepositories(basePackageClasses = Application.class)
@EnableJdbcAuditing
public class DatasourceConfiguration extends AbstractJdbcConfiguration {

}
