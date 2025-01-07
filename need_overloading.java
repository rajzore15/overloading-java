//here we define the class name
public class need_overloading {
    int[] arr ={30, 68, 22, 45, 67, 98};
    int ele = 45;

    SearchEle searchEle = new SearchEle();
    int x = searchEle.search(arr, ele);

}
// we 
class SearchEle{

    public int search(int[] arr, int ele){
        return search(arr,ele,0);

    }

    private int search(int[] arr, int ele, int i){
        if(i == arr.length){
            return -1;
        }if(arr[i] == ele){
            return i;
        }
        return search(arr,ele,i+1);
    }
}
