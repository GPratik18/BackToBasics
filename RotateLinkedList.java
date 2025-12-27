import java.util.Scanner;
import java.util.InputMismatchException;

class RotateLinkedList{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		LinkedList ll = null ;

		try{
			while(true){
				
				System.out.println("Rotating Linked List Program");
				System.out.println("1. Create a linked List");
				System.out.println("2. Display Linked List");
				System.out.println("3. Add element in Linked List");
				System.out.println("4. Pop element from Linked List");
				System.out.println("5. Rotate Linked List left by ");
				System.out.println("6. Rotate Linked List right by ");
				System.out.println("-1. Clear Screen ");				
				System.out.println("0. Exit ");
				System.out.print("Enter your choice                  :");



				int choice = sc.nextInt();
				switch(choice){

					case -1:{
						System.out.print("\033[H\033[2J");
        				System.out.flush();
						break;
					}
					case 1: {
						ll = new LinkedList();
						System.out.println("New Linked List Created");
						break;
					}
					case 2: {
						if(ll == null){
							System.out.println("Create a linked list first");
						}else{
							System.out.println(ll);
						}
						break;
					}
					case 3: {
						if(ll == null){
							System.out.println("Create a linked list first");
						}else{
							System.out.println("Enter an element to be added");
							ll.add(sc.nextInt());
						}
						break;
					}

					case 4: {
						if(ll == null){
							System.out.println("Create a linked list first");
						}else{
							System.out.println("Popped element : "+ ll.pop());
						}
						break;
					}

					case 5: {
						if(ll == null){
							System.out.println("Create a linked list first");
						}else{
							System.out.println("Enter number of elements to be rotated");
							rotateLinkedListLeftBy(ll, sc.nextInt());
							System.out.println("Linked list after rotating : " + ll);
						}
						break;
					}

					case 6: {
						if(ll == null){
							System.out.println("Create a linked list first");
						}else{
							System.out.println("Enter number of elements to be rotated");
							rotateLinkedListRightBy(ll, sc.nextInt());
							System.out.println("Linked list after rotating : " + ll);
						}
						break;
					}

					default: return;
				}

				System.out.println("=======================================================");
			}

		}catch(InputMismatchException e){
			System.out.println("Apni hoshiyari apne ghar rakhe");
		}
	}

	public static void rotateLinkedListRightBy(LinkedList ll, int length){
		length = length % ll.LENGTH;
		for(int i=0;i<length;i++){
			Node tmp = ll.pop();
			ll.add(tmp.data, 0);
		}
	}

	public static void rotateLinkedListLeftBy(LinkedList ll, int length){
		length = length % ll.LENGTH;
		for(int i=0;i<length;i++){
			Node tmp = ll.pop(0);
			ll.add(tmp.data);
		}
	}

}



class LinkedList{

	Node head;
	public int LENGTH = 0;
	public LinkedList(){
		this.head = new Node();
	}

    @Override
	public String toString(){
		StringBuilder str = new StringBuilder("[ ");
		Node tmp = this.head;
		while(tmp.next != null){
			tmp = tmp.next;
			str.append(tmp.toString()+", ");
		}

		int len = str.length();
		while (len > 0 && (str.charAt(len - 1) == ' ' || str.charAt(len - 1) == ',')) {
			str.deleteCharAt(len - 1);
			len--;
		}
		str.append(" ]");
		return str.toString();
	}

	public void add(){
		add(0);
	}
	public void add(int data){
		Node tmp = this.head;
		while(tmp != null && tmp.next!=null){
			tmp = tmp.next;
		}
		tmp.next = new Node(data);
		LENGTH ++;
	}

	public void add(int data, int index){
		if(index == 0){
			Node tmp = new Node(data, this.head.next);
			this.head.next = tmp;
			LENGTH ++;
			return;
		}
		Node tmp = this.head;
		int count = 0;

		while(tmp.next!= null){
			tmp = tmp.next;
			count ++;
			if(count == index){
				break;
			}
		}

		tmp.next = new Node(data, tmp.next);
		LENGTH ++;
	}

	public void addAtEnd(int data){
		add(data, LENGTH);
	}



	public Node pop(){
		if(this.head.next == null){
			return null;
		}
		if(this.head.next.next == null){
			Node tmp = new Node(this.head.next.data);
			this.head.next = null;
			return tmp;
		}
		Node tmp = this.head;
		while(tmp.next.next != null){
			tmp = tmp.next;
		}

		Node lastNode= new Node(tmp.next.data);
		tmp.next = null;
		return lastNode;
		
	}

	public Node pop(int index){
		if(index<0){
			return null;
		}
		if(index == 0){
			if(this.head.next != null){
				Node tmp = new Node(this.head.next.data);
				this.head.next = this.head.next.next;
				return tmp;
			}else{
				return null;
			}
		}

		Node tmp = this.head;

		int count = 0;
		while(tmp.next.next != null){
			tmp = tmp.next;
			count ++;

			if(count == index){
				break;
			}
		}

		Node lastNode = new Node(tmp.next.data);
		tmp.next = tmp.next.next;
		return lastNode;

	}
}


class Node{
	int data;
	Node next;

	public Node(){
		this(0, null);
	}

	@Override
	public String toString(){
		return String.valueOf(data);
	}
	public Node(int data){
		this(data, null);
	}
	public Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
}