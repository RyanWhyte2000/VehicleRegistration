package queueassignment;

public class Node {
	private Node NextNode;
	private Node PrevNode;
	private fitness Data;
	
	public Node() {
		
		Data= new fitness();
		NextNode = null;
		PrevNode= null;
	}
	public Node(String reg_num,String lisc_plate, String vehicle_type) {
		
		Data= new fitness(reg_num,lisc_plate, vehicle_type);
		NextNode = null;
		PrevNode= null;
	}
	public Node(fitness data) {
		
		Data =data;
		NextNode = null;
		PrevNode= null;
	}
	public Node getNextNode() {
		return NextNode;
	}
	public void setNextNode(Node nextNode) {
		NextNode = nextNode;
	}
	public Node getPrevNode() {
		return PrevNode;
	}
	public void setPrevNode(Node prevNode) {
		PrevNode = prevNode;
	}
	public fitness getData() {
		return Data;
	}
	public void setData(fitness data) {
		Data = data;
	}
	

}
