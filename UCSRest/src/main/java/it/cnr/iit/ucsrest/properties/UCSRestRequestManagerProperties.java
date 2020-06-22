package it.cnr.iit.ucsrest.properties;

import org.springframework.beans.factory.annotation.Value;

import it.cnr.iit.ucs.properties.components.RequestManagerProperties;

public class UCSRestRequestManagerProperties extends BaseProperties implements RequestManagerProperties {

    @Value( "${api-remote-response}" )
    private String apiRemoteResponse;

    @Value( "${active}" )
    private boolean active;

    @Value( "${redis-queue-active}" )
    private boolean redisQueueActive;

    @Value( "${redis-queue-host-name:localhost}" )
    private String redisQueueHostName;

    @Value( "${redis-queue-port:6379}" )
    private int redisQueuePort;

    @Value( "${redis-queue-max-num-workers:1}" )
    private int redisQueueMaxNumWorkers;

    @Override
    public String getApiRemoteResponse() {
        return apiRemoteResponse;
    }

    public void setApiRemoteResponse( String apiRemoteResponse ) {
        this.apiRemoteResponse = apiRemoteResponse;
    }

    public void setActive( boolean active ) {
        this.active = active;
    }

    public void setRedisQueueActive( boolean redisQueueActive ) {
        this.redisQueueActive = redisQueueActive;
    }

    public void setRedisQueueHostName( String redisQueueHostName ) {
        this.redisQueueHostName = redisQueueHostName;
    }

    public void setRedisQueuePort( int redisQueuePort ) {
        this.redisQueuePort = redisQueuePort;
    }

    public void setRedisQueueMaxNumWorkers( int redisQueueMaxNumWorkers ) {
        this.redisQueueMaxNumWorkers = redisQueueMaxNumWorkers;
    }

    @Override
    public boolean isRedisQueueActive() {
        return redisQueueActive;
    }

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public String getRedisHostName() {
        return redisQueueHostName != null ? redisQueueHostName : "localhost";
    }

    @Override
    public int getRedisPort() {
        return redisQueuePort != 0 ? redisQueuePort : 6379;
    }

    @Override
    public int getRqueueMaxNumWorkers() {
        return redisQueueMaxNumWorkers != 0 ? redisQueueMaxNumWorkers : 1;
    }

}
