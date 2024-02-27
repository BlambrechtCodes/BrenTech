# Welcome to BrenTech: Where Innovation Meets Fun!

At BrenTech, we're not just another tech company—we're a family of tech enthusiasts led by our fearless CEO, Brendan, a visionary with a passion for pushing the boundaries of cutting-edge innovation. Our mission is simple: to create smart device interfaces that are as intuitive and unique as they are exciting.

From TVs that respond to your voice commands to smartphones that capture life's many moments with stunning clarity, BrenTech products are designed to enhance your everyday life in ways never before thought possible. Our team of developers, led by Brendan himself, works tirelessly to bring you the latest and greatest in smart device technology, ensuring that each BrenTech product is not only top-quality but also a joy to use.

Join us on our journey to revolutionize the way you interact with your smart devices. With BrenTech, the future is not just bright—it's fun, innovative, and always one step ahead of the game. Welcome to the BrenTech family!

"BrenTech: Redefining Tomorrow, Today!"

# Class Descriptions:

## Driver:
This Java program serves as a comprehensive test suite for classes representing different models of TVs and smartphones. It meticulously tests various functionalities such as channel changing, volume adjustment, voice interface commands, and multimedia capturing capabilities. Additionally, the program ensures type conformance with the TV and smartphone classes, as well as the VoiceAssistant and Logger interfaces. Through a series of test cases, the program demonstrates the robustness and compatibility of the implemented functionalities across different device models. Overall, this test driver provides a thorough evaluation of the implemented classes and interfaces, ensuring their correctness and interoperability.

## TV:
This abstract class represents a generic TV and implements the **Logger** interface to enable logging functionality. It contains fields for the current channel, current volume, and model of the TV, as well as methods for adjusting the channel and volume, changing the channel, and logging messages. The class provides a visual string representation of the TV's current state, including its channel, volume, and model.

## StarTV:
This class represents a TV from the Star brand and extends the **TV** class. It inherits the functionalities of the **TV** class, including channel and volume adjustment, channel changing, and logging. The constructor sets the model of the TV to "star" using the superclass constructor.

## NebulaTV:
This class represents a TV from the Nebula brand and extends the **TV** class while implementing the **VoiceAssistant** interface. It provides voice control functionality, including methods for generating speech output and processing speech inputs to control the TV. The constructor sets the model of the TV to "nebula" using the superclass constructor.

## Smartphone:
This abstract class represents a generic smartphone and implements the **VoiceAssistant** and **Logger** interfaces to provide voice control and logging functionalities. It includes abstract methods for taking pictures and talking on the phone, as well as methods for processing speech commands, logging messages, and recharging the battery. The constructor initializes the smartphone with the given battery capacity and model.

## P8:
This class represents a smartphone model P8, extending the **Smartphone** class. It includes methods for taking pictures and talking on the phone. The constructor initializes a new P8 smartphone with a battery capacity of 2000 and a model name "p8". The **takePicture** method captures a picture with a specific resolution and reduces the current battery amount accordingly. The **talkOnPhone** method simulates talking on the phone for a specified number of minutes and adjusts the battery amount based on the duration of the call.

## P10:
This class represents a smartphone model P10, extending the **Smartphone** class. It includes methods for taking pictures, recording videos, talking on the phone, and processing speech commands specific to the P10 model. The constructor initializes a new P10 smartphone with a battery capacity of 2900 and a model name "p10". The **takePicture** method captures a picture with specific resolution and adjusts the current battery amount accordingly. The **talkOnPhone** method simulates talking on the phone for a specified number of minutes and adjusts the battery amount based on the call duration. The **takeVideo** method records a video for a specified number of seconds and reduces the battery amount accordingly. The **processSpeech** method processes speech commands for the P10 smartphone, including taking pictures, recording videos, and talking on the phone.

## Logger:
This interface represents a logger and includes a method for writing a message to a log file. Classes that implement this interface must provide an implementation for the **writeToLogFile** method.

## VoiceAssistant:
This interface represents a voice assistant and includes methods for processing speech commands and generating speech output. Classes that implement this interface must provide implementations for the **processSpeech** and **saySomething** methods.

## SpeechNotUnderstoodException:
This class represents an exception thrown when a speech input is not understood by a voice assistant. It extends the Java Exception class and provides a constructor to create a new instance with a specified detail message.

### General Project Summary:
The classes and interfaces provided create a cohesive system for modeling and interacting with TVs and smartphones, focusing on functionality such as channel changing, volume adjustment, voice control, and logging. The **TV** class serves as a base for generic TV functionality, while **StarTV** and **NebulaTV** extend it to represent specific TV models, with **NebulaTV** additionally implementing the **VoiceAssistant** interface for voice control functionality. The **Smartphone** abstract class provides a blueprint for generic smartphone features, with **P8** and **P10** representing specific models and implementing the **VoiceAssistant** interface. Both smartphones also implement the **Logger** interface to access logging functionality. The **Logger** interface and **Logger** class allow for logging messages from both TVs and smartphones, enhancing debugging and monitoring capabilities. The **VoiceAssistant** interface defines methods for processing speech commands and generating speech output, crucial for enabling voice control in TVs and smartphones. The **SpeechNotUnderstoodException** class provides a way to handle cases where a speech input cannot be understood, improving the user experience by allowing for error handling and feedback. Each class component plays a vital role in creating a flexible and extensible system for managing and interacting with TVs and smartphones efficiently.
