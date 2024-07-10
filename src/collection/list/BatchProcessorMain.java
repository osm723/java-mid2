package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        //BatchProcessor batchProcessor = new BatchProcessor(new MyArrayList<Integer>());
        BatchProcessor batchProcessor = new BatchProcessor(new MyLinkedList<>());

        batchProcessor.logic(100_000);
    }
}
