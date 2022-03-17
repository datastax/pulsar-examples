# pulsar-examples

As seen during the Ship All-Hands 7/6/2021 watch it [here](https://doc-0g-00-docs.googleusercontent.com/docs/securesc/to0a40djobeu9eb8utvip5baimqe2aho/7bb9uk4uh55ue97h8od9rbetrpl6ct6j/1625685300000/14445640514016380924/14112477832968321065/1QapJ_sH5KMq5Bezg5CBn20F7X86oPrjd?e=download&authuser=0).

### Before Getting Started
1. Make sure you have Java 11+ installed
2. Make sure you have Maven installed
  - (Add both to your `PATH`)
3. Clone the repo

### Setting up in Astra
- Use AstraDB's "Load Data" Feature to get the `movies_and_tv` table.
- Create a topic but don't set the schema.

### Running the Producer
    mvn compile exec:java -Dexec.mainClass=com.datastax.pulsar.SimplePulsarProducer

### Making Changes
1. Got to the `Connect` Tab in Astra Streaming and copy your tenant details into `resources/application.properties`
2. Change `DemoBean.java` to match your table and messages
3. Change the message you wish to send in `SimplePulsarProducer.java`


For questions reach our to Mike Fortman on Slack or check out the (#streaming-eng-feedback)[https://datastax.slack.com/archives/C01UCLWJ9DK] channel.



