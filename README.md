# Player Messaging
Communication between two instances of a class.

## Prerequisites
Java JDK 8

## Short description for each of the classes
Main Class:
Two instances of the class Player are initiated, where one instance is a sender and the other a receiver.
The sender will write a message and the consumer will reply with the message and send back the received message and the message counter.
The execution will stop once the maximum number of messages allowed is reached.

Player Class:
Implements the interface PlayerListener, overriding the two methods onPlayerMessageSend and onPlayerMessageRecieve. The methods have two parameters, the first one being the message exchanged and the second a boolean variable to distinguish between sender and receiver.
The onPlayerMessageRecieve method is called recursively by the receiver and the execution of the method stops if the method receives a 'false' value for the second parameter, meaning the message was received and sent back successfully. 

PlayerListener Interface:
Teo methods onPlayerMessageRecieve and onPlayerMessageSend are initialized.