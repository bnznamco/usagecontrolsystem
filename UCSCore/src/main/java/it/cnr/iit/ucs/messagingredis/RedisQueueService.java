package it.cnr.iit.ucs.messagingredis;

import com.github.sonus21.rqueue.core.RqueueMessageSender;
import com.github.sonus21.rqueue.core.RqueueMessageSenderImpl;
import com.github.sonus21.rqueue.core.RqueueMessageTemplateImpl;

import it.cnr.iit.ucs.message.Message;

import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

public class RedisQueueService {
	private RqueueMessageSender rqueueMessageSender;

	public RedisQueueService(){
		rqueueMessageSender = new RqueueMessageSenderImpl(new RqueueMessageTemplateImpl(new JedisConnectionFactory()));
	}

	public void handleMessage(Message message) {
		rqueueMessageSender.enqueue("handle-message", message);
	}

}