public class Player {
    public static final int MUSIC = 0;
    public static final int VIDEO = 1;
    private final int _type;
    public Player(int type) {
        if (type != MUSIC && type != VIDEO) {
            throw new IllegalArgumentException("type = " + type);
        }
        _type = type;
    }
    public void play() {
        switch (_type) {
        case MUSIC:
            System.out.println("Music: play");
            // 以下、音楽の再生用コード...
            break;
        case VIDEO:
            System.out.println("Video: play");
            // 以下、ビデオの再生用コード...
            break;
        default:
            assert false;
        }
    }
    public void loop() {
        switch (_type) {
        case MUSIC:
            System.out.println("Music: loop");
            // 以下、音楽のループ再生用コード...
            break;
        case VIDEO:
            System.out.println("Video: loop");
            // 以下、ビデオのループ再生用コード...
            break;
        default:
            assert false;
        }
    }
    public void stop() {
        switch (_type) {
        case MUSIC:
            System.out.println("Music: stop");
            // 以下、音楽の停止用コード...
            break;
        case VIDEO:
            System.out.println("Video: stop");
            // 以下、ビデオの停止用コード...
            break;
        default:
            assert false;
        }
    }
}
