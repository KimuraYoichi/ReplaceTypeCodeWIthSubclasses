public class MusicPlayer extends Player {
    @Override public void play() {
        System.out.println("Music: play");
        // �ȉ��A���y�̍Đ��p�R�[�h...
    }
    @Override public void loop() {
        System.out.println("Music: loop");
        // �ȉ��A���y�̃��[�v�Đ��p�R�[�h...
    }
    @Override public void stop() {
        System.out.println("Music: stop");
        // �ȉ��A���y�̒�~�p�R�[�h...
    }
}
