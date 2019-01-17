- Works as a bridge between two incompatible interfaces
- By what incompatible means is that **different methods** exuding different behaviours
- Involves a single class which is responsible to joining functionalities of independent or incompatible interfaces
- OR intepret in this way: Converting the interface of one class into an interface expected by the clients
- Due to this, the general purpose media player which is nearer to client will contain the another by using the adapter

- Class adapter: Relies on multiple inheritance
- Object adapter: Relies on object composition (which will be demonstrated)

- "AdvancedMediaPlayer" will contains different methods signature in which what the concrete classes differs from each other
- E.g. "AdvancedMediaPlayer" will have two different methods which is playMP4 and playVLC but one of this will be implemeted

- Introduce "MediaAdapter" (connector class), this interface **implements** "MediaPlayer" and **uses** "AdvancedMediaPlayer" (via composition)

- "MediaAdapter" will extend functionality (instantiate concrete class that implementing "AdvancedMediaPlayer") and "MediaAdapter" will later be used by "AudioPlayer", a general purpose audio player

- Lastly, the demo will contain this general purpose audio player, but it is no longer the player that only plays mp3 format instead it will be able to play multiple format (by passing in different paramater)

