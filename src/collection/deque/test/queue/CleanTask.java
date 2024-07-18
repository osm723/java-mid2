package collection.deque.test.queue;

public class CleanTask implements Task {
    @Override
    public void excute() {
        System.out.println("자원 정리");
    }
}
