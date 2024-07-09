package i.learn.program.learning1.Database;

import i.learn.program.learning1.model.Product;

import java.util.ArrayList;
import java.util.Objects;

public class ShopList {
    private static ArrayList<Product> products = new ArrayList<>();
    private static ArrayList<Product> products1 = new ArrayList<>();
    private static ArrayList<Product> products2 = new ArrayList<>();
    private static ArrayList<Product> products3 = new ArrayList<>();
    private static ArrayList<Product> products4 = new ArrayList<>();
    private static Long id = 6L;


    static {
        products.add(new Product(1L, "semiz koy", 35000, 100, "semiz-koy", "Semiz kushty koy satiladi. Ak tustes,tabigi osiru, tabigi shoppen korektendi. Bolatin bagasy osy. azdan bere almaimyn.","https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/A_well-developed_Texel_lamb_-_geograph.org.uk_-_767722.jpg/200px-A_well-developed_Texel_lamb_-_geograph.org.uk_-_767722.jpg"));
        products.add(new Product(2L, "semiz cow", 300000, 80, "semiz-cow", "Semyz kushty syir satiladi. Tabigi,tauly zherde osirgen bolatin. Eshkanday dari berilmegen. Tabigi onim.","https://cdn.britannica.com/55/174255-050-526314B6/brown-Guernsey-cow.jpg"));
        products.add(new Product(3L, "semiz camel", 450000, 75, "semiz-camel", "Semyz kushty tuiye. Sholdi zherde osken bolatin. Bolatyn bagasy osi, azdan bere almaymin. zhuni ulken.","https://upload.wikimedia.org/wikipedia/commons/4/43/07._Camel_Profile%2C_near_Silverton%2C_NSW%2C_07.07.2007.jpg"));
        products.add(new Product(4L, "zhuiryk at", 500000, 100, "zhuiryk-at", "mykty,zhuiryk tulpar satiladi. Bul at aidauga paidalanady. Tabygy,tauly zhakta osken","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQcH-Twx17fTmjt-UG3idfjmVe7qkmyX0efw&s"));
        products.add(new Product(5L,"tauyk",3500,1750,"ak-semiz-tauyk","Ak tustes,semiz tauyik satiladi. Tabigi zhakta zhane tabigi dandi-dakyildarmen korektengen","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTbf5MfYun5m_nx2HXMXXW0-izKaq1pFv3ctA&s"));
    }
    static {
        products1.add(new Product(1L,"katana",100000,350,"sword-katana","cool sword","https://cdn11.bigcommerce.com/s-99kn4fj7jr/images/stencil/1280x1280/products/302/560/88ABK_1__82029.1607300813.jpg?c=1"));
        products1.add(new Product(2L,"knife",5000,1000,"knife","sharp knife of steel","https://coldsteels.ru/image/cache/catalog/Produkts/noj-cold-steel-magnum-tanto-ix-cs_35ad-1-1500x1500.jpg"));
        products1.add(new Product(3L,"compound bow",15000,500,"compound-bow","compound bow","https://sarbaletom.ru/images/stories/virtuemart/product/cb5050rth.jpg"));
    }
    static {
        products2.add(new Product(1L,"cap",1000,5000,"black-cap","cool black colored cap","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEFAV7PKWkK5x70QIWv2PDjOFLLuYd4s9aGw&s"));
        products2.add(new Product(2L,"gloves",1350,5000,"black-gloves","cool black colored gloves","https://m.media-amazon.com/images/I/61MYoqU03vL._AC_UY1000_.jpg"));
        products2.add(new Product(3L,"t-shirt",3000,5000,"black-t-shirt","cool black colored t-shirt","https://images-eu-prod.cms.commerce.dynamics.com/cms/api/scwrkbhfhd/imageFileData/search?fileName=/Products%2F60543772_000_001.png"));
    }
    static {
        products3.add(new Product(1L,"ravon r4",2500000,500,"ravon-r4","ravon r4 white color edition","https://ravon.ru/uploads/cars/exterior/597063a250377.jpg"));
        products3.add(new Product(2L,"huynday sonata",9500000,600,"ravon-r4","huyndai sonata grey color edition","https://s7d1.scene7.com/is/image/hyundai/2024-sonata-hev-limited-aero-silver-metallic-conquest-hero:16-9?wid=640&hei=360&fmt=webp-alpha"));
        products3.add(new Product(3L,"huyndai staria",10000000,700,"ravon-r4","huyndai staria grey color edition","https://cdn.wheel-size.com/automobile/body/hyundai-staria-2021-2024-1681717823.885612.jpg"));
    }
    static {
        products4.add(new Product(1L,"kurt",300,7500,"tabigi-onim-kurt","tabigi pisken kurt","https://aikyn.kz/upload/media/posts/2020/03/qurt.jpg"));
        products4.add(new Product(2L,"sut",210,7500,"tabigi-onim-sut","tabigi ondirilgen sut","https://el.kz/upload/storage_el/media/images/tiny_images/0d5995ec11850b8bc26d2da23fd90966.jpg"));
        products4.add(new Product(3L,"irimshik",500,7500,"tabigi-onim-irimshik","tabigi ondirilgen irimshik","https://cdn.nur.kz/images/1200x675/5586cbb61a809a76.jpeg?version=1"));
    }
    public static ArrayList<Product> getProducts(){
        return products;
    }
    public static ArrayList<Product> getProducts1(){
        return products1;
    }
    public static ArrayList<Product> getProducts2(){
        return products2;
    }
    public static ArrayList<Product> getProducts3(){
        return products3;
    }
    public static ArrayList<Product> getProducts4(){
        return products4;
    }
 }


