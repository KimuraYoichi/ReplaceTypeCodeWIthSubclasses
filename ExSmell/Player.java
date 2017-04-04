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
            // �ȉ��A���y�̍Đ��p�R�[�h...
            break;
        case VIDEO:
            System.out.println("Video: play");
            // �ȉ��A�r�f�I�̍Đ��p�R�[�h...
            break;
        default:
            assert false;
        }
    }
    public void loop() {
        switch (_type) {
        case MUSIC:
            System.out.println("Music: loop");
            // �ȉ��A���y�̃��[�v�Đ��p�R�[�h...
            break;
        case VIDEO:
            System.out.println("Video: loop");
            // �ȉ��A�r�f�I�̃��[�v�Đ��p�R�[�h...
            break;
        default:
            assert false;
        }
    }
    public void stop() {
        switch (_type) {
        case MUSIC:
            System.out.println("Music: stop");
            // �ȉ��A���y�̒�~�p�R�[�h...
            break;
        case VIDEO:
            System.out.println("Video: stop");
            // �ȉ��A�r�f�I�̒�~�p�R�[�h...
            break;
        default:
            assert false;
        }
    }
}
