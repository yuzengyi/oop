public class GoodsTest {
    public static void main(String[] args) {
        //1.array
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("001","huaweiP40",500,100); 
        Goods g2 = new Goods("002","baowenbei",227,50); 
        Goods g3 = new Goods("003","gouqi",12.7,70); 

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            // index = i 
            Goods goods = arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());
        }
    }
}
