public class Array {

    private int[] data;
    private int size;

    // 构造函数，传入数组的容量capacity构造Array
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }
    //无参数的构造函数，默认数组的容量capacity=10
    public Array() {
        this(10);
    }

    //获取数组中的元素个数
    public int getSize(){
        return size;
    }

    //获取数组的容量
    public int getCapacity() {
        return data.length;
    }

    // 返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //向尾部添加元素
    public void addLast(int e) {
//        if (size == data.length) {
//            throw new IllegalArgumentException("AddLast failed. Array is full.");
//        }
//        data[size] = e;
//        size ++;
//        // data[size++] = e;
        add(size, e);
    }

    //向头部添加元素
    public void addFirst(int e) {
        add(0, e);
    }

    //索引位置插入元素
    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("AddLast failed. Array is full.");
        }
        if (index <0 || index > size) {
            throw new IllegalArgumentException("AddLast failed. Array is full.");
        }
        for (int i=size-1;i>=index; i--)
            data[i+1] = data[i];

        data[index] = e;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        res.append('[');
        for (int i=0; i<size; i++) {
            res.append(data[i]);
            if (i != size-1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

    //获取index索引位置的元素
    int get(int index) {
        if (index<0 || index >=size)
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        return data[index];
    }

    // 修改index索引位置的元素e
    void set(int index, int e) {
        if (index<0 || index >=size)
        throw new IllegalArgumentException("Get failed. Index is illegal.");
        data[index] = e;
    }
}
