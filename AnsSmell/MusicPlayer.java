public class MusicPlayer extends Player {
    @Override public void play() {
        System.out.println("Music: play");
        // 以下、音楽の再生用コード...
    }
    @Override public void loop() {
        System.out.println("Music: loop");
        // 以下、音楽のループ再生用コード...
    }
    @Override public void stop() {
        System.out.println("Music: stop");
        // 以下、音楽の停止用コード...
    }
}
