package alirezamontazer.createbest.productcatalog_v3;

public class Product {

    private String _id;
    private String _productname;
    private String _price;

    public Product() {
    }

    public Product(String id, String productname, String price) {
        _id = id;
        _productname = productname;
        _price = price;
    }

    public Product(String productname, String price) {
        _productname = productname;
        _price = price;
    }

    public void setId(String id) {
        _id = id;
    }

    public String getId() {
        return _id;
    }

    public void setProductName(String productname) {
        _productname = productname;
    }

    public String getProductName() {
        return _productname;
    }

    public void setPrice(String price) {
        _price = price;
    }

    public String getPrice() {
        return _price;
    }

}
