import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}
// plz

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    List<String> nodeList = new ArrayList<>();
    while (head != null) {
      nodeList.add(head.val);
      head = head.next;
    }
    return nodeList;
  }

  public static void main() {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    Solution.linkedListValues(a);
    // -> [ "a", "b", "c", "d" ]
  }
}
