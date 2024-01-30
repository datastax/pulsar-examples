# Python Function
ExclamationFunction adds an exclamation mark(!) after the input message.

### Running the function
```
# bin/pulsar-admin functions create \
     --py ~/functions/func.py \ 
     --classname ExclamationFunction \ 
     --tenant ten1 \
     --namespace ns1 \
     --inputs ten1/ns1/in \
     --output ten1/ns1/out
```
### Testing the function
Assign a consumer to listen on the output topic for messages from the `InitCapFunction` function with the `pulsar-client consume` command.

```
$ bin/pulsar-client consume ten1/ns1/out \
     --num-messages 0 #listen indefinitely \
     --subscription-name excl 
```
Produce a message on the input topic.
```
$ bin/pulsar-client produce ten1/ns1/in \ 
     --messages "Bye"
```
The consumer listening on the output topic produces something as follows in the log.
```
Bye!
```