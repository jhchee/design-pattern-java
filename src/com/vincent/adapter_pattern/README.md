**Preface**
1)  Adapter pattern works as a bridge between two incompatible interfaces. 
    This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.

2)  This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces. 
    A real life example could be a case of card reader which acts as an adapter between memory card and a laptop. 
    You plugin the memory card into card reader and card reader into the laptop so that memory card can be read via laptop.

![alt text](https://www.tutorialspoint.com/design_pattern/images/adapter_pattern_uml_diagram.jpg)
**Implementation**
1)  MediaPlayer interface, concrete class AudioPlayer implementing the interface, AudioPlayer play mp3 by default.
2)  Having another interface AdvancedMediaPlayer and concrete classes implementing AdvancedMediaPlayer interface. These classes can play vlc and mp4 format files.
3)  We want to make AudioPlayer to play other formats as well. 
    To attain this, we have created an adapter class MediaAdapter which implements the MediaPlayer interface and uses AdvancedMediaPlayer objects to play the required format.
4)  AudioPlayer uses the adapter class MediaAdapter passing it the desired audio type without knowing the actual class which can play the desired format.