package ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Arraylist myList = new Arraylist();

        // Thêm các phần tử vào ArrayList
        myList.add(5);
        myList.add(10);
        myList.add(15);

        // In ra danh sách các phần tử trong ArrayList
        System.out.println("Danh sách ban đầu:");
        myList.Print();

        // Cập nhật phần tử tại index 1
        myList.Update(12, 1);
        System.out.println("Danh sách sau khi cập nhật:");
        myList.Print();

        // Xóa phần tử tại index 0
        myList.DeleteIndex(0);
        System.out.println("Danh sách sau khi xóa index 0:");
        myList.Print();

        // Xóa tất cả các phần tử có giá trị là 12
        myList.DeleteValue(12);
        System.out.println("Danh sách sau khi xóa giá trị 12:");
        myList.Print();

        // Tìm kiếm các phần tử có giá trị là 15
        Arraylist searchResult = myList.Search(15);
        System.out.println("Kết quả tìm kiếm các phần tử có giá trị 15:");
        searchResult.Print();

        // Xóa tất cả các phần tử trong ArrayList
        myList.DeleteAll();
        System.out.println("Danh sách sau khi xóa tất cả các phần tử:");
        myList.Print();


	}

}
