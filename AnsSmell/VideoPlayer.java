public class VideoPlayer extends Player {
    @Override public void play() {
        System.out.println("Video: play");
        // �ȉ��A�r�f�I�̍Đ��p�R�[�h...
    }
    @Override public void loop() {
        System.out.println("Video: loop");
        // �ȉ��A�r�f�I�̃��[�v�Đ��p�R�[�h...
    }
    @Override public void stop() {
        System.out.println("Video: stop");
        // �ȉ��A�r�f�I�̒�~�p�R�[�h...
    }
}
