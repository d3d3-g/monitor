package dnt.monitor.engine;

import dnt.monitor.DefinitionUserConfig;
import dnt.monitor.engine.jmx.JmxVisitorFactory;
import dnt.monitor.engine.service.GenericSampleService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <h1>JMX ability in Engine side App Configuration</h1>
 *
 * @author Jay Xiong
 */
@Configuration
@ComponentScan({"dnt.monitor.engine.jmx"})
@Import(DefinitionUserConfig.class)
public class EngineJmxAppConfig extends EngineDefinitionAppConfig {

    @Override
    public void doExports() {
        exports(JmxVisitorFactory.class);
        exports(GenericSampleService.class, "jmx");
    }
}