class thirds{
PriorityQueue<Integer> pq = new PriorityQueue<>();
	public static int find(int [] A, int k){
		for(int i=0;i<A.length;i++){
			pq.offer(A[i]);
		}
		int n = -1;
		while(k>0){
			n = pq.poll();
			k--;
		}
		return n;
	}
	public static void main(String[] args) {
		int[] A = { 10, 30, 50, 67, 34, 68 };
		int k = 3;
		System.out.println("3rd largest element:" + find(A,3));

	}

}