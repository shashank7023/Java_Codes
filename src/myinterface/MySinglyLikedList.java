package myinterface;

public interface MySinglyLikedList {
    //insertAtBeginning
    //insertAtHead
    void addFirst(int element);
    //insertAtEnd
    //InsertAtTail
    //void addLast(int element);
    boolean isEmpty(); //will give true if linkedList is empty
    int size(); //will give total number of elements in likedList
    void addLast(int element);
    void addLastWithoutUsingTail(int element);
    void traverse();
    void addAfterGivenElement(int givenElemet , int element);
    // void addBeforeGivenNode(int givenElement , int element);
    int removeFirst();
    int removeLast();
    int removeGivenNode(int givenElement);
    boolean search(int element);

}
