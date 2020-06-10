package it.cnr.iit.ucs.messagingredis;

import com.github.sonus21.rqueue.config.SimpleRqueueListenerContainerFactory;
import com.github.sonus21.rqueue.spring.EnableRqueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import it.cnr.iit.ucs.properties.UCSProperties;

@Configuration
@EnableRqueue
@Conditional(RedisCondition.class)
class RqueueConfiguration {

    @Autowired
    private UCSProperties properties;

    @Bean
    public SimpleRqueueListenerContainerFactory simpleRqueueListenerContainerFactory() {
        SimpleRqueueListenerContainerFactory factory = new SimpleRqueueListenerContainerFactory();
        boolean redisQueueActive = properties.getRequestManager().isRedisQueueActive();
        factory.setAutoStartup(redisQueueActive);
        return factory;
    }

    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
        redisStandaloneConfiguration.setHostName(properties.getRequestManager().getRedisHostName());
        redisStandaloneConfiguration.setPort(properties.getRequestManager().getRedisPort());
        return new JedisConnectionFactory(redisStandaloneConfiguration);
    }
}