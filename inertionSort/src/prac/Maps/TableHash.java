package prac.Maps;

public class TableHash {
    int size=0;
    int capacity = 10;
   HashNode bucketArr[] =new HashNode[capacity]; // array of hasNodes;
   HashNode node;

    public TableHash() {


    }
    public class HashNode{
        HashNode next;
        String value;
        int key;

        public HashNode(int key,String value) {
            this.value = value;
            this.key = key;
            next=null;
        }
    }
    public  void put(int key,String value){
        int bucketArrIndex = getIndex(key);
        HashNode head = bucketArr[bucketArrIndex];
        while(head!=null){ //if there is a node already
            if (head.key== key) { // if keys are equal;
                head.value=value; //update the value to the new value
                return; // get out of this method;
            } //if key are not equal
            head=head.next;
        } //if head is null then add a node to the list
        size++;
        head = bucketArr[bucketArrIndex];
       HashNode node = new HashNode(key,value);
        node.next= head;
        bucketArr[bucketArrIndex]=node;

    }
    public int size(){
        return size;
    }
    public int getIndex(int key){
        return key % capacity;
    }
    public static  void main(String[]args){
        TableHash tableHash = new TableHash();
        tableHash.put(21,"mary");
        tableHash.put(5,"Tom");
        tableHash.put(101,"Mai");
        System.out.println(tableHash.size());

    }
}
