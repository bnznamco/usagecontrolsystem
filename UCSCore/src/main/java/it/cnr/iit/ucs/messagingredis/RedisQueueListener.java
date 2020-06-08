package it.cnr.iit.ucs.messagingredis;

import com.github.sonus21.rqueue.annotation.RqueueListener;
import org.springframework.stereotype.Component;
import it.cnr.iit.ucs.message.Message;
import it.cnr.iit.ucs.requestmanager.RequestManagerInterface;
import it.cnr.iit.utility.errorhandling.Reject;

@Component
public class RedisQueueListener {

    private static RequestManagerInterface requestManager;

    @RqueueListener(value = "handle-message")
    public void handleMessage(Message message) {
        Reject.ifNull( requestManager );
        Reject.ifNull( message );
        try {
            requestManager.handleMessage(message);
        } catch (Exception e) {
            // TODO handle this.
        }
    }

    public final static void setRequestManager( RequestManagerInterface rqm ) {
        Reject.ifNull( rqm );
        requestManager = rqm;
    }
}