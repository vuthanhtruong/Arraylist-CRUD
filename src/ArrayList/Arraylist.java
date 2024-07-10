package ArrayList;

public class Arraylist {
	int start=-1;
	int Max=10;
	int M[];
	
	public Arraylist() {
		super();
		this.start = -1;
		this.Max = 20;
		this.M = new int [this.Max];
	}

	public void add(int d) {
		this.start++;
		if(this.start == this.Max) {
			this.Max*=2;
			int N[]=new int[this.Max];
			for(int i=0;i<M.length;i++) {
				N[i]=M[i];
			}
			this.M=N;
			M[start]=d;
		}
		else {
			M[start]=d;
		}
	}
	public void Update(int d, int Index) {
		if(Index > Size() || Index <0) {
			System.out.println(" Lỗi ");
		}
		else {
			for(int i=0;i<=this.start;i++) {
				if(i==Index) {
					M[i]=d;
				}
			}
		}
	}
	
	public void DeleteIndex(int index) {
		if(index < 0) {
			System.out.println("Vị trí của bạn < 0");
		}
		else if (index > Size()) {
			System.out.println("Vị trí của bạn > kích thước tối đa");
		} 
		else {
			int N[]=new int [Size()-1];
			int count=0;
			for(int i=0;i<Size();i++) {
				if(i!=index) {
					N[count]=M[i];
					count++;
				}
			}
			this.start--;
			M=N;
		}
	}
	
	public void DeleteValue(int d) {
		int count=0;
		for(int i=0;i<Size();i++) {
			if(M[i]==d) {
				DeleteIndex(i);
			}
		}
	}
	
	public void DeleteAll() {
		int[] N = new int[this.Max];
		this.start=-1;
		M=N;
	}
	
	public Arraylist Search(int d) {
		Arraylist ArraySearch =new Arraylist();
		for(int i=0;i<Size();i++) {
			if(M[i]==d) {
				ArraySearch.add(i);
			}
		}
		return ArraySearch;
	}
	
	public int Size() {
		int count=0;
		for(int i=0;i<=this.start;i++) {
			count++;
		}
		return count;
	}
	
	public void Print() {
		if(Size()==0) {
			System.out.println(" Arraylist này rỗng ");
		}
		else {
			for(int i=0;i<=this.start;i++) {
				System.out.println(M[i]);
			}
		}
	}
	
}
