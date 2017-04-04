public class VideoPlayer extends Player {
    @Override public void play() {
        System.out.println("Video: play");
        // 以下、ビデオの再生用コード...
    }
    @Override public void loop() {
        System.out.println("Video: loop");
        // 以下、ビデオのループ再生用コード...
    }
    @Override public void stop() {
        System.out.println("Video: stop");
        // 以下、ビデオの停止用コード...
    }
}
