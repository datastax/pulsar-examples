package com.datastax.pulsar;

import java.util.Random;
import java.util.UUID;

import org.apache.pulsar.client.api.AuthenticationFactory;
import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.client.api.Schema;

public class SimplePulsarProducer {
    
    public static void main(String[] args) {
        
        PulsarClient pulsarClient = null;
        Producer<DemoBean> pulsarProducer = null;
                
        try {
            DemoKesqueConfiguration conf = 
                    DemoKesqueConfiguration.getInstance();
            
            // Create client object
            pulsarClient = PulsarClient.builder()
                    .serviceUrl(conf.getServiceUrl())
                    .authentication(AuthenticationFactory.token(conf.getAuthenticationToken()))
                    .build();
            
            // Create producer on a topic
            pulsarProducer = pulsarClient
                    .newProducer(Schema.JSON(DemoBean.class))
                    .topic("persistent://" 
                                + conf.getTenantName() + "/" 
                                + conf.getNamespace() + "/" 
                                + conf.getTopicName())
                    .create();
            
            while(true) {
                // Creates random 8 digit ID
                Random rnd = new Random();
                int id = 10000000 + rnd.nextInt(90000000);

                pulsarProducer.send(new DemoBean(
                    id,
                    "LeBron James, Anthony Davis, Kyrie Irving, Damian Lillard, Klay Thompson...",
                    "United States",
                    "July 16, 2021",
                    "NBA superstar LeBron James teams up with Bugs Bunny and the rest of the Looney Tunes for this long-awaited sequel.",
                    "Malcolm D. Lee",
                    "120 min",
                    "Animation, Adventure, Comedy",
                    "PG", 
                    2021,
                    "Space Jam: A New Legacy",
                    "Movie"
                ));
                System.out.println("[PRODUCER] -  Message " + id  + " sent");
                Thread.sleep(conf.getWaitPeriod());
            }
            
        } catch (PulsarClientException e) {
           throw new IllegalStateException("Cannot connect to pulsar", e);
        } catch (InterruptedException e) {
            System.out.println("[INFO] - Stopped request retrieved");
        } finally {
            try {
              if (null != pulsarProducer) pulsarProducer.close();
              if (null != pulsarClient)   pulsarClient.close();
            } catch (PulsarClientException e) {}
            System.out.println("[INFO] - SimplePulsarProducer has been stopped.");
        }
    }

}
