package CustomCollections;

public class Main {

    public static void main(String[] args) {
        // Test CustomArrayList
        System.out.println("Testing CustomArrayList");
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(23);
        list.add(14);
        System.out.println("List size: " + list.size());
        System.out.println("List elements: " + list);
        list.add(29);
        System.out.println("List size: " + list.size());
        System.out.println("Element at index 5: " + list.get(5));
        System.out.println("List elements: " + list);
        System.out.println("Removing element at position 2: " + list.remove(2));
        System.out.println("List size: " + list.size());
        System.out.println("Removing element 2: ");
        list.remove(new Integer(2));
        System.out.println("List size: " + list.size());
        System.out.println("List contains 5: " + list.contains(5));
        System.out.println("List contains 31: " + list.contains(31));
        System.out.println("Index of 29: " + list.indexOf(29));
        System.out.println("List size: " + list.size());
        System.out.println("List elements: " + list);
        System.out.println("Is list empty? " + list.isEmpty());
        System.out.println("Clear list...");
        list.clear();
        System.out.println("List size: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());

        // Test CustomLinkedList
        System.out.println("\nTesting CustomLinkedList");
        CustomLinkedList<String> linkedList = new CustomLinkedList<>();
        linkedList.addLast("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.addFirst("4");
        linkedList.add(3, "5");
        linkedList.add(3, "6");
        System.out.println("List elements: " + linkedList);
        System.out.println("Index of 5: " + linkedList.indexOf("5"));
        System.out.println("Linked List contains 6: " + linkedList.contains("6"));
        System.out.println("Linked List contains 21: " + linkedList.contains("21"));
        linkedList.addLast("2");
        System.out.println("List elements: " + linkedList);
        System.out.println("Last Index of 2: " + linkedList.lastIndexOf("2"));
        linkedList.remove("6");
        linkedList.remove(0);
        linkedList.removeLast();
        System.out.println("List elements: " + linkedList);
        System.out.println("Set 2nd element 15. Was: " + linkedList.set(2, "15") + " before");
        System.out.println("List elements: " + linkedList);
        System.out.println("List size: " + linkedList.size());
        System.out.println("Is list empty: " + linkedList.isEmpty());
        System.out.println("Clear list...");
        linkedList.clear();
        System.out.println("Is list empty: " + linkedList.isEmpty());
    }
}