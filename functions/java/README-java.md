# Java Function
`InitCapFunction` capitalizes the first letter of the input message and publishes it to the output topic.

### Before running the function
[Package](https://pulsar.apache.org/docs/3.1.x/functions-package-java/) the Java function into a NAR or JAR file using
```
mvn package
```


### Deploying the function
```
$ bin/pulsar-admin functions create \ 
     --jar ~/functions/pulsar-functions-1.0-SNAPSHOT.jar \ 
     --classname org.example.InitCapFunction \
     --inputs persistent://ten1/ns1/input-1 \ 
     --output persistent://ten1/ns1/output-1 \
     --tenant ten1 \
     --namespace ns1
```
This will create a function called `InitCapFunction` under the `ten1/ns1`.
Function configuration can also be specified via [YAML](https://pulsar.apache.org/docs/3.1.x/functions-cli/#yaml-configurations-for-pulsar-functions)
```
$ bin/pulsar-admin functions create \ 
     --jar ~/functions/pulsar-functions-1.0-SNAPSHOT.jar \ 
     --function-config-file ~/functions/InitCapFunction.yaml \  
```
If tenant and namespace are not passed in the create command, the function is created under the `public/default` namespace.

### Testing the function
Assign a consumer to listen on the output topic for messages from the `InitCapFunction` function with the `pulsar-client consume` command.

```
$ bin/pulsar-client consume ten1/ns1/output-1 \
     --num-messages 0 #listen indefinitely \
     --subscription-name initcons 
```
Produce a message on the input topic.
```
$ bin/pulsar-client produce ten1/ns1/input-1 \ 
     --messages "hello"
```
The consumer listening on the output topic produces something as follows in the log.
```
----- got message -----
key:[null], properties:[__pfn_input_msg_id__=CDkQACAAMAE=, __pfn_input_topic__=persistent://ten1/ns1/input-1], content:Hello
```

### Updating the function
```

$ bin/pulsar-admin functions update \
  --jar ~/functions/pulsar-functions-1.0-SNAPSHOT.jar \
  --classname org.example.InitCapFunction \
  --function-config-file ~/functions/InitCapFunction.yaml \

```