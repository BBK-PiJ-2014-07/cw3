public class ListNode {
	Object nodeContents;
	ListNode next;

	public ListNode(Object nodeContents) {
		this.nodeContents = nodeContents;
		this.next = null;
	}


	public Object getObject() {
		return nodeContents;
	}

	public ListNode getNext() {
		return next;
	}

	public void addAtEnd(Object item) {
		if (this.next == null) {
			this.next = new ListNode(item);

		} else {
			this.next.addAtEnd(item);
		}
	}

	public Object addElsewhere(Object item){
			ListNode temp = this.next;
			this.next = new ListNode(item);
			this.next.next = temp;
			return this.next.getObject();
	}

	public Object remove(){
		Object deletedObj = this.next.getObject();
		this.next = this.next.next;
		System.out.println("Next node is now " + this.next.getObject());
		return deletedObj;
	}
}